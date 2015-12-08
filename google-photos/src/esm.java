// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class esm extends Enum
{

    public static final esm a;
    public static final esm b;
    public static final esm c;
    public static final esm d;
    public static final Set e;
    private static final SparseArray g;
    private static final esm h[];
    public int f;

    private esm(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static esm a(int i)
    {
        return (esm)g.get(i, a);
    }

    public static esm valueOf(String s)
    {
        return (esm)Enum.valueOf(esm, s);
    }

    public static esm[] values()
    {
        return (esm[])h.clone();
    }

    static 
    {
        int i = 0;
        a = new esm("UNKNOWN", 0, 0);
        b = new esm("ALBUM", 1, 1);
        c = new esm("STORY", 2, 2);
        d = new esm("MOVIE", 3, 3);
        h = (new esm[] {
            a, b, c, d
        });
        e = Collections.unmodifiableSet(EnumSet.of(b, c, d));
        g = new SparseArray();
        esm aesm[] = values();
        for (int j = aesm.length; i < j; i++)
        {
            esm esm1 = aesm[i];
            g.put(esm1.f, esm1);
        }

    }
}
