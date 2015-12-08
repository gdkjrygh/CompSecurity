// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl;


// Referenced classes of package com.microsoft.dl:
//            BuildInfo

public static final class  extends Enum
{

    public static final RELEASE DEBUG;
    public static final RELEASE INTERNAL;
    public static final RELEASE RELEASE;
    private static final RELEASE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/dl/BuildInfo$Flavour, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0);
        INTERNAL = new <init>("INTERNAL", 1);
        RELEASE = new <init>("RELEASE", 2);
        a = (new a[] {
            DEBUG, INTERNAL, RELEASE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
