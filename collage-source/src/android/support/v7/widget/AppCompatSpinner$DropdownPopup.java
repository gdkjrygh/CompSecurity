// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow, AppCompatSpinner, ViewUtils

private class dismiss extends ListPopupWindow
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
            drawable.getPadding(AppCompatSpinner.access$300(AppCompatSpinner.this));
            int j;
            int k;
            if (ViewUtils.isLayoutRtl(AppCompatSpinner.this))
            {
                i = AppCompatSpinner.access$300(AppCompatSpinner.this).right;
            } else
            {
                i = -AppCompatSpinner.access$300(AppCompatSpinner.this).left;
            }
        } else
        {
            Rect rect = AppCompatSpinner.access$300(AppCompatSpinner.this);
            AppCompatSpinner.access$300(AppCompatSpinner.this).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = getPaddingLeft();
        i1 = getPaddingRight();
        j1 = getWidth();
        if (AppCompatSpinner.access$400(AppCompatSpinner.this) == -2)
        {
            j = AppCompatSpinner.access$500(AppCompatSpinner.this, (SpinnerAdapter)mAdapter, getBackground());
            k = getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.access$300(AppCompatSpinner.this).left - AppCompatSpinner.access$300(AppCompatSpinner.this).right;
            if (j > k)
            {
                j = k;
            }
            setContentWidth(Math.max(j, j1 - l - i1));
        } else
        if (AppCompatSpinner.access$400(AppCompatSpinner.this) == -1)
        {
            setContentWidth(j1 - l - i1);
        } else
        {
            setContentWidth(AppCompatSpinner.access$400(AppCompatSpinner.this));
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
                final android.view.Listener layoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final AppCompatSpinner.DropdownPopup this$1;

                    public void onGlobalLayout()
                    {
                        if (!isVisibleToUser(this$0))
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
                this$1 = AppCompatSpinner.DropdownPopup.this;
                super();
            }
                };
                viewtreeobserver.addOnGlobalLayoutListener(layoutListener);
                setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

                    final AppCompatSpinner.DropdownPopup this$1;
                    final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

                    public void onDismiss()
                    {
                        ViewTreeObserver viewtreeobserver1 = getViewTreeObserver();
                        if (viewtreeobserver1 != null)
                        {
                            viewtreeobserver1.removeGlobalOnLayoutListener(layoutListener);
                        }
                    }

            
            {
                this$1 = AppCompatSpinner.DropdownPopup.this;
                layoutListener = ongloballayoutlistener;
                super();
            }
                });
                return;
            }
        }
    }




    public _cls3.val.layoutListener(Context context, AttributeSet attributeset, int i)
    {
        this.this$0 = AppCompatSpinner.this;
        super(context, attributeset, i);
        setAnchorView(AppCompatSpinner.this);
        setModal(true);
        setPromptPosition(0);
        setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AppCompatSpinner.DropdownPopup this$1;
            final AppCompatSpinner val$this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                setSelection(j);
                if (getOnItemClickListener() != null)
                {
                    performItemClick(view, j, mAdapter.getItemId(j));
                }
                dismiss();
            }

            
            {
                this$1 = AppCompatSpinner.DropdownPopup.this;
                this$0 = appcompatspinner;
                super();
            }
        });
    }
}
