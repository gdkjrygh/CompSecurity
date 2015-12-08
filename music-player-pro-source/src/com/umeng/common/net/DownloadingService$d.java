// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.app.Notification;
import java.util.Map;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

private static class e
{

    c a;
    Notification b;
    int c;
    int d;
    c e;
    long f[];

    public void a()
    {
        DownloadingService.c().put(Integer.valueOf(c), this);
    }

    public void b()
    {
        if (DownloadingService.c().containsKey(Integer.valueOf(c)))
        {
            DownloadingService.c().remove(Integer.valueOf(c));
        }
    }

    public ( , int i)
    {
        f = new long[3];
        c = i;
        e = ;
    }
}
