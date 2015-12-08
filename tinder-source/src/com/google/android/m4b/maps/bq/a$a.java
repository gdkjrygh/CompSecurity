// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.cq.e;
import com.google.android.m4b.maps.y.j;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            a

public abstract class b extends b
{

    protected int a;
    protected byte b[][];
    private com.google.android.m4b.maps.bq.a f;

    private void a(InputStream inputstream)
    {
        int j1 = super.d;
        int k = 0;
        do
        {
            a a1 = new a(null);
            if (c.a(e.f, inputstream, a1) != -1)
            {
                Object obj1 = a1.f(1);
                byte abyte0[];
                byte abyte1[];
                int l;
                int i1;
                if (((a) (obj1)).i(8))
                {
                    i1 = ((a) (obj1)).d(8);
                } else
                {
                    i1 = -1;
                }
                abyte0 = a1.c(2);
                if (abyte0 != null)
                {
                    l = abyte0.length;
                } else
                {
                    l = 0;
                }
                abyte1 = a(l, i1);
                if (abyte0 != null)
                {
                    System.arraycopy(abyte0, 0, abyte1, abyte1.length - l, l);
                }
                if (k < j1)
                {
                    Object obj;
                    com.google.android.m4b.maps.bo. a2[];
                    int k1;
                    int l1;
                    int i2;
                    int j2;
                    int k2;
                    if (((a) (obj1)).i(30))
                    {
                        obj = al.a(((a) (obj1)).e(30));
                    } else
                    {
                        obj = obj1;
                    }
                    k1 = ((a) (obj)).d(2);
                    l1 = ((a) (obj)).d(3);
                    i2 = ((a) (obj)).d(4);
                    j2 = com.google.android.m4b.maps.bq.a.f(f);
                    obj = new af();
                    a2 = com.google.android.m4b.maps.bo..values();
                    k2 = a2.length;
                    for (i1 = 0; i1 < k2; i1++)
                    {
                        bd bd1 = a2[i1].a(((a) (obj1)));
                        if (bd1 != null)
                        {
                            ((af) (obj)).a(bd1);
                        }
                    }

                    obj1 = com.google.android.m4b.maps.al.b.a(ah.a(((a) (obj1)).d(1)), new ac(i2 - j2, k1, l1, ((af) (obj))));
                    if (((Pair) (obj1)).second == null)
                    {
                        obj = new Pair(((Pair) (obj1)).first, "");
                    } else
                    {
                        obj = obj1;
                    }
                    obj = (Integer)super.e.get(obj);
                    if (obj == null)
                    {
                        if (ab.a(f.getName(), 6))
                        {
                            Log.e(f.getName(), "Received wrong tile");
                        }
                    } else
                    if (l == 0)
                    {
                        if (ab.a(f.getName(), 3))
                        {
                            obj = f.getName();
                            abyte1 = String.valueOf(((Pair) (obj1)).first);
                            obj1 = (String)((Pair) (obj1)).second;
                            Log.d(((String) (obj)), (new StringBuilder(String.valueOf(abyte1).length() + 27 + String.valueOf(obj1).length())).append("COMPACT-0 tile with key: ").append(abyte1).append(", ").append(((String) (obj1))).toString());
                        }
                    } else
                    {
                        b[((Integer) (obj)).intValue()] = abyte1;
                    }
                }
                k++;
            } else
            {
                if (k != j1 && ab.a(f.getName(), 3))
                {
                    Log.d(f.getName(), (new StringBuilder(48)).append("Received ").append(k).append(" tiles, expected ").append(j1).toString());
                }
                return;
            }
        } while (true);
    }

    private tName i()
    {
        tName tname = com.google.android.m4b.maps.bq.a;
        for (int k = 0; k < super.d;)
        {
            tName tname1;
label0:
            {
                tName tname2 = super.c[k].d;
                if (tname != com.google.android.m4b.maps.bq.a)
                {
                    tname1 = tname;
                    if (tname2.f >= tname.f)
                    {
                        break label0;
                    }
                }
                tname1 = tname2;
            }
            k++;
            tname = tname1;
        }

        return tname;
    }

    public final void a(DataOutput dataoutput)
    {
        a a2 = new a(e.b);
        a a1 = new a(e.c);
        a1.b(1, a2);
        a2.a(1, com.google.android.m4b.maps.bq.a.a(f));
        a2.a(4, com.google.android.m4b.maps.bq.a.b(f));
        a2.a(5, i().f);
        if (com.google.android.m4b.maps.bq.a.c(f) > 1.0F)
        {
            a2.a(6, com.google.android.m4b.maps.bq.a.c(f));
        }
        for (Iterator iterator = com.google.android.m4b.maps.bq.a.d(f).iterator(); iterator.hasNext(); a2.a(2, ((Integer)iterator.next()).intValue())) { }
        if (com.google.android.m4b.maps.bq.a.e(f))
        {
            a2.a(3, 2);
        }
        if (o.a())
        {
            a2.a(3, 0);
        }
        if (f.c.a.a)
        {
            a2.a(3, 4);
        }
        if (i() != com.google.android.m4b.maps.bq.a)
        {
            a2.a(5, i().f);
        }
        a2.a(3, 6);
        if (f.b == ah.x)
        {
            a2.a(3, 7);
        }
        int l = super.d;
        for (int k = 0; k < l; k++)
        {
            Object obj = super.c[k];
            Object obj1 = ((c) (obj)).a;
            a a3 = new a(e.g);
            a3.a(30, al.a(((ac) (obj1)).b, ((ac) (obj1)).c, ((ac) (obj1)).a + com.google.android.m4b.maps.bq.a.f(f)));
            a3.a(2, 0L);
            a3.a(3, 0L);
            a3.a(4, 0L);
            a3.a(1, ((f) (obj)).h.A);
            a3.a(7, (() (obj)).h.B);
            ah ah1 = (() (obj)).h;
            obj1 = ((ac) (obj1)).d.a.values().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                bd bd1 = (bd)((Iterator) (obj1)).next();
                if (bd1.a(ah1))
                {
                    bd1.a(a3);
                }
            } while (true);
            if (f.c.a.a)
            {
                a3.a(8, ((f) (obj)).i);
            }
            obj = f.b.H;
            if (obj != null)
            {
                a3.b(15, obj);
            }
            a1.a(9, a3);
        }

        c.a(dataoutput, a1);
    }

    protected final boolean a( )
    {
        while (super.d == 0 || super.c[0].a.a == .a.a && super.c[0].a.d == .a.d) 
        {
            return true;
        }
        return false;
    }

    public final boolean a(DataInput datainput)
    {
        datainput = c.a(datainput);
        a a1 = new a(null);
        int k;
        boolean flag;
        if (c.a(e.f, datainput, a1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        a = a1.d(1);
        k = a1.d(2);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (ab.a(f.getName(), 6))
        {
            Log.e(f.getName(), (new StringBuilder(40)).append("Received tile response code: ").append(k).toString());
        }
        a(((InputStream) (datainput)));
        datainput.close();
        return true;
        Exception exception;
        exception;
        datainput.close();
        throw exception;
    }

    protected byte[] a(int k, int l)
    {
        return new byte[k];
    }

    public final int g()
    {
        return 108;
    }

    protected int h()
    {
        return a;
    }

    protected (com.google.android.m4b.maps.bq.a a1, com.google.android.m4b.maps.bs.e e1)
    {
        f = a1;
        super(e1);
        b = new byte[8][];
    }
}
