// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


final class  extends Enum
{

    public static final FAILED DONE;
    public static final FAILED FAILED;
    public static final FAILED NOT_READY;
    public static final FAILED READY;
    private static final FAILED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/base/AbstractIterator$State, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        READY = new <init>("READY", 0);
        NOT_READY = new <init>("NOT_READY", 1);
        DONE = new <init>("DONE", 2);
        FAILED = new <init>("FAILED", 3);
        a = (new a[] {
            READY, NOT_READY, DONE, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
