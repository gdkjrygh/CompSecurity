// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            k, n, g, h

public class ObservableRecyclerView extends RecyclerView
{
    static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new h();
        public static final SavedState a = new _cls1();
        int b;
        int c;
        int d;
        int e;
        int f;
        SparseIntArray g;
        Parcelable h;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            int j1 = 0;
            parcel.writeParcelable(h, i1);
            parcel.writeInt(b);
            parcel.writeInt(c);
            parcel.writeInt(d);
            parcel.writeInt(e);
            parcel.writeInt(f);
            if (g == null)
            {
                i1 = 0;
            } else
            {
                i1 = g.size();
            }
            parcel.writeInt(i1);
            if (i1 > 0)
            {
                for (; j1 < i1; j1++)
                {
                    parcel.writeInt(g.keyAt(j1));
                    parcel.writeInt(g.valueAt(j1));
                }

            }
        }


        private SavedState()
        {
            c = -1;
            h = null;
        }

        SavedState(byte byte0)
        {
            this();
        }

        private SavedState(Parcel parcel)
        {
            c = -1;
            Object obj = parcel.readParcelable(android/support/v7/widget/RecyclerView.getClassLoader());
            int j1;
            if (obj == null)
            {
                obj = a;
            }
            h = ((Parcelable) (obj));
            b = parcel.readInt();
            c = parcel.readInt();
            d = parcel.readInt();
            e = parcel.readInt();
            f = parcel.readInt();
            g = new SparseIntArray();
            j1 = parcel.readInt();
            if (j1 > 0)
            {
                for (int i1 = 0; i1 < j1; i1++)
                {
                    int k1 = parcel.readInt();
                    int l1 = parcel.readInt();
                    g.put(k1, l1);
                }

            }
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            c = -1;
            if (parcelable == a)
            {
                parcelable = null;
            }
            h = parcelable;
        }

        class _cls1 extends SavedState
        {

                _cls1()
                {
                    super((byte)0);
                }
        }

    }


    private static int h = 22;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private SparseIntArray n;
    private k o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private MotionEvent t;
    private ViewGroup u;

    public ObservableRecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = -1;
        i();
    }

    public ObservableRecyclerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = -1;
        i();
    }

    private void i()
    {
        n = new SparseIntArray();
        try
        {
            super.c(null);
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            h = 21;
        }
    }

    public final int c(View view)
    {
        if (22 <= h)
        {
            return super.c(view);
        } else
        {
            return c(view);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (o == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 0: default 28
    //                   0 34;
           goto _L2 _L3
_L2:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        r = true;
        q = true;
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        i = ((SavedState) (parcelable)).b;
        j = ((SavedState) (parcelable)).c;
        k = ((SavedState) (parcelable)).d;
        l = ((SavedState) (parcelable)).e;
        m = ((SavedState) (parcelable)).f;
        n = ((SavedState) (parcelable)).g;
        super.onRestoreInstanceState(((SavedState) (parcelable)).h);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.b = i;
        savedstate.c = j;
        savedstate.d = k;
        savedstate.e = l;
        savedstate.f = m;
        savedstate.g = n;
        return savedstate;
    }

    protected void onScrollChanged(int i1, int j1, int k1, int l1)
    {
        super.onScrollChanged(i1, j1, k1, l1);
        if (o != null && getChildCount() > 0)
        {
            l1 = c(getChildAt(0));
            int i2 = c(getChildAt(getChildCount() - 1));
            i1 = 0;
            j1 = l1;
            while (j1 <= i2) 
            {
                View view = getChildAt(i1);
                if (view != null && (n.indexOfKey(j1) < 0 || view.getHeight() != n.get(j1)))
                {
                    k1 = view.getHeight();
                } else
                {
                    k1 = 0;
                }
                n.put(j1, k1);
                j1++;
                i1++;
            }
            view = getChildAt(0);
            if (view != null)
            {
                if (i < l1)
                {
                    if (l1 - i != 1)
                    {
                        j1 = l1 - 1;
                        i1 = 0;
                        do
                        {
                            k1 = i1;
                            if (j1 <= i)
                            {
                                break;
                            }
                            if (n.indexOfKey(j1) > 0)
                            {
                                i1 += n.get(j1);
                            } else
                            {
                                i1 += view.getHeight();
                            }
                            j1--;
                        } while (true);
                    } else
                    {
                        k1 = 0;
                    }
                    k = k + (k1 + j);
                    j = view.getHeight();
                } else
                if (l1 < i)
                {
                    if (i - l1 != 1)
                    {
                        j1 = i - 1;
                        i1 = 0;
                        do
                        {
                            k1 = i1;
                            if (j1 <= l1)
                            {
                                break;
                            }
                            if (n.indexOfKey(j1) > 0)
                            {
                                i1 += n.get(j1);
                            } else
                            {
                                i1 += view.getHeight();
                            }
                            j1--;
                        } while (true);
                    } else
                    {
                        k1 = 0;
                    }
                    k = k - (k1 + view.getHeight());
                    j = view.getHeight();
                } else
                if (l1 == 0)
                {
                    j = view.getHeight();
                    k = 0;
                }
                if (j < 0)
                {
                    j = 0;
                }
                m = k - view.getTop();
                i = l1;
                o.j_();
                if (q)
                {
                    q = false;
                }
                if (l < m)
                {
                    p = n.b;
                } else
                if (m < l)
                {
                    p = n.c;
                } else
                {
                    p = n.a;
                }
                l = m;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f = 0.0F;
        if (o == null) goto _L2; else goto _L1
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
        s = false;
        r = false;
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (t == null)
        {
            t = motionevent;
        }
        float f1 = motionevent.getY();
        float f3 = t.getY();
        t = MotionEvent.obtainNoHistory(motionevent);
        if ((float)m - (f1 - f3) <= 0.0F)
        {
            if (s)
            {
                return false;
            }
            float f2;
            ViewGroup viewgroup;
            Object obj;
            if (u == null)
            {
                viewgroup = (ViewGroup)getParent();
            } else
            {
                viewgroup = u;
            }
            obj = this;
            f2 = 0.0F;
            for (; obj != null && obj != viewgroup; obj = (View)((View) (obj)).getParent())
            {
                f2 += ((View) (obj)).getLeft() - ((View) (obj)).getScrollX();
                f += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
            }

            obj = MotionEvent.obtainNoHistory(motionevent);
            ((MotionEvent) (obj)).offsetLocation(f2, f);
            if (viewgroup.onInterceptTouchEvent(((MotionEvent) (obj))))
            {
                s = true;
                ((MotionEvent) (obj)).setAction(0);
                post(new g(this, viewgroup, ((MotionEvent) (obj))));
                return false;
            } else
            {
                return super.onTouchEvent(motionevent);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

}
