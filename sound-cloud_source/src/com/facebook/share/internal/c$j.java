// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.AccessToken;
import com.facebook.D;
import com.facebook.E;
import com.facebook.G;
import com.facebook.GraphRequest;
import com.facebook.internal.K;
import com.facebook.r;

// Referenced classes of package com.facebook.share.internal:
//            c

private final class  extends 
{

    final c e;
    private String f;

    protected final void a(D d)
    {
    }

    protected final void a(r r)
    {
        K.a(G.a, c.f(), "Error unliking object with unlike token '%s' : %s", new Object[] {
            f, r
        });
        c.a(e, "publish_unlike", r);
    }

    (c c1, String s)
    {
        e = c1;
        super(c1, null, null);
        f = s;
        a(new GraphRequest(AccessToken.a(), s, null, E.c));
    }
}
