// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import com.fitbit.data.domain.ActivityItem;
import java.util.Comparator;
import java.util.Locale;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            a

private static class a
    implements Comparator
{

    private final String a;

    private int a(String s)
    {
        int i1 = s.length() + 1;
        int j1 = a.length();
        int ai1[] = new int[i1];
        int ai[] = new int[i1];
        for (int i = 0; i < i1; i++)
        {
            ai1[i] = i;
        }

        int j = 1;
        do
        {
            int ai2[] = ai1;
            if (j < j1 + 1)
            {
                ai[0] = j;
                int k = 1;
                while (k < i1) 
                {
                    int l;
                    int k1;
                    if (s.charAt(k - 1) == a.charAt(j - 1))
                    {
                        l = 0;
                    } else
                    {
                        l = 1;
                    }
                    k1 = ai2[k - 1];
                    ai[k] = Math.min(Math.min(ai2[k] + 1, ai[k - 1] + 1), l + k1);
                    k++;
                }
                j++;
                ai1 = ai;
                ai = ai2;
            } else
            {
                return ai2[i1 - 1];
            }
        } while (true);
    }

    public int a(ActivityItem activityitem, ActivityItem activityitem1)
    {
        int j = a(activityitem.a().toLowerCase(Locale.US)) - a(activityitem1.a().toLowerCase(Locale.US));
        int i = j;
        if (j == 0)
        {
            i = activityitem.a().compareToIgnoreCase(activityitem1.a());
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ActivityItem)obj, (ActivityItem)obj1);
    }

    public (String s)
    {
        a = s.toLowerCase(Locale.US);
    }
}
