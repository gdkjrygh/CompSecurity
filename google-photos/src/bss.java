// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;

public final class bss extends bmb
{

    public final bto a = new bst(this, this, bsx);
    final bsy b = new bsw(this);
    final bqa e;
    boolean f;
    private final cyz g;

    bss(bmb bmb1, bqa bqa1, cyz cyz1)
    {
        super(bmb1);
        new bsu(this, this, new bxg[] {
            bxg.c
        });
        new bsv(this, this, new bxg[] {
            bxg.j
        });
        e = (bqa)b.a(bqa1, "playerScreenController", null);
        g = (cyz)b.a(cyz1, "themesLibrary", null);
    }

    void a(bsx bsx1)
    {
        if (c.b.t.y || ddy.a.a())
        {
            cyz cyz1 = g;
            ArrayList arraylist = new ArrayList();
            cyy acyy[] = cyy.values();
            int j = acyy.length;
            for (int i = 0; i < j; i++)
            {
                cyy cyy1 = acyy[i];
                if (cyy1.y || ddy.a.a())
                {
                    arraylist.add(cyy1);
                }
            }

            Collections.sort(arraylist, cyz1.b);
            bsx1.a(Collections.unmodifiableList(arraylist));
            bsx1.a(c.b.t);
            return;
        } else
        {
            bsx1.a(new ArrayList());
            return;
        }
    }

    void a(cyy cyy1, boolean flag)
    {
        c.a(cyy1);
        e.e = false;
        f = flag;
    }

    public final void a(boolean flag)
    {
        ((bsx)a.b).h(flag);
    }

    public final void b()
    {
        e.k();
        a(c.b.u, false);
    }
}
