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
        String s = null;
        result = getMassagedText(result);
        if (!result.startsWith("smtp:") && !result.startsWith("SMTP:"))
        {
            return null;
        }
        String s1 = result.substring(5);
        int i = s1.indexOf(':');
        if (i >= 0)
        {
            String s2 = s1.substring(i + 1);
            String s3 = s1.substring(0, i);
            i = s2.indexOf(':');
            result = s2;
            s1 = s3;
            if (i >= 0)
            {
                s = s2.substring(i + 1);
                result = s2.substring(0, i);
                s1 = s3;
            }
        } else
        {
            result = null;
        }
        return new EmailAddressParsedResult(s1, result, s, (new StringBuilder()).append("mailto:").append(s1).toString());
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
