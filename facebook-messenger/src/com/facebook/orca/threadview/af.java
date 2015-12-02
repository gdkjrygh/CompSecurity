// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


public final class af extends Enum
{

    private static final af $VALUES[];
    public static final af DELIVERED;
    public static final af FAILED_TO_SEND;
    public static final af GROUP_READ;
    public static final af PENDING;
    public static final af READ;
    public static final af SENT_BY_ME_TO_SERVER;
    public static final af SENT_FROM_RECEIPT;

    private af(String s, int i)
    {
        super(s, i);
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/facebook/orca/threadview/af, s);
    }

    public static af[] values()
    {
        return (af[])$VALUES.clone();
    }

    static 
    {
        PENDING = new af("PENDING", 0);
        SENT_BY_ME_TO_SERVER = new af("SENT_BY_ME_TO_SERVER", 1);
        FAILED_TO_SEND = new af("FAILED_TO_SEND", 2);
        SENT_FROM_RECEIPT = new af("SENT_FROM_RECEIPT", 3);
        READ = new af("READ", 4);
        DELIVERED = new af("DELIVERED", 5);
        GROUP_READ = new af("GROUP_READ", 6);
        $VALUES = (new af[] {
            PENDING, SENT_BY_ME_TO_SERVER, FAILED_TO_SEND, SENT_FROM_RECEIPT, READ, DELIVERED, GROUP_READ
        });
    }
}
