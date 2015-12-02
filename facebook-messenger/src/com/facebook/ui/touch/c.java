// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.touch;


final class c extends Enum
{

    private static final c $VALUES[];
    public static final c DEFERRING;
    public static final c INTERCEPTING;
    public static final c MONITORING;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/ui/touch/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        MONITORING = new c("MONITORING", 0);
        INTERCEPTING = new c("INTERCEPTING", 1);
        DEFERRING = new c("DEFERRING", 2);
        $VALUES = (new c[] {
            MONITORING, INTERCEPTING, DEFERRING
        });
    }
}
