// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;


public final class ai extends Enum
{

    private static final ai $VALUES[];
    public static final ai ARCHIVED;
    public static final ai READ;
    public static final ai SPAM;
    private String apiName;

    private ai(String s, int i, String s1)
    {
        super(s, i);
        apiName = s1;
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/facebook/orca/server/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])$VALUES.clone();
    }

    public String getApiName()
    {
        return apiName;
    }

    static 
    {
        READ = new ai("READ", 0, "read");
        ARCHIVED = new ai("ARCHIVED", 1, "archived");
        SPAM = new ai("SPAM", 2, "spam");
        $VALUES = (new ai[] {
            READ, ARCHIVED, SPAM
        });
    }
}
