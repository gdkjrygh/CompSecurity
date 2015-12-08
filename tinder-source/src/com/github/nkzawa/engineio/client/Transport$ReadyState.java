// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;


// Referenced classes of package com.github.nkzawa.engineio.client:
//            Transport

protected static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/github/nkzawa/engineio/client/Transport$ReadyState, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase();
    }

    static 
    {
        a = new <init>("OPENING", 0);
        b = new <init>("OPEN", 1);
        c = new <init>("CLOSED", 2);
        d = new <init>("PAUSED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
