// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadApkDialog, c, UpdateDownloadUIService

class a
    implements android.view.
{

    final DownloadApkDialog a;

    public void onClick(View view)
    {
        c.a(DownloadApkDialog.b(a));
        DownloadApkDialog.b(a).stopService(new Intent(DownloadApkDialog.b(a), com/qihoo/security/v5/UpdateDownloadUIService));
        a.finish();
    }

    ice(DownloadApkDialog downloadapkdialog)
    {
        a = downloadapkdialog;
        super();
    }
}
