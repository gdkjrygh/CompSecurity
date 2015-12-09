// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.pandora.radio.data.a;

// Referenced classes of package com.pandora.android.ads:
//            c, a

class b
    implements Runnable
{

    final com.pandora.android.ads.a a;
    final a b;
    final c c;

    public void run()
    {
        if (a.e == b && com.pandora.android.ads.c.a(c, "show_ad_test", a, true))
        {
            a.e = null;
        }
    }

    (c c1, com.pandora.android.ads.a a1, a a2)
    {
        c = c1;
        a = a1;
        b = a2;
        super();
    }
}
