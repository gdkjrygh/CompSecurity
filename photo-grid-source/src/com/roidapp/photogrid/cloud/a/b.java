// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            a

final class b extends AdListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void onAdFailedToLoad(int i)
    {
        com.roidapp.photogrid.cloud.a.a.d(a);
        com.roidapp.photogrid.cloud.a.a.e(a);
        com.roidapp.photogrid.cloud.a.a.a(a, null);
        if (a.d != null)
        {
            com.roidapp.photogrid.cloud.a.a.c(a);
        }
    }

    public final void onAdOpened()
    {
        super.onAdOpened();
        a.onClick(null);
    }
}
