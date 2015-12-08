// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import com.google.zxing.Result;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;

// Referenced classes of package com.google.zxing.client.android.result:
//            TextResultHandler, AddressBookResultHandler, EmailAddressResultHandler, ProductResultHandler, 
//            URIResultHandler, WifiResultHandler, GeoResultHandler, TelResultHandler, 
//            SMSResultHandler, CalendarResultHandler, ISBNResultHandler, ResultHandler

public final class ResultHandlerFactory
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

    private ResultHandlerFactory()
    {
    }

    public static ResultHandler makeResultHandler(CaptureActivity captureactivity, Result result)
    {
        ParsedResult parsedresult = parseResult(result);
        switch ($SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()[parsedresult.getType().ordinal()])
        {
        case 5: // '\005'
        default:
            return new TextResultHandler(captureactivity, parsedresult, result);

        case 1: // '\001'
            return new AddressBookResultHandler(captureactivity, parsedresult);

        case 2: // '\002'
            return new EmailAddressResultHandler(captureactivity, parsedresult);

        case 3: // '\003'
            return new ProductResultHandler(captureactivity, parsedresult, result);

        case 4: // '\004'
            return new URIResultHandler(captureactivity, parsedresult);

        case 10: // '\n'
            return new WifiResultHandler(captureactivity, parsedresult);

        case 6: // '\006'
            return new GeoResultHandler(captureactivity, parsedresult);

        case 7: // '\007'
            return new TelResultHandler(captureactivity, parsedresult);

        case 8: // '\b'
            return new SMSResultHandler(captureactivity, parsedresult);

        case 9: // '\t'
            return new CalendarResultHandler(captureactivity, parsedresult);

        case 11: // '\013'
            return new ISBNResultHandler(captureactivity, parsedresult, result);
        }
    }

    private static ParsedResult parseResult(Result result)
    {
        return ResultParser.parseResult(result);
    }
}
