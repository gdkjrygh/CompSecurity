// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import com.google.zxing.client.result.ParsedResultType;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandlerFactory

static class 
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
