// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat, TintTypedArray, TintManager, ViewUtils

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

        public Drawable getBackground()
        {
            return null;
        }

        public CharSequence getHintText()
        {
            return mPrompt;
        }

        public int getHorizontalOffset()
        {
            return 0;
        }

        public int getVerticalOffset()
        {
            return 0;
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

        public void setBackgroundDrawable(Drawable drawable)
        {
            Log.e("Spinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void setHorizontalOffset(int i)
        {
            Log.e("Spinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void setPromptText(CharSequence charsequence)
        {
            mPrompt = charsequence;
        }

        public void setVerticalOffset(int i)
        {
            Log.e("Spinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
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

        void computeContentWidth()
        {
            Drawable drawable = getBackground();
            int i;
            int l;
            int i1;
            int j1;
            if (drawable != null)
            {
                drawable.getPadding(mTempRect);
                int j;
                int k;
                if (ViewUtils.isLayoutRtl(SpinnerCompat.this))
                {
                    i = mTempRect.right;
                } else
                {
                    i = -mTempRect.left;
                }
            } else
            {
                Rect rect = mTempRect;
                mTempRect.right = 0;
                rect.left = 0;
                i = 0;
            }
            l = getPaddingLeft();
            i1 = getPaddingRight();
            j1 = getWidth();
            if (mDropDownWidth == -2)
            {
                j = measureContentWidth((SpinnerAdapter)mAdapter, getBackground());
                k = getContext().getResources().getDisplayMetrics().widthPixels - mTempRect.left - mTempRect.right;
                if (j > k)
                {
                    j = k;
                }
                setContentWidth(Math.max(j, j1 - l - i1));
            } else
            if (mDropDownWidth == -1)
            {
                setContentWidth(j1 - l - i1);
            } else
            {
                setContentWidth(mDropDownWidth);
            }
            if (ViewUtils.isLayoutRtl(SpinnerCompat.this))
            {
                i = (j1 - i1 - getWidth()) + i;
            } else
            {
                i += l;
            }
            setHorizontalOffset(i);
        }

        public CharSequence getHintText()
        {
            return mHintText;
        }

        public void setAdapter(ListAdapter listadapter)
        {
            super.setAdapter(listadapter);
            mAdapter = listadapter;
        }

        public void setPromptText(CharSequence charsequence)
        {
            mHintText = charsequence;
        }

        public void show(int i, int j)
        {
            boolean flag = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(getSelectedItemPosition());
            ViewTreeObserver viewtreeobserver;
            if (!flag)
            {
                if ((viewtreeobserver = getViewTreeObserver()) != null)
                {
                    android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                        final DropdownPopup this$1;

                        public void onGlobalLayout()
                        {
                            computeContentWidth();
                            show();
                        }

            
            {
                this$1 = DropdownPopup.this;
                super();
            }
                    };
                    viewtreeobserver.addOnGlobalLayoutListener(ongloballayoutlistener);
                    setOnDismissListener(ongloballayoutlistener. new android.widget.PopupWindow.OnDismissListener() {

                        final DropdownPopup this$1;
                        final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

                        public void onDismiss()
                        {
                            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
                            if (viewtreeobserver != null)
                            {
                                viewtreeobserver.removeGlobalOnLayoutListener(layoutListener);
                            }
                        }

            
            {
                this$1 = final_dropdownpopup;
                layoutListener = android.view.ViewTreeObserver.OnGlobalLayoutListener.this;
                super();
            }
                    });
                    return;
                }
            }
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

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
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

        /* block-local class not found */
        class _cls1 {}

    }

    private static interface SpinnerPopup
    {

        public abstract void dismiss();

        public abstract Drawable getBackground();

        public abstract CharSequence getHintText();

        public abstract int getHorizontalOffset();

        public abstract int getVerticalOffset();

        public abstract boolean isShowing();

        public abstract void setAdapter(ListAdapter listadapter);

        public abstract void setBackgroundDrawable(Drawable drawable);

        public abstract void setHorizontalOffset(int i);

        public abstract void setPromptText(CharSequence charsequence);

        public abstract void setVerticalOffset(int i);

        public abstract void show();
    }


    private static final int MAX_ITEMS_MEASURED = 15;
    public static final int MODE_DIALOG = 0;
    public static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "Spinner";
    private boolean mDisableChildrenWhenDisabled;
    int mDropDownWidth;
    private android.support.v7.widget.ListPopupWindow.ForwardingListener mForwardingListener;
    private int mGravity;
    private SpinnerPopup mPopup;
    private DropDownAdapter mTempAdapter;
    private Rect mTempRect;
    private final TintManager mTintManager;

    SpinnerCompat(Context context)
    {
        this(context, ((AttributeSet) (null)));
    }

    SpinnerCompat(Context context, int i)
    {
        this(context, null, android.support.v7.appcompat.R.attr.spinnerStyle, i);
    }

    SpinnerCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.spinnerStyle);
    }

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
        setBackgroundDrawable(tinttypedarray.getDrawable(android.support.v7.appcompat.R.styleable.Spinner_android_background));
        k = j;
        if (j == -1)
        {
            k = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.Spinner_spinnerMode, 0);
        }
        k;
        JVM INSTR tableswitch 0 1: default 88
    //                   0 172
    //                   1 188;
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
        view.layout(0, i, view.getMeasuredWidth() + 0, j + i);
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

    public int getDropDownHorizontalOffset()
    {
        return mPopup.getHorizontalOffset();
    }

    public int getDropDownVerticalOffset()
    {
        return mPopup.getVerticalOffset();
    }

    public int getDropDownWidth()
    {
        return mDropDownWidth;
    }

    public Drawable getPopupBackground()
    {
        return mPopup.getBackground();
    }

    public CharSequence getPrompt()
    {
        return mPopup.getHintText();
    }

    void layout(int i, boolean flag)
    {
        int j;
        i = mSpinnerPadding.left;
        j = getRight() - getLeft() - mSpinnerPadding.left - mSpinnerPadding.right;
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
        int k;
        int l;
        view = makeView(mSelectedPosition, true);
        k = view.getMeasuredWidth();
        l = ViewCompat.getLayoutDirection(this);
        GravityCompat.getAbsoluteGravity(mGravity, l) & 7;
        JVM INSTR lookupswitch 2: default 156
    //                   1: 195
    //                   5: 210;
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
        i = (i + j / 2) - k / 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i = (i + j) - k;
        if (true) goto _L3; else goto _L6
_L6:
    }

    int measureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = Math.max(0, getSelectedItemPosition());
        int k1 = Math.min(spinneradapter.getCount(), i + 15);
        int j = Math.max(0, i - (15 - (k1 - i)));
        View view = null;
        int k = 0;
        i = 0;
        for (; j < k1; j++)
        {
            int l = spinneradapter.getItemViewType(j);
            if (l != i)
            {
                view = null;
                i = l;
            }
            view = spinneradapter.getView(j, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(i1, j1);
            k = Math.max(k, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(mTempRect);
            return mTempRect.left + mTempRect.right + k;
        } else
        {
            return k;
        }
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

    public void setDropDownHorizontalOffset(int i)
    {
        mPopup.setHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i)
    {
        mPopup.setVerticalOffset(i);
    }

    public void setDropDownWidth(int i)
    {
        if (!(mPopup instanceof DropdownPopup))
        {
            Log.e("Spinner", "Cannot set dropdown width for MODE_DIALOG, ignoring");
            return;
        } else
        {
            mDropDownWidth = i;
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

    public void setGravity(int i)
    {
        if (mGravity != i)
        {
            int j = i;
            if ((i & 7) == 0)
            {
                j = i | 0x800003;
            }
            mGravity = j;
            requestLayout();
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

    public void setPopupBackgroundDrawable(Drawable drawable)
    {
        if (!(mPopup instanceof DropdownPopup))
        {
            Log.e("Spinner", "setPopupBackgroundDrawable: incompatible spinner mode; ignoring...");
            return;
        } else
        {
            ((DropdownPopup)mPopup).setBackgroundDrawable(drawable);
            return;
        }
    }

    public void setPopupBackgroundResource(int i)
    {
        setPopupBackgroundDrawable(mTintManager.getDrawable(i));
    }

    public void setPrompt(CharSequence charsequence)
    {
        mPopup.setPromptText(charsequence);
    }

    public void setPromptId(int i)
    {
        setPrompt(getContext().getText(i));
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
