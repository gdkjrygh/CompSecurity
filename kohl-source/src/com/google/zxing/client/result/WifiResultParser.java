// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, WifiParsedResult, ParsedResult

public final class WifiResultParser extends ResultParser
{

    public WifiResultParser()
    {
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public WifiParsedResult parse(Result result)
    {
        String s1 = getMassagedText(result);
        String s2;
        if (s1.startsWith("WIFI:"))
        {
            if ((s2 = matchSinglePrefixedField("S:", s1, ';', false)) != null && !s2.isEmpty())
            {
                String s3 = matchSinglePrefixedField("P:", s1, ';', false);
                String s = matchSinglePrefixedField("T:", s1, ';', false);
                result = s;
                if (s == null)
                {
                    result = "nopass";
                }
                return new WifiParsedResult(result, s2, s3, Boolean.parseBoolean(matchSinglePrefixedField("H:", s1, ';', false)));
            }
        }
        return null;
    }
}
