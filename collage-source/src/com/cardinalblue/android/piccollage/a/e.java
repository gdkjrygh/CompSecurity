// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.text.TextUtils;
import com.google.b.i;
import com.google.b.l;
import com.google.b.o;

// Referenced classes of package com.cardinalblue.android.piccollage.a:
//            f

public class e
{

    public e()
    {
    }

    public static float a(o o1, String s, float f1)
    {
        if (a(o1, s))
        {
            f1 = o1.c(s).e();
        }
        return f1;
    }

    public static int a(o o1, String s, int j)
    {
        if (a(o1, s))
        {
            j = o1.c(s).g();
        }
        return j;
    }

    public static String a(o o1, String s, String s1)
    {
        if (a(o1, s))
        {
            s1 = o1.c(s).c();
        }
        return s1;
    }

    public static boolean a(o o1, String s)
    {
        return !TextUtils.isEmpty(s) && o1.b(s) && !o1.c(s).l();
    }

    public static float[] a(o o1, String s, float af[])
    {
        if (a(o1, s)) goto _L2; else goto _L1
_L1:
        return af;
_L2:
        s = o1.d(s);
        if (s.a() < 0)
        {
            f.a(new IllegalStateException("Invalid json array size"));
            return af;
        }
        o1 = new float[s.a()];
        int j = 0;
        do
        {
            af = o1;
            if (j >= o1.length)
            {
                continue;
            }
            o1[j] = s.a(j).e();
            j++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static l b(o o1, String s)
    {
        if (a(o1, s))
        {
            return o1.c(s);
        } else
        {
            return null;
        }
    }
}
