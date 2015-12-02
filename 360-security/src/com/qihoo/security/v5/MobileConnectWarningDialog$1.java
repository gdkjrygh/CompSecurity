// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.qihoo.security.v5:
//            MobileConnectWarningDialog, UpdateDownloadUIService

class a
    implements android.view.Dialog._cls1
{

    final MobileConnectWarningDialog a;

    public void onClick(View view)
    {
        view = new Intent(MobileConnectWarningDialog.a(a), com/qihoo/security/v5/UpdateDownloadUIService);
        view.putExtra("uiforce", MobileConnectWarningDialog.b(a));
        view.putExtra("ispatch", MobileConnectWarningDialog.c(a));
        view.putExtra("type", MobileConnectWarningDialog.d(a));
        a.startService(view);
        a.finish();
    }

    (MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        a = mobileconnectwarningdialog;
        super();
    }
}
