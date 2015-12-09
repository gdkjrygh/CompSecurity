// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.TintableCompoundButton;
import android.util.AttributeSet;
import android.widget.RadioButton;

// Referenced classes of package android.support.v7.widget:
//            TintManager, AppCompatCompoundButtonHelper

public class AppCompatRadioButton extends RadioButton
    implements TintableCompoundButton
{

    private AppCompatCompoundButtonHelper mCompoundButtonHelper;
    private TintManager mTintManager;

    public AppCompatRadioButton(Context context)
    {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTintManager = TintManager.get(context);
        mCompoundButtonHelper = new AppCompatCompoundButtonHelper(this, mTintManager);
        mCompoundButtonHelper.loadFromAttributes(attributeset, i);
    }

    public int getCompoundPaddingLeft()
    {
        int j = super.getCompoundPaddingLeft();
        int i = j;
        if (mCompoundButtonHelper != null)
        {
            i = mCompoundButtonHelper.getCompoundPaddingLeft(j);
        }
        return i;
    }

    public ColorStateList getSupportButtonTintList()
    {
        if (mCompoundButtonHelper != null)
        {
            return mCompoundButtonHelper.getSupportButtonTintList();
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode()
    {
        if (mCompoundButtonHelper != null)
        {
            return mCompoundButtonHelper.getSupportButtonTintMode();
        } else
        {
            return null;
        }
    }

    public void setButtonDrawable(int i)
    {
        Drawable drawable;
        if (mTintManager != null)
        {
            drawable = mTintManager.getDrawable(i);
        } else
        {
            drawable = ContextCompat.getDrawable(getContext(), i);
        }
        setButtonDrawable(drawable);
    }

    public void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        if (mCompoundButtonHelper != null)
        {
            mCompoundButtonHelper.onSetButtonDrawable();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorstatelist)
    {
        if (mCompoundButtonHelper != null)
        {
            mCompoundButtonHelper.setSupportButtonTintList(colorstatelist);
        }
    }

    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (mCompoundButtonHelper != null)
        {
            mCompoundButtonHelper.setSupportButtonTintMode(mode);
        }
    }
}
