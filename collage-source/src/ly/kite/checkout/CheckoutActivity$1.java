// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.ProgressDialog;
import ly.kite.catalogue.Catalogue;
import ly.kite.catalogue.ICatalogueConsumer;

// Referenced classes of package ly.kite.checkout:
//            CheckoutActivity

class val.progress
    implements ICatalogueConsumer
{

    final CheckoutActivity this$0;
    final ProgressDialog val$progress;

    public void onCatalogueError(Exception exception)
    {
        val$progress.dismiss();
        CheckoutActivity.access$100(CheckoutActivity.this, exception);
    }

    public void onCatalogueSuccess(Catalogue catalogue)
    {
        val$progress.dismiss();
        CheckoutActivity.access$000(CheckoutActivity.this);
    }

    ()
    {
        this$0 = final_checkoutactivity;
        val$progress = ProgressDialog.this;
        super();
    }
}
