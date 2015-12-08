// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;

// Referenced classes of package com.google.zxing.client.result:
//            AbstractDoCoMoResultParser, AddressBookParsedResult, ParsedResult

public final class AddressBookDoCoMoResultParser extends AbstractDoCoMoResultParser
{

    public AddressBookDoCoMoResultParser()
    {
    }

    private static String parseName(String s)
    {
        int i = s.indexOf(',');
        String s1 = s;
        if (i >= 0)
        {
            s1 = (new StringBuilder()).append(s.substring(i + 1)).append(' ').append(s.substring(0, i)).toString();
        }
        return s1;
    }

    public AddressBookParsedResult parse(Result result)
    {
        String s1 = getMassagedText(result);
        if (!s1.startsWith("MECARD:"))
        {
            return null;
        }
        result = matchDoCoMoPrefixedField("N:", s1, true);
        if (result == null)
        {
            return null;
        }
        String s2 = parseName(result[0]);
        String s3 = matchSingleDoCoMoPrefixedField("SOUND:", s1, true);
        String as1[] = matchDoCoMoPrefixedField("TEL:", s1, true);
        String as2[] = matchDoCoMoPrefixedField("EMAIL:", s1, true);
        String s4 = matchSingleDoCoMoPrefixedField("NOTE:", s1, false);
        String as3[] = matchDoCoMoPrefixedField("ADR:", s1, true);
        String s = matchSingleDoCoMoPrefixedField("BDAY:", s1, true);
        result = s;
        if (s != null)
        {
            result = s;
            if (!isStringOfDigits(s, 8))
            {
                result = null;
            }
        }
        String as[] = matchDoCoMoPrefixedField("URL:", s1, true);
        s1 = matchSingleDoCoMoPrefixedField("ORG:", s1, true);
        return new AddressBookParsedResult(maybeWrap(s2), null, s3, as1, null, as2, null, null, s4, as3, null, s1, result, null, as, null);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
