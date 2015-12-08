// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


public final class ParsedResultType extends Enum
{

    private static final ParsedResultType $VALUES[];
    public static final ParsedResultType ADDRESSBOOK;
    public static final ParsedResultType CALENDAR;
    public static final ParsedResultType EMAIL_ADDRESS;
    public static final ParsedResultType GEO;
    public static final ParsedResultType ISBN;
    public static final ParsedResultType PRODUCT;
    public static final ParsedResultType SMS;
    public static final ParsedResultType TEL;
    public static final ParsedResultType TEXT;
    public static final ParsedResultType URI;
    public static final ParsedResultType WIFI;

    private ParsedResultType(String s, int i)
    {
        super(s, i);
    }

    public static ParsedResultType valueOf(String s)
    {
        return (ParsedResultType)Enum.valueOf(com/google/zxing/client/result/ParsedResultType, s);
    }

    public static ParsedResultType[] values()
    {
        return (ParsedResultType[])$VALUES.clone();
    }

    static 
    {
        ADDRESSBOOK = new ParsedResultType("ADDRESSBOOK", 0);
        EMAIL_ADDRESS = new ParsedResultType("EMAIL_ADDRESS", 1);
        PRODUCT = new ParsedResultType("PRODUCT", 2);
        URI = new ParsedResultType("URI", 3);
        TEXT = new ParsedResultType("TEXT", 4);
        GEO = new ParsedResultType("GEO", 5);
        TEL = new ParsedResultType("TEL", 6);
        SMS = new ParsedResultType("SMS", 7);
        CALENDAR = new ParsedResultType("CALENDAR", 8);
        WIFI = new ParsedResultType("WIFI", 9);
        ISBN = new ParsedResultType("ISBN", 10);
        $VALUES = (new ParsedResultType[] {
            ADDRESSBOOK, EMAIL_ADDRESS, PRODUCT, URI, TEXT, GEO, TEL, SMS, CALENDAR, WIFI, 
            ISBN
        });
    }
}
