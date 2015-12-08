// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package com.flurry.sdk:
//            jx, lc, jn, jy, 
//            jw

class it>
    implements jx
{

    final jn a;

    public volatile void a(jw jw)
    {
        a((lc)jw);
    }

    public void a(lc lc1)
    {
        if (jn.a(a) != null && lc1.b != jn.a(a).get())
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
            jy.a().b("com.flurry.android.sdk.FlurrySessionEvent", jn.b(a));
            break;
        }
        a.a();
    }

    ext(jn jn1)
    {
        a = jn1;
        super();
    }
}
