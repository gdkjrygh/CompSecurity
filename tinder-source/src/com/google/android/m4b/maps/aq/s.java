// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bh.a;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cc.f;
import com.google.android.m4b.maps.cc.q;
import com.google.android.m4b.maps.cc.u;
import com.google.android.m4b.maps.cg.bb;
import com.google.android.m4b.maps.model.Tile;
import com.google.android.m4b.maps.y.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class s
    implements com.google.android.m4b.maps.cg.bb.a
{
    public static interface a
    {

        public abstract void b(boolean flag);
    }


    static q a = new u();
    final com.google.android.m4b.maps.bh.a.d b;
    final bb c;
    final Set d = Collections.synchronizedSet(new HashSet());
    volatile d e;
    final com.google.android.m4b.maps.bh.a f = com.google.android.m4b.maps.bh.a.a();
    final Set g = Collections.synchronizedSet(new HashSet());
    private volatile a h;
    private final e i;

    public s(bb bb1, String s1, e e1)
    {
        c = (bb)j.a(bb1);
        bb1 = a(Integer.valueOf(s1.replaceAll("\\D", "")).intValue());
        b = new com.google.android.m4b.maps.bh.a.d(ah.t, null, bb1);
        com.google.android.m4b.maps.bh.a.a(new k());
        i = e1;
    }

    private static com.google.android.m4b.maps.bw.a a(int l)
    {
        int ai[] = new int[32];
        int j1 = 0;
        int i1 = 0;
        for (; j1 < 32; j1++)
        {
            if ((1 << j1 & l) != 0)
            {
                int k1 = i1 + 1;
                ai[i1] = j1;
                i1 = k1;
            }
        }

        int ai1[] = new int[i1];
        System.arraycopy(ai, 0, ai1, 0, i1);
        return com.google.android.m4b.maps.bw.a.a(ai1);
    }

    private void a(ac ac1)
    {
        d d1;
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        d1 = e;
        a(ac1, a, d1);
    }

    private void a(ac ac1, q q1, d d1)
    {
        if (f != null)
        {
            f.a(d1, b, ac1, q1);
        }
        d.remove(ac1);
        boolean flag;
        if (q1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ac1 = h;
        if (ac1 != null)
        {
            ac1.b(flag);
        }
    }

    final q a(ac ac1, boolean flag)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return f.a(e, b, ac1, flag);
        }
    }

    public final void a()
    {
        if (e != null)
        {
            f.b(e, b);
        }
    }

    public final void a(a a1)
    {
        boolean flag2 = true;
        boolean flag = true;
        if (h == null)
        {
            if (a1 == null)
            {
                flag = false;
            }
            j.a(flag);
        } else
        {
            boolean flag1;
            if (a1 == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            j.a(flag1);
        }
        h = a1;
    }

    public final void a(com.google.android.m4b.maps.cg.bb.b b1)
    {
        g.remove(b1);
        a(new ac(b1.c, b1.a, b1.b));
    }

    public final void a(com.google.android.m4b.maps.cg.bb.b b1, Tile tile)
    {
        ac ac1;
        boolean flag;
        boolean flag1 = true;
        bg bg1;
        if (tile.b > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "width of tile image must be positive");
        if (tile.c > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "height of tile image must be positive");
        ac1 = new ac(b1.c, b1.a, b1.b);
        bg1 = new bg(ac1, 0, tile.b, tile.c, tile.d, ah.t, i);
        g.remove(b1);
        if (e != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        try
        {
            j.b(flag);
            tile = e;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.m4b.maps.cg.bb.b b1)
        {
            a(ac1);
            return;
        }
        if (tile == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        b1 = com.google.android.m4b.maps.cc.f.a(bg1);
_L1:
        a(ac1, ((q) (b1)), ((d) (tile)));
        return;
        b1 = null;
          goto _L1
    }

    public final void a(List list)
    {
        ArrayList arraylist;
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            q q1 = (q)list.next();
            if (q1 != a)
            {
                arraylist.add(q1.b());
            }
        } while (true);
        f.b(e, b, arraylist);
    }

}
