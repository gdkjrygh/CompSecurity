// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.spotify.android.paste.widget.SectionHeaderView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public abstract class fsz extends BaseAdapter
{

    public ArrayList a;
    private DataSetObserver b;
    private Context c;
    private ListAdapter d;
    private int e[];
    private int f;

    public fsz(Context context, ListAdapter listadapter)
    {
        b = new DataSetObserver() {

            private fsz a;

            public final void onChanged()
            {
                fsz.a(a);
                a.notifyDataSetChanged();
            }

            public final void onInvalidated()
            {
                fsz.a(a);
                a.notifyDataSetInvalidated();
            }

            
            {
                a = fsz.this;
                super();
            }
        };
        a = new ArrayList();
        c = context;
        d = listadapter;
        listadapter.registerDataSetObserver(b);
    }

    private void a()
    {
        boolean flag = false;
        if (d != null && !a.isEmpty())
        {
            int ai[] = new int[a.size()];
            for (int i = 0; i < ai.length; i++)
            {
                ai[i] = 0;
            }

            for (int j = 0; j < d.getCount(); j++)
            {
                int j1 = a(j);
                ai[j1] = ai[j1] + 1;
            }

            f = 0;
            for (int k = 0; k < ai.length; k++)
            {
                if (ai[k] > 0)
                {
                    ai[k] = ai[k] + 1;
                    f = f + 1;
                }
            }

            int l = 0;
            int k1 = 0;
            for (; l < ai.length; l++)
            {
                int l1 = ai[l];
                ai[l] = k1;
                k1 += l1;
            }

            ai.clone();
            e = new int[k1 + 1];
            l = 0;
            do
            {
                k1 = ((flag) ? 1 : 0);
                if (l >= ai.length)
                {
                    break;
                }
                k1 = -(l + 1);
                e[ai[l]] = k1;
                ai[l] = ai[l] + 1;
                l++;
            } while (true);
            while (k1 < d.getCount()) 
            {
                int i1 = a(k1);
                e[ai[i1]] = k1;
                ai[i1] = ai[i1] + 1;
                k1++;
            }
        }
    }

    static void a(fsz fsz1)
    {
        fsz1.a();
    }

    public abstract int a(int i);

    public final void a(String as[])
    {
        Collections.addAll(a, as);
        a();
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled()
    {
        return f == 0 && d.areAllItemsEnabled();
    }

    public int getCount()
    {
        return d.getCount() + f;
    }

    public Object getItem(int i)
    {
        int j = e[i];
        if (j < 0)
        {
            i = -j;
            return a.get(i - 1);
        } else
        {
            return d.getItem(e[i]);
        }
    }

    public long getItemId(int i)
    {
        if (i >= 0)
        {
            if ((i = e[i]) >= 0)
            {
                return d.getItemId(i);
            }
        }
        return -1L;
    }

    public int getItemViewType(int i)
    {
        if (i > e.length)
        {
            return -1;
        }
        i = e[i];
        if (i < 0)
        {
            return 0;
        } else
        {
            return d.getItemViewType(i) + 1;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ctz.a(i, e.length);
        i = e[i];
        if (i < 0)
        {
            i = -i;
            view = new SectionHeaderView(c);
            ((TextView)view.findViewById(0x7f11026e)).setText(((String)a.get(i - 1)).toUpperCase(Locale.getDefault()));
            return view;
        } else
        {
            return d.getView(i, view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return d.getViewTypeCount() + 1;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public boolean isEnabled(int i)
    {
        if (i <= e.length)
        {
            if ((i = e[i]) >= 0)
            {
                return d.isEnabled(i);
            }
        }
        return false;
    }
}
