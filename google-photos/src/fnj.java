// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class fnj extends Enum
{

    public static final fnj a;
    public static final fnj b;
    public static final fnj c;
    public static final fnj d;
    private static final fnj f[];
    public final String e;

    private fnj(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static fnj a(String s)
    {
        fnj afnj[] = values();
        int j = afnj.length;
        for (int i = 0; i < j; i++)
        {
            fnj fnj1 = afnj[i];
            if (fnj1.e.equals(s))
            {
                return fnj1;
            }
        }

        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unrecognised name: ".concat(s);
        } else
        {
            s = new String("Unrecognised name: ");
        }
        throw new IllegalArgumentException(s);
    }

    public static fnj[] a()
    {
        return values();
    }

    public static fnj[] b()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(values()));
        arraylist.remove(a);
        return (fnj[])arraylist.toArray(new fnj[arraylist.size() - 1]);
    }

    public static fnj valueOf(String s)
    {
        return (fnj)Enum.valueOf(fnj, s);
    }

    public static fnj[] values()
    {
        return (fnj[])f.clone();
    }

    static 
    {
        a = new fnj("MONTH", 0, "month");
        b = new fnj("COMPACT", 1, "compact");
        c = new fnj("DAY_SEGMENTED", 2, "day_segmented");
        d = new fnj("COZY", 3, "cozy");
        f = (new fnj[] {
            a, b, c, d
        });
    }
}
