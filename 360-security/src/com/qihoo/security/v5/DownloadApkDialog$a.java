// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.widget.ProgressView;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadApkDialog

private class ndViewById
{

    final DownloadApkDialog a;
    private final Context b;
    private final ProgressView c;

    public void a()
    {
        a.finish();
    }

    public void a(int i)
    {
        ((LocaleTextView)a.findViewById(0x7f0b0107)).setLocalText((new StringBuilder()).append(String.valueOf(i)).append("%").toString());
        c.setProgress((float)i / 100F);
        DownloadApkDialog.a(a, i);
    }

    public tView(DownloadApkDialog downloadapkdialog, Context context)
    {
        a = downloadapkdialog;
        super();
        b = context.getApplicationContext();
        c = (ProgressView)downloadapkdialog.findViewById(0x7f0b0108);
    }
}
