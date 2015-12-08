// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            KohlsError

public class NetworkFailureActivity extends Activity
{

    public NetworkFailureActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new android.app.AlertDialog.Builder(this)).setTitle("Kohl's").setMessage(KohlsError.getInstance().getErrorMessage(String.valueOf("internetConnectivityFailure"))).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final NetworkFailureActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = NetworkFailureActivity.this;
                super();
            }
        }).show();
    }
}
