// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;


public final class ai extends Enum
{

    private static final ai $VALUES[];
    public static final ai ONE_LINE;
    public static final ai TEXT_ONLY;
    public static final ai TWO_LINE;
    public static final ai TWO_LINE_RICH_PRESENCE;

    private ai(String s, int i)
    {
        super(s, i);
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/facebook/contacts/picker/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])$VALUES.clone();
    }

    static 
    {
        ONE_LINE = new ai("ONE_LINE", 0);
        TWO_LINE = new ai("TWO_LINE", 1);
        TWO_LINE_RICH_PRESENCE = new ai("TWO_LINE_RICH_PRESENCE", 2);
        TEXT_ONLY = new ai("TEXT_ONLY", 3);
        $VALUES = (new ai[] {
            ONE_LINE, TWO_LINE, TWO_LINE_RICH_PRESENCE, TEXT_ONLY
        });
    }
}
