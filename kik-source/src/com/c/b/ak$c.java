// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            ak, bd

public static final class owable extends Exception
{

    private final String a;
    private final bd b;
    private final String c;

    private ing(ing ing, String s)
    {
        super((new StringBuilder()).append(ing.b()).append(": ").append(s).toString());
        a = ing.b();
        b = ing.a();
        c = s;
    }

    ing(ing ing, String s, byte byte0)
    {
        this(ing, s);
    }

    private ing(ing ing, String s)
    {
        super((new StringBuilder()).append(ing.c()).append(": ").append(s).toString());
        a = ing.c();
        b = ing.i();
        c = s;
    }

    ing(ing ing, String s, byte byte0)
    {
        this(ing, s);
    }

    private owable(owable owable, String s, Throwable throwable)
    {
        this(owable, s);
        initCause(throwable);
    }

    owable(owable owable, String s, Throwable throwable, byte byte0)
    {
        this(owable, s, throwable);
    }
}
