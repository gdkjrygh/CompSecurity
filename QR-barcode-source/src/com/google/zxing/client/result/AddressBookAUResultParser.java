// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, AddressBookParsedResult, ParsedResult

public final class AddressBookAUResultParser extends ResultParser
{

    public AddressBookAUResultParser()
    {
    }

    private static String[] matchMultipleValuePrefix(String s, int i, String s1, boolean flag)
    {
        int j = 1;
        ArrayList arraylist = null;
        do
        {
label0:
            {
                String s2;
                if (j <= i)
                {
                    s2 = matchSinglePrefixedField((new StringBuilder()).append(s).append(j).append(':').toString(), s1, '\r', flag);
                    if (s2 != null)
                    {
                        break label0;
                    }
                }
                ArrayList arraylist1;
                if (arraylist == null)
                {
                    return null;
                } else
                {
                    return (String[])arraylist.toArray(new String[arraylist.size()]);
                }
            }
            arraylist1 = arraylist;
            if (arraylist == null)
            {
                arraylist1 = new ArrayList(i);
            }
            arraylist1.add(s2);
            j++;
            arraylist = arraylist1;
        } while (true);
    }

    public AddressBookParsedResult parse(Result result)
    {
        result = getMassagedText(result);
        if (!result.contains("MEMORY") || !result.contains("\r\n"))
        {
            return null;
        }
        String s = matchSinglePrefixedField("NAME1:", result, '\r', true);
        String s1 = matchSinglePrefixedField("NAME2:", result, '\r', true);
        String as[] = matchMultipleValuePrefix("TEL", 3, result, true);
        String as1[] = matchMultipleValuePrefix("MAIL", 3, result, true);
        String s2 = matchSinglePrefixedField("MEMORY:", result, '\r', false);
        String s3 = matchSinglePrefixedField("ADD:", result, '\r', true);
        if (s3 == null)
        {
            result = null;
        } else
        {
            result = new String[1];
            result[0] = s3;
        }
        return new AddressBookParsedResult(maybeWrap(s), null, s1, as, null, as1, null, null, s2, result, null, null, null, null, null, null);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
