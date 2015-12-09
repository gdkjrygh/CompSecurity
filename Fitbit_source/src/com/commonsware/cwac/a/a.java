// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.commonsware.cwac.a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class com.commonsware.cwac.a.a extends BaseAdapter
    implements SectionIndexer
{
    private class a extends DataSetObserver
    {

        final com.commonsware.cwac.a.a a;

        public void onChanged()
        {
            a.notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            a.notifyDataSetInvalidated();
        }

        private a()
        {
            a = com.commonsware.cwac.a.a.this;
            super();
        }

    }

    private static class b extends com.commonsware.cwac.b.a
    {

        public boolean areAllItemsEnabled()
        {
            return true;
        }

        public boolean isEnabled(int i)
        {
            return true;
        }

        public b(List list)
        {
            super(list);
        }
    }


    private final ArrayList a = new ArrayList();
    private final a b = new a();

    public com.commonsware.cwac.a.a()
    {
    }

    public void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ListAdapter)iterator.next()).unregisterDataSetObserver(b)) { }
        a.clear();
    }

    public void a(int i)
    {
        ListAdapter listadapter;
        for (; i < a.size(); listadapter.unregisterDataSetObserver(b))
        {
            listadapter = (ListAdapter)a.get(i);
            a.remove(i);
        }

    }

    public void a(View view)
    {
        a(view, false);
    }

    public void a(View view, boolean flag)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(view);
        a(((List) (arraylist)), flag);
    }

    public void a(ListAdapter listadapter)
    {
        a.add(listadapter);
        listadapter.registerDataSetObserver(b);
    }

    public void a(Comparator comparator)
    {
        Collections.sort(a, comparator);
        notifyDataSetChanged();
    }

    public void a(List list)
    {
        a(list, false);
    }

    public void a(List list, boolean flag)
    {
        if (flag)
        {
            a(((ListAdapter) (new b(list))));
            return;
        } else
        {
            a(((ListAdapter) (new com.commonsware.cwac.b.a(list))));
            return;
        }
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public ListAdapter b(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ListAdapter listadapter = (ListAdapter)iterator.next();
            int j = listadapter.getCount();
            if (i < j)
            {
                return listadapter;
            }
            i -= j;
        }

        return null;
    }

    public int getCount()
    {
        Iterator iterator = a.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((ListAdapter)iterator.next()).getCount() + i) { }
        return i;
    }

    public Object getItem(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ListAdapter listadapter = (ListAdapter)iterator.next();
            int j = listadapter.getCount();
            if (i < j)
            {
                return listadapter.getItem(i);
            }
            i -= j;
        }

        return null;
    }

    public long getItemId(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ListAdapter listadapter = (ListAdapter)iterator.next();
            int j = listadapter.getCount();
            if (i < j)
            {
                return listadapter.getItemId(i);
            }
            i -= j;
        }

        return -1L;
    }

    public int getItemViewType(int i)
    {
        Iterator iterator = a.iterator();
        boolean flag = false;
        int j = i;
        ListAdapter listadapter;
        for (i = ((flag) ? 1 : 0); iterator.hasNext(); i = listadapter.getViewTypeCount() + i)
        {
            listadapter = (ListAdapter)iterator.next();
            int k = listadapter.getCount();
            if (j < k)
            {
                return listadapter.getItemViewType(j) + i;
            }
            j -= k;
        }

        return -1;
    }

    public int getPositionForSection(int i)
    {
        boolean flag1 = false;
        Iterator iterator = a.iterator();
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
label0:
            {
label1:
                {
                    int k = ((flag1) ? 1 : 0);
                    if (iterator.hasNext())
                    {
                        ListAdapter listadapter = (ListAdapter)iterator.next();
                        k = j;
                        if (!(listadapter instanceof SectionIndexer))
                        {
                            break label0;
                        }
                        Object aobj[] = ((SectionIndexer)listadapter).getSections();
                        int l;
                        if (aobj != null)
                        {
                            l = aobj.length;
                        } else
                        {
                            l = 0;
                        }
                        if (j >= l)
                        {
                            break label1;
                        }
                        k = i + ((SectionIndexer)listadapter).getPositionForSection(j);
                    }
                    return k;
                }
                k = j;
                if (aobj != null)
                {
                    k = j - l;
                }
            }
            i = listadapter.getCount() + i;
            j = k;
        } while (true);
    }

    public int getSectionForPosition(int i)
    {
        boolean flag1 = false;
        Iterator iterator = a.iterator();
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            ListAdapter listadapter;
            int k;
label0:
            {
                k = ((flag1) ? 1 : 0);
                if (iterator.hasNext())
                {
                    listadapter = (ListAdapter)iterator.next();
                    k = listadapter.getCount();
                    if (j >= k)
                    {
                        break label0;
                    }
                    k = ((flag1) ? 1 : 0);
                    if (listadapter instanceof SectionIndexer)
                    {
                        k = i + ((SectionIndexer)listadapter).getSectionForPosition(j);
                    }
                }
                return k;
            }
            if (listadapter instanceof SectionIndexer)
            {
                Object aobj[] = ((SectionIndexer)listadapter).getSections();
                if (aobj != null)
                {
                    i += aobj.length;
                }
            }
            j -= k;
        } while (true);
    }

    public Object[] getSections()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ListAdapter listadapter = (ListAdapter)iterator.next();
            if (listadapter instanceof SectionIndexer)
            {
                Object aobj[] = ((SectionIndexer)listadapter).getSections();
                if (aobj != null)
                {
                    int j = aobj.length;
                    int i = 0;
                    while (i < j) 
                    {
                        arraylist.add(aobj[i]);
                        i++;
                    }
                }
            }
        } while (true);
        if (arraylist.size() == 0)
        {
            return null;
        } else
        {
            return arraylist.toArray(new Object[0]);
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ListAdapter listadapter = (ListAdapter)iterator.next();
            int j = listadapter.getCount();
            if (i < j)
            {
                return listadapter.getView(i, view, viewgroup);
            }
            i -= j;
        }

        return null;
    }

    public int getViewTypeCount()
    {
        Iterator iterator = a.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((ListAdapter)iterator.next()).getViewTypeCount() + i) { }
        return Math.max(i, 1);
    }

    public boolean isEnabled(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ListAdapter listadapter = (ListAdapter)iterator.next();
            int j = listadapter.getCount();
            if (i < j)
            {
                return listadapter.isEnabled(i);
            }
            i -= j;
        }

        return false;
    }
}
