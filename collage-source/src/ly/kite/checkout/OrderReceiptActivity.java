// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import ly.kite.catalogue.PrintOrder;
import ly.kite.catalogue.PrintOrderSubmissionListener;

// Referenced classes of package ly.kite.checkout:
//            PaymentActivity, OrderPricingAdaptor

public class OrderReceiptActivity extends Activity
{

    public static final String EXTRA_PRINT_ORDER = "ly.kite.EXTRA_PRINT_ORDER";
    private PrintOrder printOrder;

    public OrderReceiptActivity()
    {
    }

    private void showErrorDialog(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Oops!").setMessage(s).setPositiveButton("OK", null);
        builder.create().show();
    }

    public void onBackPressed()
    {
        setResult(-1);
        super.onBackPressed();
    }

    public void onButtonRetryPrintClicked(final View dialog)
    {
        dialog = new ProgressDialog(this);
        dialog.setCancelable(false);
        dialog.setIndeterminate(false);
        dialog.setProgressStyle(1);
        dialog.setTitle("Processing");
        dialog.setMessage("One moment...");
        dialog.setMax(100);
        dialog.show();
        printOrder.submitForPrinting(this, new PrintOrderSubmissionListener() {

            final OrderReceiptActivity this$0;
            final ProgressDialog val$dialog;

            public void onError(PrintOrder printorder, Exception exception)
            {
                if (Looper.myLooper() != Looper.getMainLooper())
                {
                    throw new AssertionError("Should be calling back on the main thread");
                } else
                {
                    dialog.dismiss();
                    showErrorDialog(exception.getMessage());
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
                    s = (Button)findViewById(ly.kite.R.id.button_retry_print);
                    ImageView imageview = (ImageView)findViewById(ly.kite.R.id.image_view_order_receipt_header);
                    ((TextView)findViewById(ly.kite.R.id.text_view_order_id)).setText(printorder.getReceipt());
                    imageview.setImageResource(ly.kite.R.drawable.receipt_success);
                    s.setVisibility(8);
                    return;
                }
            }

            
            {
                this$0 = OrderReceiptActivity.this;
                dialog = progressdialog;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(8);
        setContentView(ly.kite.R.layout.screen_order_receipt);
        printOrder = (PrintOrder)getIntent().getParcelableExtra("ly.kite.EXTRA_PRINT_ORDER");
        if (printOrder == null)
        {
            throw new IllegalArgumentException("You must specify a PrintOrder object extra in the intent used to start the OrderReceiptActivity");
        }
        if (getActionBar() != null)
        {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        if (!printOrder.isPrinted() && (getParent() instanceof PaymentActivity) && printOrder.getLastPrintSubmissionError() != null)
        {
            showErrorDialog(printOrder.getLastPrintSubmissionError().getMessage());
        }
        ((ListView)findViewById(ly.kite.R.id.order_summary_list_view)).setAdapter(new OrderPricingAdaptor(this, printOrder.getOrderPricing()));
        bundle = (TextView)findViewById(ly.kite.R.id.text_view_order_id);
        bundle.setText(printOrder.getReceipt());
        Object obj = (Button)findViewById(ly.kite.R.id.button_retry_print);
        ImageView imageview = (ImageView)findViewById(ly.kite.R.id.image_view_order_receipt_header);
        if (printOrder.isPrinted())
        {
            imageview.setImageResource(ly.kite.R.drawable.receipt_success);
            ((Button) (obj)).setVisibility(8);
            return;
        }
        imageview.setImageResource(ly.kite.R.drawable.receipt_failure);
        ((Button) (obj)).setVisibility(0);
        obj = new StringBuilder();
        if (printOrder.getProofOfPayment() != null)
        {
            ((StringBuilder) (obj)).append(printOrder.getProofOfPayment());
        }
        if (printOrder.getPromoCode() != null)
        {
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append(" ");
            }
            ((StringBuilder) (obj)).append("PROMO-").append(printOrder.getPromoCode());
        }
        bundle.setText(((CharSequence) (obj)));
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            setResult(-1);
            finish();
            return true;
        } else
        {
            return super.onMenuItemSelected(i, menuitem);
        }
    }

}
