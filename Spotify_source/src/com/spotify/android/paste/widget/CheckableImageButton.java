// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;

public class CheckableImageButton extends ImageButton
    implements Checkable
{

    private static final int b[] = {
        0x10100a0
    };
    private boolean a;

    public CheckableImageButton(Context context)
    {
        super(context);
    }

    public CheckableImageButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean isChecked()
    {
        return a;
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, b);
        }
        return ai;
    }

    public boolean performClick()
    {
        toggle();
        return super.performClick();
    }

    public void setChecked(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
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
