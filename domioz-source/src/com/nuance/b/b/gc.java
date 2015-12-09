// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.af;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.b.c;

// Referenced classes of package com.nuance.b.b:
//            fr, ax, v, es

final class gc
    implements c
{

    private final b a;

    public gc(b b1)
    {
        a = b1;
    }

    public final void a()
    {
        fr.e((new StringBuilder("prompt ")).append(a.b()).append(" success.").toString());
    }

    public final void a(an an1)
    {
        Object obj = new StringBuilder();
        new ax();
        obj = ((StringBuilder) (obj)).append(ax.a(an1)).append("-").append(an1.e()).append("-").append(an1.d()).toString();
        fr.a((new StringBuilder("prompt ")).append(a.b()).append(" error: ").append(((String) (obj))).toString());
        boolean flag = true;
        obj = v.r().h;
        if (obj != null)
        {
            flag = ((es) (obj)).a();
        }
        a.b(new ae(a.b(), af.g, null, an1.d(), flag));
    }
}
