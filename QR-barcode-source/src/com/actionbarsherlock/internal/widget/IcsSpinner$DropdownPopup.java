// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow, IcsSpinner

private class dismiss extends IcsListPopupWindow
    implements dismiss
{

    private ListAdapter mAdapter;
    private CharSequence mHintText;
    final IcsSpinner this$0;

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
            drawable.getPadding(IcsSpinner.access$0(IcsSpinner.this));
            j = -IcsSpinner.access$0(IcsSpinner.this).left;
        }
        setHorizontalOffset(j + k);
        setInputMethodMode(2);
        super.show();
        getListView().setChoiceMode(1);
        setSelection(getSelectedItemPosition());
    }


    public _cls1.this._cls1(Context context, AttributeSet attributeset, int i)
    {
        this$0 = IcsSpinner.this;
        super(context, attributeset, 0, i);
        setAnchorView(IcsSpinner.this);
        setModal(true);
        setPromptPosition(0);
        setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final IcsSpinner.DropdownPopup this$1;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                setSelection(j);
                dismiss();
            }

            
            {
                this$1 = IcsSpinner.DropdownPopup.this;
                super();
            }
        });
    }
}
