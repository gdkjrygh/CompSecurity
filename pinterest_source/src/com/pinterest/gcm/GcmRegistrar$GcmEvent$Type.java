// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.gcm;


public final class  extends Enum
{

    public static final a a;
    private static final a b[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/gcm/GcmRegistrar$GcmEvent$Type, s);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    static 
    {
        a = new <init>("UNREGISTER");
        b = (new b[] {
            a
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
