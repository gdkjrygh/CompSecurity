// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.model.DataSource;
import com.skype.android.widget.recycler.OnAnyChangeObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.skype.android.widget:
//            HeaderComparator

public class SemanticZoomAdapter extends android.support.v7.widget.RecyclerView.a
    implements DataSource
{
    static final class a extends android.support.v7.widget.RecyclerView.v
    {

        TextView a;

        static void a(a a1, int i, Object obj, List list, android.view.View.OnClickListener onclicklistener)
        {
            Context context = a1.a.getContext();
            if (list.size() > 0)
            {
                a1.a.setText((CharSequence)list.get(i));
            } else
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)obj;
                a1.a.setText(entry.toString());
            }
            if (obj instanceof SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)
            {
                SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo groupinfo = (SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)obj;
                a1.itemView.setContentDescription(context.getString(0x7f08007a, new Object[] {
                    a1.a.getText(), Integer.valueOf(groupinfo.c), Integer.valueOf(list.size())
                }));
                if (groupinfo.b > 0)
                {
                    a1.itemView.setAlpha(1.0F);
                }
                a1.itemView.setTag(obj);
                a1.itemView.setOnClickListener(onclicklistener);
                return;
            } else
            {
                a1.itemView.setAlpha(0.3F);
                a1.itemView.setOnClickListener(null);
                return;
            }
        }

        public a(ViewGroup viewgroup)
        {
            super(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03005a, viewgroup, false));
            a = (TextView)ViewUtil.a(itemView, 0x7f100304);
        }
    }


    private android.support.v7.widget.RecyclerView.a a;
    private String b;
    private android.view.View.OnClickListener c;

    public SemanticZoomAdapter(Context context, android.support.v7.widget.RecyclerView.a a1)
    {
        a = a1;
        b = context.getResources().getString(0x7f08045c);
        a1.registerAdapterDataObserver(new OnAnyChangeObserver() {

            final SemanticZoomAdapter a;

            public final void onChanged()
            {
                a.notifyDataSetChanged();
            }

            
            {
                a = SemanticZoomAdapter.this;
                super();
            }
        });
    }

    private Map a()
    {
        if (a instanceof SeparatedColumnsAdapter.ListItemsGroupsProvider)
        {
            return ((SeparatedColumnsAdapter.ListItemsGroupsProvider)a).getGroupInfoMap();
        } else
        {
            return null;
        }
    }

    private List b()
    {
        if (a() != null)
        {
            Iterator iterator = a().values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo groupinfo = (SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)iterator.next();
                if (!b.contains(groupinfo.a))
                {
                    b = (new StringBuilder()).append(b).append(groupinfo.a).toString();
                }
            } while (true);
        }
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < b.length(); i++)
        {
            arraylist.add(String.valueOf(b.charAt(i)));
        }

        Collections.sort(arraylist, new HeaderComparator());
        return arraylist;
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        c = onclicklistener;
    }

    public int getCount()
    {
        return getItemCount();
    }

    public Object getItem(int i)
    {
        if (a() != null)
        {
            Object obj = b();
            if (((List) (obj)).size() > 0)
            {
                return a().get(((List) (obj)).get(i));
            }
            int j = 0;
            obj = a().entrySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                if (i == j)
                {
                    return entry.getValue();
                }
                j++;
            }
        }
        return null;
    }

    public int getItemCount()
    {
        List list = b();
        if (list.isEmpty() && a() != null)
        {
            return a().size();
        } else
        {
            return list.size();
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        a.a((a)v, i, getItem(i), b(), c);
    }

    public android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a(viewgroup);
    }
}
