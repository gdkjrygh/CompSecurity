// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.recycler.CellHolder;
import com.skype.android.widget.recycler.OnAnyChangeObserver;
import com.skype.android.widget.recycler.RecyclerViewUtils;
import com.skype.android.widget.recycler.ReservedViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SeparatedColumnsAdapter extends android.support.v7.widget.RecyclerView.a
{
    public static interface ListItemsGroupsProvider
    {

        public abstract android.support.v7.widget.RecyclerView.a getAdapter();

        public abstract Map getGroupInfoMap();
    }

    public static class ListItemsGroupsProvider.GroupInfo
    {

        public final String a;
        public final int b;
        public final int c;

        public ListItemsGroupsProvider.GroupInfo(int i, int j)
        {
            this(null, i, j);
        }

        public ListItemsGroupsProvider.GroupInfo(String s, int i, int j)
        {
            a = s;
            b = i;
            c = j;
        }
    }

    public class ReferencedItem
    {

        final SeparatedColumnsAdapter a;
        private int b;
        private android.support.v7.widget.RecyclerView.a c;

        static int a(ReferencedItem referenceditem)
        {
            return referenceditem.b;
        }

        public final int a()
        {
            return c.getItemViewType(b);
        }

        public final View a(ViewGroup viewgroup)
        {
            return RecyclerViewUtils.a(c, b, viewgroup);
        }

        public final ReferencedItem a(int i, android.support.v7.widget.RecyclerView.a a1)
        {
            b = i;
            c = a1;
            return this;
        }

        public final long b()
        {
            return c.getItemId(b);
        }

        public ReferencedItem(int i, android.support.v7.widget.RecyclerView.a a1)
        {
            a = SeparatedColumnsAdapter.this;
            super();
            b = i;
            c = a1;
        }
    }

    private final class a extends android.support.v7.widget.RecyclerView.a
    {

        final SeparatedColumnsAdapter a;

        public final int getItemCount()
        {
            return 1;
        }

        public final long getItemId(int i)
        {
            return 0L;
        }

        public final int getItemViewType(int i)
        {
            return ReservedViewTypes.b.c;
        }

        public final void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
        {
        }

        public final android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return new a(this, viewgroup);
        }

        public a()
        {
            a = SeparatedColumnsAdapter.this;
            super();
        }
    }

    private final class a.a extends android.support.v7.widget.RecyclerView.v
    {

        final a a;

        public a.a(a a1, ViewGroup viewgroup)
        {
            a = a1;
            super(LayoutInflater.from(SeparatedColumnsAdapter.b(a1.a)).inflate(0x7f030082, viewgroup, false));
        }
    }


    private ListItemsGroupsProvider a;
    private a b;
    private List c;
    private Context d;
    private boolean e;
    private boolean f;

    public SeparatedColumnsAdapter(Context context, ListItemsGroupsProvider listitemsgroupsprovider)
    {
        c = new ArrayList();
        f = false;
        d = context;
        a = listitemsgroupsprovider;
        b = new a();
        listitemsgroupsprovider.getAdapter().registerAdapterDataObserver(new OnAnyChangeObserver() {

            final SeparatedColumnsAdapter a;

            public final void onChanged()
            {
                SeparatedColumnsAdapter.a(a);
            }

            
            {
                a = SeparatedColumnsAdapter.this;
                super();
            }
        });
    }

    private int a(int i, int j, int k)
    {
        i += j;
        for (int l = 0; (j + l) % k != 0;)
        {
            if (i <= c.size())
            {
                c.add(i, new ReferencedItem(0, b));
            }
            l++;
            i++;
        }

        return i;
    }

    static void a(SeparatedColumnsAdapter separatedcolumnsadapter)
    {
        android.support.v7.widget.RecyclerView.a a1 = separatedcolumnsadapter.a.getAdapter();
        int i1 = a1.getItemCount();
        Iterator iterator = separatedcolumnsadapter.c.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ReferencedItem referenceditem = (ReferencedItem)iterator.next();
            if (i >= i1)
            {
                break;
            }
            referenceditem.a(i, a1);
            i++;
        } while (true);
        for (int j = separatedcolumnsadapter.c.size(); j < i1; j++)
        {
            separatedcolumnsadapter.c.add(separatedcolumnsadapter. new ReferencedItem(j, a1));
        }

        for (int k = separatedcolumnsadapter.c.size(); k > i1; k--)
        {
            separatedcolumnsadapter.c.remove(separatedcolumnsadapter.c.size() - 1);
        }

        if (separatedcolumnsadapter.e)
        {
            Object obj = separatedcolumnsadapter.a.getGroupInfoMap();
            if (obj != null)
            {
                int k2 = separatedcolumnsadapter.d.getResources().getInteger(0x7f0e0007);
                boolean flag;
                int k1;
                if (!ViewUtil.a(separatedcolumnsadapter.d))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = ((Map) (obj)).values().iterator();
                k1 = 0;
label0:
                while (((Iterator) (obj)).hasNext()) 
                {
                    ListItemsGroupsProvider.GroupInfo groupinfo = (ListItemsGroupsProvider.GroupInfo)((Iterator) (obj)).next();
                    int l1;
                    int i2;
                    if (flag)
                    {
                        separatedcolumnsadapter.a(k1, 1, k2);
                        l1 = k2;
                    } else
                    {
                        l1 = 1;
                    }
                    if (separatedcolumnsadapter.f && !flag)
                    {
                        int l2 = groupinfo.b;
                        int l = 0;
                        int j1 = 0;
                        do
                        {
                            i2 = j1;
                            if (l >= l2 + l1 + j1)
                            {
                                continue label0;
                            }
                            int j2 = l;
                            i2 = j1;
                            if (l / k2 != 0)
                            {
                                j2 = l;
                                i2 = j1;
                                if (l % k2 == 0)
                                {
                                    j2 = l;
                                    i2 = j1;
                                    if (l + k1 <= separatedcolumnsadapter.c.size())
                                    {
                                        separatedcolumnsadapter.c.add(l + k1, separatedcolumnsadapter. new ReferencedItem(0, separatedcolumnsadapter.b));
                                        i2 = j1 + 1;
                                        j2 = l + 1;
                                    }
                                }
                            }
                            l = j2 + 1;
                            j1 = i2;
                        } while (true);
                    }
                    i2 = 0;
                    k1 = separatedcolumnsadapter.a(k1, groupinfo.b + l1 + i2, k2);
                }
            }
        }
        separatedcolumnsadapter.notifyDataSetChanged();
    }

    static Context b(SeparatedColumnsAdapter separatedcolumnsadapter)
    {
        return separatedcolumnsadapter.d;
    }

    public final int a(int i)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            ReferencedItem referenceditem = (ReferencedItem)iterator.next();
            if (ReferencedItem.a(referenceditem) == i)
            {
                return c.indexOf(referenceditem);
            }
        }

        return -1;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public final void b(boolean flag)
    {
        f = flag;
    }

    public int getItemCount()
    {
        return c.size();
    }

    public long getItemId(int i)
    {
        return ((ReferencedItem)c.get(i)).b();
    }

    public int getItemViewType(int i)
    {
        return ((ReferencedItem)c.get(i)).a();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        v = (CellHolder)v;
        v.a(((ReferencedItem)c.get(i)).a((ViewGroup)((CellHolder) (v)).itemView));
    }

    public android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new CellHolder(viewgroup);
    }
}
