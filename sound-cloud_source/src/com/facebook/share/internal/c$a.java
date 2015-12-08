// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.C;
import com.facebook.D;
import com.facebook.G;
import com.facebook.GraphRequest;
import com.facebook.internal.K;
import com.facebook.r;

// Referenced classes of package com.facebook.share.internal:
//            c, q

private abstract class b
{

    protected String a;
    protected com.facebook.share.widget.View.e b;
    r c;
    final c d;
    private GraphRequest e;

    final void a(C c1)
    {
        c1.a(e);
    }

    protected abstract void a(D d1);

    protected final void a(GraphRequest graphrequest)
    {
        e = graphrequest;
        graphrequest.g = "v2.4";
        graphrequest.a(new q(this));
    }

    protected void a(r r)
    {
        K.a(G.a, com.facebook.share.internal.c.f(), "Error running request for object '%s' with type '%s' : %s", new Object[] {
            a, b, r
        });
    }

    protected (c c1, String s, com.facebook.share.widget.View.e e1)
    {
        d = c1;
        super();
        a = s;
        b = e1;
    }
}
