// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package com.flurry.sdk:
//            jx, lc, iy, jy, 
//            jw

class it>
    implements jx
{

    final iy a;

    public volatile void a(jw jw)
    {
        a((lc)jw);
    }

    public void a(lc lc1)
    {
        if (iy.a(a) != null && lc1.b != iy.a(a).get())
        {
            return;
        }
        switch (a[lc1.c.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.a(lc1.b, (Context)lc1.a.get());
            return;

        case 2: // '\002'
            a.a((Context)lc1.a.get());
            return;

        case 3: // '\003'
            a.b((Context)lc1.a.get());
            return;

        case 4: // '\004'
            jy.a().b("com.flurry.android.sdk.FlurrySessionEvent", iy.b(a));
            break;
        }
        a.a(lc1.d);
    }

    ext(iy iy1)
    {
        a = iy1;
        super();
    }
}
