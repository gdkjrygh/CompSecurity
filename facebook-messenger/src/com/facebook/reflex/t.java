// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public final class t extends Enum
{

    private static final t $VALUES[];
    public static final t Cancelled;
    public static final t Changed;
    public static final t Ended;
    public static final t Started;

    private t(String s, int i)
    {
        super(s, i);
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(com/facebook/reflex/t, s);
    }

    public static t[] values()
    {
        return (t[])$VALUES.clone();
    }

    static 
    {
        Started = new t("Started", 0);
        Changed = new t("Changed", 1);
        Ended = new t("Ended", 2);
        Cancelled = new t("Cancelled", 3);
        $VALUES = (new t[] {
            Started, Changed, Ended, Cancelled
        });
    }
}
