// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            ae, aj, ak, al, 
//            am

abstract class ai extends Enum
    implements ae
{

    public static final ai a;
    public static final ai b;
    public static final ai c;
    public static final ai d;
    private static final ai e[];

    private ai(String s, int i)
    {
        super(s, i);
    }

    ai(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/google/a/a/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])e.clone();
    }

    static 
    {
        a = new aj("ALWAYS_TRUE");
        b = new ak("ALWAYS_FALSE");
        c = new al("IS_NULL");
        d = new am("NOT_NULL");
        e = (new ai[] {
            a, b, c, d
        });
    }
}
