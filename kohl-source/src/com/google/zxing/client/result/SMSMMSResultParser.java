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
        int i = s.indexOf(';');
        if (i < 0)
        {
            collection.add(s);
            collection1.add(null);
            return;
        }
        collection.add(s.substring(0, i));
        collection = s.substring(i + 1);
        if (collection.startsWith("via="))
        {
            collection = collection.substring(4);
        } else
        {
            collection = null;
        }
        collection1.add(collection);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public SMSParsedResult parse(Result result)
    {
        Object obj = getMassagedText(result);
        if (!((String) (obj)).startsWith("sms:") && !((String) (obj)).startsWith("SMS:") && !((String) (obj)).startsWith("mms:") && !((String) (obj)).startsWith("MMS:"))
        {
            return null;
        }
        Map map = parseNameValuePairs(((String) (obj)));
        String s1 = null;
        ArrayList arraylist = null;
        int j = 0;
        String s = arraylist;
        boolean flag = j;
        result = s1;
        if (map != null)
        {
            s = arraylist;
            flag = j;
            result = s1;
            if (!map.isEmpty())
            {
                result = (String)map.get("subject");
                s = (String)map.get("body");
                flag = true;
            }
        }
        j = ((String) (obj)).indexOf('?', 4);
        int i;
        if (j < 0 || !flag)
        {
            s1 = ((String) (obj)).substring(4);
        } else
        {
            s1 = ((String) (obj)).substring(4, j);
        }
        i = -1;
        arraylist = new ArrayList(1);
        obj = new ArrayList(1);
        do
        {
            j = s1.indexOf(',', i + 1);
            if (j > i)
            {
                addNumberVia(arraylist, ((Collection) (obj)), s1.substring(i + 1, j));
                i = j;
            } else
            {
                addNumberVia(arraylist, ((Collection) (obj)), s1.substring(i + 1));
                return new SMSParsedResult((String[])arraylist.toArray(new String[arraylist.size()]), (String[])((List) (obj)).toArray(new String[((List) (obj)).size()]), result, s);
            }
        } while (true);
    }
}
