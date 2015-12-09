// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Color;
import java.util.List;

public final class bgz
{

    private static final int g;
    private static int h = Color.rgb(204, 204, 204);
    private static int i;
    final String a;
    final List b;
    final int c;
    final int d;
    final int e;
    final int f;

    public bgz(String s, List list, Integer integer, Integer integer1, Integer integer2, int j)
    {
        a = s;
        b = list;
        int k;
        if (integer != null)
        {
            k = integer.intValue();
        } else
        {
            k = h;
        }
        c = k;
        if (integer1 != null)
        {
            k = integer1.intValue();
        } else
        {
            k = i;
        }
        d = k;
        if (integer2 != null)
        {
            k = integer2.intValue();
        } else
        {
            k = 12;
        }
        e = k;
        f = j;
    }

    static 
    {
        g = Color.rgb(12, 174, 206);
        i = g;
    }
}
