// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder

static abstract class x
    implements x
{

    private volatile String iOtherAffixes[];

    public void finish(Set set)
    {
        if (iOtherAffixes == null)
        {
            int i = 0x7fffffff;
            String s = null;
            String as[] = getAffixes();
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s1 = as[j];
                if (s1.length() < i)
                {
                    i = s1.length();
                    s = s1;
                }
            }

            HashSet hashset = new HashSet();
            set = set.iterator();
            do
            {
                if (!set.hasNext())
                {
                    break;
                }
                x x = (x)set.next();
                if (x != null)
                {
                    String as1[] = x.getAffixes();
                    int i1 = as1.length;
                    int k = 0;
                    while (k < i1) 
                    {
                        String s2 = as1[k];
                        if (s2.length() > i || s2.equalsIgnoreCase(s) && !s2.equals(s))
                        {
                            hashset.add(s2);
                        }
                        k++;
                    }
                }
            } while (true);
            iOtherAffixes = (String[])hashset.toArray(new String[hashset.size()]);
        }
    }

    protected boolean matchesOtherAffix(int i, String s, int j)
    {
        if (iOtherAffixes != null)
        {
            String as[] = iOtherAffixes;
            int l = as.length;
            for (int k = 0; k < l; k++)
            {
                String s1 = as[k];
                int i1 = s1.length();
                if (i < i1 && s.regionMatches(true, j, s1, 0, i1) || i == i1 && s.regionMatches(false, j, s1, 0, i1))
                {
                    return true;
                }
            }

        }
        return false;
    }

    x()
    {
    }
}
