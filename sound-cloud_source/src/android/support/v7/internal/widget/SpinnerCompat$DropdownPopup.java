// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat, ViewUtils

private class _cls1 extends ListPopupWindow
    implements _cls1
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
            drawable.getPadding(SpinnerCompat.access$400(SpinnerCompat.this));
            int j;
            int k;
            if (ViewUtils.isLayoutRtl(SpinnerCompat.this))
            {
                i = SpinnerCompat.access$400(SpinnerCompat.this).right;
            } else
            {
                i = -SpinnerCompat.access$400(SpinnerCompat.this).left;
            }
        } else
        {
            Rect rect = SpinnerCompat.access$400(SpinnerCompat.this);
            SpinnerCompat.access$400(SpinnerCompat.this).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = getPaddingLeft();
        i1 = getPaddingRight();
        j1 = getWidth();
        if (mDropDownWidth == -2)
        {
            j = measureContentWidth((SpinnerAdapter)mAdapter, getBackground());
            k = getContext().getResources().getDisplayMetrics().widthPixels - SpinnerCompat.access$400(SpinnerCompat.this).left - SpinnerCompat.access$400(SpinnerCompat.this).right;
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
                class _cls2
                    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
                {

                    final SpinnerCompat.DropdownPopup this$1;

                    public void onGlobalLayout()
                    {
                        computeContentWidth();
                        show();
                    }

            _cls2()
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                super();
            }
                }

                final _cls2 layoutListener = new _cls2();
                viewtreeobserver.addOnGlobalLayoutListener(layoutListener);
                class _cls3
                    implements android.widget.PopupWindow.OnDismissListener
                {

                    final SpinnerCompat.DropdownPopup this$1;
                    final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

                    public void onDismiss()
                    {
                        ViewTreeObserver viewtreeobserver1 = getViewTreeObserver();
                        if (viewtreeobserver1 != null)
                        {
                            viewtreeobserver1.removeGlobalOnLayoutListener(layoutListener);
                        }
                    }

            _cls3()
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                layoutListener = ongloballayoutlistener;
                super();
            }
                }

                setOnDismissListener(new _cls3());
                return;
            }
        }
    }



    public _cls1.val.this._cls0(Context context, AttributeSet attributeset, int i)
    {
        this.this$0 = SpinnerCompat.this;
        super(context, attributeset, i);
        setAnchorView(SpinnerCompat.this);
        setModal(true);
        setPromptPosition(0);
        class _cls1
            implements android.widget.AdapterView.OnItemClickListener
        {

            final SpinnerCompat.DropdownPopup this$1;
            final SpinnerCompat val$this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                setSelection(j);
                if (mOnItemClickListener != null)
                {
                    performItemClick(view, j, mAdapter.getItemId(j));
                }
                dismiss();
            }

            _cls1()
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                this$0 = spinnercompat;
                super();
            }
        }

        setOnItemClickListener(new _cls1());
    }
}
