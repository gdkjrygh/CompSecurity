// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckedLinearLayout extends LinearLayout
    implements Checkable
{

    private static final int a[] = {
        0x10100a0
    };
    private boolean b;

    public CheckedLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
    }

    public boolean isChecked()
    {
        return b;
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, a);
        }
        return ai;
    }

    public void setChecked(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            refreshDrawableState();
        }
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

}
