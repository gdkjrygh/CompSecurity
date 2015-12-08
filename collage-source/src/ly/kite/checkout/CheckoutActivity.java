// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ly.kite.KiteSDK;
import ly.kite.address.Address;
import ly.kite.address.AddressBookActivity;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.Catalogue;
import ly.kite.catalogue.CatalogueLoader;
import ly.kite.catalogue.ICatalogueConsumer;
import ly.kite.catalogue.PrintJob;
import ly.kite.catalogue.PrintOrder;
import ly.kite.catalogue.Product;
import ly.kite.journey.AKiteActivity;
import ly.kite.pricing.PricingAgent;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.checkout:
//            PaymentActivity

public class CheckoutActivity extends AKiteActivity
    implements android.view.View.OnClickListener
{

    public static final String ENVIRONMENT_LIVE = "ly.kite.ENVIRONMENT_LIVE";
    public static final String ENVIRONMENT_STAGING = "ly.kite.ENVIRONMENT_STAGING";
    public static final String ENVIRONMENT_TEST = "ly.kite.ENVIRONMENT_TEST";
    public static final String EXTRA_PRINT_API_KEY = "ly.kite.EXTRA_PRINT_API_KEY";
    public static final String EXTRA_PRINT_ENVIRONMENT = "ly.kite.EXTRA_PRINT_ENVIRONMENT";
    public static final String EXTRA_PRINT_ORDER = "ly.kite.EXTRA_PRINT_ORDER";
    private static final String LOG_TAG = "CheckoutActivity";
    private static final long MAXIMUM_PRODUCT_AGE_MILLIS = 0x36ee80L;
    private static final int REQUEST_CODE_ADDRESS_BOOK = 2;
    private static final int REQUEST_CODE_PAYMENT = 1;
    private static final String SHIPPING_PREFERENCES = "shipping_preferences";
    private static final String SHIPPING_PREFERENCE_EMAIL = "shipping_preferences.email";
    private static final String SHIPPING_PREFERENCE_PHONE = "shipping_preferences.phone";
    private EditText mEmailEditText;
    private EditText mPhoneEditText;
    private PrintOrder mPrintOrder;
    private Button mProceedButton;

    public CheckoutActivity()
    {
    }

    private void showErrorDialog(String s, String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(s).setMessage(s1).setPositiveButton("OK", null);
        builder.create().show();
    }

    private void showRetryTemplateSyncDialog(Exception exception)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Oops");
        builder.setMessage(exception.getLocalizedMessage());
        if ((exception instanceof UnknownHostException) || (exception instanceof SocketTimeoutException))
        {
            builder.setMessage("Please check your internet connectivity and then try again");
        }
        builder.setPositiveButton("Retry", new android.content.DialogInterface.OnClickListener() {

            final CheckoutActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                onProceedButtonClicked();
            }

            
            {
                this$0 = CheckoutActivity.this;
                super();
            }
        });
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }

    public static void start(Activity activity, PrintOrder printorder, int i)
    {
        Intent intent = new Intent(activity, ly/kite/checkout/CheckoutActivity);
        intent.putExtra("ly.kite.EXTRA_PRINT_ORDER", printorder);
        activity.startActivityForResult(intent, i);
    }

    private void startPaymentActivity()
    {
        try
        {
            Catalogue catalogue = CatalogueLoader.getInstance(this).getCachedCatalogue(0x36ee80L);
            for (Iterator iterator = mPrintOrder.getJobs().iterator(); iterator.hasNext(); catalogue.confirmProductIdExistsOrThrow(((PrintJob)iterator.next()).getProduct().getId())) { }
        }
        catch (Exception exception)
        {
            showRetryTemplateSyncDialog(exception);
            return;
        }
        KiteSDK kitesdk = KiteSDK.getInstance(this);
        PaymentActivity.start(this, mPrintOrder, kitesdk.getAPIKey(), kitesdk.getEnvironment().getPaymentActivityEnvironment(), 1);
    }

    boolean isEmailValid(CharSequence charsequence)
    {
        return Patterns.EMAIL_ADDRESS.matcher(charsequence).matches();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == -1)
            {
                setResult(-1);
                finish();
            }
        } else
        if (i == 2 && j == -1)
        {
            intent = (Address)intent.getParcelableExtra("ly.kite.EXTRA_ADDRESS");
            mPrintOrder.setShippingAddress(intent);
            ((Button)findViewById(ly.kite.R.id.address_picker_button)).setText(intent.toString());
            PricingAgent.getInstance().requestPricing(this, mPrintOrder, null);
            return;
        }
    }

    public void onChooseDeliveryAddressButtonClicked(View view)
    {
        startActivityForResult(new Intent(this, ly/kite/address/AddressBookActivity), 2);
    }

    public void onClick(View view)
    {
        if (view == mProceedButton)
        {
            onProceedButtonClicked();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(8);
        setContentView(ly.kite.R.layout.screen_checkout);
        mEmailEditText = (EditText)findViewById(ly.kite.R.id.email_edit_text);
        mPhoneEditText = (EditText)findViewById(ly.kite.R.id.phone_edit_text);
        mProceedButton = (Button)findViewById(ly.kite.R.id.proceed_overlay_button);
        Object obj = getSharedPreferences("shipping_preferences", 0);
        String s = ((SharedPreferences) (obj)).getString("shipping_preferences.email", null);
        obj = ((SharedPreferences) (obj)).getString("shipping_preferences.phone", null);
        if (s != null)
        {
            mEmailEditText.setText(s);
        }
        if (obj != null)
        {
            mPhoneEditText.setText(((CharSequence) (obj)));
        }
        if (!KiteSDK.getInstance(this).getRequestPhoneNumber())
        {
            mPhoneEditText.setVisibility(8);
            findViewById(ly.kite.R.id.phone_require_reason).setVisibility(8);
        }
        s = getIntent().getStringExtra("ly.kite.EXTRA_PRINT_API_KEY");
        getIntent().getStringExtra("ly.kite.EXTRA_PRINT_ENVIRONMENT");
        mPrintOrder = (PrintOrder)getIntent().getParcelableExtra("ly.kite.EXTRA_PRINT_ORDER");
        if (s == null && KiteSDK.getInstance(this).getAPIKey() == null)
        {
            throw new IllegalArgumentException("You must specify an API key string extra in the intent used to start the CheckoutActivity or with KitePrintSDK.initialize");
        }
        if (mPrintOrder == null)
        {
            throw new IllegalArgumentException("You must specify a PrintOrder object extra in the intent used to start the CheckoutActivity");
        }
        if (mPrintOrder.getJobs().size() < 1)
        {
            throw new IllegalArgumentException("You must specify a PrintOrder object extra that actually has some jobs for printing i.e. PrintOrder.getJobs().size() > 0");
        }
        mProceedButton.setText(ly.kite.R.string.shipping_proceed_button_text);
        getWindow().setSoftInputMode(3);
        PricingAgent.getInstance().requestPricing(this, mPrintOrder, null);
        if (bundle == null)
        {
            Analytics.getInstance(this).trackShippingScreenViewed(mPrintOrder, "Classic + Address Search", true);
        }
        mProceedButton.setOnClickListener(this);
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

    public void onProceedButtonClicked()
    {
        String s = mEmailEditText.getText().toString();
        String s1 = mPhoneEditText.getText().toString();
        if (mPrintOrder.getShippingAddress() == null)
        {
            showErrorDialog("Invalid Delivery Address", "Please choose a delivery address");
            return;
        }
        if (!isEmailValid(s))
        {
            showErrorDialog("Invalid Email Address", "Please enter a valid email address");
            return;
        }
        if (KiteSDK.getInstance(this).getRequestPhoneNumber() && s1.length() < 5)
        {
            showErrorDialog("Invalid Phone Number", "Please enter a valid phone number");
            return;
        }
        JSONObject jsonobject = mPrintOrder.getUserData();
        final ProgressDialog progress = jsonobject;
        if (jsonobject == null)
        {
            progress = new JSONObject();
        }
        try
        {
            progress.put("email", s);
            progress.put("phone", s1);
        }
        catch (JSONException jsonexception) { }
        mPrintOrder.setUserData(progress);
        mPrintOrder.setNotificationEmail(s);
        mPrintOrder.setNotificationPhoneNumber(s1);
        progress = getSharedPreferences("shipping_preferences", 0).edit();
        progress.putString("shipping_preferences.email", s);
        progress.putString("shipping_preferences.phone", s1);
        progress.commit();
        progress = ProgressDialog.show(this, null, "Loading");
        CatalogueLoader.getInstance(this).requestCatalogue(0x36ee80L, new ICatalogueConsumer() {

            final CheckoutActivity this$0;
            final ProgressDialog val$progress;

            public void onCatalogueError(Exception exception)
            {
                progress.dismiss();
                showRetryTemplateSyncDialog(exception);
            }

            public void onCatalogueSuccess(Catalogue catalogue)
            {
                progress.dismiss();
                startPaymentActivity();
            }

            
            {
                this$0 = CheckoutActivity.this;
                progress = progressdialog;
                super();
            }
        });
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        mPrintOrder = (PrintOrder)bundle.getParcelable("ly.kite.EXTRA_PRINT_ORDER");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("ly.kite.EXTRA_PRINT_ORDER", mPrintOrder);
    }


}
