// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import com.google.android.gms.ads.AdListener;
import com.roidapp.photogrid.common.ai;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            a

final class b extends AdListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void onAdClosed()
    {
    }

    public final void onAdFailedToLoad(int i)
    {
        com.roidapp.photogrid.cloud.a.a(a);
    }

    public final void onAdLeftApplication()
    {
    }

    public final void onAdLoaded()
    {
        com.roidapp.photogrid.cloud.a.a(com.roidapp.photogrid.cloud.a.b(a), 1, 2);
        if (com.roidapp.photogrid.cloud.a.b(a) != null && !com.roidapp.photogrid.cloud.a.b(a).isFinishing())
        {
            ai.a();
            ai.c();
        }
    }

    public final void onAdOpened()
    {
        com.roidapp.photogrid.cloud.a.a(com.roidapp.photogrid.cloud.a.b(a), 4, 2);
        if (com.roidapp.photogrid.cloud.a.b(a) != null && !com.roidapp.photogrid.cloud.a.b(a).isFinishing())
        {
            ai.a();
            ai.d();
        }
    }
}
