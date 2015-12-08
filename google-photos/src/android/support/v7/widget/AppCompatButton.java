// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import abp;
import ace;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import b;
import mf;
import yg;
import yh;

public class AppCompatButton extends Button
    implements mf
{

    private final abp mBackgroundTintHelper;
    private final ace mTextHelper;
    private final yh mTintManager;

    public AppCompatButton(Context context)
    {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.y);
    }

    public AppCompatButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTintManager = yh.a(getContext());
        mBackgroundTintHelper = new abp(this, mTintManager);
        mBackgroundTintHelper.a(attributeset, i);
        mTextHelper = new ace(this);
        mTextHelper.a(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        Object obj = null;
        ColorStateList colorstatelist = obj;
        if (mBackgroundTintHelper != null)
        {
            abp abp1 = mBackgroundTintHelper;
            colorstatelist = obj;
            if (abp1.a != null)
            {
                colorstatelist = abp1.a.a;
            }
        }
        return colorstatelist;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        Object obj = null;
        android.graphics.PorterDuff.Mode mode = obj;
        if (mBackgroundTintHelper != null)
        {
            abp abp1 = mBackgroundTintHelper;
            mode = obj;
            if (abp1.a != null)
            {
                mode = abp1.a.b;
            }
        }
        return mode;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/Button.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/Button.getName());
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.b(null);
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.a(i);
        }
    }

    public void setSupportAllCaps(boolean flag)
    {
        if (mTextHelper != null)
        {
            mTextHelper.a(flag);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.a(colorstatelist);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (mBackgroundTintHelper != null)
        {
            mBackgroundTintHelper.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (mTextHelper != null)
        {
            mTextHelper.a(context, i);
        }
    }
}
