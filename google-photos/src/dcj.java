// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;

public class dcj extends dcc
{

    public dck b;
    public long c;
    public boolean d;
    private boolean e;

    public dcj(dbc dbc1)
    {
        super(dbc1);
        c = -1L;
        e = false;
        d = false;
    }

    private static void a(View view)
    {
        ((dbq)view.findViewById(b.hn)).b(false);
    }

    private static void b(View view)
    {
        ((dbq)view.findViewById(b.hn)).b(true);
    }

    private void b(dbd dbd1)
    {
        if (c == -1L)
        {
            return;
        }
        if (dbd1.a(c) != null)
        {
            a(dbd1.a(c).a);
        }
        c = -1L;
        b.a();
    }

    public final void a()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            a.c();
            return;
        }
    }

    public final void a(dbd dbd1)
    {
label0:
        {
            c.a(b, "mListener", "setListener() was not called");
            if (e)
            {
                b(dbd1);
                e = false;
            }
            if (d && c != -1L)
            {
                dbd1 = dbd1.a(c);
                if (dbd1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        b(((dba) (dbd1)).a);
        b.a(c);
        a.c();
        d = false;
    }

    public final boolean a(dbd dbd1, int i)
    {
        b(dbd1);
        return false;
    }

    public final boolean a(dbd dbd1, MotionEvent motionevent)
    {
        b.b();
        if (motionevent.getAction() != 2)
        {
            return false;
        } else
        {
            b(dbd1);
            return false;
        }
    }

    public final void b(dbd dbd1, int i)
    {
        c.a(b, "mListener", "setListener() was not called");
        Object obj;
        long l;
        if (b.a(i))
        {
            if ((l = dbd1.h.getItemId(i)) != -1L && (obj = (dba)dbd1.c.get(i)) != null)
            {
                obj = ((dba) (obj)).a;
                if (c == l)
                {
                    b(dbd1);
                    return;
                }
                if (c != -1L)
                {
                    a(dbd1.a(c).a);
                }
                b(((View) (obj)));
                c = l;
                b.a(l);
                a.c();
                return;
            }
        }
    }
}
