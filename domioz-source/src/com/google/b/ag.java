// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


// Referenced classes of package com.google.b:
//            ah, ai

public abstract class ag extends Enum
{

    public static final ag a;
    public static final ag b;
    private static final ag c[];

    private ag(String s, int i)
    {
        super(s, i);
    }

    ag(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/google/b/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])c.clone();
    }

    static 
    {
        a = new ah("DEFAULT");
        b = new ai("STRING");
        c = (new ag[] {
            a, b
        });
    }
}
