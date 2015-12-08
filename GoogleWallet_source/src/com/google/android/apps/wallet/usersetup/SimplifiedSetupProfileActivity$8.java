// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

final class this._cls0
    implements com.google.android.gms.common.tionFailedListener
{

    final SimplifiedSetupProfileActivity this$0;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        Object obj = SimplifiedSetupProfileActivity.access$900();
        String s = String.valueOf(connectionresult);
        WLog.w(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 27)).append("Client connection failure: ").append(s).toString());
        obj = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), SimplifiedSetupProfileActivity.this, 9001, new android.content.DialogInterface.OnCancelListener() {

            final SimplifiedSetupProfileActivity._cls8 this$1;

            public final void onCancel(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$1 = SimplifiedSetupProfileActivity._cls8.this;
                super();
            }
        });
        if (obj != null)
        {
            ((Dialog) (obj)).show();
        } else
        if (connectionresult.hasResolution())
        {
            try
            {
                connectionresult.startResolutionForResult(SimplifiedSetupProfileActivity.this, 9000);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                peopleClient.connect();
            }
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = SimplifiedSetupProfileActivity.this;
        super();
    }
}
