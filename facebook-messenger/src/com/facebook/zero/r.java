// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.inject.d;
import com.facebook.zero.annotations.IsZeroRatingFeatureEnabled;
import com.facebook.zero.d.a;
import com.facebook.zero.protocol.a.b;
import com.facebook.zero.rewrite.e;
import com.facebook.zero.ui.p;

// Referenced classes of package com.facebook.zero:
//            a, c, d

class r extends d
{

    final c a;

    private r(c c)
    {
        a = c;
        super();
    }

    r(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public com.facebook.zero.a a()
    {
        return new com.facebook.zero.a((com.facebook.zero.b.d)a(com/facebook/zero/b/d), (a)a(com/facebook/zero/d/a), (com.facebook.zero.server.d)a(com/facebook/zero/server/d), (b)a(com/facebook/zero/protocol/a/b), (p)a(com/facebook/zero/ui/p), (e)a(com/facebook/zero/rewrite/e), b(java/lang/Boolean, com/facebook/zero/annotations/IsZeroRatingFeatureEnabled));
    }

    public Object b()
    {
        return a();
    }
}
