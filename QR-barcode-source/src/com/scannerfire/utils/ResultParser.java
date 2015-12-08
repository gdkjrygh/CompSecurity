// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public class ResultParser
{

    private static int $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType[];

    static int[] $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()
    {
        int ai[] = $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[ParsedResultType.values().length];
        try
        {
            ai[ParsedResultType.ADDRESSBOOK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[ParsedResultType.CALENDAR.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[ParsedResultType.EMAIL_ADDRESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[ParsedResultType.GEO.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[ParsedResultType.ISBN.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[ParsedResultType.PRODUCT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[ParsedResultType.SMS.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[ParsedResultType.TEL.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[ParsedResultType.TEXT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[ParsedResultType.URI.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[ParsedResultType.WIFI.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType = ai;
        return ai;
    }

    public ResultParser()
    {
    }

    public static Utils.MODE getParsedResult(ParsedResult parsedresult)
    {
        switch ($SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()[parsedresult.getType().ordinal()])
        {
        default:
            return Utils.MODE._text;

        case 1: // '\001'
            return Utils.MODE._contact;

        case 2: // '\002'
            return Utils.MODE._email;

        case 9: // '\t'
            return Utils.MODE._calendar;

        case 6: // '\006'
            return Utils.MODE._geo;

        case 11: // '\013'
            return Utils.MODE._isbn;

        case 3: // '\003'
            return Utils.MODE._product;

        case 8: // '\b'
            return Utils.MODE._text;

        case 7: // '\007'
            return Utils.MODE._phone;

        case 5: // '\005'
            return Utils.MODE._text;

        case 4: // '\004'
            return Utils.MODE._url;

        case 10: // '\n'
            return Utils.MODE._text;
        }
    }

    private boolean isContact(String s)
    {
        return s.startsWith("BEGIN:");
    }

    private boolean isGeolocalization(String s)
    {
        return s.startsWith("geo:");
    }

    private boolean isUrl(String s)
    {
        return s.startsWith("http://") || s.startsWith("www.");
    }
}
