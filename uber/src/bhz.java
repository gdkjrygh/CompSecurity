// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wallet.LineItem;

public final class bhz
{

    final LineItem a;

    private bhz(LineItem lineitem)
    {
        a = lineitem;
        super();
    }

    public bhz(LineItem lineitem, byte byte0)
    {
        this(lineitem);
    }

    public final bhz a(String s)
    {
        a.a = s;
        return this;
    }

    public final LineItem a()
    {
        return a;
    }

    public final bhz b(String s)
    {
        a.b = s;
        return this;
    }

    public final bhz c(String s)
    {
        a.c = s;
        return this;
    }

    public final bhz d(String s)
    {
        a.d = s;
        return this;
    }

    public final bhz e(String s)
    {
        a.f = s;
        return this;
    }
}
