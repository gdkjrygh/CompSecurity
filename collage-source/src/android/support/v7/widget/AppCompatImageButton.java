// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.util.AttributeSet;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//            TintManager, AppCompatBackgroundHelper, AppCompatImageHelper

public class AppCompatImageButton extends ImageButton
    implements TintableBackgroundView
{

    private AppCompatBackgroundHelper mBackgroundTintHelper;
    private AppCompatImageHelper mImageHelper;

    public AppCompatImageButton(Context context)
    {
        this(context, null);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintManager.get(context);
        mBackgroundTintHelper = new AppCompatBackgroundHelper(this, context);
        mBackgroundTintHelper.loadFromAttributes(attributeset, i);
        mImageHelper = new AppCompatImageHelper(this, context);
        mImageHelper.loadFromAttributes(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.applySupportBackgroundTint();
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

    public void setImageResource(int i)
    {
        mImageHelper.setImageResource(i);
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
}
