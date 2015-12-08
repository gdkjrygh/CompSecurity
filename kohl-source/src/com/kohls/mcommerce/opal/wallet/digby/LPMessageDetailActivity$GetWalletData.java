// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.digby;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import com.kohls.mcommerce.opal.wallet.asynctask.GetDataFromServerTask;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.digby:
//            LPMessageDetailActivity

private class isEnabled extends GetDataFromServerTask
{

    boolean isEnabled;
    ProgressDialog progressDialog;
    final LPMessageDetailActivity this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        isEnabled = false;
        avoid = retrieveWalletResponse();
        if (avoid == null || !hasErrors(avoid).booleanValue()) goto _L2; else goto _L1
_L1:
        if (((ErrorResponse)avoid.getErrors().get(0)).getErrorCode() != 5);
_L4:
        return null;
_L2:
        if (avoid != null && avoid.isSuccess())
        {
            isEnabled = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void doOnPostExecute()
    {
        progressDialog.cancel();
        if (isEnabled)
        {
            LPMessageDetailActivity.access$200(LPMessageDetailActivity.this, (WalletItemResponse)findViewById(0x7f0d0044).getTag());
        }
    }

    protected void onPreExecute()
    {
        progressDialog = ProgressDialog.show(LPMessageDetailActivity.this, "Adding Items", "Please wait");
        super.onPreExecute();
    }

    public Q(Context context)
    {
        this$0 = LPMessageDetailActivity.this;
        super(context);
        isEnabled = false;
    }
}
