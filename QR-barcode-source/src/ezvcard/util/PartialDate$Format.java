// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.util:
//            PartialDate

private static class componentIndexes
{

    private int componentIndexes[];
    private Pattern regex;

    public boolean parse(PartialDate partialdate, String s)
    {
        boolean flag1 = true;
        Matcher matcher = regex.matcher(s);
        boolean flag;
        if (matcher.find())
        {
            int i = 0;
            do
            {
                flag = flag1;
                if (i >= componentIndexes.length)
                {
                    break;
                }
                int j = componentIndexes[i];
                if (j != -1)
                {
                    String s1 = matcher.group(i + 1);
                    if (s1 != null)
                    {
                        s = s1;
                        if (s1.startsWith("+"))
                        {
                            s = s1.substring(1);
                        }
                        partialdate.components[j] = Integer.valueOf(s);
                    }
                }
                i++;
            } while (true);
        } else
        {
            flag = false;
        }
        return flag;
    }

    public transient (String s, int ai[])
    {
        regex = Pattern.compile((new StringBuilder()).append("^").append(s).append("$").toString());
        componentIndexes = ai;
    }
}
