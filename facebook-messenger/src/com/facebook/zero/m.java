// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.inject.d;
import com.facebook.zero.annotations.IsZeroRatingFeatureEnabled;
import com.facebook.zero.rewrite.b;
import com.facebook.zero.rewrite.f;

// Referenced classes of package com.facebook.zero:
//            c, d

class m extends d
{

    final c a;

    private m(c c)
    {
        a = c;
        super();
    }

    m(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public b a()
    {
        return new b((f)a(com/facebook/zero/rewrite/f), b(java/lang/Boolean, com/facebook/zero/annotations/IsZeroRatingFeatureEnabled));
    }

    public Object b()
    {
        return a();
    }
}
