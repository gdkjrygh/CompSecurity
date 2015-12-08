// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public final class gup extends Enum
{

    public static final gup a;
    public static final gup b;
    private static gup d;
    private static gup e;
    private static gup f;
    private static Set g;
    private static final SparseArray h;
    private static final gup i[];
    int c;

    private gup(String s, int j, int k)
    {
        super(s, j);
        c = k;
    }

    public static gup a(int j)
    {
        return (gup)h.get(j, a);
    }

    public static gup valueOf(String s)
    {
        return (gup)Enum.valueOf(gup, s);
    }

    public static gup[] values()
    {
        return (gup[])i.clone();
    }

    static 
    {
        a = new gup("UNKNOWN", 0, 0);
        d = new gup("DEBUG_EDITOR", 1, 1);
        b = new gup("CONSUMER_PHOTO_EDITOR", 2, 2);
        e = new gup("SNAPSEED", 3, 3);
        f = new gup("SLOMO_VIDEO_EDITOR", 4, 4);
        i = (new gup[] {
            a, d, b, e, f
        });
        g = Collections.unmodifiableSet(EnumSet.of(d, b, e, f));
        h = new SparseArray();
        gup gup1;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); h.put(gup1.c, gup1))
        {
            gup1 = (gup)iterator.next();
        }

    }
}
