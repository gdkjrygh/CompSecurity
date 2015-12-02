// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;


final class bv extends Enum
{

    private static final bv $VALUES[];
    public static final bv COMPLETED;
    public static final bv INIT;
    public static final bv RUNNING;

    private bv(String s, int i)
    {
        super(s, i);
    }

    public static bv valueOf(String s)
    {
        return (bv)Enum.valueOf(com/facebook/orca/contacts/divebar/bv, s);
    }

    public static bv[] values()
    {
        return (bv[])$VALUES.clone();
    }

    static 
    {
        INIT = new bv("INIT", 0);
        RUNNING = new bv("RUNNING", 1);
        COMPLETED = new bv("COMPLETED", 2);
        $VALUES = (new bv[] {
            INIT, RUNNING, COMPLETED
        });
    }
}
