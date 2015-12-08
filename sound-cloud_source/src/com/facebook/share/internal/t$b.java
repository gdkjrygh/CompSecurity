// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.a;
import com.facebook.internal.o;

// Referenced classes of package com.facebook.share.internal:
//            t, LikeContent

private final class <init> extends com.facebook.internal.l.t.b
{

    final t b;

    public final boolean a(Object obj)
    {
        return (LikeContent)obj != null && t.e();
    }

    public final a b(Object obj)
    {
        obj = (LikeContent)obj;
        a a1 = b.c();
        o.a(a1, com.facebook.share.internal.t.a(((LikeContent) (obj))), t.f());
        return a1;
    }

    private Content(t t1)
    {
        b = t1;
        super(t1);
    }

    (t t1, byte byte0)
    {
        this(t1);
    }
}
