// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, TelParsedResult, ParsedResult

public final class TelResultParser extends ResultParser
{

    public TelResultParser()
    {
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public TelParsedResult parse(Result result)
    {
        String s = getMassagedText(result);
        if (!s.startsWith("tel:") && !s.startsWith("TEL:"))
        {
            return null;
        }
        int i;
        if (s.startsWith("TEL:"))
        {
            result = (new StringBuilder()).append("tel:").append(s.substring(4)).toString();
        } else
        {
            result = s;
        }
        i = s.indexOf('?', 4);
        if (i < 0)
        {
            s = s.substring(4);
        } else
        {
            s = s.substring(4, i);
        }
        return new TelParsedResult(s, result, null);
    }
}
