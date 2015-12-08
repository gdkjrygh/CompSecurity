// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.util.SparseArray;
import java.text.ParseException;

public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    private static SparseArray d;
    private static final e f[];
    private int e;

    private e(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static e a(int i)
    {
        e ae[] = values();
        int k = ae.length;
        for (int j = 0; j < k; j++)
        {
            e e1 = ae[j];
            if (e1.e == i)
            {
                return e1;
            }
        }

        throw new ParseException((new StringBuilder("Unknown status code: ")).append(Integer.toString(i)).toString(), 0);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(crittercism/android/e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new e("NOT_ON_WIFI", 0, 0);
        b = new e("ON_WIFI", 1, 1);
        c = new e("UNKNOWN", 2, 2);
        f = (new e[] {
            a, b, c
        });
        SparseArray sparsearray = new SparseArray();
        d = sparsearray;
        sparsearray.put(0, a);
        d.put(1, b);
    }
}
