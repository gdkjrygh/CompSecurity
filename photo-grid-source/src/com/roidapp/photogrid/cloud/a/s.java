// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.roidapp.baselib.c.x;
import com.roidapp.photogrid.release.ParentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            q, l, a

final class s extends BaseAdapter
{

    final q a;
    private LayoutInflater b;

    public s(q q1)
    {
        a = q1;
        super();
        b = q1.d.getLayoutInflater();
    }

    private l a(int i)
    {
        if (q.a(a) == null)
        {
            return null;
        } else
        {
            return (l)q.a(a).get(i);
        }
    }

    public final int getCount()
    {
        if (q.a(a) == null)
        {
            return 0;
        } else
        {
            return q.a(a).size();
        }
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        l l1 = a(i);
        if (l1 != null)
        {
            return l1.a(b, view, viewgroup);
        } else
        {
            return null;
        }
    }

    public final void notifyDataSetChanged()
    {
        if (q.a(a) != null && q.b(a) != null && !q.b(a).isEmpty())
        {
            Iterator iterator = (new ArrayList(q.b(a))).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                x x1 = (x)iterator.next();
                if (x1 != null && x1.a != null && ((a)x1.a).c)
                {
                    q.a(a).add(((Integer)x1.b).intValue(), x1.a);
                    q.b(a).remove(x1);
                }
            } while (true);
        }
        super.notifyDataSetChanged();
    }
}
