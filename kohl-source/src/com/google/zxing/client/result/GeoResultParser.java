// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, GeoParsedResult, ParsedResult

public final class GeoResultParser extends ResultParser
{

    private static final Pattern GEO_URL_PATTERN = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    public GeoResultParser()
    {
    }

    public GeoParsedResult parse(Result result)
    {
        result = getMassagedText(result);
        result = GEO_URL_PATTERN.matcher(result);
        if (result.matches()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s = result.group(4);
        double d;
        double d1;
        double d2;
        double d3;
        String s1;
        try
        {
            d2 = Double.parseDouble(result.group(1));
        }
        // Misplaced declaration of an exception variable
        catch (Result result)
        {
            return null;
        }
        if (d2 > 90D || d2 < -90D) goto _L1; else goto _L3
_L3:
        d3 = Double.parseDouble(result.group(2));
        if (d3 > 180D || d3 < -180D) goto _L1; else goto _L4
_L4:
        s1 = result.group(3);
        if (s1 != null) goto _L6; else goto _L5
_L5:
        d = 0.0D;
_L8:
        return new GeoParsedResult(d2, d3, d, s);
_L6:
        d1 = Double.parseDouble(result.group(3));
        d = d1;
        if (d1 < 0.0D)
        {
            return null;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

}
