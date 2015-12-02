// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.view.View;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadApkDialog, c

class a
    implements android.view.
{

    final DownloadApkDialog a;

    public void onClick(View view)
    {
        com.qihoo.security.v5.c.a(DownloadApkDialog.b(a));
        a.finish();
        com.qihoo360.mobilesafe.b.a.e(DownloadApkDialog.b(a));
    }

    (DownloadApkDialog downloadapkdialog)
    {
        a = downloadapkdialog;
        super();
    }
}
