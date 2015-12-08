// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.a;
import android.support.v4.view.accessibility.g;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            n, l, RecyclerView, i

public class LinearLayoutManager extends RecyclerView.i
{
    static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int j)
            {
                return new SavedState[j];
            }

        };
        int a;
        int b;
        boolean c;

        final boolean a()
        {
            return a >= 0;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
            if (c)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            boolean flag = true;
            super();
            a = parcel.readInt();
            b = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            c = flag;
        }

        public SavedState(SavedState savedstate)
        {
            a = savedstate.a;
            b = savedstate.b;
            c = savedstate.c;
        }
    }

    final class a
    {

        int a;
        int b;
        boolean c;
        final LinearLayoutManager d;

        final void a()
        {
            int j;
            if (c)
            {
                j = d.mOrientationHelper.d();
            } else
            {
                j = d.mOrientationHelper.c();
            }
            b = j;
        }

        public final void a(View view)
        {
            if (c)
            {
                b = d.mOrientationHelper.b(view) + d.mOrientationHelper.b();
            } else
            {
                b = d.mOrientationHelper.a(view);
            }
            a = d.getPosition(view);
        }

        public final String toString()
        {
            return (new StringBuilder("AnchorInfo{mPosition=")).append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
        }

        a()
        {
            d = LinearLayoutManager.this;
            super();
        }
    }

    protected static final class b
    {

        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b()
        {
        }
    }

    static final class c
    {

        boolean a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        boolean i;
        int j;
        List k;

        final View a(RecyclerView.o o)
        {
            if (k != null)
            {
                int k1 = k.size();
                for (int i1 = 0; i1 < k1; i1++)
                {
                    o = ((RecyclerView.v)k.get(i1)).itemView;
                    RecyclerView.j j1 = (RecyclerView.j)o.getLayoutParams();
                    if (!j1.a.isRemoved() && d == j1.a.getLayoutPosition())
                    {
                        a(((View) (o)));
                        return o;
                    }
                }

                return null;
            } else
            {
                o = o.c(d);
                d = d + e;
                return o;
            }
        }

        public final void a(View view)
        {
_L2:
            if (view2 == null)
            {
                d = -1;
                return;
            } else
            {
                d = ((RecyclerView.j)view2.getLayoutParams()).a.getLayoutPosition();
                return;
            }
            int i2 = k.size();
            View view1 = null;
            int i1 = 0x7fffffff;
            View view2;
            for (int k1 = 0; k1 < i2; k1++)
            {
                view2 = ((RecyclerView.v)k.get(k1)).itemView;
                RecyclerView.j j1 = (RecyclerView.j)view2.getLayoutParams();
                if (view2 != view && !j1.a.isRemoved())
                {
                    int l1 = (j1.a.getLayoutPosition() - d) * e;
                    if (l1 >= 0 && l1 < i1)
                    {
                        if (l1 == 0)
                        {
                            break MISSING_BLOCK_LABEL_122;
                        }
                        view1 = view2;
                        i1 = l1;
                    }
                }
            }

            view2 = view1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        final boolean a(RecyclerView.s s)
        {
            return d >= 0 && d < s.e();
        }

        c()
        {
            a = true;
            h = 0;
            i = false;
            k = null;
        }
    }


    private static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = 0x80000000;
    private static final float MAX_SCROLL_FACTOR = 0.33F;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private boolean mLastStackFromEnd;
    private c mLayoutState;
    int mOrientation;
    l mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(Context context)
    {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int j, boolean flag)
    {
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mStackFromEnd = false;
        mSmoothScrollbarEnabled = true;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mPendingSavedState = null;
        mAnchorInfo = new a();
        setOrientation(j);
        setReverseLayout(flag);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeset, int j, int k)
    {
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mStackFromEnd = false;
        mSmoothScrollbarEnabled = true;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mPendingSavedState = null;
        mAnchorInfo = new a();
        context = getProperties(context, attributeset, j, k);
        setOrientation(((RecyclerView.i.a) (context)).a);
        setReverseLayout(((RecyclerView.i.a) (context)).c);
        setStackFromEnd(((RecyclerView.i.a) (context)).d);
    }

    private int computeScrollExtent(RecyclerView.s s)
    {
        boolean flag1 = false;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureLayoutState();
        l l1 = mOrientationHelper;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleChildClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return android.support.v7.widget.n.a(s, l1, view, findFirstVisibleChildClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.s s)
    {
        boolean flag1 = false;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureLayoutState();
        l l1 = mOrientationHelper;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleChildClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return android.support.v7.widget.n.a(s, l1, view, findFirstVisibleChildClosestToEnd(flag, true), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.s s)
    {
        boolean flag1 = false;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureLayoutState();
        l l1 = mOrientationHelper;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleChildClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return n.b(s, l1, view, findFirstVisibleChildClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int j)
    {
        int k;
        byte byte0;
        byte0 = -1;
        k = byte0;
        j;
        JVM INSTR lookupswitch 6: default 64
    //                   1: 67
    //                   2: 69
    //                   17: 97
    //                   33: 71
    //                   66: 109
    //                   130: 84;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break MISSING_BLOCK_LABEL_67;
_L1:
        k = 0x80000000;
_L9:
        return k;
_L3:
        return 1;
_L5:
        k = byte0;
        if (mOrientation == 1) goto _L9; else goto _L8
_L8:
        return 0x80000000;
_L7:
        return mOrientation != 1 ? 0x80000000 : 1;
_L4:
        k = byte0;
        if (mOrientation == 0) goto _L9; else goto _L10
_L10:
        return 0x80000000;
_L6:
        return mOrientation != 0 ? 0x80000000 : 1;
    }

    private View findFirstReferenceChild(RecyclerView.o o, RecyclerView.s s)
    {
        return findReferenceChild(o, s, 0, getChildCount(), s.e());
    }

    private View findFirstVisibleChildClosestToEnd(boolean flag, boolean flag1)
    {
        if (mShouldReverseLayout)
        {
            return findOneVisibleChild(0, getChildCount(), flag, flag1);
        } else
        {
            return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
        }
    }

    private View findFirstVisibleChildClosestToStart(boolean flag, boolean flag1)
    {
        if (mShouldReverseLayout)
        {
            return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
        } else
        {
            return findOneVisibleChild(0, getChildCount(), flag, flag1);
        }
    }

    private View findLastReferenceChild(RecyclerView.o o, RecyclerView.s s)
    {
        return findReferenceChild(o, s, getChildCount() - 1, -1, s.e());
    }

    private View findReferenceChildClosestToEnd(RecyclerView.o o, RecyclerView.s s)
    {
        if (mShouldReverseLayout)
        {
            return findFirstReferenceChild(o, s);
        } else
        {
            return findLastReferenceChild(o, s);
        }
    }

    private View findReferenceChildClosestToStart(RecyclerView.o o, RecyclerView.s s)
    {
        if (mShouldReverseLayout)
        {
            return findLastReferenceChild(o, s);
        } else
        {
            return findFirstReferenceChild(o, s);
        }
    }

    private int fixLayoutEndGap(int j, RecyclerView.o o, RecyclerView.s s, boolean flag)
    {
        int k = mOrientationHelper.d() - j;
        if (k > 0)
        {
            int i1 = -scrollBy(-k, o, s);
            k = i1;
            if (flag)
            {
                j = mOrientationHelper.d() - (j + i1);
                k = i1;
                if (j > 0)
                {
                    mOrientationHelper.a(j);
                    k = i1 + j;
                }
            }
            return k;
        } else
        {
            return 0;
        }
    }

    private int fixLayoutStartGap(int j, RecyclerView.o o, RecyclerView.s s, boolean flag)
    {
        int k = j - mOrientationHelper.c();
        if (k > 0)
        {
            int i1 = -scrollBy(k, o, s);
            k = i1;
            if (flag)
            {
                j = (j + i1) - mOrientationHelper.c();
                k = i1;
                if (j > 0)
                {
                    mOrientationHelper.a(-j);
                    k = i1 - j;
                }
            }
            return k;
        } else
        {
            return 0;
        }
    }

    private View getChildClosestToEnd()
    {
        int j;
        if (mShouldReverseLayout)
        {
            j = 0;
        } else
        {
            j = getChildCount() - 1;
        }
        return getChildAt(j);
    }

    private View getChildClosestToStart()
    {
        int j;
        if (mShouldReverseLayout)
        {
            j = getChildCount() - 1;
        } else
        {
            j = 0;
        }
        return getChildAt(j);
    }

    private void layoutForPredictiveAnimations(RecyclerView.o o, RecyclerView.s s, int j, int k)
    {
        if (!s.b() || getChildCount() == 0 || s.a() || !supportsPredictiveItemAnimations())
        {
            return;
        }
        int i1 = 0;
        int k1 = 0;
        List list = o.b();
        int j2 = list.size();
        int k2 = getPosition(getChildAt(0));
        int j1 = 0;
        while (j1 < j2) 
        {
            RecyclerView.v v = (RecyclerView.v)list.get(j1);
            int l1 = k1;
            int i2 = i1;
            if (!v.isRemoved())
            {
                boolean flag;
                if (v.getLayoutPosition() < k2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != mShouldReverseLayout)
                {
                    l1 = -1;
                } else
                {
                    l1 = 1;
                }
                if (l1 == -1)
                {
                    i2 = i1 + mOrientationHelper.c(v.itemView);
                    l1 = k1;
                } else
                {
                    l1 = k1 + mOrientationHelper.c(v.itemView);
                    i2 = i1;
                }
            }
            j1++;
            k1 = l1;
            i1 = i2;
        }
        mLayoutState.k = list;
        if (i1 > 0)
        {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), j);
            mLayoutState.h = i1;
            mLayoutState.c = 0;
            mLayoutState.a(null);
            fill(o, mLayoutState, s, false);
        }
        if (k1 > 0)
        {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), k);
            mLayoutState.h = k1;
            mLayoutState.c = 0;
            mLayoutState.a(null);
            fill(o, mLayoutState, s, false);
        }
        mLayoutState.k = null;
    }

    private void logChildren()
    {
        for (int j = 0; j < getChildCount(); j++)
        {
            View view = getChildAt(j);
            (new StringBuilder("item ")).append(getPosition(view)).append(", coord:").append(mOrientationHelper.a(view));
        }

    }

    private void recycleByLayoutState(RecyclerView.o o, c c1)
    {
        if (!c1.a)
        {
            return;
        }
        if (c1.f == -1)
        {
            recycleViewsFromEnd(o, c1.g);
            return;
        } else
        {
            recycleViewsFromStart(o, c1.g);
            return;
        }
    }

    private void recycleChildren(RecyclerView.o o, int j, int k)
    {
        if (j != k) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (k <= j)
        {
            break; /* Loop/switch isn't completed */
        }
        k--;
        while (k >= j) 
        {
            removeAndRecycleViewAt(k, o);
            k--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (j > k) 
        {
            removeAndRecycleViewAt(j, o);
            j--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void recycleViewsFromEnd(RecyclerView.o o, int j)
    {
        int k = getChildCount();
        if (j >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        i1 = mOrientationHelper.e() - j;
        if (!mShouldReverseLayout)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
        while (j < k) 
        {
            View view = getChildAt(j);
            if (mOrientationHelper.a(view) < i1)
            {
                recycleChildren(o, 0, j);
                return;
            }
            j++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        j = k - 1;
        while (j >= 0) 
        {
            View view1 = getChildAt(j);
            if (mOrientationHelper.a(view1) < i1)
            {
                recycleChildren(o, k - 1, j);
                return;
            }
            j--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void recycleViewsFromStart(RecyclerView.o o, int j)
    {
        if (j >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1;
        j1 = getChildCount();
        if (!mShouldReverseLayout)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = j1 - 1;
        while (k >= 0) 
        {
            View view = getChildAt(k);
            if (mOrientationHelper.b(view) > j)
            {
                recycleChildren(o, j1 - 1, k);
                return;
            }
            k--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (mOrientationHelper.b(view1) > j)
            {
                recycleChildren(o, 0, i1);
                return;
            }
            i1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void resolveShouldLayoutReverse()
    {
        boolean flag = true;
        if (mOrientation != 1 && isLayoutRTL()) goto _L2; else goto _L1
_L1:
        flag = mReverseLayout;
_L4:
        mShouldReverseLayout = flag;
        return;
_L2:
        if (mReverseLayout)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean updateAnchorFromChildren(RecyclerView.o o, RecyclerView.s s, a a1)
    {
        View view;
        int l1;
        l1 = 0;
        if (getChildCount() == 0)
        {
            return false;
        }
        view = getFocusedChild();
        if (view == null) goto _L2; else goto _L1
_L1:
        RecyclerView.j j = (RecyclerView.j)view.getLayoutParams();
        boolean flag;
        if (!j.a.isRemoved() && j.a.getLayoutPosition() >= 0 && j.a.getLayoutPosition() < s.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        l1 = a1.d.mOrientationHelper.b();
        if (l1 < 0) goto _L5; else goto _L4
_L4:
        a1.a(view);
_L6:
        return true;
_L5:
        a1.a = a1.d.getPosition(view);
        if (a1.c)
        {
            int k = a1.d.mOrientationHelper.d() - l1 - a1.d.mOrientationHelper.b(view);
            a1.b = a1.d.mOrientationHelper.d() - k;
            if (k > 0)
            {
                l1 = a1.d.mOrientationHelper.c(view);
                int i2 = a1.b;
                int l2 = a1.d.mOrientationHelper.c();
                l1 = i2 - l1 - (Math.min(a1.d.mOrientationHelper.a(view) - l2, 0) + l2);
                if (l1 < 0)
                {
                    int j2 = a1.b;
                    a1.b = Math.min(k, -l1) + j2;
                }
            }
        } else
        {
            int k2 = a1.d.mOrientationHelper.a(view);
            int i1 = k2 - a1.d.mOrientationHelper.c();
            a1.b = k2;
            if (i1 > 0)
            {
                int i3 = a1.d.mOrientationHelper.c(view);
                int j3 = a1.d.mOrientationHelper.d();
                int k3 = a1.d.mOrientationHelper.b(view);
                l1 = a1.d.mOrientationHelper.d() - Math.min(0, j3 - l1 - k3) - (k2 + i3);
                if (l1 < 0)
                {
                    a1.b = a1.b - Math.min(i1, -l1);
                }
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
label0:
        {
label1:
            {
label2:
                {
                    if (mLastStackFromEnd != mStackFromEnd)
                    {
                        return false;
                    }
                    int j1;
                    if (a1.c)
                    {
                        o = findReferenceChildClosestToEnd(o, s);
                    } else
                    {
                        o = findReferenceChildClosestToStart(o, s);
                    }
                    if (o == null)
                    {
                        break label0;
                    }
                    a1.a(o);
                    if (s.a() || !supportsPredictiveItemAnimations())
                    {
                        break label1;
                    }
                    if (mOrientationHelper.a(o) < mOrientationHelper.d())
                    {
                        j1 = l1;
                        if (mOrientationHelper.b(o) >= mOrientationHelper.c())
                        {
                            break label2;
                        }
                    }
                    j1 = 1;
                }
                if (j1 != 0)
                {
                    int k1;
                    if (a1.c)
                    {
                        k1 = mOrientationHelper.d();
                    } else
                    {
                        k1 = mOrientationHelper.c();
                    }
                    a1.b = k1;
                }
            }
            return true;
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.s s, a a1)
    {
        boolean flag1 = false;
        if (s.a() || mPendingScrollPosition == -1)
        {
            return false;
        }
        if (mPendingScrollPosition < 0 || mPendingScrollPosition >= s.e())
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            return false;
        }
        a1.a = mPendingScrollPosition;
        if (mPendingSavedState != null && mPendingSavedState.a())
        {
            a1.c = mPendingSavedState.c;
            if (a1.c)
            {
                a1.b = mOrientationHelper.d() - mPendingSavedState.b;
                return true;
            } else
            {
                a1.b = mOrientationHelper.c() + mPendingSavedState.b;
                return true;
            }
        }
        if (mPendingScrollPositionOffset == 0x80000000)
        {
            s = findViewByPosition(mPendingScrollPosition);
            if (s != null)
            {
                if (mOrientationHelper.c(s) > mOrientationHelper.f())
                {
                    a1.a();
                    return true;
                }
                if (mOrientationHelper.a(s) - mOrientationHelper.c() < 0)
                {
                    a1.b = mOrientationHelper.c();
                    a1.c = false;
                    return true;
                }
                if (mOrientationHelper.d() - mOrientationHelper.b(s) < 0)
                {
                    a1.b = mOrientationHelper.d();
                    a1.c = true;
                    return true;
                }
                int j;
                if (a1.c)
                {
                    j = mOrientationHelper.b(s) + mOrientationHelper.b();
                } else
                {
                    j = mOrientationHelper.a(s);
                }
                a1.b = j;
                return true;
            }
            if (getChildCount() > 0)
            {
                int k = getPosition(getChildAt(0));
                boolean flag;
                if (mPendingScrollPosition < k)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag == mShouldReverseLayout)
                {
                    flag1 = true;
                }
                a1.c = flag1;
            }
            a1.a();
            return true;
        }
        a1.c = mShouldReverseLayout;
        if (mShouldReverseLayout)
        {
            a1.b = mOrientationHelper.d() - mPendingScrollPositionOffset;
            return true;
        } else
        {
            a1.b = mOrientationHelper.c() + mPendingScrollPositionOffset;
            return true;
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView.o o, RecyclerView.s s, a a1)
    {
        while (updateAnchorFromPendingData(s, a1) || updateAnchorFromChildren(o, s, a1)) 
        {
            return;
        }
        a1.a();
        int j;
        if (mStackFromEnd)
        {
            j = s.e() - 1;
        } else
        {
            j = 0;
        }
        a1.a = j;
    }

    private void updateLayoutState(int j, int k, boolean flag, RecyclerView.s s)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        mLayoutState.h = getExtraLayoutSpace(s);
        mLayoutState.f = j;
        if (j == 1)
        {
            s = mLayoutState;
            s.h = ((c) (s)).h + mOrientationHelper.g();
            s = getChildClosestToEnd();
            c c1 = mLayoutState;
            if (mShouldReverseLayout)
            {
                j = byte0;
            } else
            {
                j = 1;
            }
            c1.e = j;
            mLayoutState.d = getPosition(s) + mLayoutState.e;
            mLayoutState.b = mOrientationHelper.b(s);
            j = mOrientationHelper.b(s) - mOrientationHelper.d();
        } else
        {
            s = getChildClosestToStart();
            c c2 = mLayoutState;
            c2.h = c2.h + mOrientationHelper.c();
            c2 = mLayoutState;
            if (mShouldReverseLayout)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = -1;
            }
            c2.e = j;
            mLayoutState.d = getPosition(s) + mLayoutState.e;
            mLayoutState.b = mOrientationHelper.a(s);
            j = -mOrientationHelper.a(s) + mOrientationHelper.c();
        }
        mLayoutState.c = k;
        if (flag)
        {
            s = mLayoutState;
            s.c = ((c) (s)).c - j;
        }
        mLayoutState.g = j;
    }

    private void updateLayoutStateToFillEnd(int j, int k)
    {
        mLayoutState.c = mOrientationHelper.d() - k;
        c c1 = mLayoutState;
        int i1;
        if (mShouldReverseLayout)
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        c1.e = i1;
        mLayoutState.d = j;
        mLayoutState.f = 1;
        mLayoutState.b = k;
        mLayoutState.g = 0x80000000;
    }

    private void updateLayoutStateToFillEnd(a a1)
    {
        updateLayoutStateToFillEnd(a1.a, a1.b);
    }

    private void updateLayoutStateToFillStart(int j, int k)
    {
        mLayoutState.c = k - mOrientationHelper.c();
        mLayoutState.d = j;
        c c1 = mLayoutState;
        if (mShouldReverseLayout)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        c1.e = j;
        mLayoutState.f = -1;
        mLayoutState.b = k;
        mLayoutState.g = 0x80000000;
    }

    private void updateLayoutStateToFillStart(a a1)
    {
        updateLayoutStateToFillStart(a1.a, a1.b);
    }

    public void assertNotInLayoutOrScroll(String s)
    {
        if (mPendingSavedState == null)
        {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    public boolean canScrollHorizontally()
    {
        return mOrientation == 0;
    }

    public boolean canScrollVertically()
    {
        return mOrientation == 1;
    }

    public int computeHorizontalScrollExtent(RecyclerView.s s)
    {
        return computeScrollExtent(s);
    }

    public int computeHorizontalScrollOffset(RecyclerView.s s)
    {
        return computeScrollOffset(s);
    }

    public int computeHorizontalScrollRange(RecyclerView.s s)
    {
        return computeScrollRange(s);
    }

    public PointF computeScrollVectorForPosition(int j)
    {
        boolean flag = false;
        if (getChildCount() == 0)
        {
            return null;
        }
        if (j < getPosition(getChildAt(0)))
        {
            flag = true;
        }
        if (flag != mShouldReverseLayout)
        {
            j = -1;
        } else
        {
            j = 1;
        }
        if (mOrientation == 0)
        {
            return new PointF(j, 0.0F);
        } else
        {
            return new PointF(0.0F, j);
        }
    }

    public int computeVerticalScrollExtent(RecyclerView.s s)
    {
        return computeScrollExtent(s);
    }

    public int computeVerticalScrollOffset(RecyclerView.s s)
    {
        return computeScrollOffset(s);
    }

    public int computeVerticalScrollRange(RecyclerView.s s)
    {
        return computeScrollRange(s);
    }

    c createLayoutState()
    {
        return new c();
    }

    void ensureLayoutState()
    {
        if (mLayoutState == null)
        {
            mLayoutState = createLayoutState();
        }
        if (mOrientationHelper == null)
        {
            mOrientationHelper = android.support.v7.widget.l.a(this, mOrientation);
        }
    }

    int fill(RecyclerView.o o, c c1, RecyclerView.s s, boolean flag)
    {
        int i1 = c1.c;
        if (c1.g != 0x80000000)
        {
            if (c1.c < 0)
            {
                c1.g = c1.g + c1.c;
            }
            recycleByLayoutState(o, c1);
        }
        int j = c1.c + c1.h;
        b b1 = new b();
label0:
        do
        {
            int k;
            do
            {
label1:
                {
                    if (j <= 0 || !c1.a(s))
                    {
                        break label0;
                    }
                    b1.a = 0;
                    b1.b = false;
                    b1.c = false;
                    b1.d = false;
                    layoutChunk(o, s, c1, b1);
                    if (b1.b)
                    {
                        break label0;
                    }
                    c1.b = c1.b + b1.a * c1.f;
                    if (b1.c && mLayoutState.k == null)
                    {
                        k = j;
                        if (s.a())
                        {
                            break label1;
                        }
                    }
                    c1.c = c1.c - b1.a;
                    k = j - b1.a;
                }
                if (c1.g != 0x80000000)
                {
                    c1.g = c1.g + b1.a;
                    if (c1.c < 0)
                    {
                        c1.g = c1.g + c1.c;
                    }
                    recycleByLayoutState(o, c1);
                }
                j = k;
            } while (!flag);
            j = k;
        } while (!b1.d);
        return i1 - c1.c;
    }

    public int findFirstCompletelyVisibleItemPosition()
    {
        View view = findOneVisibleChild(0, getChildCount(), true, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public int findFirstVisibleItemPosition()
    {
        View view = findOneVisibleChild(0, getChildCount(), false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public int findLastCompletelyVisibleItemPosition()
    {
        View view = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public int findLastVisibleItemPosition()
    {
        View view = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    View findOneVisibleChild(int j, int k, boolean flag, boolean flag1)
    {
        ensureLayoutState();
        int i1 = mOrientationHelper.c();
        int j1 = mOrientationHelper.d();
        View view;
        View view1;
        byte byte0;
        if (k > j)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        for (view = null; j != k; view = view1)
        {
            View view2 = getChildAt(j);
            int k1 = mOrientationHelper.a(view2);
            int l1 = mOrientationHelper.b(view2);
            view1 = view;
            if (k1 < j1)
            {
                view1 = view;
                if (l1 > i1)
                {
                    if (!flag || k1 >= i1 && l1 <= j1)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (flag1)
                    {
                        view1 = view;
                        if (view == null)
                        {
                            view1 = view2;
                        }
                    }
                }
            }
            j += byte0;
        }

        return view;
    }

    View findReferenceChild(RecyclerView.o o, RecyclerView.s s, int j, int k, int i1)
    {
        Object obj;
label0:
        {
            Object obj1;
label1:
            {
                ensureLayoutState();
                obj = null;
                o = null;
                int k1 = mOrientationHelper.c();
                int l1 = mOrientationHelper.d();
                int j1;
                if (k > j)
                {
                    j1 = 1;
                } else
                {
                    j1 = -1;
                }
                while (j != k) 
                {
                    s = getChildAt(j);
                    int i2 = getPosition(s);
                    obj1 = obj;
                    Object obj2 = o;
                    if (i2 >= 0)
                    {
                        obj1 = obj;
                        obj2 = o;
                        if (i2 < i1)
                        {
                            if (((RecyclerView.j)s.getLayoutParams()).a.isRemoved())
                            {
                                obj1 = obj;
                                obj2 = o;
                                if (obj == null)
                                {
                                    obj2 = o;
                                    obj1 = s;
                                }
                            } else
                            {
                                if (mOrientationHelper.a(s) < l1)
                                {
                                    obj1 = s;
                                    if (mOrientationHelper.b(s) >= k1)
                                    {
                                        break label1;
                                    }
                                }
                                obj1 = obj;
                                obj2 = o;
                                if (o == null)
                                {
                                    obj1 = obj;
                                    obj2 = s;
                                }
                            }
                        }
                    }
                    j += j1;
                    obj = obj1;
                    o = ((RecyclerView.o) (obj2));
                }
                if (o == null)
                {
                    break label0;
                }
                obj1 = o;
            }
            return ((View) (obj1));
        }
        return ((View) (obj));
    }

    public View findViewByPosition(int j)
    {
        int k = getChildCount();
        if (k != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int i1 = j - getPosition(getChildAt(0));
        if (i1 < 0 || i1 >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(i1);
        view = view1;
        if (getPosition(view1) == j) goto _L4; else goto _L3
_L3:
        return super.findViewByPosition(j);
    }

    public RecyclerView.j generateDefaultLayoutParams()
    {
        return new RecyclerView.j(-2);
    }

    protected int getExtraLayoutSpace(RecyclerView.s s)
    {
        if (s.d())
        {
            return mOrientationHelper.f();
        } else
        {
            return 0;
        }
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public boolean getRecycleChildrenOnDetach()
    {
        return mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout()
    {
        return mReverseLayout;
    }

    public boolean getStackFromEnd()
    {
        return mStackFromEnd;
    }

    protected boolean isLayoutRTL()
    {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled()
    {
        return mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.o o, RecyclerView.s s, c c1, b b1)
    {
        o = c1.a(o);
        if (o == null)
        {
            b1.b = true;
            return;
        }
        s = (RecyclerView.j)o.getLayoutParams();
        int j;
        int k;
        int i1;
        int j1;
        if (c1.k == null)
        {
            boolean flag2 = mShouldReverseLayout;
            boolean flag;
            if (c1.f == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                addView(o);
            } else
            {
                addView(o, 0);
            }
        } else
        {
            boolean flag3 = mShouldReverseLayout;
            boolean flag1;
            if (c1.f == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                addDisappearingView(o);
            } else
            {
                addDisappearingView(o, 0);
            }
        }
        measureChildWithMargins(o, 0, 0);
        b1.a = mOrientationHelper.c(o);
        if (mOrientation == 1)
        {
            if (isLayoutRTL())
            {
                i1 = getWidth() - getPaddingRight();
                k = i1 - mOrientationHelper.d(o);
            } else
            {
                k = getPaddingLeft();
                i1 = k + mOrientationHelper.d(o);
            }
            if (c1.f == -1)
            {
                j = c1.b;
                j1 = c1.b - b1.a;
            } else
            {
                j1 = c1.b;
                j = c1.b + b1.a;
            }
        } else
        {
            j1 = getPaddingTop();
            j = j1 + mOrientationHelper.d(o);
            if (c1.f == -1)
            {
                i1 = c1.b;
                k = c1.b - b1.a;
            } else
            {
                k = c1.b;
                i1 = c1.b + b1.a;
            }
        }
        layoutDecorated(o, k + ((RecyclerView.j) (s)).leftMargin, j1 + ((RecyclerView.j) (s)).topMargin, i1 - ((RecyclerView.j) (s)).rightMargin, j - ((RecyclerView.j) (s)).bottomMargin);
        if (((RecyclerView.j) (s)).a.isRemoved() || ((RecyclerView.j) (s)).a.isChanged())
        {
            b1.c = true;
        }
        b1.d = o.isFocusable();
    }

    void onAnchorReady(RecyclerView.o o, RecyclerView.s s, a a1)
    {
    }

    public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.o o)
    {
        super.onDetachedFromWindow(recyclerview, o);
        if (mRecycleChildrenOnDetach)
        {
            removeAndRecycleAllViews(o);
            o.a();
        }
    }

    public View onFocusSearchFailed(View view, int j, RecyclerView.o o, RecyclerView.s s)
    {
        resolveShouldLayoutReverse();
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        o = null;
_L4:
        return o;
_L2:
        j = convertFocusDirectionToLayoutDirection(j);
        if (j == 0x80000000)
        {
            return null;
        }
        ensureLayoutState();
        View view1;
        if (j == -1)
        {
            view1 = findReferenceChildClosestToStart(o, s);
        } else
        {
            view1 = findReferenceChildClosestToEnd(o, s);
        }
        if (view1 == null)
        {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(j, (int)(0.33F * (float)mOrientationHelper.f()), false, s);
        mLayoutState.g = 0x80000000;
        mLayoutState.a = false;
        fill(o, mLayoutState, s, true);
        if (j == -1)
        {
            view = getChildClosestToStart();
        } else
        {
            view = getChildClosestToEnd();
        }
        if (view == view1)
        {
            break; /* Loop/switch isn't completed */
        }
        o = view;
        if (view.isFocusable()) goto _L4; else goto _L3
_L3:
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        if (getChildCount() > 0)
        {
            accessibilityevent = android.support.v4.view.accessibility.a.a(accessibilityevent);
            accessibilityevent.b(findFirstVisibleItemPosition());
            accessibilityevent.c(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(RecyclerView.o o, RecyclerView.s s)
    {
        if ((mPendingSavedState != null || mPendingScrollPosition != -1) && s.e() == 0)
        {
            removeAndRecycleAllViews(o);
            return;
        }
        if (mPendingSavedState != null && mPendingSavedState.a())
        {
            mPendingScrollPosition = mPendingSavedState.a;
        }
        ensureLayoutState();
        mLayoutState.a = false;
        resolveShouldLayoutReverse();
        a a1 = mAnchorInfo;
        a1.a = -1;
        a1.b = 0x80000000;
        a1.c = false;
        mAnchorInfo.c = mShouldReverseLayout ^ mStackFromEnd;
        updateAnchorInfoForLayout(o, s, mAnchorInfo);
        int j = getExtraLayoutSpace(s);
        int k;
        int i1;
        int j1;
        if (mLayoutState.j >= 0)
        {
            k = 0;
        } else
        {
            k = j;
            j = 0;
        }
        i1 = k + mOrientationHelper.c();
        j1 = j + mOrientationHelper.g();
        j = j1;
        k = i1;
        if (s.a())
        {
            j = j1;
            k = i1;
            if (mPendingScrollPosition != -1)
            {
                j = j1;
                k = i1;
                if (mPendingScrollPositionOffset != 0x80000000)
                {
                    Object obj = findViewByPosition(mPendingScrollPosition);
                    j = j1;
                    k = i1;
                    if (obj != null)
                    {
                        int k1;
                        if (mShouldReverseLayout)
                        {
                            j = mOrientationHelper.d() - mOrientationHelper.b(((View) (obj))) - mPendingScrollPositionOffset;
                        } else
                        {
                            j = mOrientationHelper.a(((View) (obj)));
                            k = mOrientationHelper.c();
                            j = mPendingScrollPositionOffset - (j - k);
                        }
                        if (j > 0)
                        {
                            k = i1 + j;
                            j = j1;
                        } else
                        {
                            j = j1 - j;
                            k = i1;
                        }
                    }
                }
            }
        }
        onAnchorReady(o, s, mAnchorInfo);
        detachAndScrapAttachedViews(o);
        mLayoutState.i = s.a();
        if (mAnchorInfo.c)
        {
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.h = k;
            fill(o, mLayoutState, s, false);
            i1 = mLayoutState.b;
            k1 = mLayoutState.d;
            k = j;
            if (mLayoutState.c > 0)
            {
                k = j + mLayoutState.c;
            }
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.h = k;
            obj = mLayoutState;
            obj.d = ((c) (obj)).d + mLayoutState.e;
            fill(o, mLayoutState, s, false);
            j1 = mLayoutState.b;
            j = j1;
            k = i1;
            if (mLayoutState.c > 0)
            {
                j = mLayoutState.c;
                updateLayoutStateToFillStart(k1, i1);
                mLayoutState.h = j;
                fill(o, mLayoutState, s, false);
                k = mLayoutState.b;
                j = j1;
            }
        } else
        {
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.h = j;
            fill(o, mLayoutState, s, false);
            i1 = mLayoutState.b;
            int l1 = mLayoutState.d;
            j = k;
            if (mLayoutState.c > 0)
            {
                j = k + mLayoutState.c;
            }
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.h = j;
            c c1 = mLayoutState;
            c1.d = c1.d + mLayoutState.e;
            fill(o, mLayoutState, s, false);
            j1 = mLayoutState.b;
            j = i1;
            k = j1;
            if (mLayoutState.c > 0)
            {
                j = mLayoutState.c;
                updateLayoutStateToFillEnd(l1, i1);
                mLayoutState.h = j;
                fill(o, mLayoutState, s, false);
                j = mLayoutState.b;
                k = j1;
            }
        }
        i1 = j;
        j1 = k;
        if (getChildCount() > 0)
        {
            if (mShouldReverseLayout ^ mStackFromEnd)
            {
                i1 = fixLayoutEndGap(j, o, s, true);
                j1 = k + i1;
                k = fixLayoutStartGap(j1, o, s, false);
                j1 += k;
                i1 = j + i1 + k;
            } else
            {
                i1 = fixLayoutStartGap(k, o, s, true);
                j += i1;
                int i2 = fixLayoutEndGap(j, o, s, false);
                j1 = k + i1 + i2;
                i1 = j + i2;
            }
        }
        layoutForPredictiveAnimations(o, s, j1, i1);
        if (!s.a())
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            mOrientationHelper.a();
        }
        mLastStackFromEnd = mStackFromEnd;
        mPendingSavedState = null;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            mPendingSavedState = (SavedState)parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        if (mPendingSavedState != null)
        {
            return new SavedState(mPendingSavedState);
        }
        SavedState savedstate = new SavedState();
        if (getChildCount() > 0)
        {
            ensureLayoutState();
            boolean flag = mLastStackFromEnd ^ mShouldReverseLayout;
            savedstate.c = flag;
            if (flag)
            {
                View view = getChildClosestToEnd();
                savedstate.b = mOrientationHelper.d() - mOrientationHelper.b(view);
                savedstate.a = getPosition(view);
                return savedstate;
            } else
            {
                View view1 = getChildClosestToStart();
                savedstate.a = getPosition(view1);
                savedstate.b = mOrientationHelper.a(view1) - mOrientationHelper.c();
                return savedstate;
            }
        } else
        {
            savedstate.a = -1;
            return savedstate;
        }
    }

    public void prepareForDrop(View view, View view1, int j, int k)
    {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        j = getPosition(view);
        k = getPosition(view1);
        if (j < k)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        if (mShouldReverseLayout)
        {
            if (j == 1)
            {
                scrollToPositionWithOffset(k, mOrientationHelper.d() - (mOrientationHelper.a(view1) + mOrientationHelper.c(view)));
                return;
            } else
            {
                scrollToPositionWithOffset(k, mOrientationHelper.d() - mOrientationHelper.b(view1));
                return;
            }
        }
        if (j == -1)
        {
            scrollToPositionWithOffset(k, mOrientationHelper.a(view1));
            return;
        } else
        {
            scrollToPositionWithOffset(k, mOrientationHelper.b(view1) - mOrientationHelper.c(view));
            return;
        }
    }

    int scrollBy(int j, RecyclerView.o o, RecyclerView.s s)
    {
        if (getChildCount() != 0 && j != 0)
        {
            mLayoutState.a = true;
            ensureLayoutState();
            int k;
            int i1;
            int j1;
            if (j > 0)
            {
                k = 1;
            } else
            {
                k = -1;
            }
            i1 = Math.abs(j);
            updateLayoutState(k, i1, true, s);
            j1 = mLayoutState.g + fill(o, mLayoutState, s, false);
            if (j1 >= 0)
            {
                if (i1 > j1)
                {
                    j = k * j1;
                }
                mOrientationHelper.a(-j);
                mLayoutState.j = j;
                return j;
            }
        }
        return 0;
    }

    public int scrollHorizontallyBy(int j, RecyclerView.o o, RecyclerView.s s)
    {
        if (mOrientation == 1)
        {
            return 0;
        } else
        {
            return scrollBy(j, o, s);
        }
    }

    public void scrollToPosition(int j)
    {
        mPendingScrollPosition = j;
        mPendingScrollPositionOffset = 0x80000000;
        if (mPendingSavedState != null)
        {
            mPendingSavedState.a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int j, int k)
    {
        mPendingScrollPosition = j;
        mPendingScrollPositionOffset = k;
        if (mPendingSavedState != null)
        {
            mPendingSavedState.a = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int j, RecyclerView.o o, RecyclerView.s s)
    {
        if (mOrientation == 0)
        {
            return 0;
        } else
        {
            return scrollBy(j, o, s);
        }
    }

    public void setOrientation(int j)
    {
        if (j != 0 && j != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid orientation:")).append(j).toString());
        }
        assertNotInLayoutOrScroll(null);
        if (j == mOrientation)
        {
            return;
        } else
        {
            mOrientation = j;
            mOrientationHelper = null;
            requestLayout();
            return;
        }
    }

    public void setRecycleChildrenOnDetach(boolean flag)
    {
        mRecycleChildrenOnDetach = flag;
    }

    public void setReverseLayout(boolean flag)
    {
        assertNotInLayoutOrScroll(null);
        if (flag == mReverseLayout)
        {
            return;
        } else
        {
            mReverseLayout = flag;
            requestLayout();
            return;
        }
    }

    public void setSmoothScrollbarEnabled(boolean flag)
    {
        mSmoothScrollbarEnabled = flag;
    }

    public void setStackFromEnd(boolean flag)
    {
        assertNotInLayoutOrScroll(null);
        if (mStackFromEnd == flag)
        {
            return;
        } else
        {
            mStackFromEnd = flag;
            requestLayout();
            return;
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.s s, int j)
    {
        recyclerview = new i(recyclerview.getContext()) {

            final LinearLayoutManager a;

            public final PointF a(int k)
            {
                return a.computeScrollVectorForPosition(k);
            }

            
            {
                a = LinearLayoutManager.this;
                super(context);
            }
        };
        recyclerview.b(j);
        startSmoothScroll(recyclerview);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null && mLastStackFromEnd == mStackFromEnd;
    }

    void validateChildOrder()
    {
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        (new StringBuilder("validating child count ")).append(getChildCount());
        if (getChildCount() > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        int j1;
        i1 = getPosition(getChildAt(0));
        j1 = mOrientationHelper.a(getChildAt(0));
        if (!mShouldReverseLayout)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = 1;
        while (j < getChildCount()) 
        {
            View view = getChildAt(j);
            int k1 = getPosition(view);
            int i2 = mOrientationHelper.a(view);
            if (k1 < i1)
            {
                logChildren();
                StringBuilder stringbuilder = new StringBuilder("detected invalid position. loc invalid? ");
                if (i2 >= j1)
                {
                    flag = false;
                }
                throw new RuntimeException(stringbuilder.append(flag).toString());
            }
            if (i2 > j1)
            {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
            j++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k = 1;
        while (k < getChildCount()) 
        {
            View view1 = getChildAt(k);
            int l1 = getPosition(view1);
            int j2 = mOrientationHelper.a(view1);
            if (l1 < i1)
            {
                logChildren();
                StringBuilder stringbuilder1 = new StringBuilder("detected invalid position. loc invalid? ");
                boolean flag1;
                if (j2 < j1)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                throw new RuntimeException(stringbuilder1.append(flag1).toString());
            }
            if (j2 < j1)
            {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
            k++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
