// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;

import java.util.EnumSet;
import java.util.Iterator;

public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    private static final i f[];
    String e;

    private i(String s, int j, String s1)
    {
        super(s, j);
        e = s1;
    }

    public static i a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(p/bh/i).iterator(); iterator.hasNext();)
        {
            i j = (i)iterator.next();
            if (j.toString().equals(s))
            {
                return j;
            }
        }

        return null;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(p/bh/i, s);
    }

    public static i[] values()
    {
        return (i[])f.clone();
    }

    public String toString()
    {
        return e;
    }

    static 
    {
        a = new i("HMI_FULL", 0, "FULL");
        b = new i("HMI_LIMITED", 1, "LIMITED");
        c = new i("HMI_BACKGROUND", 2, "BACKGROUND");
        d = new i("HMI_NONE", 3, "NONE");
        f = (new i[] {
            a, b, c, d
        });
    }
}
