// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.ContextThemeWrapper;
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
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            TintTypedArray, AppCompatBackgroundHelper, TintManager, ThemedSpinnerAdapter, 
//            ListPopupWindow, ViewUtils

public class AppCompatSpinner extends Spinner
    implements TintableBackgroundView
{
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

        public DropDownAdapter(SpinnerAdapter spinneradapter, android.content.res.Resources.Theme theme)
        {
            mAdapter = spinneradapter;
            if (spinneradapter instanceof ListAdapter)
            {
                mListAdapter = (ListAdapter)spinneradapter;
            }
            if (theme != null)
            {
                if (AppCompatSpinner.IS_AT_LEAST_M && (spinneradapter instanceof ThemedSpinnerAdapter))
                {
                    spinneradapter = (ThemedSpinnerAdapter)spinneradapter;
                    if (spinneradapter.getDropDownViewTheme() != theme)
                    {
                        spinneradapter.setDropDownViewTheme(theme);
                    }
                } else
                if (spinneradapter instanceof android.support.v7.widget.ThemedSpinnerAdapter)
                {
                    spinneradapter = (android.support.v7.widget.ThemedSpinnerAdapter)spinneradapter;
                    if (spinneradapter.getDropDownViewTheme() == null)
                    {
                        spinneradapter.setDropDownViewTheme(theme);
                        return;
                    }
                }
            }
        }
    }

    private class DropdownPopup extends ListPopupWindow
    {

        private ListAdapter mAdapter;
        private CharSequence mHintText;
        private final Rect mVisibleRect = new Rect();
        final AppCompatSpinner this$0;

        private boolean isVisibleToUser(View view)
        {
            return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(mVisibleRect);
        }

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
                if (ViewUtils.isLayoutRtl(AppCompatSpinner.this))
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
                j = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
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
            if (ViewUtils.isLayoutRtl(AppCompatSpinner.this))
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

        public void show()
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
                            if (!isVisibleToUser(_fld0))
                            {
                                dismiss();
                                return;
                            } else
                            {
                                computeContentWidth();
                                show();
                                return;
                            }
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
            this$0 = AppCompatSpinner.this;
            super(context, attributeset, i);
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new _cls1());
        }
    }


    private static final int ATTRS_ANDROID_SPINNERMODE[] = {
        0x10102f1
    };
    private static final boolean IS_AT_LEAST_JB;
    private static final boolean IS_AT_LEAST_M;
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private AppCompatBackgroundHelper mBackgroundTintHelper;
    private int mDropDownWidth;
    private ListPopupWindow.ForwardingListener mForwardingListener;
    private DropdownPopup mPopup;
    private Context mPopupContext;
    private boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    private final Rect mTempRect;
    private TintManager mTintManager;

    public AppCompatSpinner(Context context)
    {
        this(context, ((AttributeSet) (null)));
    }

    public AppCompatSpinner(Context context, int i)
    {
        this(context, null, android.support.v7.appcompat.R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset, int i, int j)
    {
        this(context, attributeset, i, j, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset, int i, int j, android.content.res.Resources.Theme theme)
    {
        int i1;
        super(context, attributeset, i);
        mTempRect = new Rect();
        TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
        mTintManager = tinttypedarray.getTintManager();
        mBackgroundTintHelper = new AppCompatBackgroundHelper(this, mTintManager);
        int k;
        if (theme != null)
        {
            mPopupContext = new ContextThemeWrapper(context, theme);
        } else
        {
            int l = tinttypedarray.getResourceId(android.support.v7.appcompat.R.styleable.Spinner_popupTheme, 0);
            if (l != 0)
            {
                mPopupContext = new ContextThemeWrapper(context, l);
            } else
            {
                if (!IS_AT_LEAST_M)
                {
                    theme = context;
                } else
                {
                    theme = null;
                }
                mPopupContext = theme;
            }
        }
        if (mPopupContext == null) goto _L2; else goto _L1
_L1:
        i1 = j;
        if (j != -1) goto _L4; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L6; else goto _L5
_L5:
        theme = context.obtainStyledAttributes(attributeset, ATTRS_ANDROID_SPINNERMODE, i, 0);
        k = j;
        context = theme;
        if (!theme.hasValue(0))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        context = theme;
        k = theme.getInt(0, 0);
        i1 = k;
        if (theme != null)
        {
            theme.recycle();
            i1 = k;
        }
_L4:
        if (i1 == 1)
        {
            context = new DropdownPopup(mPopupContext, attributeset, i);
            theme = TintTypedArray.obtainStyledAttributes(mPopupContext, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
            mDropDownWidth = theme.getLayoutDimension(android.support.v7.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
            context.setBackgroundDrawable(theme.getDrawable(android.support.v7.appcompat.R.styleable.Spinner_android_popupBackground));
            context.setPromptText(tinttypedarray.getString(android.support.v7.appcompat.R.styleable.Spinner_android_prompt));
            theme.recycle();
            mPopup = context;
            mForwardingListener = new ListPopupWindow.ForwardingListener(context) {

                final AppCompatSpinner this$0;
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
                this$0 = AppCompatSpinner.this;
                popup = dropdownpopup;
                super(final_view);
            }
            };
        }
_L2:
        tinttypedarray.recycle();
        mPopupSet = true;
        if (mTempAdapter != null)
        {
            setAdapter(mTempAdapter);
            mTempAdapter = null;
        }
        mBackgroundTintHelper.loadFromAttributes(attributeset, i);
        return;
        Exception exception;
        exception;
        theme = null;
_L8:
        context = theme;
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception);
        i1 = j;
        if (theme != null)
        {
            theme.recycle();
            i1 = j;
        }
          goto _L4
        attributeset;
        context = null;
_L7:
        if (context != null)
        {
            context.recycle();
        }
        throw attributeset;
_L6:
        i1 = 1;
          goto _L4
        attributeset;
          goto _L7
        exception;
          goto _L8
    }

    private int compatMeasureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
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

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.applySupportBackgroundTint();
        }
    }

    public int getDropDownHorizontalOffset()
    {
        if (mPopup != null)
        {
            return mPopup.getHorizontalOffset();
        }
        if (IS_AT_LEAST_JB)
        {
            return super.getDropDownHorizontalOffset();
        } else
        {
            return 0;
        }
    }

    public int getDropDownVerticalOffset()
    {
        if (mPopup != null)
        {
            return mPopup.getVerticalOffset();
        }
        if (IS_AT_LEAST_JB)
        {
            return super.getDropDownVerticalOffset();
        } else
        {
            return 0;
        }
    }

    public int getDropDownWidth()
    {
        if (mPopup != null)
        {
            return mDropDownWidth;
        }
        if (IS_AT_LEAST_JB)
        {
            return super.getDropDownWidth();
        } else
        {
            return 0;
        }
    }

    public Drawable getPopupBackground()
    {
        if (mPopup != null)
        {
            return mPopup.getBackground();
        }
        if (IS_AT_LEAST_JB)
        {
            return super.getPopupBackground();
        } else
        {
            return null;
        }
    }

    public Context getPopupContext()
    {
        if (mPopup != null)
        {
            return mPopupContext;
        }
        if (IS_AT_LEAST_M)
        {
            return super.getPopupContext();
        } else
        {
            return null;
        }
    }

    public CharSequence getPrompt()
    {
        if (mPopup != null)
        {
            return mPopup.getHintText();
        } else
        {
            return super.getPrompt();
        }
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (mBackgroundTintHelper != null)
        {
            return mBackgroundTintHelper.getSupportBackgroundTintList();
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (mBackgroundTintHelper != null)
        {
            return mBackgroundTintHelper.getSupportBackgroundTintMode();
        } else
        {
            return null;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mPopup != null && mPopup.isShowing())
        {
            mPopup.dismiss();
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (mPopup != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
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
        if (mPopup != null && !mPopup.isShowing())
        {
            mPopup.show();
            return true;
        } else
        {
            return super.performClick();
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        if (!mPopupSet)
        {
            mTempAdapter = spinneradapter;
        } else
        {
            super.setAdapter(spinneradapter);
            if (mPopup != null)
            {
                Context context;
                if (mPopupContext == null)
                {
                    context = getContext();
                } else
                {
                    context = mPopupContext;
                }
                mPopup.setAdapter(new DropDownAdapter(spinneradapter, context.getTheme()));
                return;
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.onSetBackgroundResource(i);
        }
    }

    public void setDropDownHorizontalOffset(int i)
    {
        if (mPopup != null)
        {
            mPopup.setHorizontalOffset(i);
        } else
        if (IS_AT_LEAST_JB)
        {
            super.setDropDownHorizontalOffset(i);
            return;
        }
    }

    public void setDropDownVerticalOffset(int i)
    {
        if (mPopup != null)
        {
            mPopup.setVerticalOffset(i);
        } else
        if (IS_AT_LEAST_JB)
        {
            super.setDropDownVerticalOffset(i);
            return;
        }
    }

    public void setDropDownWidth(int i)
    {
        if (mPopup != null)
        {
            mDropDownWidth = i;
        } else
        if (IS_AT_LEAST_JB)
        {
            super.setDropDownWidth(i);
            return;
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable)
    {
        if (mPopup != null)
        {
            mPopup.setBackgroundDrawable(drawable);
        } else
        if (IS_AT_LEAST_JB)
        {
            super.setPopupBackgroundDrawable(drawable);
            return;
        }
    }

    public void setPopupBackgroundResource(int i)
    {
        setPopupBackgroundDrawable(getPopupContext().getDrawable(i));
    }

    public void setPrompt(CharSequence charsequence)
    {
        if (mPopup != null)
        {
            mPopup.setPromptText(charsequence);
            return;
        } else
        {
            super.setPrompt(charsequence);
            return;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_AT_LEAST_M = flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_AT_LEAST_JB = flag;
    }






    // Unreferenced inner class android/support/v7/widget/AppCompatSpinner$DropdownPopup$1

/* anonymous class */
    class DropdownPopup._cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final DropdownPopup this$1;
        final AppCompatSpinner val$this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            setSelection(i);
            if (getOnItemClickListener() != null)
            {
                performItemClick(view, i, mAdapter.getItemId(i));
            }
            dismiss();
        }

            
            {
                this$1 = final_dropdownpopup;
                this$0 = AppCompatSpinner.this;
                super();
            }
    }

}
