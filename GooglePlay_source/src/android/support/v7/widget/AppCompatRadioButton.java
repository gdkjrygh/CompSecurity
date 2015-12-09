// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class AppCompatRadioButton extends RadioButton
{

    private static final int TINT_ATTRS[] = {
        0x1010107
    };
    private Drawable mButtonDrawable;
    private TintManager mTintManager;

    public AppCompatRadioButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010152);
    }

    private AppCompatRadioButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0x7f010152);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes$1a6c1917(getContext(), attributeset, TINT_ATTRS, 0x7f010152);
            setButtonDrawable(context.getDrawable(0));
            ((TintTypedArray) (context)).mWrapped.recycle();
            mTintManager = context.getTintManager();
        }
    }

    public final int getCompoundPaddingLeft()
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

    public final void setButtonDrawable(int i)
    {
        if (mTintManager != null)
        {
            setButtonDrawable(mTintManager.getDrawable(i, false));
            return;
        } else
        {
            super.setButtonDrawable(i);
            return;
        }
    }

    public final void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        mButtonDrawable = drawable;
    }

}
