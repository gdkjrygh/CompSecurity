// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;


// Referenced classes of package com.microsoft.onlineid.internal:
//            c

public static final class  extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/onlineid/internal/c$a, s);
    }

    public static [] values()
    {
        return ([])c.clone();
    }

    public final String a()
    {
        return (new StringBuilder("com.microsoft.msa.authenticator.")).append(name()).toString();
    }

    static 
    {
        a = new <init>("Exception", 0);
        b = new <init>("UINeededIntent", 1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
