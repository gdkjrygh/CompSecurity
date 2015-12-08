// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.microsoft.advertising.android:
//            a, d, bn, bp, 
//            l

final class bm extends a
    implements d
{

    private final String a;
    private final List b;
    private final String c;

    bm(bn bn1, l l)
    {
        super(l);
        b = bn1.b;
        c = bn1.c;
        a = bn1.a;
    }

    public final bp a(String s, int i)
    {
        if (b.size() > 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((bp) (obj));
_L2:
        bp bp2;
        int j = 0;
        int k = 0x7fffffff;
        String s1;
        bp bp1;
        Iterator iterator;
        if (s != null)
        {
            s1 = s;
        } else
        {
            s1 = "";
        }
        bp1 = null;
        bp2 = null;
        s = null;
        iterator = b.iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    obj = s;
                    if (s == null)
                    {
                        if (bp1 != null)
                        {
                            return bp1;
                        }
                        break label0;
                    }
                    continue; /* Loop/switch isn't completed */
                }
                obj = (bp)iterator.next();
                if (((bp) (obj)).a().toLowerCase(Locale.ENGLISH).startsWith(s1.toLowerCase(Locale.ENGLISH)))
                {
                    int l = ((bp) (obj)).b();
                    bp bp3 = bp2;
                    if (l == 0)
                    {
                        bp3 = bp2;
                        if (bp2 == null)
                        {
                            bp3 = ((bp) (obj));
                        }
                    }
                    if (l <= i && l > j)
                    {
                        j = l;
                        s = ((String) (obj));
                        bp2 = bp3;
                    } else
                    {
                        bp2 = bp3;
                        if (l > i)
                        {
                            bp2 = bp3;
                            if (l < k)
                            {
                                k = l;
                                bp1 = ((bp) (obj));
                                bp2 = bp3;
                            }
                        }
                    }
                }
            }
        } while (true);
        if (bp2 != null)
        {
            return bp2;
        } else
        {
            return (bp)b.get(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final d.a e()
    {
        return d.a.d;
    }

    public final boolean f()
    {
        return true;
    }

    public final String g()
    {
        return c;
    }

    public final String h()
    {
        return a;
    }
}
