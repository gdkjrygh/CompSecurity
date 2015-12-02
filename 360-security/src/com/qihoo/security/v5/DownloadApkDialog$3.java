// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadApkDialog

class a
    implements android.view.
{

    final DownloadApkDialog a;

    public void onClick(View view)
    {
        view = new Intent("com.qihoo.security.action.ACTION_HIDE_DOWNLOAD_APK_DIALOG");
        view.putExtra("progress", DownloadApkDialog.c(a));
        DownloadApkDialog.b(a).sendBroadcast(view, "com.qihoo.security.lite.PERMISSION");
        a.finish();
    }

    (DownloadApkDialog downloadapkdialog)
    {
        a = downloadapkdialog;
        super();
    }
}
