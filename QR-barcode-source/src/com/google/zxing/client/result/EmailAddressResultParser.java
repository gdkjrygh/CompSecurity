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
        Object obj = null;
        String s = null;
        String s2 = getMassagedText(result);
        if (s2.startsWith("mailto:") || s2.startsWith("MAILTO:"))
        {
            obj = s2.substring(7);
            int i = ((String) (obj)).indexOf('?');
            result = ((Result) (obj));
            if (i >= 0)
            {
                result = ((String) (obj)).substring(0, i);
            }
            obj = urlDecode(result);
            Map map = parseNameValuePairs(s2);
            if (map != null)
            {
                String s1;
                if (((String) (obj)).isEmpty())
                {
                    result = (String)map.get("to");
                } else
                {
                    result = ((Result) (obj));
                }
                s1 = (String)map.get("subject");
                s = (String)map.get("body");
                obj = result;
                result = s1;
            } else
            {
                result = null;
            }
            result = new EmailAddressParsedResult(((String) (obj)), result, s, s2);
        } else
        {
            result = ((Result) (obj));
            if (EmailDoCoMoResultParser.isBasicallyValidEmailAddress(s2))
            {
                return new EmailAddressParsedResult(s2, null, null, (new StringBuilder()).append("mailto:").append(s2).toString());
            }
        }
        return result;
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
