// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

private class dismiss extends ListPopupWindow
    implements dismiss
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


    public _cls1.val.this._cls0(Context context, AttributeSet attributeset, int i)
    {
        this.this$0 = SpinnerCompat.this;
        super(context, attributeset, i);
        setAnchorView(SpinnerCompat.this);
        setModal(true);
        setPromptPosition(0);
        setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

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

            
            {
                this$1 = SpinnerCompat.DropdownPopup.this;
                this$0 = spinnercompat;
                super();
            }
        });
    }
}
