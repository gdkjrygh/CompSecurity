// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class PiiKind extends Enum
{

    private static final PiiKind $VALUES[];
    public static final PiiKind DISTINGUISHED_NAME;
    public static final PiiKind FQDN;
    public static final PiiKind GENERIC_DATA;
    public static final PiiKind IDENTITY;
    public static final PiiKind IPV4_ADDRESS;
    public static final PiiKind IPV4_ADDRESS_LEGACY;
    public static final PiiKind IPV6_ADDRESS;
    public static final PiiKind MAIL_SUBJECT;
    public static final PiiKind NONE;
    public static final PiiKind PHONE_NUMBER;
    public static final PiiKind QUERY_STRING;
    public static final PiiKind SIP_ADDRESS;
    public static final PiiKind SMTP_ADDRESS;
    public static final PiiKind URI;
    private final int val;

    private PiiKind(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static PiiKind valueOf(String s)
    {
        return (PiiKind)Enum.valueOf(com/microsoft/applications/telemetry/PiiKind, s);
    }

    public static PiiKind[] values()
    {
        return (PiiKind[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        NONE = new PiiKind("NONE", 0, 0);
        DISTINGUISHED_NAME = new PiiKind("DISTINGUISHED_NAME", 1, 1);
        GENERIC_DATA = new PiiKind("GENERIC_DATA", 2, 2);
        IPV4_ADDRESS = new PiiKind("IPV4_ADDRESS", 3, 3);
        IPV6_ADDRESS = new PiiKind("IPV6_ADDRESS", 4, 4);
        MAIL_SUBJECT = new PiiKind("MAIL_SUBJECT", 5, 5);
        PHONE_NUMBER = new PiiKind("PHONE_NUMBER", 6, 6);
        QUERY_STRING = new PiiKind("QUERY_STRING", 7, 7);
        SIP_ADDRESS = new PiiKind("SIP_ADDRESS", 8, 8);
        SMTP_ADDRESS = new PiiKind("SMTP_ADDRESS", 9, 9);
        IDENTITY = new PiiKind("IDENTITY", 10, 10);
        URI = new PiiKind("URI", 11, 11);
        FQDN = new PiiKind("FQDN", 12, 12);
        IPV4_ADDRESS_LEGACY = new PiiKind("IPV4_ADDRESS_LEGACY", 13, 13);
        $VALUES = (new PiiKind[] {
            NONE, DISTINGUISHED_NAME, GENERIC_DATA, IPV4_ADDRESS, IPV6_ADDRESS, MAIL_SUBJECT, PHONE_NUMBER, QUERY_STRING, SIP_ADDRESS, SMTP_ADDRESS, 
            IDENTITY, URI, FQDN, IPV4_ADDRESS_LEGACY
        });
    }
}
