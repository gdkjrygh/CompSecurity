// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;


// Referenced classes of package com.google.a:
//            ai, aj

public abstract class ah extends Enum
{

    public static final ah a;
    public static final ah b;
    private static final ah c[];

    private ah(String s, int i)
    {
        super(s, i);
    }

    ah(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static ah valueOf(String s)
    {
        return (ah)Enum.valueOf(com/google/a/ah, s);
    }

    public static ah[] values()
    {
        return (ah[])c.clone();
    }

    static 
    {
        a = new ai("DEFAULT");
        b = new aj("STRING");
        c = (new ah[] {
            a, b
        });
    }
}
