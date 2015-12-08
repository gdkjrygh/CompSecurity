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
        double d = 0.0D;
        result = getMassagedText(result);
        result = GEO_URL_PATTERN.matcher(result);
        if (!result.matches())
        {
            return null;
        }
        String s = result.group(4);
        double d1;
        double d2;
        String s1;
        try
        {
            d1 = Double.parseDouble(result.group(1));
        }
        // Misplaced declaration of an exception variable
        catch (Result result)
        {
            return null;
        }
        if (d1 > 90D || d1 < -90D)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        d2 = Double.parseDouble(result.group(2));
        if (d2 > 180D || d2 < -180D)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        s1 = result.group(3);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return new GeoParsedResult(d1, d2, d, s);
_L2:
        if ((d = Double.parseDouble(result.group(3))) >= 0.0D) goto _L1; else goto _L3
_L3:
        return null;
        return null;
        return null;
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

}
