// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;


public final class k extends Enum
{

    private static final k $VALUES[];
    public static final k FAILED;
    public static final k NOT_STARTED;
    public static final k RUNNING;
    public static final k STARTED;
    public static final k SUCCEEDED;

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/contacts/upload/k, s);
    }

    public static k[] values()
    {
        return (k[])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new k("NOT_STARTED", 0);
        STARTED = new k("STARTED", 1);
        RUNNING = new k("RUNNING", 2);
        SUCCEEDED = new k("SUCCEEDED", 3);
        FAILED = new k("FAILED", 4);
        $VALUES = (new k[] {
            NOT_STARTED, STARTED, RUNNING, SUCCEEDED, FAILED
        });
    }
}
