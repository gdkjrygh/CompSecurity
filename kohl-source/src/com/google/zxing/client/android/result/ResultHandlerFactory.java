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

    private ResultHandlerFactory()
    {
    }

    public static ResultHandler makeResultHandler(CaptureActivity captureactivity, Result result)
    {
        ParsedResult parsedresult = parseResult(result);
        static class _cls1
        {

            static final int $SwitchMap$com$google$zxing$client$result$ParsedResultType[];

            static 
            {
                $SwitchMap$com$google$zxing$client$result$ParsedResultType = new int[ParsedResultType.values().length];
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.ADDRESSBOOK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.EMAIL_ADDRESS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.PRODUCT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.URI.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.WIFI.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.GEO.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.TEL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.SMS.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.CALENDAR.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$zxing$client$result$ParsedResultType[ParsedResultType.ISBN.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.zxing.client.result.ParsedResultType[parsedresult.getType().ordinal()])
        {
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

        case 5: // '\005'
            return new WifiResultHandler(captureactivity, parsedresult);

        case 6: // '\006'
            return new GeoResultHandler(captureactivity, parsedresult);

        case 7: // '\007'
            return new TelResultHandler(captureactivity, parsedresult);

        case 8: // '\b'
            return new SMSResultHandler(captureactivity, parsedresult);

        case 9: // '\t'
            return new CalendarResultHandler(captureactivity, parsedresult);

        case 10: // '\n'
            return new ISBNResultHandler(captureactivity, parsedresult, result);
        }
    }

    private static ParsedResult parseResult(Result result)
    {
        return ResultParser.parseResult(result);
    }
}
