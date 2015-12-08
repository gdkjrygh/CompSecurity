// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import java.util.Arrays;
import java.util.BitSet;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            o

public final class q
    implements Comparable
{

    o a;
    final int b[];
    final BitSet c;
    final int d;
    private String e;

    public q(int ai[], BitSet bitset, int i)
    {
        e = null;
        b = ai;
        d = i;
        c = bitset;
    }

    public static String a(int ai[], BitSet bitset, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (ai != null)
        {
            for (int j = 0; j < ai.length; j++)
            {
                stringbuilder.append(ai[j]);
                stringbuilder.append(" ");
            }

        }
        stringbuilder.append(bitset.toString());
        stringbuilder.append(" ");
        stringbuilder.append(i);
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

    public final String b()
    {
        if (e != null)
        {
            return e;
        } else
        {
            e = a(b, c, d);
            return e;
        }
    }

    public final int compareTo(Object obj)
    {
        obj = (q)obj;
        if (a() == ((q) (obj)).a())
        {
            return 0;
        }
        return a() >= ((q) (obj)).a() ? -1 : 1;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof q)
        {
            obj = (q)obj;
            if (d == ((q) (obj)).d && c.equals(((q) (obj)).c) && Arrays.equals(b, ((q) (obj)).b))
            {
                if (a == null)
                {
                    if (((q) (obj)).a == null)
                    {
                        return true;
                    }
                } else
                {
                    return a.equals(((q) (obj)).a);
                }
            }
        }
        return false;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Node Info = ");
        String s = b();
        stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 13)).append("Signature = ").append(s).append("\t").toString());
        double d1 = a();
        stringbuilder.append((new StringBuilder(38)).append("ViterbiCost = ").append(d1).toString());
        return stringbuilder.toString();
    }
}
