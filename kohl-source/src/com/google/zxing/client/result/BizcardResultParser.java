// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.zxing.client.result:
//            AbstractDoCoMoResultParser, AddressBookParsedResult, ParsedResult

public final class BizcardResultParser extends AbstractDoCoMoResultParser
{

    public BizcardResultParser()
    {
    }

    private static String buildName(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        }
        if (s1 != null)
        {
            s = (new StringBuilder()).append(s).append(' ').append(s1).toString();
        }
        return s;
    }

    private static String[] buildPhoneNumbers(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList(3);
        if (s != null)
        {
            arraylist.add(s);
        }
        if (s1 != null)
        {
            arraylist.add(s1);
        }
        if (s2 != null)
        {
            arraylist.add(s2);
        }
        int i = arraylist.size();
        if (i == 0)
        {
            return null;
        } else
        {
            return (String[])arraylist.toArray(new String[i]);
        }
    }

    public AddressBookParsedResult parse(Result result)
    {
        String s5 = getMassagedText(result);
        if (!s5.startsWith("BIZCARD:"))
        {
            return null;
        } else
        {
            result = buildName(matchSingleDoCoMoPrefixedField("N:", s5, true), matchSingleDoCoMoPrefixedField("X:", s5, true));
            String s = matchSingleDoCoMoPrefixedField("T:", s5, true);
            String s1 = matchSingleDoCoMoPrefixedField("C:", s5, true);
            String as[] = matchDoCoMoPrefixedField("A:", s5, true);
            String s2 = matchSingleDoCoMoPrefixedField("B:", s5, true);
            String s3 = matchSingleDoCoMoPrefixedField("M:", s5, true);
            String s4 = matchSingleDoCoMoPrefixedField("F:", s5, true);
            s5 = matchSingleDoCoMoPrefixedField("E:", s5, true);
            return new AddressBookParsedResult(maybeWrap(result), null, null, buildPhoneNumbers(s2, s3, s4), null, maybeWrap(s5), null, null, null, as, null, s1, null, s, null, null);
        }
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
