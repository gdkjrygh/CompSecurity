// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public final class etz extends Enum
{

    public static final etz a;
    public static final etz b;
    public static final etz c;
    public static final etz d;
    public static final etz e;
    private static final etz g[];
    final int f;

    private etz(String s, int i, int j)
    {
        super(s, i);
        boolean flag;
        if (!ety.b().contains(Integer.valueOf(j)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        f = j;
    }

    public static etz valueOf(String s)
    {
        return (etz)Enum.valueOf(etz, s);
    }

    public static etz[] values()
    {
        return (etz[])g.clone();
    }

    static 
    {
        a = new etz("CURRENT_SYNC_TOKEN", 0, 0);
        b = new etz("NEXT_SYNC_TOKEN", 1, 1);
        c = new etz("INITIAL_RESUME_TOKEN", 2, 3);
        d = new etz("DELTA_RESUME_TOKEN", 3, 4);
        e = new etz("BOOTSTRAP_COMPLETE", 4, 5);
        g = (new etz[] {
            a, b, c, d, e
        });
    }
}
