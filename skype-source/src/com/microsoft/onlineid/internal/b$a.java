// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;


// Referenced classes of package com.microsoft.onlineid.internal:
//            b

public static final class  extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/onlineid/internal/b$a, s);
    }

    public static [] values()
    {
        return ([])k.clone();
    }

    public final String a()
    {
        return (new StringBuilder("com.microsoft.msa.authenticator.")).append(name()).toString();
    }

    static 
    {
        a = new <init>("AccountName", 0);
        b = new <init>("AccountPuid", 1);
        c = new <init>("ClientPackageName", 2);
        d = new <init>("ClientStateBundle", 3);
        e = new <init>("CobrandingId", 4);
        f = new <init>("Continuation", 5);
        g = new <init>("FlowToken", 6);
        h = new <init>("IsSdkRequest", 7);
        i = new <init>("ResultReceiver", 8);
        j = new <init>("Scope", 9);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private (String s, int l)
    {
        super(s, l);
    }
}
