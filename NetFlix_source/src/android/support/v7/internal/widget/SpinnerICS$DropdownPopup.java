// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow, SpinnerICS, AdapterViewICS

private class dismiss extends ListPopupWindow
    implements dismiss
{

    private ListAdapter mAdapter;
    private CharSequence mHintText;
    final SpinnerICS this$0;

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
        int k = getPaddingLeft();
        Drawable drawable;
        int j;
        if (mDropDownWidth == -2)
        {
            int i = getWidth();
            int l = getPaddingRight();
            setContentWidth(Math.max(measureContentWidth((SpinnerAdapter)mAdapter, getBackground()), i - k - l));
        } else
        if (mDropDownWidth == -1)
        {
            setContentWidth(getWidth() - k - getPaddingRight());
        } else
        {
            setContentWidth(mDropDownWidth);
        }
        drawable = getBackground();
        j = 0;
        if (drawable != null)
        {
            drawable.getPadding(SpinnerICS.access$200(SpinnerICS.this));
            j = -SpinnerICS.access$200(SpinnerICS.this).left;
        }
        setHorizontalOffset(j + k);
        setInputMethodMode(2);
        super.show();
        getListView().setChoiceMode(1);
        setSelection(getSelectedItemPosition());
    }


    public kListener(Context context, AttributeSet attributeset, int i)
    {
        this.this$0 = SpinnerICS.this;
        super(context, attributeset, i);
        setAnchorView(SpinnerICS.this);
        setModal(true);
        setPromptPosition(0);
        setOnItemClickListener(new kListenerWrapper(SpinnerICS.this, new AdapterViewICS.OnItemClickListener() {

            final SpinnerICS.DropdownPopup this$1;
            final SpinnerICS val$this$0;

            public void onItemClick(AdapterViewICS adapterviewics, View view, int j, long l)
            {
                setSelection(j);
                if (mOnItemClickListener != null)
                {
                    performItemClick(view, j, mAdapter.getItemId(j));
                }
                dismiss();
            }

            
            {
                this$1 = SpinnerICS.DropdownPopup.this;
                this$0 = spinnerics;
                super();
            }
        }));
    }
}
