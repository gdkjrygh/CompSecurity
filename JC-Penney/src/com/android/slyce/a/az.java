// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

// Referenced classes of package com.android.slyce.a:
//            ba, bb, bc, bd, 
//            be, bf, bg, bh, 
//            aj, am, bk, bi, 
//            bl, bj

public class az
    implements e
{

    static Hashtable d = new Hashtable();
    am a;
    ByteOrder b;
    aj c;
    private bl e;
    private bl f;
    private bl g;
    private bl h;
    private bl i;
    private bj j;
    private bj k;
    private bj l;
    private LinkedList m;
    private ArrayList n;

    public az(am am1)
    {
        e = new ba(this, 0);
        f = new bb(this, 1);
        g = new bc(this, 2);
        h = new bd(this, 4);
        i = new be(this, 8);
        j = new bf(this);
        k = new bg(this);
        l = new bh(this);
        m = new LinkedList();
        n = new ArrayList();
        b = ByteOrder.BIG_ENDIAN;
        c = new aj();
        a = am1;
        a.a(this);
    }

    static ArrayList a(az az1)
    {
        return az1.n;
    }

    public az a(byte byte0, e e1)
    {
        m.add(new bk(byte0, e1));
        return this;
    }

    public az a(int i1, bj bj)
    {
        m.add(new bi(i1, bj));
        return this;
    }

    public void a(am am1, aj aj1)
    {
        aj1.a(c);
        do
        {
            if (m.size() <= 0 || c.d() < ((bl)m.peek()).c)
            {
                break;
            }
            c.a(b);
            bl bl1 = ((bl)m.poll()).a(am1, c);
            if (bl1 != null)
            {
                m.addFirst(bl1);
            }
        } while (true);
        if (m.size() == 0)
        {
            c.a(aj1);
        }
    }

}
