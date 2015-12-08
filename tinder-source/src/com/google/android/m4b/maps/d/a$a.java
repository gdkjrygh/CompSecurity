// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.d;

import java.util.regex.Pattern;

// Referenced classes of package com.google.android.m4b.maps.d:
//            a

public static final class c
    implements Comparable
{

    public static final a d = new <init>();
    public final String a;
    public final String b;
    public final boolean c;
    private String e;

    public final int compareTo(Object obj)
    {
        return ((c)obj).a.compareTo(a);
    }


    private ()
    {
        e = "DEFAULT";
        a = "";
        b = null;
        c = false;
    }

    public c(String s, String s1)
    {
        e = s;
        String as[] = com.google.android.m4b.maps.d.a.a().split(s1);
        if (as.length == 0)
        {
            throw new <init>("Empty rule");
        }
        a = as[0];
        s = null;
        boolean flag = false;
        for (int i = 1; i < as.length;)
        {
            String s2 = as[i].toLowerCase();
            if (s2.equals("rewrite") && i + 1 < as.length)
            {
                s = as[i + 1];
                i += 2;
            } else
            if (s2.equals("block"))
            {
                i++;
                flag = true;
            } else
            {
                throw new <init>((new StringBuilder("Illegal rule: ")).append(s1).toString());
            }
        }

        b = s;
        c = flag;
    }
}
