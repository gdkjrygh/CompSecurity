// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class ai extends Enum
{

    private static final ai $VALUES[];
    public static final ai HARD;
    public static final ai SOFT;

    private ai(String s, int i)
    {
        super(s, i);
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/facebook/contacts/server/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])$VALUES.clone();
    }

    static 
    {
        HARD = new ai("HARD", 0);
        SOFT = new ai("SOFT", 1);
        $VALUES = (new ai[] {
            HARD, SOFT
        });
    }
}
