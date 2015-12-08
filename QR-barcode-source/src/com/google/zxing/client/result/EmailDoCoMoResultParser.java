// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.result:
//            AbstractDoCoMoResultParser, EmailAddressParsedResult, ParsedResult

public final class EmailDoCoMoResultParser extends AbstractDoCoMoResultParser
{

    private static final Pattern ATEXT_ALPHANUMERIC = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public EmailDoCoMoResultParser()
    {
    }

    static boolean isBasicallyValidEmailAddress(String s)
    {
        return s != null && ATEXT_ALPHANUMERIC.matcher(s).matches() && s.indexOf('@') >= 0;
    }

    public EmailAddressParsedResult parse(Result result)
    {
        result = getMassagedText(result);
        String as[];
        String s;
        if (result.startsWith("MATMSG:"))
        {
            if ((as = matchDoCoMoPrefixedField("TO:", result, true)) != null && isBasicallyValidEmailAddress(s = as[0]))
            {
                return new EmailAddressParsedResult(s, matchSingleDoCoMoPrefixedField("SUB:", result, false), matchSingleDoCoMoPrefixedField("BODY:", result, false), (new StringBuilder()).append("mailto:").append(s).toString());
            }
        }
        return null;
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

}
