// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

// Referenced classes of package android.support.v7.widget:
//            AppCompatTextHelper, TintManager, TintTypedArray

public class AppCompatCheckedTextView extends CheckedTextView
{

    private static final int TINT_ATTRS[] = {
        0x1010108
    };
    private AppCompatTextHelper mTextHelper;
    private TintManager mTintManager;

    public AppCompatCheckedTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x10103c8);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTextHelper = AppCompatTextHelper.create(this);
        mTextHelper.loadFromAttributes(attributeset, i);
        mTextHelper.applyCompoundDrawablesTints();
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
            setCheckMarkDrawable(context.getDrawable(0));
            context.recycle();
            mTintManager = context.getTintManager();
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mTextHelper != null)
        {
            mTextHelper.applyCompoundDrawablesTints();
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

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (mTextHelper != null)
        {
            mTextHelper.onSetTextAppearance(context, i);
        }
    }

}
