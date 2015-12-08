// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            aq, as

public final class at
{

    final String a;
    final as b;
    private final String c;

    public at(String s, String s1, as as)
    {
        c = s;
        a = s1;
        b = as;
    }

    public final String a(String s)
    {
        Object obj = null;
        if (s.contains("*"))
        {
            String s1 = c;
            String as[] = s.split("\\*");
            s = obj;
            if (as.length > 1)
            {
                int i;
                try
                {
                    i = Integer.parseInt(as[1]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    aq.f((new StringBuilder("Unable to parse slot for url parameter ")).append(s1).toString());
                    return null;
                }
                s = (new StringBuilder()).append(s1).append(i).toString();
            }
            return s;
        } else
        {
            return c;
        }
    }
}
