// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, EmailAddressParsedResult, ParsedResult

public final class SMTPResultParser extends ResultParser
{

    public SMTPResultParser()
    {
    }

    public EmailAddressParsedResult parse(Result result)
    {
        result = getMassagedText(result);
        if (!result.startsWith("smtp:") && !result.startsWith("SMTP:"))
        {
            return null;
        }
        String s3 = result.substring(5);
        result = null;
        Object obj = null;
        int i = s3.indexOf(':');
        String s1 = obj;
        String s = s3;
        if (i >= 0)
        {
            String s2 = s3.substring(i + 1);
            s3 = s3.substring(0, i);
            i = s2.indexOf(':');
            s1 = obj;
            s = s3;
            result = s2;
            if (i >= 0)
            {
                s1 = s2.substring(i + 1);
                result = s2.substring(0, i);
                s = s3;
            }
        }
        return new EmailAddressParsedResult(s, result, s1, (new StringBuilder()).append("mailto:").append(s).toString());
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
