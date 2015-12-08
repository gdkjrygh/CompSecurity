// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView extends CheckedTextView
{

    private static final int TINT_ATTRS[] = {
        0x1010108
    };
    private TintManager mTintManager;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x10103c8);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
            setCheckMarkDrawable(context.getDrawable(0));
            context.recycle();
            mTintManager = context.getTintManager();
        }
    }

    public void setCheckMarkDrawable(int i)
    {
        if (mTintManager != null)
        {
            setCheckMarkDrawable(mTintManager.getDrawable(i));
            return;
        } else
        {
            super.setCheckMarkDrawable(i);
            return;
        }
    }

}
