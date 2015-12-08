// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import com.pandora.android.countdown.b;
import p.dc.a;

// Referenced classes of package com.pandora.android.iap:
//            a

class a
    implements Runnable
{

    final com.pandora.android.iap.a a;

    public void run()
    {
        Object obj = com.pandora.android.iap.a.b(a, com.pandora.android.iap.a.g(a));
        if (com.pandora.android.iap.a.g(a).i() && ((com.pandora.android.countdown.a) (obj)).h())
        {
            com.pandora.android.iap.a.a(a, ((com.pandora.android.countdown.a) (obj)));
            obj = new b(com.pandora.android.countdown.b, com.pandora.android.iap.a.d(a));
            com.pandora.android.iap.a.e(a).e().a(obj);
            return;
        } else
        {
            com.pandora.android.iap.a.a(a, null);
            return;
        }
    }

    .b(com.pandora.android.iap.a a1)
    {
        a = a1;
        super();
    }
}
