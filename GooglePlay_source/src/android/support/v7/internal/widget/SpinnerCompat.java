// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat, AdapterViewCompat

final class SpinnerCompat extends AbsSpinnerCompat
    implements android.content.DialogInterface.OnClickListener
{
    static class SavedState extends AbsSpinnerCompat.SavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        boolean showDropdown;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (showDropdown)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            showDropdown = flag;
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private static interface SpinnerPopup
    {

        public abstract void dismiss();

        public abstract boolean isShowing();

        public abstract void show();
    }


    private boolean mDisableChildrenWhenDisabled;
    private android.support.v7.widget.ListPopupWindow.ForwardingListener mForwardingListener;
    private int mGravity;
    private SpinnerPopup mPopup;
    private Rect mTempRect;

    private View makeView(int i, boolean flag)
    {
        if (!mDataChanged)
        {
            View view = mRecycler.get(i);
            if (view != null)
            {
                setUpChild(view, flag);
                return view;
            }
        }
        View view1 = mAdapter.getView(i, null, this);
        setUpChild(view1, flag);
        return view1;
    }

    private void setUpChild(View view, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        if (flag)
        {
            addViewInLayout(view, 0, layoutparams);
        }
        view.setSelected(hasFocus());
        if (mDisableChildrenWhenDisabled)
        {
            view.setEnabled(isEnabled());
        }
        int i = ViewGroup.getChildMeasureSpec(mHeightMeasureSpec, mSpinnerPadding.top + mSpinnerPadding.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(mWidthMeasureSpec, mSpinnerPadding.left + mSpinnerPadding.right, layoutparams.width), i);
        i = mSpinnerPadding.top + (getMeasuredHeight() - mSpinnerPadding.bottom - mSpinnerPadding.top - view.getMeasuredHeight()) / 2;
        int j = view.getMeasuredHeight();
        view.layout(0, i, view.getMeasuredWidth() + 0, i + j);
    }

    public final int getBaseline()
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = null;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        int i = byte0;
        if (view != null)
        {
            int j = view.getBaseline();
            i = byte0;
            if (j >= 0)
            {
                i = view.getTop() + j;
            }
        }
        return i;
_L2:
        view = obj;
        if (mAdapter != null)
        {
            view = obj;
            if (mAdapter.getCount() > 0)
            {
                view = makeView(0, false);
                mRecycler.put(0, view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        setSelection(i);
        dialoginterface.dismiss();
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mPopup != null && mPopup.isShowing())
        {
            mPopup.dismiss();
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mInLayout = true;
        j = mSpinnerPadding.left;
        k = getRight() - getLeft() - mSpinnerPadding.left - mSpinnerPadding.right;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        if (mItemCount != 0) goto _L2; else goto _L1
_L1:
        resetList();
_L8:
        mInLayout = false;
        return;
_L2:
        if (mNextSelectedPosition >= 0)
        {
            setSelectedPositionInt(mNextSelectedPosition);
        }
        l = getChildCount();
        AbsSpinnerCompat.RecycleBin recyclebin = super.mRecycler;
        int i1 = super.mFirstPosition;
        for (i = 0; i < l; i++)
        {
            recyclebin.put(i1 + i, getChildAt(i));
        }

        removeAllViewsInLayout();
        mFirstPosition = mSelectedPosition;
        if (mAdapter == null) goto _L4; else goto _L3
_L3:
        View view;
        view = makeView(mSelectedPosition, true);
        i = view.getMeasuredWidth();
        l = ViewCompat.getLayoutDirection(this);
        GravityCompat.getAbsoluteGravity(mGravity, l) & 7;
        JVM INSTR lookupswitch 2: default 220
    //                   1: 264
    //                   5: 278;
           goto _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_278;
_L5:
        i = j;
_L9:
        view.offsetLeftAndRight(i);
_L4:
        mRecycler.clear();
        invalidate();
        checkSelectionChanged();
        mDataChanged = false;
        mNeedSync = false;
        setNextSelectedPositionInt(mSelectedPosition);
          goto _L8
_L6:
        i = (j + k / 2) - i / 2;
          goto _L9
        i = (j + k) - i;
          goto _L9
    }

    protected final void onMeasure(int i, int j)
    {
        boolean flag;
        flag = false;
        super.onMeasure(i, j);
        if (mPopup == null || android.view.View.MeasureSpec.getMode(i) != 0x80000000) goto _L2; else goto _L1
_L1:
        SpinnerAdapter spinneradapter;
        Drawable drawable;
        int j1;
        j1 = getMeasuredWidth();
        spinneradapter = super.mAdapter;
        drawable = getBackground();
        if (spinneradapter != null) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
_L6:
        setMeasuredDimension(Math.min(Math.max(j1, j), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
_L2:
        return;
_L4:
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j = Math.max(0, super.mNextSelectedPosition);
        int i2 = Math.min(spinneradapter.getCount(), j + 15);
        int l = Math.max(0, j - (15 - (i2 - j)));
        View view = null;
        j = 0;
        int k = 0;
        for (; l < i2; l++)
        {
            int i1 = spinneradapter.getItemViewType(l);
            if (i1 != k)
            {
                view = null;
                k = i1;
            }
            view = spinneradapter.getView(l, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(k1, l1);
            j = Math.max(j, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(mTempRect);
            j = mTempRect.left + mTempRect.right + j;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).showDropdown)
        {
            parcelable = getViewTreeObserver();
            if (parcelable != null)
            {
                parcelable.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final SpinnerCompat this$0;

                    public final void onGlobalLayout()
                    {
                        if (!mPopup.isShowing())
                        {
                            mPopup.show();
                        }
                        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
                        if (viewtreeobserver != null)
                        {
                            viewtreeobserver.removeGlobalOnLayoutListener(this);
                        }
                    }

            
            {
                this$0 = SpinnerCompat.this;
                super();
            }
                });
            }
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (mPopup != null && mPopup.isShowing())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        savedstate.showDropdown = flag;
        return savedstate;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mForwardingListener != null && mForwardingListener.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final boolean performClick()
    {
        boolean flag1 = super.performClick();
        boolean flag = flag1;
        if (!flag1)
        {
            boolean flag2 = true;
            flag = flag2;
            if (!mPopup.isShowing())
            {
                mPopup.show();
                flag = flag2;
            }
        }
        return flag;
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        if (mDisableChildrenWhenDisabled)
        {
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                getChildAt(i).setEnabled(flag);
            }

        }
    }

}
