// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, SMSParsedResult, ParsedResult

public final class SMSMMSResultParser extends ResultParser
{

    public SMSMMSResultParser()
    {
    }

    private static void addNumberVia(Collection collection, Collection collection1, String s)
    {
        Object obj = null;
        int i = s.indexOf(';');
        if (i < 0)
        {
            collection.add(s);
            collection1.add(null);
            return;
        }
        collection.add(s.substring(0, i));
        s = s.substring(i + 1);
        collection = obj;
        if (s.startsWith("via="))
        {
            collection = s.substring(4);
        }
        collection1.add(collection);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public SMSParsedResult parse(Result result)
    {
        String s1 = getMassagedText(result);
        if (!s1.startsWith("sms:") && !s1.startsWith("SMS:") && !s1.startsWith("mms:") && !s1.startsWith("MMS:"))
        {
            return null;
        }
        result = parseNameValuePairs(s1);
        boolean flag = false;
        String s;
        ArrayList arraylist;
        ArrayList arraylist1;
        int i;
        int j;
        if (result != null && !result.isEmpty())
        {
            s = (String)result.get("subject");
            result = (String)result.get("body");
            flag = true;
        } else
        {
            result = null;
            s = null;
        }
        j = s1.indexOf('?', 4);
        if (j < 0 || !flag)
        {
            s1 = s1.substring(4);
        } else
        {
            s1 = s1.substring(4, j);
        }
        i = -1;
        arraylist = new ArrayList(1);
        arraylist1 = new ArrayList(1);
        do
        {
            j = s1.indexOf(',', i + 1);
            if (j > i)
            {
                addNumberVia(arraylist, arraylist1, s1.substring(i + 1, j));
                i = j;
            } else
            {
                addNumberVia(arraylist, arraylist1, s1.substring(i + 1));
                return new SMSParsedResult((String[])arraylist.toArray(new String[arraylist.size()]), (String[])arraylist1.toArray(new String[arraylist1.size()]), s, result);
            }
        } while (true);
    }
}
