// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentConfirmation;
import com.paypal.android.sdk.payments.ProofOfPayment;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import java.math.BigDecimal;
import ly.kite.KiteSDK;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.MultipleCurrencyAmount;
import ly.kite.catalogue.PrintOrder;
import ly.kite.catalogue.PrintOrderSubmissionListener;
import ly.kite.catalogue.SingleCurrencyAmount;
import ly.kite.journey.AKiteActivity;
import ly.kite.payment.PayPalCard;
import ly.kite.payment.PayPalCardChargeListener;
import ly.kite.payment.PayPalCardVaultStorageListener;
import ly.kite.pricing.IPricingConsumer;
import ly.kite.pricing.OrderPricing;
import ly.kite.pricing.PricingAgent;

// Referenced classes of package ly.kite.checkout:
//            OrderPricingAdaptor, OrderReceiptActivity

public class PaymentActivity extends AKiteActivity
    implements android.widget.TextView.OnEditorActionListener, IPricingConsumer
{
    private class PromoCodeTextWatcher
        implements TextWatcher
    {

        final PaymentActivity this$0;

        public void afterTextChanged(Editable editable)
        {
            mPromoEditText.setTextColor(getResources().getColor(ly.kite.R.color.payment_promo_code_text_default));
            setPromoButtonEnabledState();
            mPromoButton.setText(ly.kite.R.string.payment_promo_button_text_apply);
            mPromoButtonClearsCode = false;
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private PromoCodeTextWatcher()
        {
            this$0 = PaymentActivity.this;
            super();
        }

    }

    private class RetrievePricingRunnable
        implements Runnable
    {

        final PaymentActivity this$0;

        public void run()
        {
            requestPrices();
        }

        private RetrievePricingRunnable()
        {
            this$0 = PaymentActivity.this;
            super();
        }

    }


    private static final String CARD_IO_TOKEN = "f1d07b66ad21407daf153c0ac66c09d7";
    public static final String ENVIRONMENT_LIVE = "ly.kite.ENVIRONMENT_LIVE";
    public static final String ENVIRONMENT_STAGING = "ly.kite.ENVIRONMENT_STAGING";
    public static final String ENVIRONMENT_TEST = "ly.kite.ENVIRONMENT_TEST";
    public static final String EXTRA_PRINT_API_KEY = "ly.kite.EXTRA_PRINT_API_KEY";
    public static final String EXTRA_PRINT_ENVIRONMENT = "ly.kite.EXTRA_PRINT_ENVIRONMENT";
    public static final String EXTRA_PRINT_ORDER = "ly.kite.EXTRA_PRINT_ORDER";
    private static final String LOG_TAG = "PaymentActivity";
    private static final int REQUEST_CODE_CREDITCARD = 1;
    private static final int REQUEST_CODE_PAYPAL = 0;
    private static final int REQUEST_CODE_RECEIPT = 2;
    private String mAPIKey;
    private Button mCreditCardButton;
    private ly.kite.KiteSDK.Environment mKiteSDKEnvironment;
    private boolean mLastPriceRetrievalSucceeded;
    private OrderPricing mOrderPricing;
    private ListView mOrderSummaryListView;
    private Button mPayPalButton;
    private PrintOrder mPrintOrder;
    private ProgressBar mProgressBar;
    private Button mPromoButton;
    private boolean mPromoButtonClearsCode;
    private EditText mPromoEditText;

    public PaymentActivity()
    {
    }

    public static ly.kite.payment.PayPalCard.Currency getPayPalCurrency(String s)
    {
        if (s.equals("GBP"))
        {
            return ly.kite.payment.PayPalCard.Currency.GBP;
        }
        if (s.equals("EUR"))
        {
            return ly.kite.payment.PayPalCard.Currency.EUR;
        }
        if (s.equals("USD"))
        {
            return ly.kite.payment.PayPalCard.Currency.USD;
        }
        if (s.equals("SGD"))
        {
            return ly.kite.payment.PayPalCard.Currency.SGD;
        }
        if (s.equals("AUD"))
        {
            return ly.kite.payment.PayPalCard.Currency.AUD;
        }
        if (s.equals("NZD"))
        {
            return ly.kite.payment.PayPalCard.Currency.NZD;
        }
        if (s.equals("CAD"))
        {
            return ly.kite.payment.PayPalCard.Currency.CAD;
        } else
        {
            return ly.kite.payment.PayPalCard.Currency.GBP;
        }
    }

    private void payWithExistingCard(PayPalCard paypalcard)
    {
        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setCancelable(false);
        dialog.setTitle("Processing");
        dialog.setMessage("One moment");
        dialog.show();
        SingleCurrencyAmount singlecurrencyamount = mOrderPricing.getTotalCost().getDefaultAmountWithFallback();
        paypalcard.chargeCard(mKiteSDKEnvironment, singlecurrencyamount.getAmount(), getPayPalCurrency(singlecurrencyamount.getCurrencyCode()), "", new PayPalCardChargeListener() {

            final PaymentActivity this$0;
            final ProgressDialog val$dialog;

            public void onChargeSuccess(PayPalCard paypalcard1, String s)
            {
                dialog.dismiss();
                submitOrderForPrinting(s);
                paypalcard1.saveAsLastUsedCard(PaymentActivity.this);
            }

            public void onError(PayPalCard paypalcard1, Exception exception)
            {
                dialog.dismiss();
                showErrorDialog(exception.getMessage());
            }

            
            {
                this$0 = PaymentActivity.this;
                dialog = progressdialog;
                super();
            }
        });
    }

    private void payWithNewCard()
    {
        Intent intent = new Intent(this, io/card/payment/CardIOActivity);
        intent.putExtra("io.card.payment.requireExpiry", true);
        intent.putExtra("io.card.payment.requireCVV", true);
        intent.putExtra("io.card.payment.requirePostalCode", false);
        startActivityForResult(intent, 1);
    }

    private boolean setPromoButtonEnabledState()
    {
        boolean flag;
        if (mPromoEditText.getText().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPromoButton.setEnabled(flag);
        return flag;
    }

    public static void start(Activity activity, PrintOrder printorder, String s, String s1, int i)
    {
        Intent intent = new Intent(activity, ly/kite/checkout/PaymentActivity);
        intent.putExtra("ly.kite.EXTRA_PRINT_ORDER", printorder);
        intent.putExtra("ly.kite.EXTRA_PRINT_API_KEY", s);
        intent.putExtra("ly.kite.EXTRA_PRINT_ENVIRONMENT", s1);
        activity.startActivityForResult(intent, i);
    }

    private void submitOrderForPrinting(final String dialog)
    {
        if (dialog != null)
        {
            mPrintOrder.setProofOfPayment(dialog);
            Analytics.getInstance(this).trackPaymentCompleted(mPrintOrder, "PayPal");
        }
        dialog = new ProgressDialog(this);
        dialog.setCancelable(false);
        dialog.setIndeterminate(false);
        dialog.setProgressStyle(1);
        dialog.setProgressNumberFormat(null);
        dialog.setTitle("Processing");
        dialog.setMessage("One moment...");
        dialog.setMax(100);
        dialog.show();
        mPrintOrder.submitForPrinting(this, new PrintOrderSubmissionListener() {

            final PaymentActivity this$0;
            final ProgressDialog val$dialog;

            public void onError(PrintOrder printorder, Exception exception)
            {
                if (Looper.myLooper() != Looper.getMainLooper())
                {
                    throw new AssertionError("Should be calling back on the main thread");
                } else
                {
                    dialog.dismiss();
                    exception = new Intent(PaymentActivity.this, ly/kite/checkout/OrderReceiptActivity);
                    exception.putExtra("ly.kite.EXTRA_PRINT_ORDER", printorder);
                    startActivityForResult(exception, 2);
                    return;
                }
            }

            public void onProgress(PrintOrder printorder, int i, int j)
            {
                if (Looper.myLooper() != Looper.getMainLooper())
                {
                    throw new AssertionError("Should be calling back on the main thread");
                } else
                {
                    dialog.setProgress(i);
                    dialog.setSecondaryProgress(j);
                    dialog.setMessage("Uploading images");
                    return;
                }
            }

            public void onSubmissionComplete(PrintOrder printorder, String s)
            {
                if (Looper.myLooper() != Looper.getMainLooper())
                {
                    throw new AssertionError("Should be calling back on the main thread");
                } else
                {
                    dialog.dismiss();
                    s = new Intent(PaymentActivity.this, ly/kite/checkout/OrderReceiptActivity);
                    s.putExtra("ly.kite.EXTRA_PRINT_ORDER", printorder);
                    startActivityForResult(s, 2);
                    Analytics.getInstance(PaymentActivity.this).trackOrderSubmission(printorder);
                    return;
                }
            }

            
            {
                this$0 = PaymentActivity.this;
                dialog = progressdialog;
                super();
            }
        });
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        intent = (PaymentConfirmation)intent.getParcelableExtra("com.paypal.android.sdk.paymentConfirmation");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        intent = intent.a();
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        intent = intent.a();
        if (intent != null)
        {
            try
            {
                submitOrderForPrinting(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                showErrorDialog(intent.getMessage());
            }
            break MISSING_BLOCK_LABEL_65;
        }
        showErrorDialog("No payment id found in proof of payment");
        return;
        return;
        showErrorDialog("No proof of payment found in payment confirmation");
        return;
        showErrorDialog("No payment confirmation received from PayPal");
        return;
        if (i == 1)
        {
            if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
            {
                CreditCard creditcard = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
                if (!creditcard.d())
                {
                    showErrorDialog("Sorry it looks like that card has expired. Please try again.");
                    return;
                }
                intent = new PayPalCard();
                intent.setNumber(creditcard.a);
                intent.setExpireMonth(creditcard.b);
                intent.setExpireYear(creditcard.c);
                intent.setCvv2(creditcard.d);
                intent.setCardType(ly.kite.payment.PayPalCard.CardType.getCardType(creditcard.c()));
                if (intent.getCardType() == ly.kite.payment.PayPalCard.CardType.UNSUPPORTED)
                {
                    showErrorDialog("Sorry we couldn't recognize your card. Please try again manually entering your card details if necessary.");
                    return;
                } else
                {
                    final ProgressDialog dialog = new ProgressDialog(this);
                    dialog.setCancelable(false);
                    dialog.setTitle("Processing");
                    dialog.setMessage("One moment");
                    dialog.show();
                    intent.storeCard(mKiteSDKEnvironment, new PayPalCardVaultStorageListener() {

                        final PaymentActivity this$0;
                        final ProgressDialog val$dialog;

                        public void onError(PayPalCard paypalcard, Exception exception)
                        {
                            if (dialog.isShowing())
                            {
                                dialog.dismiss();
                            }
                            showErrorDialog(exception.getMessage());
                        }

                        public void onStoreSuccess(PayPalCard paypalcard)
                        {
                            if (dialog.isShowing())
                            {
                                dialog.dismiss();
                            }
                            payWithExistingCard(paypalcard);
                        }

            
            {
                this$0 = PaymentActivity.this;
                dialog = progressdialog;
                super();
            }
                    });
                    return;
                }
            }
        } else
        if (i == 2)
        {
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getIntent().getStringExtra("ly.kite.EXTRA_PRINT_API_KEY");
        getIntent().getStringExtra("ly.kite.EXTRA_PRINT_ENVIRONMENT");
        mPrintOrder = (PrintOrder)getIntent().getParcelableExtra("ly.kite.EXTRA_PRINT_ORDER");
        if (obj == null)
        {
            throw new IllegalArgumentException("You must specify an API key string extra in the intent used to start the PaymentActivity");
        }
        if (mPrintOrder == null)
        {
            throw new IllegalArgumentException("You must specify a PrintOrder object extra in the intent used to start the PaymentActivity");
        }
        mKiteSDKEnvironment = KiteSDK.getInstance(this).getEnvironment();
        obj = (new PayPalConfiguration()).b(mKiteSDKEnvironment.getPayPalClientId()).a(mKiteSDKEnvironment.getPayPalEnvironment()).a(false);
        Intent intent = new Intent(this, com/paypal/android/sdk/payments/PayPalService);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", ((android.os.Parcelable) (obj)));
        startService(intent);
        setContentView(ly.kite.R.layout.screen_payment);
        mOrderSummaryListView = (ListView)findViewById(ly.kite.R.id.order_summary_list_view);
        mPromoEditText = (EditText)findViewById(ly.kite.R.id.promo_edit_text);
        mPromoButton = (Button)findViewById(ly.kite.R.id.promo_button);
        mCreditCardButton = (Button)findViewById(ly.kite.R.id.credit_card_button);
        mPayPalButton = (Button)findViewById(ly.kite.R.id.paypal_button);
        mProgressBar = (ProgressBar)findViewById(ly.kite.R.id.progress_bar);
        mPromoEditText.addTextChangedListener(new PromoCodeTextWatcher());
        mPromoEditText.setOnEditorActionListener(this);
        if (mKiteSDKEnvironment.getPayPalEnvironment().equals("sandbox"))
        {
            setTitle("Payment (Sandbox)");
        } else
        {
            setTitle("Payment");
        }
        requestPrices();
        if (bundle == null)
        {
            Analytics.getInstance(this).trackPaymentScreenViewed(mPrintOrder);
        }
    }

    public void onCreditCardButtonClicked(View view)
    {
        final PayPalCard lastUsedCard = PayPalCard.getLastUsedCard(this);
        if (lastUsedCard != null && !lastUsedCard.hasVaultStorageExpired())
        {
            view = new android.app.AlertDialog.Builder(this);
            String s;
            if (mKiteSDKEnvironment.getPayPalEnvironment().equals("sandbox"))
            {
                view.setTitle("Payment Source (Sandbox)");
            } else
            {
                view.setTitle("Payment Source");
            }
            s = (new StringBuilder()).append("Pay with card ending ").append(lastUsedCard.getLastFour()).toString();
            lastUsedCard = new android.content.DialogInterface.OnClickListener() {

                final PaymentActivity this$0;
                final PayPalCard val$lastUsedCard;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == 0)
                    {
                        payWithNewCard();
                        return;
                    } else
                    {
                        payWithExistingCard(lastUsedCard);
                        return;
                    }
                }

            
            {
                this$0 = PaymentActivity.this;
                lastUsedCard = paypalcard;
                super();
            }
            };
            view.setItems(new String[] {
                "Pay with new card", s
            }, lastUsedCard);
            view.show();
            return;
        } else
        {
            payWithNewCard();
            return;
        }
    }

    public void onDestroy()
    {
        stopService(new Intent(this, com/paypal/android/sdk/payments/PayPalService));
        super.onDestroy();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            onPromoButtonClicked();
        }
        return false;
    }

    void onGotPrices()
    {
        Object obj = mOrderPricing.getPromoCodeInvalidMessage();
        if (obj != null)
        {
            mPromoEditText.setTextColor(getResources().getColor(ly.kite.R.color.payment_promo_code_text_error));
            mPromoButton.setText(ly.kite.R.string.payment_promo_button_text_clear);
            mPromoButtonClearsCode = true;
            showErrorDialog(((String) (obj)));
        } else
        if (setPromoButtonEnabledState())
        {
            mPromoButton.setText(ly.kite.R.string.payment_promo_button_text_clear);
            mPromoButtonClearsCode = true;
        }
        obj = mOrderPricing.getTotalCost();
        mPrintOrder.setOrderPricing(mOrderPricing);
        if (((MultipleCurrencyAmount) (obj)).getDefaultAmountWithFallback().getAmount().compareTo(BigDecimal.ZERO) <= 0)
        {
            mPayPalButton.setVisibility(8);
            mCreditCardButton.setText(ly.kite.R.string.payment_credit_card_button_text_free);
            mCreditCardButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentActivity this$0;

                public void onClick(View view)
                {
                    submitOrderForPrinting(null);
                }

            
            {
                this$0 = PaymentActivity.this;
                super();
            }
            });
        } else
        {
            mPayPalButton.setVisibility(0);
            mCreditCardButton.setText(ly.kite.R.string.payment_credit_card_button_text);
        }
        obj = new OrderPricingAdaptor(this, mOrderPricing);
        mOrderSummaryListView.setAdapter(((android.widget.ListAdapter) (obj)));
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onMenuItemSelected(i, menuitem);
        }
    }

    public void onPayPalButtonClicked(View view)
    {
        if (mOrderPricing != null)
        {
            view = mOrderPricing.getTotalCost();
            if (view != null)
            {
                view = view.getDefaultAmountWithFallback();
                view = new PayPalPayment(view.getAmount(), view.getCurrencyCode(), "Product", "sale");
                Intent intent = new Intent(this, com/paypal/android/sdk/payments/PaymentActivity);
                intent.putExtra("com.paypal.android.sdk.payment", view);
                startActivityForResult(intent, 0);
            }
        }
    }

    public void onPromoButtonClicked()
    {
        if (mPromoButtonClearsCode)
        {
            String s = mPrintOrder.getPromoCode();
            mPrintOrder.clearPromoCode();
            mPromoEditText.setText(null);
            mPromoButton.setText(ly.kite.R.string.payment_promo_button_text_apply);
            mPromoButton.setEnabled(false);
            mPromoButtonClearsCode = false;
            if (s != null && mLastPriceRetrievalSucceeded)
            {
                requestPrices();
            }
            return;
        } else
        {
            mPrintOrder.setPromoCode(mPromoEditText.getText().toString());
            requestPrices();
            return;
        }
    }

    public void onPromoButtonClicked(View view)
    {
        onPromoButtonClicked();
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        mPrintOrder = (PrintOrder)bundle.getParcelable("ly.kite.EXTRA_PRINT_ORDER");
        mAPIKey = bundle.getString("ly.kite.EXTRA_PRINT_API_KEY");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("ly.kite.EXTRA_PRINT_ORDER", mPrintOrder);
        bundle.putString("ly.kite.EXTRA_PRINT_API_KEY", mAPIKey);
    }

    public void paOnError(Exception exception)
    {
        mLastPriceRetrievalSucceeded = false;
        displayModalDialog(ly.kite.R.string.alert_dialog_title_oops, getString(ly.kite.R.string.alert_dialog_message_pricing_format_string, new Object[] {
            exception.getMessage()
        }), ly.kite.R.string.Retry, new RetrievePricingRunnable(), ly.kite.R.string.Cancel, new ly.kite.journey.AKiteActivity.FinishRunnable(this));
    }

    public void paOnSuccess(OrderPricing orderpricing)
    {
        mOrderPricing = orderpricing;
        mLastPriceRetrievalSucceeded = true;
        mPromoButton.setEnabled(true);
        mCreditCardButton.setEnabled(true);
        mCreditCardButton.setEnabled(true);
        mProgressBar.setVisibility(8);
        onGotPrices();
    }

    void requestPrices()
    {
        mOrderPricing = PricingAgent.getInstance().requestPricing(this, mPrintOrder, this);
        if (mOrderPricing == null)
        {
            mPromoButton.setEnabled(false);
            mCreditCardButton.setEnabled(false);
            mCreditCardButton.setEnabled(false);
            mProgressBar.setVisibility(0);
            return;
        } else
        {
            onGotPrices();
            return;
        }
    }



/*
    static boolean access$1002(PaymentActivity paymentactivity, boolean flag)
    {
        paymentactivity.mPromoButtonClearsCode = flag;
        return flag;
    }

*/







}
