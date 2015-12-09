// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.GraphRequest;
import com.facebook.ag;
import com.facebook.aj;
import com.facebook.am;
import com.facebook.internal.ak;
import com.facebook.n;
import com.facebook.share.a.g;

// Referenced classes of package com.facebook.share.internal:
//            k, a

abstract class j
{

    protected String a;
    protected g b;
    n c;
    final a d;
    private GraphRequest e;

    protected j(a a1, String s, g g)
    {
        d = a1;
        super();
        a = s;
        b = g;
    }

    protected final void a(GraphRequest graphrequest)
    {
        e = graphrequest;
        graphrequest.b("v2.3");
        graphrequest.a(new k(this));
    }

    final void a(ag ag1)
    {
        ag1.a(e);
    }

    protected abstract void a(aj aj);

    protected void a(n n)
    {
        ak.a(am.a, com.facebook.share.internal.a.e(), "Error running request for object '%s' with type '%s' : %s", new Object[] {
            a, b, n
        });
    }
}
