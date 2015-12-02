// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b.a;

import com.google.common.d.a.ab;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.b.a:
//            b

class d
    implements h
{

    final ab a;
    final b b;

    d(b b1, ab ab1)
    {
        b = b1;
        a = ab1;
        super();
    }

    public void a(Boolean boolean1)
    {
        a.a_(boolean1);
    }

    public volatile void a(Object obj)
    {
        a((Boolean)obj);
    }

    public void a(Throwable throwable)
    {
        a.a_(throwable);
    }
}
