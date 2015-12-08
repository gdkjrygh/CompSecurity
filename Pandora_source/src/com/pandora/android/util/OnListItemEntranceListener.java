// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class OnListItemEntranceListener
    implements android.widget.AbsListView.OnScrollListener
{
    private static class State
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public State a(Parcel parcel)
            {
                return null;
            }

            public State[] a(int i)
            {
                return new State[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private final int a;
        private final int b;
        private final SparseArray c;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
            parcel.writeSparseArray(c);
        }

    }

    class a
    {

        public final long a;
        public final int b;
        public final int c;
        final OnListItemEntranceListener d;

        a(long l, int i, int j)
        {
            d = OnListItemEntranceListener.this;
            super();
            a = l;
            b = i;
            c = j;
        }
    }


    private static final String f = (new StringBuilder()).append(com/pandora/android/util/OnListItemEntranceListener.getCanonicalName()).append(".STATE").toString();
    private int a;
    private int b;
    private SparseArray c;
    private android.widget.AbsListView.OnScrollListener d;
    private boolean e;

    public OnListItemEntranceListener()
    {
        a = -1;
        b = -1;
        c = new SparseArray();
        e = true;
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        d = onscrolllistener;
    }

    public void a(AbsListView abslistview)
    {
        SparseArray sparsearray = c;
        c = new SparseArray(c.size());
        Object obj = new ArrayList();
        Object obj1 = new ArrayList();
        int i = abslistview.getFirstVisiblePosition();
        while (i < abslistview.getLastVisiblePosition() + 1) 
        {
            long l = abslistview.getItemIdAtPosition(i);
            int k = sparsearray.indexOfValue(Long.valueOf(l));
            if (((ListAdapter)abslistview.getAdapter()).hasStableIds() && k >= 0)
            {
                ((List) (obj1)).add(new a(l, sparsearray.keyAt(k), i));
                sparsearray.removeAt(k);
            } else
            {
                ((List) (obj)).add(new a(l, -1, i));
            }
            i++;
        }
        for (int j = 0; j < sparsearray.size(); j++)
        {
            b(abslistview, ((Long)sparsearray.valueAt(j)).longValue(), sparsearray.keyAt(j));
        }

        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); a(abslistview, ((a) (obj1)).a, ((a) (obj1)).b, ((a) (obj1)).c))
        {
            obj1 = (a)iterator.next();
        }

        a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a(abslistview, a1.a, a1.c))
        {
            a1 = (a)((Iterator) (obj)).next();
        }

    }

    public abstract void a(AbsListView abslistview, long l, int i);

    public abstract void a(AbsListView abslistview, long l, int i, int j);

    public void b(AbsListView abslistview)
    {
        for (; a < b; a = a + 1)
        {
            long l = ((Long)c.get(a, Long.valueOf(-1L))).longValue();
            c.delete(a);
            b(abslistview, l, a);
        }

        a = -1;
        b = -1;
        e = false;
    }

    public abstract void b(AbsListView abslistview, long l, int i);

    public void c(AbsListView abslistview)
    {
        e = true;
        android.widget.AbsListView.OnScrollListener onscrolllistener = d;
        d = null;
        onScroll(abslistview, abslistview.getFirstVisiblePosition(), abslistview.getLastVisiblePosition() - abslistview.getFirstVisiblePosition(), abslistview.getCount());
        d = onscrolllistener;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (e)
        {
            if (d != null)
            {
                d.onScroll(abslistview, i, j, k);
            }
            if (a == -1)
            {
                a = i;
            }
            if (b == -1)
            {
                b = i;
            }
            j = i + j;
            for (; a < i; a = a + 1)
            {
                long l = ((Long)c.get(a, Long.valueOf(-1L))).longValue();
                c.delete(a);
                b(abslistview, l, a);
            }

            for (; b < j; b = b + 1)
            {
                long l1 = abslistview.getItemIdAtPosition(b);
                c.append(b, Long.valueOf(l1));
                a(abslistview, l1, b);
            }

            for (; a > i; a = a - 1)
            {
                long l2 = abslistview.getItemIdAtPosition(a - 1);
                c.put(a - 1, Long.valueOf(l2));
                a(abslistview, l2, a - 1);
            }

            while (b > j) 
            {
                long l3 = ((Long)c.get(b - 1, Long.valueOf(-1L))).longValue();
                c.delete(b - 1);
                b(abslistview, l3, b - 1);
                b = b - 1;
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (d != null)
        {
            d.onScrollStateChanged(abslistview, i);
        }
    }

}
