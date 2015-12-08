// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.Map;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, EmailAddressParsedResult, EmailDoCoMoResultParser, ParsedResult

public final class EmailAddressResultParser extends ResultParser
{

    public EmailAddressResultParser()
    {
    }

    public EmailAddressParsedResult parse(Result result)
    {
        String s = null;
        String s3 = getMassagedText(result);
        if (s3.startsWith("mailto:") || s3.startsWith("MAILTO:"))
        {
            s = s3.substring(7);
            int i = s.indexOf('?');
            result = s;
            if (i >= 0)
            {
                result = s.substring(0, i);
            }
            s = urlDecode(result);
            Map map = parseNameValuePairs(s3);
            String s1 = null;
            String s2 = null;
            result = s;
            if (map != null)
            {
                result = s;
                if (s.isEmpty())
                {
                    result = (String)map.get("to");
                }
                s1 = (String)map.get("subject");
                s2 = (String)map.get("body");
            }
            result = new EmailAddressParsedResult(result, s1, s2, s3);
        } else
        {
            result = s;
            if (EmailDoCoMoResultParser.isBasicallyValidEmailAddress(s3))
            {
                return new EmailAddressParsedResult(s3, null, null, (new StringBuilder()).append("mailto:").append(s3).toString());
            }
        }
        return result;
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
