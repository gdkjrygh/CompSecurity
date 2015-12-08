// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.a.aa;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.b.e;

// Referenced classes of package com.nuance.b.b:
//            fm, ax, v, ad, 
//            fr

abstract class gp
    implements aa
{

    protected final long b;
    protected String c;
    protected String d;
    protected fm e;
    protected ax f;

    public gp(long l, String s, String s1)
    {
        b = l;
        c = s;
        d = s1;
        e = new fm();
        f = new ax();
    }

    void a()
    {
        v.r().c().b();
    }

    void a(ao ao1)
    {
        ad ad1;
        if (!ao1.e())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        ad1 = v.r().c();
        ao1.d().e("adk_result");
        com.nuance.b.b.fr.e("Found adk_result in transaction response, restarting session timer");
        ad1.a();
        return;
        ao1;
        com.nuance.b.b.fr.e("Unable to find adk_result in transaction response, resuming session timer");
        ad1.c();
        return;
    }

    public void a(x x)
    {
        com.nuance.b.b.fr.e((new StringBuilder()).append(d()).append(" onTransactionStarted ").toString());
        a();
    }

    public void a(x x, an an1)
    {
        if (an1.b() == 0)
        {
            fr.c((new StringBuilder()).append(d()).append(" cancelled").toString());
        } else
        {
            fr.a((new StringBuilder()).append(d()).append(" onTransactionError ").append(ax.a(an1)).append("(type:").append(an1.b()).append(" code: ").append(an1.g()).append(" ").append(an1.d()).append(" ").append(an1.e()).append(" ").append(an1.f()).append(")").toString());
        }
        b();
    }

    public void a(x x, ao ao1, boolean flag)
    {
        fr.c((new StringBuilder()).append(d()).append(" onTransactionResult (final ").append(flag).append(") ").append("").toString());
        a(ao1);
    }

    void b()
    {
        v.r().c().c();
    }

    protected final String d()
    {
        return (new StringBuilder()).append(c).append(" (").append(b).append(")").toString();
    }
}
