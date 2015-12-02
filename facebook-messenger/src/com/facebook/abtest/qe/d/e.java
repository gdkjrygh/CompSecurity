// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.d;

import com.facebook.abtest.qe.b.a;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.abtest.qe.d:
//            a, c

public class e
{

    private final a a;
    private final com.facebook.abtest.qe.e.a b;

    public e(a a1, com.facebook.abtest.qe.e.a a2)
    {
        a = (a)Preconditions.checkNotNull(a1);
        b = (com.facebook.abtest.qe.e.a)Preconditions.checkNotNull(a2);
    }

    public com.facebook.abtest.qe.d.a a(String s, c c)
    {
        return new com.facebook.abtest.qe.d.a(a, b, s, c);
    }
}
