// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.e;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d NAME;
    public static final d UNORDERED;
    private String providerOrderBy;

    private d(String s, int i, String s1)
    {
        super(s, i);
        providerOrderBy = s1;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/contacts/e/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        UNORDERED = new d("UNORDERED", 0, null);
        NAME = new d("NAME", 1, "sort_name_key");
        $VALUES = (new d[] {
            UNORDERED, NAME
        });
    }

}
