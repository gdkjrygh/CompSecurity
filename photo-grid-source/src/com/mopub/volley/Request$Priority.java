// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


public final class  extends Enum
{

    public static final IMMEDIATE HIGH;
    public static final IMMEDIATE IMMEDIATE;
    public static final IMMEDIATE LOW;
    public static final IMMEDIATE NORMAL;
    private static final IMMEDIATE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mopub/volley/Request$Priority, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        LOW = new <init>("LOW", 0);
        NORMAL = new <init>("NORMAL", 1);
        HIGH = new <init>("HIGH", 2);
        IMMEDIATE = new <init>("IMMEDIATE", 3);
        a = (new a[] {
            LOW, NORMAL, HIGH, IMMEDIATE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
