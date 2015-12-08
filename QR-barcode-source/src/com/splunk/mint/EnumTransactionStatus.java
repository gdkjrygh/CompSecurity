// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


final class EnumTransactionStatus extends Enum
{

    private static final EnumTransactionStatus $VALUES[];
    public static final EnumTransactionStatus CANCEL;
    public static final EnumTransactionStatus FAIL;
    public static final EnumTransactionStatus SUCCESS;

    private EnumTransactionStatus(String s, int i)
    {
        super(s, i);
    }

    public static EnumTransactionStatus valueOf(String s)
    {
        return (EnumTransactionStatus)Enum.valueOf(com/splunk/mint/EnumTransactionStatus, s);
    }

    public static EnumTransactionStatus[] values()
    {
        return (EnumTransactionStatus[])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new EnumTransactionStatus("SUCCESS", 0);
        FAIL = new EnumTransactionStatus("FAIL", 1);
        CANCEL = new EnumTransactionStatus("CANCEL", 2);
        $VALUES = (new EnumTransactionStatus[] {
            SUCCESS, FAIL, CANCEL
        });
    }
}
