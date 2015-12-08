// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, SMSParsedResult, ParsedResult

public final class SMSTOMMSTOResultParser extends ResultParser
{

    public SMSTOMMSTOResultParser()
    {
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public SMSParsedResult parse(Result result)
    {
        result = getMassagedText(result);
        if (!result.startsWith("smsto:") && !result.startsWith("SMSTO:") && !result.startsWith("mmsto:") && !result.startsWith("MMSTO:"))
        {
            return null;
        }
        String s = result.substring(6);
        int i = s.indexOf(':');
        if (i >= 0)
        {
            result = s.substring(i + 1);
            s = s.substring(0, i);
        } else
        {
            result = null;
        }
        return new SMSParsedResult(s, null, null, result);
    }
}
