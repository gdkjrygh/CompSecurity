// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat, TintTypedArray, TintManager

class SpinnerCompat extends AbsSpinnerCompat
    implements android.content.DialogInterface.OnClickListener
{
    private class DialogPopup
        implements android.content.DialogInterface.OnClickListener, SpinnerPopup
    {

        private ListAdapter mListAdapter;
        private AlertDialog mPopup;
        private CharSequence mPrompt;
        final SpinnerCompat this$0;

        public void dismiss()
        {
            if (mPopup != null)
            {
                mPopup.dismiss();
                mPopup = null;
            }
        }

        public boolean isShowing()
        {
            if (mPopup != null)
            {
                return mPopup.isShowing();
            } else
            {
                return false;
            }
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
            setSelection(i);
            if (mOnItemClickListener != null)
            {
                performItemClick(null, i, mListAdapter.getItemId(i));
            }
            dismiss();
        }

        public void setAdapter(ListAdapter listadapter)
        {
            mListAdapter = listadapter;
        }

        public void setPromptText(CharSequence charsequence)
        {
            mPrompt = charsequence;
        }

        public void show()
        {
            if (mListAdapter == null)
            {
                return;
            }
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
            if (mPrompt != null)
            {
                builder.setTitle(mPrompt);
            }
            mPopup = builder.setSingleChoiceItems(mListAdapter, getSelectedItemPosition(), this).create();
            mPopup.show();
        }

        private DialogPopup()
        {
            this$0 = SpinnerCompat.this;
            super();
        }

    }

    private static class DropDownAdapter
        implements ListAdapter, SpinnerAdapter
    {

        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public boolean areAllItemsEnabled()
        {
            ListAdapter listadapter = mListAdapter;
            if (listadapter != null)
            {
                return listadapter.areAllItemsEnabled();
            } else
            {
                return true;
            }
        }

        public int getCount()
        {
            if (mAdapter == null)
            {
                return 0;
            } else
            {
                return mAdapter.getCount();
            }
        }

        public View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            if (mAdapter == null)
            {
                return null;
            } else
            {
                return mAdapter.getDropDownView(i, view, viewgroup);
            }
        }

        public Object getItem(int i)
        {
            if (mAdapter == null)
            {
                return null;
            } else
            {
                return mAdapter.getItem(i);
            }
        }

        public long getItemId(int i)
        {
            if (mAdapter == null)
            {
                return -1L;
            } else
            {
                return mAdapter.getItemId(i);
            }
        }

        public int getItemViewType(int i)
        {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            return getDropDownView(i, view, viewgroup);
        }

        public int getViewTypeCount()
        {
            return 1;
        }

        public boolean hasStableIds()
        {
            return mAdapter != null && mAdapter.hasStableIds();
        }

        public boolean isEmpty()
        {
            return getCount() == 0;
        }

        public boolean isEnabled(int i)
        {
            ListAdapter listadapter = mListAdapter;
            if (listadapter != null)
            {
                return listadapter.isEnabled(i);
            } else
            {
                return true;
            }
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            if (mAdapter != null)
            {
                mAdapter.registerDataSetObserver(datasetobserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            if (mAdapter != null)
            {
                mAdapter.unregisterDataSetObserver(datasetobserver);
            }
        }

        public DropDownAdapter(SpinnerAdapter spinneradapter)
        {
            mAdapter = spinneradapter;
            if (spinneradapter instanceof ListAdapter)
            {
                mListAdapter = (ListAdapter)spinneradapter;
            }
        }
    }

    private class DropdownPopup extends ListPopupWindow
        implements SpinnerPopup
    {

        private ListAdapter mAdapter;
        private CharSequence mHintText;
        final SpinnerCompat this$0;

        public void setAdapter(ListAdapter listadapter)
        {
            super.setAdapter(listadapter);
            mAdapter = listadapter;
        }

        public void setPromptText(CharSequence charsequence)
        {
            mHintText = charsequence;
        }


        public DropdownPopup(Context context, AttributeSet attributeset, int i)
        {
            this$0 = SpinnerCompat.this;
            super(context, attributeset, i);
            setAnchorView(SpinnerCompat.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new _cls1());
        }
    }

    static class SavedState extends AbsSpinnerCompat.SavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
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


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private static interface SpinnerPopup
    {

        public abstract void dismiss();

        public abstract boolean isShowing();

        public abstract void setAdapter(ListAdapter listadapter);

        public abstract void setPromptText(CharSequence charsequence);

        public abstract void show();
    }


    private boolean mDisableChildrenWhenDisabled;
    int mDropDownWidth;
    private android.support.v7.widget.ListPopupWindow.ForwardingListener mForwardingListener;
    private int mGravity;
    private SpinnerPopup mPopup;
    private DropDownAdapter mTempAdapter;
    private Rect mTempRect;
    private final TintManager mTintManager;

    SpinnerCompat(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, -1);
    }

    SpinnerCompat(Context context, AttributeSet attributeset, int i, int j)
    {
        TintTypedArray tinttypedarray;
        int k;
        super(context, attributeset, i);
        mTempRect = new Rect();
        tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
        if (tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.Spinner_android_background))
        {
            setBackgroundDrawable(tinttypedarray.getDrawable(android.support.v7.appcompat.R.styleable.Spinner_android_background));
        }
        k = j;
        if (j == -1)
        {
            k = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.Spinner_spinnerMode, 0);
        }
        k;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 184
    //                   1 200;
           goto _L1 _L2 _L3
_L1:
        mGravity = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.Spinner_android_gravity, 17);
        mPopup.setPromptText(tinttypedarray.getString(android.support.v7.appcompat.R.styleable.Spinner_prompt));
        mDisableChildrenWhenDisabled = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.Spinner_disableChildrenWhenDisabled, false);
        tinttypedarray.recycle();
        if (mTempAdapter != null)
        {
            mPopup.setAdapter(mTempAdapter);
            mTempAdapter = null;
        }
        mTintManager = tinttypedarray.getTintManager();
        return;
_L2:
        mPopup = new DialogPopup();
        continue; /* Loop/switch isn't completed */
_L3:
        context = new DropdownPopup(context, attributeset, i);
        mDropDownWidth = tinttypedarray.getLayoutDimension(android.support.v7.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
        context.setBackgroundDrawable(tinttypedarray.getDrawable(android.support.v7.appcompat.R.styleable.Spinner_android_popupBackground));
        mPopup = context;
        mForwardingListener = new android.support.v7.widget.ListPopupWindow.ForwardingListener(context) {

            final SpinnerCompat this$0;
            final DropdownPopup val$popup;

            public ListPopupWindow getPopup()
            {
                return popup;
            }

            public boolean onForwardingStarted()
            {
                if (!mPopup.isShowing())
                {
                    mPopup.show();
                }
                return true;
            }

            
            {
                this$0 = SpinnerCompat.this;
                popup = dropdownpopup;
                super(final_view);
            }
        };
        if (true) goto _L1; else goto _L4
_L4:
    }

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
        view.layout(0, i, 0 + view.getMeasuredWidth(), i + j);
    }

    public int getBaseline()
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

    void layout(int i, boolean flag)
    {
        int j;
        int k;
        j = mSpinnerPadding.left;
        k = getRight() - getLeft() - mSpinnerPadding.left - mSpinnerPadding.right;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        if (mItemCount == 0)
        {
            resetList();
            return;
        }
        if (mNextSelectedPosition >= 0)
        {
            setSelectedPositionInt(mNextSelectedPosition);
        }
        recycleAllViews();
        removeAllViewsInLayout();
        mFirstPosition = mSelectedPosition;
        if (mAdapter == null) goto _L2; else goto _L1
_L1:
        View view;
        int l;
        int i1;
        view = makeView(mSelectedPosition, true);
        l = view.getMeasuredWidth();
        i = j;
        i1 = ViewCompat.getLayoutDirection(this);
        GravityCompat.getAbsoluteGravity(mGravity, i1) & 7;
        JVM INSTR lookupswitch 2: default 160
    //                   1: 199
    //                   5: 215;
           goto _L3 _L4 _L5
_L3:
        view.offsetLeftAndRight(i);
_L2:
        mRecycler.clear();
        invalidate();
        checkSelectionChanged();
        mDataChanged = false;
        mNeedSync = false;
        setNextSelectedPositionInt(mSelectedPosition);
        return;
_L4:
        i = (k / 2 + j) - l / 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i = (j + k) - l;
        if (true) goto _L3; else goto _L6
_L6:
    }

    int measureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        int j;
        if (spinneradapter == null)
        {
            j = 0;
        } else
        {
            int i = 0;
            View view = null;
            int k = 0;
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            j = Math.max(0, getSelectedItemPosition());
            int l1 = Math.min(spinneradapter.getCount(), j + 15);
            for (j = Math.max(0, j - (15 - (l1 - j))); j < l1;)
            {
                int i1 = spinneradapter.getItemViewType(j);
                int l = k;
                if (i1 != k)
                {
                    l = i1;
                    view = null;
                }
                view = spinneradapter.getView(j, view, this);
                if (view.getLayoutParams() == null)
                {
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(j1, k1);
                i = Math.max(i, view.getMeasuredWidth());
                j++;
                k = l;
            }

            j = i;
            if (drawable != null)
            {
                drawable.getPadding(mTempRect);
                return i + (mTempRect.left + mTempRect.right);
            }
        }
        return j;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        setSelection(i);
        dialoginterface.dismiss();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mPopup != null && mPopup.isShowing())
        {
            mPopup.dismiss();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mInLayout = true;
        layout(0, false);
        mInLayout = false;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (mPopup != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
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

                    public void onGlobalLayout()
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

    public Parcelable onSaveInstanceState()
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

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mForwardingListener != null && mForwardingListener.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean performClick()
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

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        super.setAdapter(spinneradapter);
        mRecycler.clear();
        if (getContext().getApplicationInfo().targetSdkVersion >= 21 && spinneradapter != null && spinneradapter.getViewTypeCount() != 1)
        {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        if (mPopup != null)
        {
            mPopup.setAdapter(new DropDownAdapter(spinneradapter));
            return;
        } else
        {
            mTempAdapter = new DropDownAdapter(spinneradapter);
            return;
        }
    }

    public void setEnabled(boolean flag)
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

    public void setOnItemClickListener(AdapterViewCompat.OnItemClickListener onitemclicklistener)
    {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    void setOnItemClickListenerInt(AdapterViewCompat.OnItemClickListener onitemclicklistener)
    {
        super.setOnItemClickListener(onitemclicklistener);
    }


    // Unreferenced inner class android/support/v7/internal/widget/SpinnerCompat$DropdownPopup$1

/* anonymous class */
    class DropdownPopup._cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final DropdownPopup this$1;
        final SpinnerCompat val$this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            setSelection(i);
            if (mOnItemClickListener != null)
            {
                performItemClick(view, i, mAdapter.getItemId(i));
            }
            dismiss();
        }

            
            {
                this$1 = final_dropdownpopup;
                this$0 = SpinnerCompat.this;
                super();
            }
    }

}
