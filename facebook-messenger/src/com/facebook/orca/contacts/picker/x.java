// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;


public final class x extends Enum
{

    private static final x $VALUES[];
    public static final x ADDRESS_BOOK;
    public static final x FACEBOOK_LIST;
    public static final x MERGED;

    private x(String s, int i)
    {
        super(s, i);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/facebook/orca/contacts/picker/x, s);
    }

    public static x[] values()
    {
        return (x[])$VALUES.clone();
    }

    static 
    {
        FACEBOOK_LIST = new x("FACEBOOK_LIST", 0);
        ADDRESS_BOOK = new x("ADDRESS_BOOK", 1);
        MERGED = new x("MERGED", 2);
        $VALUES = (new x[] {
            FACEBOOK_LIST, ADDRESS_BOOK, MERGED
        });
    }
}
