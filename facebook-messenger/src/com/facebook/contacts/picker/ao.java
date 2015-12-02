// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;


public final class ao extends Enum
{

    private static final ao $VALUES[];
    public static final ao LOADING;
    public static final ao NO_RESULTS;

    private ao(String s, int i)
    {
        super(s, i);
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(com/facebook/contacts/picker/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])$VALUES.clone();
    }

    static 
    {
        LOADING = new ao("LOADING", 0);
        NO_RESULTS = new ao("NO_RESULTS", 1);
        $VALUES = (new ao[] {
            LOADING, NO_RESULTS
        });
    }
}
