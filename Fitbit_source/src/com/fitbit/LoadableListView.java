// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fitbit.e.a;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.h;

public class LoadableListView extends StickyListHeadersListView
{
    public static final class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        private static final Status d[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/fitbit/LoadableListView$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])d.clone();
        }

        static 
        {
            a = new Status("LOADABLE", 0);
            b = new Status("LOADING", 1);
            c = new Status("COMPLETE", 2);
            d = (new Status[] {
                a, b, c
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract Status a();

        public abstract Status b();
    }

    public static class b
        implements android.widget.AbsListView.OnScrollListener
    {

        public final android.widget.AbsListView.OnScrollListener a;
        public final LoadableListView b;
        private final a c;
        private final float d;

        public boolean a()
        {
            return Status.c == c.b();
        }

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
label0:
            {
                if (a != null)
                {
                    a.onScroll(abslistview, i, j, k);
                }
                if (!abslistview.isStackFromBottom())
                {
                    i = k - (i + j);
                }
                com.fitbit.e.a.b(LoadableListView.c(), "Found %s items left of %s", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(k)
                });
                if (i <= Math.min(1, (int)Math.rint((float)k * d)))
                {
                    com.fitbit.e.a.a(LoadableListView.c(), "Load needed from adapter", new Object[0]);
                    abslistview = c.a();
                    if (abslistview != Status.c)
                    {
                        break label0;
                    }
                    com.fitbit.e.a.a(LoadableListView.c(), "Adapter claims to be complete, resetting old scroll listener", new Object[0]);
                    com.fitbit.LoadableListView.a(b, a);
                }
                return;
            }
            com.fitbit.e.a.a(LoadableListView.c(), "Adapter claims to be %s", new Object[] {
                abslistview
            });
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (a != null)
            {
                a.onScrollStateChanged(abslistview, i);
            }
        }

        public b(android.widget.AbsListView.OnScrollListener onscrolllistener, a a1, float f, LoadableListView loadablelistview)
        {
            c = a1;
            d = f;
            a = onscrolllistener;
            b = loadablelistview;
        }
    }

    private static class c
        implements a, h
    {

        private final ListAdapter a;
        private final a b;

        public long a(int i)
        {
            return 0L;
        }

        public View a(int i, View view, ViewGroup viewgroup)
        {
            return null;
        }

        public Status a()
        {
            return b.a();
        }

        public boolean areAllItemsEnabled()
        {
            return a.areAllItemsEnabled();
        }

        public Status b()
        {
            return b.b();
        }

        public int getCount()
        {
            return a.getCount();
        }

        public Object getItem(int i)
        {
            return a.getItem(i);
        }

        public long getItemId(int i)
        {
            return a.getItemId(i);
        }

        public int getItemViewType(int i)
        {
            return a.getItemViewType(i);
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            return a.getView(i, view, viewgroup);
        }

        public int getViewTypeCount()
        {
            return a.getViewTypeCount();
        }

        public boolean hasStableIds()
        {
            return a.hasStableIds();
        }

        public boolean isEmpty()
        {
            return a.isEmpty();
        }

        public boolean isEnabled(int i)
        {
            return a.isEnabled(i);
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            a.registerDataSetObserver(datasetobserver);
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            a.unregisterDataSetObserver(datasetobserver);
        }

        public c(ListAdapter listadapter)
        {
            a = listadapter;
            if (listadapter instanceof a)
            {
                b = (a)listadapter;
                return;
            } else
            {
                b = new a();
                return;
            }
        }
    }


    private static String a = com/fitbit/LoadableListView.getSimpleName();
    private static final float b = 0.25F;
    private android.widget.AbsListView.OnScrollListener c;
    private View d;
    private int e;

    public LoadableListView(Context context)
    {
        this(context, null);
    }

    public LoadableListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0100e6);
    }

    public LoadableListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.LoadableListView, i, i);
        a(context.getResourceId(1, 0x7f040185));
        context.recycle();
    }

    private void a(View view)
    {
        com.fitbit.e.a.a(a, "Removing Loader View", new Object[0]);
        if (j().isStackFromBottom())
        {
            c(view);
            return;
        } else
        {
            e(view);
            return;
        }
    }

    static void a(LoadableListView loadablelistview, android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        loadablelistview.b(onscrolllistener);
    }

    private void b(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        super.a(onscrolllistener);
    }

    static String c()
    {
        return a;
    }

    private void c(View view, Object obj, boolean flag)
    {
        com.fitbit.e.a.a(a, "Adding loader view", new Object[0]);
        if (j().isStackFromBottom())
        {
            a(view, obj, flag);
            return;
        } else
        {
            b(view, obj, flag);
            return;
        }
    }

    public void a()
    {
        e_();
        d = LayoutInflater.from(getContext()).inflate(0x7f040151, j(), false);
        c(d, (new StringBuilder()).append(getClass().getSimpleName()).append(".loadingView").toString(), false);
        d = null;
        invalidate();
    }

    public void a(int i)
    {
        e = i;
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        if (onscrolllistener instanceof b)
        {
            b(onscrolllistener);
        }
        if (e_())
        {
            com.fitbit.e.a.a(a, "Removed Loading View because adding new ScrollListener %s", new Object[] {
                onscrolllistener.getClass()
            });
            invalidate();
        }
        if (onscrolllistener != null && (onscrolllistener instanceof b) && !((b)onscrolllistener).a())
        {
            if (d == null)
            {
                d = LayoutInflater.from(getContext()).inflate(e, j(), false);
            }
            c(d, (new StringBuilder()).append(getClass().getSimpleName()).append(".loadingView").toString(), false);
            int i = q();
            onscrolllistener.onScroll(j(), i, r() - i, w());
        } else
        {
            d = null;
        }
        c = onscrolllistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (listadapter instanceof h)
        {
            listadapter = (h)listadapter;
        } else
        {
            listadapter = new c(listadapter);
        }
        a(((h) (listadapter)));
    }

    public void a(h h1)
    {
        if (h1 instanceof a)
        {
            com.fitbit.e.a.a(a, "Loadable added, adding to scroll listener", new Object[0]);
            android.widget.AbsListView.OnScrollListener onscrolllistener;
            if (c != null)
            {
                if (c instanceof b)
                {
                    onscrolllistener = ((b)c).a;
                } else
                {
                    onscrolllistener = c;
                }
            } else
            {
                onscrolllistener = null;
            }
            c = new b(onscrolllistener, (a)h1, 0.25F, this);
            a(c);
        }
        super.a(h1);
    }

    public boolean e_()
    {
        if (d != null)
        {
            a(d);
            return true;
        } else
        {
            return false;
        }
    }


    // Unreferenced inner class com/fitbit/LoadableListView$c$a
    /* block-local class not found */
    class c.a {}

}
