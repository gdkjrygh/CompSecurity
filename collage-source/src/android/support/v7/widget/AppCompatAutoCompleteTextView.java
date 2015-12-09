// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//            TintContextWrapper, TintTypedArray, AppCompatBackgroundHelper, AppCompatTextHelper, 
//            TintManager

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView
    implements TintableBackgroundView
{

    private static final int TINT_ATTRS[] = {
        0x1010176
    };
    private AppCompatBackgroundHelper mBackgroundTintHelper;
    private AppCompatTextHelper mTextHelper;
    private TintManager mTintManager;

    public AppCompatAutoCompleteTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(TintContextWrapper.wrap(context), attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
        mTintManager = context.getTintManager();
        if (context.hasValue(0))
        {
            setDropDownBackgroundDrawable(context.getDrawable(0));
        }
        context.recycle();
        mBackgroundTintHelper = new AppCompatBackgroundHelper(this, mTintManager);
        mBackgroundTintHelper.loadFromAttributes(attributeset, i);
        mTextHelper = AppCompatTextHelper.create(this);
        mTextHelper.loadFromAttributes(attributeset, i);
        mTextHelper.applyCompoundDrawablesTints();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.applySupportBackgroundTint();
        }
        if (mTextHelper != null)
        {
            mTextHelper.applyCompoundDrawablesTints();
        }
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (mBackgroundTintHelper != null)
        {
            return mBackgroundTintHelper.getSupportBackgroundTintList();
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (mBackgroundTintHelper != null)
        {
            return mBackgroundTintHelper.getSupportBackgroundTintMode();
        } else
        {
            return null;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.onSetBackgroundResource(i);
        }
    }

    public void setDropDownBackgroundResource(int i)
    {
        if (mTintManager != null)
        {
            setDropDownBackgroundDrawable(mTintManager.getDrawable(i));
            return;
        } else
        {
            super.setDropDownBackgroundResource(i);
            return;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
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
