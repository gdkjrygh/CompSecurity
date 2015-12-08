// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

final class dcn
    implements dae
{

    final dae a;
    final int b[] = new int[2];
    long c;
    final dcl d;
    private int e;

    public dcn(dcl dcl1, dae dae1)
    {
        d = dcl1;
        super();
        c = 0xcccccccc00000000L;
        a = (dae)b.a(dae1, "inner", null);
    }

    private int a(int i)
    {
        return dcl.a(i, e);
    }

    public final int a(long l)
    {
        if (l == c)
        {
            return e;
        } else
        {
            return dcl.b(a.a(l), e);
        }
    }

    public final void a(long l, boolean flag)
    {
        int j = a.a(l);
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i += j;
        if (e != i)
        {
            e = i;
            c = c + 1L;
        }
    }

    public final boolean a(long l, long l1, boolean flag)
    {
        return a(l, l1, flag, b) && dcl.a(d).b(b[0], b[1]);
    }

    boolean a(long l, long l1, boolean flag, int ai[])
    {
        int i = 0;
        int j = a.a(l);
        int k = a.a(l1);
        if (j != -1 && k != -1)
        {
            ai[0] = j;
            if (flag)
            {
                i = 1;
            }
            ai[1] = dcl.a(i + k, j);
            return true;
        } else
        {
            return false;
        }
    }

    public final int getCount()
    {
        return a.getCount() + 1;
    }

    public final Object getItem(int i)
    {
        if (i == e)
        {
            return null;
        } else
        {
            return a.getItem(a(i));
        }
    }

    public final long getItemId(int i)
    {
        if (i == e)
        {
            return c;
        } else
        {
            return a.getItemId(a(i));
        }
    }

    public final int getItemViewType(int i)
    {
        if (i == e)
        {
            return a.getViewTypeCount();
        } else
        {
            return a.getItemViewType(a(i));
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (dcl.b(d)[0].getParent() != null)
        {
            view1 = dcl.b(d)[1];
        } else
        {
            view1 = dcl.b(d)[0];
        }
        if (i == e)
        {
            return view1;
        } else
        {
            return a.getView(a(i), view, viewgroup);
        }
    }

    public final int getViewTypeCount()
    {
        return a.getViewTypeCount() + 1;
    }

    public final boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.registerDataSetObserver(datasetobserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.unregisterDataSetObserver(datasetobserver);
    }
}
