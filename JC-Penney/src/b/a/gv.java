// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package b.a:
//            pe, gy, gm, gz, 
//            gl, nk, nh, ha, 
//            gs, gx, pn

public final class gv extends pe
{

    public static final gv a = new gv(0);

    private gv(int i)
    {
        super(i);
    }

    public static gv a(gm gm1)
    {
        int j1 = ((pe) (gm1)).K.length;
        Object obj = new gy(j1);
        int i = 0;
        while (i < j1) 
        {
            Object obj1 = gm1.a(i);
            if (obj1 instanceof gz)
            {
                nk nk1 = ((gz)obj1).a;
                int k1 = ((gl) (obj1)).d();
                int l1 = nk1.a();
                ((gy) (obj)).a(k1, l1 - 1);
                int l = 0;
                while (l < l1) 
                {
                    obj1 = ((gy) (obj)).c.a(l);
                    nh nh3 = gy.a(nk1.a(l));
                    if (obj1 == null)
                    {
                        if (nh3 != null)
                        {
                            ((gy) (obj)).a(k1, nh3);
                        }
                    } else
                    if (nh3 == null)
                    {
                        ((gy) (obj)).b(k1, ((nh) (obj1)));
                    } else
                    if (!nh3.a(((nh) (obj1))))
                    {
                        ((gy) (obj)).b(k1, ((nh) (obj1)));
                        ((gy) (obj)).a(k1, nh3);
                    }
                    l++;
                }
            } else
            if (obj1 instanceof ha)
            {
                nh nh1 = ((ha)obj1).a;
                ((gy) (obj)).a(((gl) (obj1)).d(), nh1);
            } else
            if (obj1 instanceof gs)
            {
                nh nh2 = ((gs)obj1).a;
                ((gy) (obj)).b(((gl) (obj1)).d(), nh2);
            }
            i++;
        }
        ((gy) (obj)).a(0x7fffffff, 0);
        i = ((gy) (obj)).a.size();
        int i1 = i - ((gy) (obj)).b;
        if (i1 == 0)
        {
            return a;
        }
        gm1 = new gx[i1];
        if (i == i1)
        {
            ((gy) (obj)).a.toArray(gm1);
        } else
        {
            obj = ((gy) (obj)).a.iterator();
            int k = 0;
            while (((Iterator) (obj)).hasNext()) 
            {
                gx gx1 = (gx)((Iterator) (obj)).next();
                if (gx1 != null)
                {
                    gm1[k] = gx1;
                    k++;
                }
            }
        }
        Arrays.sort(gm1);
        obj = new gv(i1);
        for (int j = 0; j < i1; j++)
        {
            ((gv) (obj)).a(j, gm1[j]);
        }

        obj.L = false;
        return ((gv) (obj));
    }

    public final gx a(int i)
    {
        return (gx)d(i);
    }

}
