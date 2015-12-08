// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            d, k, n, e, 
//            f

public class ObservableListView extends ListView
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new f();
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
    private android.widget.AbsListView.OnScrollListener n;
    private android.widget.AbsListView.OnScrollListener o;

    public ObservableListView(Context context)
    {
        super(context);
        b = -1;
        o = new d(this);
        a();
    }

    public ObservableListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
        o = new d(this);
        a();
    }

    public ObservableListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = -1;
        o = new d(this);
        a();
    }

    static android.widget.AbsListView.OnScrollListener a(ObservableListView observablelistview)
    {
        return observablelistview.n;
    }

    private void a()
    {
        f = new SparseIntArray();
        super.setOnScrollListener(o);
    }

    static void b(ObservableListView observablelistview)
    {
        if (observablelistview.g != null && observablelistview.getChildCount() > 0)
        {
            int i3 = observablelistview.getFirstVisiblePosition();
            int l1 = observablelistview.getFirstVisiblePosition();
            for (int i1 = 0; l1 <= observablelistview.getLastVisiblePosition(); i1++)
            {
                if (observablelistview.f.indexOfKey(l1) < 0 || observablelistview.getChildAt(i1).getHeight() != observablelistview.f.get(l1))
                {
                    observablelistview.f.put(l1, observablelistview.getChildAt(i1).getHeight());
                }
                l1++;
            }

            View view = observablelistview.getChildAt(0);
            if (view != null)
            {
                if (observablelistview.a < i3)
                {
                    int k2;
                    if (i3 - observablelistview.a != 1)
                    {
                        int i2 = i3 - 1;
                        int j1 = 0;
                        do
                        {
                            k2 = j1;
                            if (i2 <= observablelistview.a)
                            {
                                break;
                            }
                            if (observablelistview.f.indexOfKey(i2) > 0)
                            {
                                j1 += observablelistview.f.get(i2);
                            } else
                            {
                                j1 += view.getHeight();
                            }
                            i2--;
                        } while (true);
                    } else
                    {
                        k2 = 0;
                    }
                    observablelistview.c = observablelistview.c + (k2 + observablelistview.b);
                    observablelistview.b = view.getHeight();
                } else
                if (i3 < observablelistview.a)
                {
                    int l2;
                    if (observablelistview.a - i3 != 1)
                    {
                        int j2 = observablelistview.a - 1;
                        int k1 = 0;
                        do
                        {
                            l2 = k1;
                            if (j2 <= i3)
                            {
                                break;
                            }
                            if (observablelistview.f.indexOfKey(j2) > 0)
                            {
                                k1 += observablelistview.f.get(j2);
                            } else
                            {
                                k1 += view.getHeight();
                            }
                            j2--;
                        } while (true);
                    } else
                    {
                        l2 = 0;
                    }
                    observablelistview.c = observablelistview.c - (l2 + view.getHeight());
                    observablelistview.b = view.getHeight();
                } else
                if (i3 == 0)
                {
                    observablelistview.b = view.getHeight();
                }
                if (observablelistview.b < 0)
                {
                    observablelistview.b = 0;
                }
                observablelistview.e = observablelistview.c - view.getTop();
                observablelistview.a = i3;
                observablelistview.g.j_();
                if (observablelistview.i)
                {
                    observablelistview.i = false;
                }
                if (observablelistview.d < observablelistview.e)
                {
                    observablelistview.h = n.b;
                } else
                if (observablelistview.e < observablelistview.d)
                {
                    observablelistview.h = n.c;
                } else
                {
                    observablelistview.h = n.a;
                }
                observablelistview.d = observablelistview.e;
            }
        }
    }

    public final void a(k k1)
    {
        g = k1;
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
        float f2 = 0.0F;
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
        if (true) goto _L2; else goto _L4
_L4:
        float f1;
        float f3;
        if (l == null)
        {
            l = motionevent;
        }
        f1 = motionevent.getY();
        f3 = l.getY();
        l = MotionEvent.obtainNoHistory(motionevent);
        if ((float)e - (f1 - f3) > 0.0F) goto _L2; else goto _L5
_L5:
        float f4;
        ViewGroup viewgroup;
        if (k)
        {
            return false;
        }
        Object obj;
        if (m == null)
        {
            viewgroup = (ViewGroup)getParent();
        } else
        {
            viewgroup = m;
        }
        obj = this;
        f1 = 0.0F;
        f4 = f1;
        f3 = f2;
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        f4 = f1;
        f3 = f2;
        if (obj == viewgroup)
        {
            break; /* Loop/switch isn't completed */
        }
        f2 = (float)(((View) (obj)).getLeft() - ((View) (obj)).getScrollX()) + f2;
        f1 = (float)(((View) (obj)).getTop() - ((View) (obj)).getScrollY()) + f1;
        obj = (View)((View) (obj)).getParent();
        if (true) goto _L7; else goto _L6
_L7:
        break MISSING_BLOCK_LABEL_138;
        ClassCastException classcastexception;
        classcastexception;
        f3 = f2;
        f4 = f1;
_L6:
        MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
        motionevent1.offsetLocation(f3, f4);
        if (viewgroup.onInterceptTouchEvent(motionevent1))
        {
            k = true;
            motionevent1.setAction(0);
            post(new e(this, viewgroup, motionevent1));
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        n = onscrolllistener;
    }
}
