// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            a, k, n, b, 
//            c

public class ObservableGridView extends GridView
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new c();
        int a;
        int b;
        int c;
        int d;
        int e;
        SparseIntArray f;

        public void writeToParcel(Parcel parcel, int i1)
        {
            int j1 = 0;
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            parcel.writeInt(b);
            parcel.writeInt(c);
            parcel.writeInt(d);
            parcel.writeInt(e);
            if (f == null)
            {
                i1 = 0;
            } else
            {
                i1 = f.size();
            }
            parcel.writeInt(i1);
            if (i1 > 0)
            {
                for (; j1 < i1; j1++)
                {
                    parcel.writeInt(f.keyAt(j1));
                    parcel.writeInt(f.valueAt(j1));
                }

            }
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            b = -1;
            a = parcel.readInt();
            b = parcel.readInt();
            c = parcel.readInt();
            d = parcel.readInt();
            e = parcel.readInt();
            f = new SparseIntArray();
            int j1 = parcel.readInt();
            if (j1 > 0)
            {
                for (int i1 = 0; i1 < j1; i1++)
                {
                    int k1 = parcel.readInt();
                    int l1 = parcel.readInt();
                    f.put(k1, l1);
                }

            }
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
            b = -1;
        }
    }

    public static final class a
    {

        public ViewGroup a;
        public Object b;
        public boolean c;

        public a()
        {
        }
    }

    public static final class b
        implements Filterable, WrapperListAdapter
    {

        static final ArrayList a = new ArrayList();
        ArrayList b;
        ArrayList c;
        boolean d;
        private final DataSetObservable e = new DataSetObservable();
        private final ListAdapter f;
        private int g;
        private int h;
        private final boolean i;
        private boolean j;
        private boolean k;

        private int a()
        {
            return (int)(Math.ceil((1.0F * (float)f.getCount()) / (float)g) * (double)g);
        }

        private static boolean a(ArrayList arraylist)
        {
label0:
            {
                if (arraylist == null)
                {
                    break label0;
                }
                arraylist = arraylist.iterator();
                do
                {
                    if (!arraylist.hasNext())
                    {
                        break label0;
                    }
                } while (((a)arraylist.next()).c);
                return false;
            }
            return true;
        }

        public final void a(int i1)
        {
            while (i1 <= 0 || g == i1) 
            {
                return;
            }
            g = i1;
            e.notifyChanged();
        }

        public final boolean areAllItemsEnabled()
        {
            return f == null || d && f.areAllItemsEnabled();
        }

        public final int getCount()
        {
            if (f != null)
            {
                return (c.size() + b.size()) * g + a();
            } else
            {
                return (c.size() + b.size()) * g;
            }
        }

        public final Filter getFilter()
        {
            if (i)
            {
                return ((Filterable)f).getFilter();
            } else
            {
                return null;
            }
        }

        public final Object getItem(int i1)
        {
            int j1 = b.size() * g;
            if (i1 < j1)
            {
                if (i1 % g == 0)
                {
                    return ((a)b.get(i1 / g)).b;
                } else
                {
                    return null;
                }
            }
            int l1 = i1 - j1;
            i1 = 0;
            if (f != null)
            {
                int k1 = a();
                i1 = k1;
                if (l1 < k1)
                {
                    if (l1 < f.getCount())
                    {
                        return f.getItem(l1);
                    } else
                    {
                        return null;
                    }
                }
            }
            i1 = l1 - i1;
            if (i1 % g == 0)
            {
                return ((a)c.get(i1)).b;
            } else
            {
                return null;
            }
        }

        public final long getItemId(int i1)
        {
            int j1 = b.size() * g;
            if (f != null && i1 >= j1)
            {
                i1 -= j1;
                if (i1 < f.getCount())
                {
                    return f.getItemId(i1);
                }
            }
            return -1L;
        }

        public final int getItemViewType(int i1)
        {
            int j1;
            int k1;
            int l1;
            int i2;
            i2 = 0;
            int j2 = b.size() * g;
            if (f == null)
            {
                k1 = 0;
            } else
            {
                k1 = f.getViewTypeCount() - 1;
            }
            l1 = -2;
            j1 = l1;
            if (j)
            {
                j1 = l1;
                if (i1 < j2)
                {
                    j1 = l1;
                    if (i1 == 0)
                    {
                        j1 = l1;
                        if (k)
                        {
                            j1 = b.size() + k1 + c.size() + 1 + 1;
                        }
                    }
                    if (i1 % g != 0)
                    {
                        j1 = i1 / g + 1 + k1;
                    }
                }
            }
            j2 = i1 - j2;
            l1 = i2;
            i1 = j1;
            if (f == null) goto _L2; else goto _L1
_L1:
            i2 = a();
            l1 = i2;
            i1 = j1;
            if (j2 < 0) goto _L2; else goto _L3
_L3:
            l1 = i2;
            i1 = j1;
            if (j2 >= i2) goto _L2; else goto _L4
_L4:
            if (j2 >= f.getCount()) goto _L6; else goto _L5
_L5:
            i1 = f.getItemViewType(j2);
            l1 = i2;
_L2:
            j1 = i1;
            if (j)
            {
                l1 = j2 - l1;
                j1 = i1;
                if (l1 >= 0)
                {
                    j1 = i1;
                    if (l1 < getCount())
                    {
                        j1 = i1;
                        if (l1 % g != 0)
                        {
                            j1 = k1 + b.size() + 1 + (l1 / g + 1);
                        }
                    }
                }
            }
            return j1;
_L6:
            l1 = i2;
            i1 = j1;
            if (j)
            {
                i1 = b.size() + k1 + 1;
                l1 = i2;
            }
            if (true) goto _L2; else goto _L7
_L7:
        }

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            int j1 = b.size() * g;
            if (i1 < j1)
            {
                ViewGroup viewgroup1 = ((a)b.get(i1 / g)).a;
                if (i1 % g == 0)
                {
                    return viewgroup1;
                }
                View view1 = view;
                if (view == null)
                {
                    view1 = new View(viewgroup.getContext());
                }
                view1.setVisibility(4);
                view1.setMinimumHeight(viewgroup1.getHeight());
                return view1;
            }
            int l1 = i1 - j1;
            j1 = 0;
            if (f != null)
            {
                int k1 = a();
                j1 = k1;
                if (l1 < k1)
                {
                    if (l1 < f.getCount())
                    {
                        return f.getView(l1, view, viewgroup);
                    }
                    View view2 = view;
                    if (view == null)
                    {
                        view2 = new View(viewgroup.getContext());
                    }
                    view2.setVisibility(4);
                    view2.setMinimumHeight(h);
                    return view2;
                }
            }
            j1 = l1 - j1;
            if (j1 < getCount())
            {
                ViewGroup viewgroup2 = ((a)c.get(j1 / g)).a;
                if (i1 % g == 0)
                {
                    return viewgroup2;
                }
                View view3 = view;
                if (view == null)
                {
                    view3 = new View(viewgroup.getContext());
                }
                view3.setVisibility(4);
                view3.setMinimumHeight(viewgroup2.getHeight());
                return view3;
            } else
            {
                throw new ArrayIndexOutOfBoundsException(i1);
            }
        }

        public final int getViewTypeCount()
        {
            int i1;
            int j1;
            if (f == null)
            {
                i1 = 1;
            } else
            {
                i1 = f.getViewTypeCount();
            }
            j1 = i1;
            if (j)
            {
                int k1 = b.size() + 1 + c.size();
                j1 = k1;
                if (k)
                {
                    j1 = k1 + 1;
                }
                j1 = i1 + j1;
            }
            return j1;
        }

        public final ListAdapter getWrappedAdapter()
        {
            return f;
        }

        public final boolean hasStableIds()
        {
            return f != null && f.hasStableIds();
        }

        public final boolean isEmpty()
        {
            return f == null || f.isEmpty();
        }

        public final boolean isEnabled(int i1)
        {
            int j1;
            boolean flag1;
            flag1 = false;
            j1 = b.size() * g;
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            boolean flag;
            flag = flag1;
            if (i1 % g == 0)
            {
                flag = flag1;
                if (((a)b.get(i1 / g)).c)
                {
                    flag = true;
                }
            }
_L4:
            return flag;
_L2:
            int l1 = i1 - j1;
            if (f != null)
            {
                int k1 = a();
                i1 = k1;
                if (l1 < k1)
                {
                    flag = flag1;
                    if (l1 < f.getCount())
                    {
                        flag = flag1;
                        if (f.isEnabled(l1))
                        {
                            return true;
                        }
                    }
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                i1 = 0;
            }
            i1 = l1 - i1;
            flag = flag1;
            if (i1 % g == 0)
            {
                flag = flag1;
                if (((a)c.get(i1 / g)).c)
                {
                    return true;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            e.registerObserver(datasetobserver);
            if (f != null)
            {
                f.registerDataSetObserver(datasetobserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            e.unregisterObserver(datasetobserver);
            if (f != null)
            {
                f.unregisterDataSetObserver(datasetobserver);
            }
        }


        public b(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
        {
            boolean flag = true;
            super();
            g = 1;
            h = -1;
            j = true;
            k = false;
            f = listadapter;
            i = listadapter instanceof Filterable;
            if (arraylist == null)
            {
                b = a;
            } else
            {
                b = arraylist;
            }
            if (arraylist1 == null)
            {
                c = a;
            } else
            {
                c = arraylist1;
            }
            if (!a(b) || !a(c))
            {
                flag = false;
            }
            d = flag;
        }
    }


    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private SparseIntArray f;
    private k g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private MotionEvent l;
    private ViewGroup m;
    private ArrayList n;
    private ArrayList o;
    private android.widget.AbsListView.OnScrollListener p;
    private android.widget.AbsListView.OnScrollListener q;

    public ObservableGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
        q = new com.github.ksoichiro.android.observablescrollview.a(this);
        a();
    }

    public ObservableGridView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = -1;
        q = new com.github.ksoichiro.android.observablescrollview.a(this);
        a();
    }

    static android.widget.AbsListView.OnScrollListener a(ObservableGridView observablegridview)
    {
        return observablegridview.p;
    }

    private void a()
    {
        f = new SparseIntArray();
        n = new ArrayList();
        o = new ArrayList();
        super.setClipChildren(false);
        super.setOnScrollListener(q);
    }

    private int b()
    {
        int j1 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            j1 = getNumColumns();
        } else
        {
            int i1 = j1;
            if (getChildCount() > 0)
            {
                int k1 = getChildAt(0).getMeasuredWidth();
                i1 = j1;
                if (k1 > 0)
                {
                    i1 = getWidth() / k1;
                }
            }
            j1 = i1;
            if (i1 <= 0)
            {
                return -1;
            }
        }
        return j1;
    }

    static void b(ObservableGridView observablegridview)
    {
        if (observablegridview.g != null && observablegridview.getChildCount() > 0)
        {
            int i3 = observablegridview.getFirstVisiblePosition();
            int l1 = observablegridview.getFirstVisiblePosition();
            for (int i1 = 0; l1 <= observablegridview.getLastVisiblePosition(); i1++)
            {
                if ((observablegridview.f.indexOfKey(l1) < 0 || observablegridview.getChildAt(i1).getHeight() != observablegridview.f.get(l1)) && l1 % observablegridview.b() == 0)
                {
                    observablegridview.f.put(l1, observablegridview.getChildAt(i1).getHeight());
                }
                l1++;
            }

            View view = observablegridview.getChildAt(0);
            if (view != null)
            {
                if (observablegridview.a < i3)
                {
                    int k2;
                    if (i3 - observablegridview.a != 1)
                    {
                        int i2 = i3 - 1;
                        int j1 = 0;
                        do
                        {
                            k2 = j1;
                            if (i2 <= observablegridview.a)
                            {
                                break;
                            }
                            k2 = j1;
                            if (observablegridview.f.indexOfKey(i2) > 0)
                            {
                                k2 = j1 + observablegridview.f.get(i2);
                            }
                            i2--;
                            j1 = k2;
                        } while (true);
                    } else
                    {
                        k2 = 0;
                    }
                    observablegridview.c = observablegridview.c + (k2 + observablegridview.b);
                    observablegridview.b = view.getHeight();
                } else
                if (i3 < observablegridview.a)
                {
                    int l2;
                    if (observablegridview.a - i3 != 1)
                    {
                        int j2 = observablegridview.a - 1;
                        int k1 = 0;
                        do
                        {
                            l2 = k1;
                            if (j2 <= i3)
                            {
                                break;
                            }
                            l2 = k1;
                            if (observablegridview.f.indexOfKey(j2) > 0)
                            {
                                l2 = k1 + observablegridview.f.get(j2);
                            }
                            j2--;
                            k1 = l2;
                        } while (true);
                    } else
                    {
                        l2 = 0;
                    }
                    observablegridview.c = observablegridview.c - (l2 + view.getHeight());
                    observablegridview.b = view.getHeight();
                } else
                if (i3 == 0)
                {
                    observablegridview.b = view.getHeight();
                }
                if (observablegridview.b < 0)
                {
                    observablegridview.b = 0;
                }
                observablegridview.e = observablegridview.c - view.getTop();
                observablegridview.a = i3;
                observablegridview.g.j_();
                if (observablegridview.i)
                {
                    observablegridview.i = false;
                }
                if (observablegridview.d < observablegridview.e)
                {
                    observablegridview.h = n.b;
                } else
                if (observablegridview.e < observablegridview.d)
                {
                    observablegridview.h = n.c;
                } else
                {
                    observablegridview.h = n.a;
                }
                observablegridview.d = observablegridview.e;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 0: default 28
    //                   0 34;
           goto _L2 _L3
_L2:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        j = true;
        i = true;
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && (listadapter instanceof b))
        {
            ((b)listadapter).a(b());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        a = ((SavedState) (parcelable)).a;
        b = ((SavedState) (parcelable)).b;
        c = ((SavedState) (parcelable)).c;
        d = ((SavedState) (parcelable)).d;
        e = ((SavedState) (parcelable)).e;
        f = ((SavedState) (parcelable)).f;
        super.onRestoreInstanceState(parcelable.getSuperState());
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = a;
        savedstate.b = b;
        savedstate.c = c;
        savedstate.d = d;
        savedstate.e = e;
        savedstate.f = f;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1 = 0.0F;
        if (g == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 59
    //                   3 46;
           goto _L2 _L3 _L4 _L3
_L2:
        return super.onTouchEvent(motionevent);
_L3:
        k = false;
        j = false;
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (l == null)
        {
            l = motionevent;
        }
        float f2 = motionevent.getY();
        float f4 = l.getY();
        l = MotionEvent.obtainNoHistory(motionevent);
        if ((float)e - (f2 - f4) <= 0.0F)
        {
            if (k)
            {
                return false;
            }
            float f3;
            ViewGroup viewgroup;
            Object obj;
            if (m == null)
            {
                viewgroup = (ViewGroup)getParent();
            } else
            {
                viewgroup = m;
            }
            obj = this;
            f3 = 0.0F;
            for (; obj != null && obj != viewgroup; obj = (View)((View) (obj)).getParent())
            {
                f3 += ((View) (obj)).getLeft() - ((View) (obj)).getScrollX();
                f1 += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
            }

            obj = MotionEvent.obtainNoHistory(motionevent);
            ((MotionEvent) (obj)).offsetLocation(f3, f1);
            if (viewgroup.onInterceptTouchEvent(((MotionEvent) (obj))))
            {
                k = true;
                ((MotionEvent) (obj)).setAction(0);
                post(new com.github.ksoichiro.android.observablescrollview.b(this, viewgroup, ((MotionEvent) (obj))));
                return false;
            } else
            {
                return super.onTouchEvent(motionevent);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (n.size() > 0)
        {
            listadapter = new b(n, o, listadapter);
            int i1 = b();
            if (1 < i1)
            {
                listadapter.a(i1);
            }
            super.setAdapter(listadapter);
            return;
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setClipChildren(boolean flag)
    {
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        p = onscrolllistener;
    }
}
