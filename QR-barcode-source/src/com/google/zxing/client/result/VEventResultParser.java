// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.List;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, VCardResultParser, CalendarParsedResult, ParsedResult

public final class VEventResultParser extends ResultParser
{

    public VEventResultParser()
    {
    }

    private static String matchSingleVCardPrefixedField(CharSequence charsequence, String s, boolean flag)
    {
        charsequence = VCardResultParser.matchSingleVCardPrefixedField(charsequence, s, flag, false);
        if (charsequence == null || charsequence.isEmpty())
        {
            return null;
        } else
        {
            return (String)charsequence.get(0);
        }
    }

    private static String[] matchVCardPrefixedField(CharSequence charsequence, String s, boolean flag)
    {
        charsequence = VCardResultParser.matchVCardPrefixedField(charsequence, s, flag, false);
        if (charsequence == null || charsequence.isEmpty())
        {
            return null;
        }
        int j = charsequence.size();
        s = new String[j];
        for (int i = 0; i < j; i++)
        {
            s[i] = (String)((List)charsequence.get(i)).get(0);
        }

        return s;
    }

    private static String stripMailto(String s)
    {
        String s1;
label0:
        {
            s1 = s;
            if (s == null)
            {
                break label0;
            }
            if (!s.startsWith("mailto:"))
            {
                s1 = s;
                if (!s.startsWith("MAILTO:"))
                {
                    break label0;
                }
            }
            s1 = s.substring(7);
        }
        return s1;
    }

    public CalendarParsedResult parse(Result result)
    {
        String s6 = getMassagedText(result);
        if (s6.indexOf("BEGIN:VEVENT") < 0)
        {
            return null;
        }
        result = matchSingleVCardPrefixedField("SUMMARY", s6, true);
        String s = matchSingleVCardPrefixedField("DTSTART", s6, true);
        if (s == null)
        {
            return null;
        }
        String s1 = matchSingleVCardPrefixedField("DTEND", s6, true);
        String s2 = matchSingleVCardPrefixedField("DURATION", s6, true);
        String s3 = matchSingleVCardPrefixedField("LOCATION", s6, true);
        String s4 = stripMailto(matchSingleVCardPrefixedField("ORGANIZER", s6, true));
        String as[] = matchVCardPrefixedField("ATTENDEE", s6, true);
        if (as != null)
        {
            for (int i = 0; i < as.length; i++)
            {
                as[i] = stripMailto(as[i]);
            }

        }
        String s5 = matchSingleVCardPrefixedField("DESCRIPTION", s6, true);
        s6 = matchSingleVCardPrefixedField("GEO", s6, true);
        double d;
        double d1;
        if (s6 == null)
        {
            d = (0.0D / 0.0D);
            d1 = (0.0D / 0.0D);
        } else
        {
            int j = s6.indexOf(';');
            try
            {
                d = Double.parseDouble(s6.substring(0, j));
                d1 = Double.parseDouble(s6.substring(j + 1));
            }
            // Misplaced declaration of an exception variable
            catch (Result result)
            {
                return null;
            }
        }
        try
        {
            result = new CalendarParsedResult(result, s, s1, s2, s3, s4, as, s5, d, d1);
        }
        // Misplaced declaration of an exception variable
        catch (Result result)
        {
            return null;
        }
        return result;
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }
}
