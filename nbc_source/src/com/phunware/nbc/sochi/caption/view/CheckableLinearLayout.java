// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout
    implements Checkable, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final String TAG = "CheckableLinearLayout";
    private CompoundButton mCompoundButton;

    public CheckableLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean isChecked()
    {
        if (mCompoundButton != null)
        {
            return mCompoundButton.isChecked();
        } else
        {
            return false;
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view instanceof CompoundButton)
            {
                mCompoundButton = (CompoundButton)view;
                mCompoundButton.setOnCheckedChangeListener(this);
            }
        }

    }

    public void setChecked(boolean flag)
    {
        if (mCompoundButton != null)
        {
            mCompoundButton.setChecked(flag);
        }
    }

    public void toggle()
    {
        if (mCompoundButton != null)
        {
            mCompoundButton.toggle();
        }
    }
}
