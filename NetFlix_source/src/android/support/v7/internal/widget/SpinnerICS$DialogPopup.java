// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerICS

private class <init>
    implements , android.content.Listener
{

    private ListAdapter mListAdapter;
    private AlertDialog mPopup;
    private CharSequence mPrompt;
    final SpinnerICS this$0;

    public void dismiss()
    {
        mPopup.dismiss();
        mPopup = null;
    }

    public CharSequence getHintText()
    {
        return mPrompt;
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
        android.app.lickListener licklistener = new android.app.it>(getContext());
        if (mPrompt != null)
        {
            licklistener.Title(mPrompt);
        }
        mPopup = licklistener.SingleChoiceItems(mListAdapter, getSelectedItemPosition(), this).w();
    }

    private ()
    {
        this$0 = SpinnerICS.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
