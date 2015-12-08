// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.widget.Toast;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

class g
    implements Runnable
{

    final DownloadingService a;
    private final String b;

    g(DownloadingService downloadingservice, String s)
    {
        a = downloadingservice;
        b = s;
        super();
    }

    public void run()
    {
        Toast.makeText(DownloadingService.a(a), b, 0).show();
    }
}
