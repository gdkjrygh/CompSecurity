// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.widget.Toast;
import com.umeng.common.a.c;

class j
    implements Runnable
{

    final DownloadingService.b a;

    j(DownloadingService.b b)
    {
        a = b;
        super();
    }

    public void run()
    {
        Toast.makeText(DownloadingService.b.b(a), c.h(DownloadingService.b.a(a)), 0).show();
    }
}
