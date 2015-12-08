// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class AppCompatCheckedTextView extends CheckedTextView
{

    private static final int TINT_ATTRS[] = {
        0x1010108
    };
    private TintManager mTintManager;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, (byte)0);
    }

    private AppCompatCheckedTextView(Context context, AttributeSet attributeset, byte byte0)
    {
        super(context, attributeset, 0x10103c8);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes$1a6c1917(getContext(), attributeset, TINT_ATTRS, 0x10103c8);
            setCheckMarkDrawable(context.getDrawable(0));
            ((TintTypedArray) (context)).mWrapped.recycle();
            mTintManager = context.getTintManager();
        }
    }

    public final void setCheckMarkDrawable(int i)
    {
        if (mTintManager != null)
        {
            setCheckMarkDrawable(mTintManager.getDrawable(i, false));
            return;
        } else
        {
            super.setCheckMarkDrawable(i);
            return;
        }
    }

}
