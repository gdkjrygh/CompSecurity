// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            d, j

static final class b extends d
{

    private d a;
    private d b;

    final d a(String s)
    {
        return new <init>(a, b, s);
    }

    public final boolean a(char c)
    {
        return a.a(c) || b.a(c);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    (d d1, d d2)
    {
        this(d1, d2, (new StringBuilder("CharMatcher.or(")).append(d1).append(", ").append(d2).append(")").toString());
    }

    private <init>(d d1, d d2, String s)
    {
        super(s);
        a = (d)j.a(d1);
        b = (d)j.a(d2);
    }
}
