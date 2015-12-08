// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, ExpandedProductParsedResult, ParsedResult

public final class ExpandedProductResultParser extends ResultParser
{

    public ExpandedProductResultParser()
    {
    }

    private static String findAIvalue(int i, String s)
    {
        if (s.charAt(i) == '(') goto _L2; else goto _L1
_L1:
        return null;
_L2:
        StringBuilder stringbuilder;
        s = s.substring(i + 1);
        stringbuilder = new StringBuilder();
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= s.length())
                {
                    break label1;
                }
                char c = s.charAt(i);
                if (c == ')')
                {
                    return stringbuilder.toString();
                }
                if (c < '0' || c > '9')
                {
                    break label0;
                }
                stringbuilder.append(c);
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return stringbuilder.toString();
    }

    private static String findValue(int i, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        s = s.substring(i);
        i = 0;
_L8:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        char c = s.charAt(i);
        if (c != '(') goto _L4; else goto _L3
_L3:
        if (findAIvalue(i, s) != null) goto _L2; else goto _L5
_L5:
        stringbuilder.append('(');
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(c);
        if (true) goto _L6; else goto _L2
_L2:
        return stringbuilder.toString();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public ExpandedProductParsedResult parse(Result result)
    {
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED)
        {
            return null;
        }
        String s4 = getMassagedText(result);
        Result result8 = null;
        Result result7 = null;
        Result result6 = null;
        Result result5 = null;
        Result result4 = null;
        Result result3 = null;
        Result result2 = null;
        Result result1 = null;
        String s1 = null;
        String s2 = null;
        Object obj = null;
        String s = null;
        String s3 = null;
        HashMap hashmap = new HashMap();
        for (int i = 0; i < s4.length();)
        {
            String s5 = findAIvalue(i, s4);
            if (s5 == null)
            {
                return null;
            }
            i += s5.length() + 2;
            result = findValue(i, s4);
            i += result.length();
            if ("00".equals(s5))
            {
                result7 = result;
            } else
            if ("01".equals(s5))
            {
                result8 = result;
            } else
            if ("10".equals(s5))
            {
                result6 = result;
            } else
            if ("11".equals(s5))
            {
                result5 = result;
            } else
            if ("13".equals(s5))
            {
                result4 = result;
            } else
            if ("15".equals(s5))
            {
                result3 = result;
            } else
            if ("17".equals(s5))
            {
                result2 = result;
            } else
            if ("3100".equals(s5) || "3101".equals(s5) || "3102".equals(s5) || "3103".equals(s5) || "3104".equals(s5) || "3105".equals(s5) || "3106".equals(s5) || "3107".equals(s5) || "3108".equals(s5) || "3109".equals(s5))
            {
                s1 = "KG";
                s2 = s5.substring(3);
                result1 = result;
            } else
            if ("3200".equals(s5) || "3201".equals(s5) || "3202".equals(s5) || "3203".equals(s5) || "3204".equals(s5) || "3205".equals(s5) || "3206".equals(s5) || "3207".equals(s5) || "3208".equals(s5) || "3209".equals(s5))
            {
                s1 = "LB";
                s2 = s5.substring(3);
                result1 = result;
            } else
            if ("3920".equals(s5) || "3921".equals(s5) || "3922".equals(s5) || "3923".equals(s5))
            {
                s = s5.substring(3);
                obj = result;
            } else
            if ("3930".equals(s5) || "3931".equals(s5) || "3932".equals(s5) || "3933".equals(s5))
            {
                if (result.length() < 4)
                {
                    return null;
                }
                obj = result.substring(3);
                s3 = result.substring(0, 3);
                s = s5.substring(3);
            } else
            {
                hashmap.put(s5, result);
            }
        }

        return new ExpandedProductParsedResult(s4, result8, result7, result6, result5, result4, result3, result2, result1, s1, s2, ((String) (obj)), s, s3, hashmap);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
