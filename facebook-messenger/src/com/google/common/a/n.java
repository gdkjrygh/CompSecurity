// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


final class n extends Enum
{

    private static final n $VALUES[];
    public static final n DONE;
    public static final n FAILED;
    public static final n NOT_READY;
    public static final n READY;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/google/common/a/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        READY = new n("READY", 0);
        NOT_READY = new n("NOT_READY", 1);
        DONE = new n("DONE", 2);
        FAILED = new n("FAILED", 3);
        $VALUES = (new n[] {
            READY, NOT_READY, DONE, FAILED
        });
    }
}
