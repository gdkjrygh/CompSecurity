// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;

public class dcl extends dcc
    implements dab
{

    public dcm b;
    private final czz c = new czz(this);
    private final View d[] = new View[2];
    private dcn e;
    private long f;
    private long g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public dcl(dbc dbc1, int l)
    {
        super(dbc1);
        f = -1L;
        g = -1L;
        d[0] = LayoutInflater.from(dbc1.e()).inflate(l, null);
        d[1] = LayoutInflater.from(dbc1.e()).inflate(l, null);
    }

    static int a(int l, int i1)
    {
        if (l > i1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return l - i1;
    }

    static dcm a(dcl dcl1)
    {
        return dcl1.b;
    }

    static int b(int l, int i1)
    {
        if (l >= i1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return i1 + l;
    }

    private void b(dbd dbd1)
    {
        dbd1 = dbd1.a(f);
        if (dbd1 != null)
        {
            ((dbq)((dba) (dbd1)).a.findViewById(b.hn)).c(false);
        }
        c.b = true;
        f = -1L;
        g = -1L;
        h = false;
        a.c();
    }

    static View[] b(dcl dcl1)
    {
        return dcl1.d;
    }

    private void c(dbd dbd1)
    {
        if (e != null)
        {
            long l4 = e.c;
            int l;
            int j1;
            int k1;
            long l2;
            if (dbd1.a)
            {
                l = i;
            } else
            {
                l = j;
            }
            j1 = dbd1.i;
            l2 = 0L;
            k1 = dbd1.c.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                dba dba1 = (dba)dbd1.c.valueAt(i1);
                if (dba1.b == l4)
                {
                    continue;
                }
                long l3 = dba1.b;
                int l1 = dbd1.a(dba1.a);
                l2 = l3;
                if (l + j1 >= dbd1.b(dba1.a) / 2 + l1)
                {
                    continue;
                }
                l2 = l3;
                if (e.a(f, l3, false))
                {
                    g = l3;
                    h = false;
                    e.a(l3, false);
                    return;
                }
            }

            if (e.a(f, l2, true))
            {
                g = l2;
                h = true;
                e.a(l2, true);
                return;
            }
        }
    }

    public final void a(int l)
    {
        k = k + l;
        a.c();
    }

    public final void a(dbd dbd1)
    {
        c.a(b, "mListener", "setListener() was not called");
        if (f == -1L)
        {
            return;
        }
        if (e == null || e.a != dbd1.h)
        {
            e = new dcn(this, (dae)dbd1.h);
        }
        dbd1.h = e;
        c(dbd1);
        dbd1.i = dbd1.i + k;
        k = 0;
    }

    public final boolean a(dbd dbd1, int l)
    {
        c.a(b, "mListener", "setListener() was not called");
        View view = ((dba)dbd1.c.get(l)).a;
        f = dbd1.h.getItemId(l);
        g = f;
        h = false;
        k = 0;
        dbd1 = b.a(view);
        a.a(dbd1, null);
        ((dbq)view.findViewById(b.hn)).c(true);
        a.c();
        return true;
    }

    public final boolean a(dbd dbd1, DragEvent dragevent)
    {
        int l;
        int i1;
        c.a(b, "mListener", "setListener() was not called");
        if (f == -1L)
        {
            return false;
        }
        l = (int)dragevent.getX();
        i1 = (int)dragevent.getY();
        i = l;
        j = i1;
        c(dbd1);
        dragevent.getAction();
        JVM INSTR tableswitch 2 4: default 88
    //                   2 90
    //                   3 181
    //                   4 275;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        dragevent = dbd1.d;
        float f1;
        if (dbd1.a)
        {
            f1 = ddl.b(((Rect) (dragevent)).left, ((Rect) (dragevent)).right, l);
        } else
        {
            f1 = ddl.b(((Rect) (dragevent)).top, ((Rect) (dragevent)).bottom, i1);
        }
        dbd1 = c;
        dbd1.c = f1;
        dbd1.b = false;
        if (!((czz) (dbd1)).a)
        {
            dbd1.a = true;
            ((czz) (dbd1)).e.post(((czz) (dbd1)).f);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (e != null)
        {
            dragevent = e;
            if (dragevent.a(f, g, h, ((dcn) (dragevent)).b) && ((dcn) (dragevent)).d.b.b(((dcn) (dragevent)).b[0], ((dcn) (dragevent)).b[1]))
            {
                ((dcn) (dragevent)).d.b.a(((dcn) (dragevent)).b[0], ((dcn) (dragevent)).b[1]);
            }
        }
        b(dbd1);
        continue; /* Loop/switch isn't completed */
_L4:
        b(dbd1);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
