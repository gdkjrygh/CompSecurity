// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

public final class gdd
{

    private Set a;
    private Set b;
    private int c;
    private gde d;

    public gdd(int i, gde gde1)
    {
        ctz.a(gde1);
        if (i < 0)
        {
            throw new IllegalArgumentException("numberOfCursors must be positive");
        } else
        {
            c = i;
            d = gde1;
            a = new HashSet(i);
            b = new HashSet(i);
            return;
        }
    }

    public final void a(Object obj, Cursor cursor)
    {
        boolean flag = duc.a(cursor);
        int i;
        int j;
        int k;
        int l;
        if (cursor.getCount() == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = a.size();
        k = b.size();
        if (flag)
        {
            if (i != 0)
            {
                a.add(obj);
                b.remove(obj);
            } else
            {
                a.remove(obj);
                b.add(obj);
            }
        } else
        {
            a.remove(obj);
            b.remove(obj);
        }
        if ((k != 0 || b.size() <= 0) && j < c)
        {
            a.size();
        }
        i = a.size();
        l = b.size();
        if (j + k < c && i + l == c)
        {
            d.a();
        }
    }
}
