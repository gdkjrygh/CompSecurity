// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;


// Referenced classes of package com.umeng.common.net:
//            DownloadingService

class h
    implements Runnable
{

    final DownloadingService a;

    h(DownloadingService downloadingservice)
    {
        a = downloadingservice;
        super();
    }

    public void run()
    {
        DownloadingService.a(Boolean.valueOf(false));
    }
}
