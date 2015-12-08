// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class oaj extends BaseAdapter
    implements nzz
{

    private oai a;
    private List b;
    private ArrayList c;
    private oal d;
    private boolean e;
    private volatile boolean f;
    private Handler g;
    private Runnable h;

    public oaj(oai oai1)
    {
        d = new oal();
        e = false;
        f = false;
        g = new Handler();
        h = new oak(this);
        a = oai1;
        a.v = this;
        b = new ArrayList();
        c = new ArrayList();
        c();
    }

    private nzw a(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return null;
        } else
        {
            return (nzw)b.get(i);
        }
    }

    private static oal a(nzw nzw1, oal oal1)
    {
        if (oal1 == null)
        {
            oal1 = new oal();
        }
        oal.a(oal1, nzw1.getClass().getName());
        oal.a(oal1, nzw1.s);
        oal.b(oal1, nzw1.t);
        return oal1;
    }

    private void a(List list, oai oai1)
    {
        oai1;
        JVM INSTR monitorenter ;
        Collections.sort(oai1.a);
        oai1;
        JVM INSTR monitorexit ;
        int j = oai1.c();
        for (int i = 0; i < j; i++)
        {
            nzw nzw1 = oai1.d(i);
            list.add(nzw1);
            if (!e && nzw1.u)
            {
                oal oal1 = a(nzw1, ((oal) (null)));
                int k = Collections.binarySearch(c, oal1);
                if (k < 0)
                {
                    k = -k;
                    c.add(k - 1, oal1);
                }
            }
            if (nzw1 instanceof oai)
            {
                oai oai2 = (oai)nzw1;
                if (oai2.k())
                {
                    a(list, oai2);
                }
            }
            nzw1.v = this;
        }

        break MISSING_BLOCK_LABEL_144;
        list;
        oai1;
        JVM INSTR monitorexit ;
        throw list;
    }

    static void a(oaj oaj1)
    {
        oaj1.c();
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        f = true;
        this;
        JVM INSTR monitorexit ;
        ArrayList arraylist = new ArrayList(b.size());
        a(arraylist, a);
        b = arraylist;
        notifyDataSetChanged();
        this;
        JVM INSTR monitorenter ;
        f = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        notifyDataSetChanged();
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final void b()
    {
        g.removeCallbacks(h);
        g.post(h);
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return 0x8000000000000000L;
        } else
        {
            return a(i).i;
        }
    }

    public final int getItemViewType(int i)
    {
        if (!e)
        {
            e = true;
        }
        nzw nzw1 = a(i);
        if (nzw1.u)
        {
            d = a(nzw1, d);
            i = Collections.binarySearch(c, d);
            if (i >= 0)
            {
                return i;
            }
        }
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        nzw nzw1 = a(i);
        d = a(nzw1, d);
        if (Collections.binarySearch(c, d) < 0)
        {
            view = null;
        }
        return nzw1.a(view, viewgroup);
    }

    public final int getViewTypeCount()
    {
        if (!e)
        {
            e = true;
        }
        return Math.max(1, c.size());
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final boolean isEnabled(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return true;
        } else
        {
            return a(i).q;
        }
    }
}
