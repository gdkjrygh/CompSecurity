// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, URIParsedResult, ParsedResult

public final class URIResultParser extends ResultParser
{

    private static final Pattern URL_WITHOUT_PROTOCOL_PATTERN = Pattern.compile("([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");
    private static final Pattern URL_WITH_PROTOCOL_PATTERN = Pattern.compile("[a-zA-Z0-9]{2,}:");

    public URIResultParser()
    {
    }

    static boolean isBasicallyValidURI(String s)
    {
        boolean flag1 = true;
        if (!s.contains(" ")) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        Matcher matcher;
        matcher = URL_WITH_PROTOCOL_PATTERN.matcher(s);
        if (!matcher.find())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (matcher.start() == 0) goto _L4; else goto _L3
_L3:
        s = URL_WITHOUT_PROTOCOL_PATTERN.matcher(s);
        if (!s.find())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (s.start() == 0) goto _L4; else goto _L5
_L5:
        return false;
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public URIParsedResult parse(Result result)
    {
        result = getMassagedText(result);
        if (result.startsWith("URL:") || result.startsWith("URI:"))
        {
            return new URIParsedResult(result.substring(4).trim(), null);
        }
        result = result.trim();
        if (isBasicallyValidURI(result))
        {
            return new URIParsedResult(result, null);
        } else
        {
            return null;
        }
    }

}
