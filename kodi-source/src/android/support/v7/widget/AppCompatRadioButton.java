// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class AppCompatRadioButton extends RadioButton
{

    private static final int TINT_ATTRS[] = {
        0x1010107
    };
    private Drawable mButtonDrawable;
    private TintManager mTintManager;

    public AppCompatRadioButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
            setButtonDrawable(context.getDrawable(0));
            context.recycle();
            mTintManager = context.getTintManager();
        }
    }

    public int getCompoundPaddingLeft()
    {
        int j = super.getCompoundPaddingLeft();
        int i = j;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            i = j;
            if (mButtonDrawable != null)
            {
                i = j + mButtonDrawable.getIntrinsicWidth();
            }
        }
        return i;
    }

    public void setButtonDrawable(int i)
    {
        if (mTintManager != null)
        {
            setButtonDrawable(mTintManager.getDrawable(i));
            return;
        } else
        {
            super.setButtonDrawable(i);
            return;
        }
    }

    public void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        mButtonDrawable = drawable;
    }

}
