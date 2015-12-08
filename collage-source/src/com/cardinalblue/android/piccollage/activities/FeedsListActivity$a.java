// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            FeedsListActivity

private static final class c extends Enum
{

    public static final a a;
    private static final a d[];
    private final String b;
    private final int c;

    public static c a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            c ac[] = values();
            int j = ac.length;
            for (int i = 0; i < j; i++)
            {
                c c1 = ac[i];
                if (s.equalsIgnoreCase(c1.a()))
                {
                    return c1;
                }
            }

        }
        throw new IllegalArgumentException((new StringBuilder()).append("Cannot find feed name for ").append(s).toString());
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/cardinalblue/android/piccollage/activities/FeedsListActivity$a, s);
    }

    public static a[] values()
    {
        return (a[])d.clone();
    }

    public String a()
    {
        return b;
    }

    public String a(Context context)
    {
        return context.getString(c);
    }

    static 
    {
        a = new <init>("CONTESTS", 0, "contests", 0x7f0701ae);
        d = (new d[] {
            a
        });
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        b = s1;
        c = j;
    }
}
