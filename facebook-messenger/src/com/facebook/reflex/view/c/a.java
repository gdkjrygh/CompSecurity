// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.google.common.a.hq;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.reflex.view.c:
//            i, b

public class a
    implements i
{

    private final Adapter a;
    private final ArrayList b[];
    private final ViewGroup c;
    private DataSetObserver d;

    public a(Adapter adapter, ViewGroup viewgroup)
    {
        int k = adapter.getViewTypeCount();
        a = adapter;
        b = new ArrayList[k];
        for (int j = 0; j < k; j++)
        {
            b[j] = hq.a();
        }

        c = viewgroup;
    }

    private View a(ArrayList arraylist, long l)
    {
        for (int j = 0; j < arraylist.size(); j++)
        {
            android.view.ViewGroup.LayoutParams layoutparams = ((View)arraylist.get(j)).getLayoutParams();
            if ((layoutparams instanceof b) && ((b)layoutparams).b == l)
            {
                return (View)arraylist.remove(j);
            }
        }

        if (arraylist.isEmpty())
        {
            return null;
        } else
        {
            return (View)arraylist.remove(arraylist.size() - 1);
        }
    }

    public int a()
    {
        return a.getCount();
    }

    public View a(int j)
    {
        int k = a.getItemViewType(j);
        Object obj = null;
        if (k != -1)
        {
            obj = a(b[k], a.getItemId(j));
        }
        View view = a.getView(j, ((View) (obj)), c);
        obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = new b(-1, -2);
        } else
        if (obj instanceof b)
        {
            obj = (b)obj;
        } else
        {
            obj = new b(((android.view.ViewGroup.LayoutParams) (obj)).width, ((android.view.ViewGroup.LayoutParams) (obj)).height);
        }
        obj.a = k;
        obj.b = a.getItemId(j);
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return view;
    }

    public void a(DataSetObserver datasetobserver)
    {
        if (d != null)
        {
            a.unregisterDataSetObserver(d);
        }
        d = datasetobserver;
        if (d != null)
        {
            a.registerDataSetObserver(d);
        }
    }

    public void a(View view)
    {
        int j = ((b)view.getLayoutParams()).a;
        if (j != -1)
        {
            b[j].add(view);
        }
    }

    public void b()
    {
    }

    public void c()
    {
        ArrayList aarraylist[] = b;
        int k = aarraylist.length;
        for (int j = 0; j < k; j++)
        {
            ArrayList arraylist = aarraylist[j];
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                View view = (View)iterator.next();
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup))
                {
                    ((ViewGroup)view.getParent()).removeView(view);
                }
            } while (true);
            arraylist.clear();
        }

    }
}
