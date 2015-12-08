// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import java.util.Arrays;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            n

public final class p
    implements Comparable
{

    n a;
    final int b[];
    private final int c;

    public p(int i, int ai[])
    {
        c = i;
        b = ai;
        a = null;
    }

    public static String a(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder(ai.length * 12);
        for (int i = 0; i < ai.length; i++)
        {
            stringbuilder.append(ai[i]);
            if (i < ai.length - 1)
            {
                stringbuilder.append(" ");
            }
        }

        return stringbuilder.toString();
    }

    public final double a()
    {
        if (a != null)
        {
            return a.b;
        } else
        {
            return 0.0D;
        }
    }

    public final int compareTo(Object obj)
    {
        obj = (p)obj;
        if (a() == ((p) (obj)).a())
        {
            return 0;
        }
        return a() >= ((p) (obj)).a() ? 1 : -1;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof p)
        {
            obj = (p)obj;
            if (c == ((p) (obj)).c && Arrays.equals(b, ((p) (obj)).b))
            {
                if (a == null)
                {
                    if (((p) (obj)).a == null)
                    {
                        return true;
                    }
                } else
                {
                    return a.equals(((p) (obj)).a);
                }
            }
        }
        return false;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("========= Node Info ============\n");
        int i = c;
        stringbuilder.append((new StringBuilder(19)).append("endPos=").append(i).append("\n").toString());
        String s = String.valueOf(Arrays.toString(b));
        stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 12)).append("stateWords=").append(s).append("\n").toString());
        double d = a();
        stringbuilder.append((new StringBuilder(37)).append("ViterbiCost=").append(d).append("\n").toString());
        return stringbuilder.toString();
    }
}
