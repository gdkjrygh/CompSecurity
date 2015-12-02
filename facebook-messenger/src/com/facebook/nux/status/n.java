// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;


public final class n extends Enum
{

    private static final n $VALUES[];
    public static final n COMPLETE;
    public static final n SKIPPED;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/nux/status/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        COMPLETE = new n("COMPLETE", 0);
        SKIPPED = new n("SKIPPED", 1);
        $VALUES = (new n[] {
            COMPLETE, SKIPPED
        });
    }
}
