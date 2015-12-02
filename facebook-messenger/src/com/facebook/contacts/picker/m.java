// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;


public final class m extends Enum
{

    private static final m $VALUES[];
    public static final m EMPTY_CONSTRAINT;
    public static final m EXCEPTION;
    public static final m OK;

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/contacts/picker/m, s);
    }

    public static m[] values()
    {
        return (m[])$VALUES.clone();
    }

    static 
    {
        OK = new m("OK", 0);
        EMPTY_CONSTRAINT = new m("EMPTY_CONSTRAINT", 1);
        EXCEPTION = new m("EXCEPTION", 2);
        $VALUES = (new m[] {
            OK, EMPTY_CONSTRAINT, EXCEPTION
        });
    }
}
