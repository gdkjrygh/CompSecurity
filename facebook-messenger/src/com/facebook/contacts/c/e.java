// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.c;


public final class e extends Enum
{

    private static final e $VALUES[];
    public static final e DELTA;
    public static final e FULL;

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/contacts/c/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        FULL = new e("FULL", 0);
        DELTA = new e("DELTA", 1);
        $VALUES = (new e[] {
            FULL, DELTA
        });
    }
}
