// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.kohls.mcommerce.opal.framework.view.activity.ScanHelpActivity;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ZxingScannerActivity

class this._cls0
    implements android.content.Listener
{

    final ZxingScannerActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
        dialoginterface.setData(Uri.parse("file:///android_asset/scan_help.html"));
        dialoginterface.putExtra("scan_request", 2001);
        dialoginterface.setAction("android.intent.action.VIEW");
        startActivity(dialoginterface);
    }

    y()
    {
        this$0 = ZxingScannerActivity.this;
        super();
    }
}
