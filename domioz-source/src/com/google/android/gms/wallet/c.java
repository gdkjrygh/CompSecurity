// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public final class c
{

    final LineItem a;

    private c(LineItem lineitem)
    {
        a = lineitem;
        super();
    }

    c(LineItem lineitem, byte byte0)
    {
        this(lineitem);
    }

    public final LineItem a()
    {
        return a;
    }

    public final c a(int i)
    {
        a.e = i;
        return this;
    }

    public final c a(String s)
    {
        a.a = s;
        return this;
    }

    public final c b(String s)
    {
        a.b = s;
        return this;
    }

    public final c c(String s)
    {
        a.c = s;
        return this;
    }

    public final c d(String s)
    {
        a.d = s;
        return this;
    }

    public final c e(String s)
    {
        a.f = s;
        return this;
    }
}
