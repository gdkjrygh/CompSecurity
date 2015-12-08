// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

public class CheckableImageView extends ImageView
    implements Checkable
{

    private static final int CHECKED_STATE_SET[] = {
        0x10100a0
    };
    private boolean isChecked;

    public CheckableImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean isChecked()
    {
        return isChecked;
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, CHECKED_STATE_SET);
        }
        return ai;
    }

    public void setChecked(boolean flag)
    {
        if (isChecked == flag)
        {
            return;
        } else
        {
            isChecked = flag;
            refreshDrawableState();
            return;
        }
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

}
