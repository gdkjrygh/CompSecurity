// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;


public final class aw extends Enum
{

    private static final aw $VALUES[];
    public static final aw LIST;
    public static final aw UPSELL;

    private aw(String s, int i)
    {
        super(s, i);
    }

    public static aw valueOf(String s)
    {
        return (aw)Enum.valueOf(com/facebook/orca/contacts/divebar/aw, s);
    }

    public static aw[] values()
    {
        return (aw[])$VALUES.clone();
    }

    static 
    {
        UPSELL = new aw("UPSELL", 0);
        LIST = new aw("LIST", 1);
        $VALUES = (new aw[] {
            UPSELL, LIST
        });
    }
}
