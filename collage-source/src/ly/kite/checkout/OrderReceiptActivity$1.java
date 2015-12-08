// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.ProgressDialog;
import android.os.Looper;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ly.kite.catalogue.PrintOrder;
import ly.kite.catalogue.PrintOrderSubmissionListener;

// Referenced classes of package ly.kite.checkout:
//            OrderReceiptActivity

class val.dialog
    implements PrintOrderSubmissionListener
{

    final OrderReceiptActivity this$0;
    final ProgressDialog val$dialog;

    public void onError(PrintOrder printorder, Exception exception)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new AssertionError("Should be calling back on the main thread");
        } else
        {
            val$dialog.dismiss();
            OrderReceiptActivity.access$000(OrderReceiptActivity.this, exception.getMessage());
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
            val$dialog.setProgress(i);
            val$dialog.setSecondaryProgress(j);
            val$dialog.setMessage("Uploading images");
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
            val$dialog.dismiss();
            s = (Button)findViewById(ly.kite.);
            ImageView imageview = (ImageView)findViewById(ly.kite.eceipt_header);
            ((TextView)findViewById(ly.kite.)).setText(printorder.getReceipt());
            imageview.setImageResource(ly.kite.ess);
            s.setVisibility(8);
            return;
        }
    }

    stener()
    {
        this$0 = final_orderreceiptactivity;
        val$dialog = ProgressDialog.this;
        super();
    }
}
