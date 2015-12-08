// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.support.v7.internal.widget.ThemeUtils;
import android.support.v7.internal.widget.TintInfo;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class AppCompatButton extends Button
    implements TintableBackgroundView
{

    private static final int TINT_ATTRS[] = {
        0x10100d4
    };
    private TintInfo mBackgroundTint;
    private TintInfo mInternalBackgroundTint;
    private TintManager mTintManager;

    public AppCompatButton(Context context)
    {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (TintManager.SHOULD_BE_USED)
        {
            TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
            if (tinttypedarray.hasValue(0))
            {
                ColorStateList colorstatelist = tinttypedarray.getTintManager().getTintList(tinttypedarray.getResourceId(0, -1));
                if (colorstatelist != null)
                {
                    setInternalBackgroundTint(colorstatelist);
                }
            }
            mTintManager = tinttypedarray.getTintManager();
            tinttypedarray.recycle();
        }
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, i, 0);
        int j = typedarray.getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextView_android_textAppearance, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, android.support.v7.appcompat.R.styleable.TextAppearance);
            if (typedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
            {
                setAllCaps(typedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, i, 0);
        if (attributeset.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_textAllCaps))
        {
            setAllCaps(attributeset.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTextView_textAllCaps, false));
        }
        attributeset.recycle();
        attributeset = getTextColors();
        if (attributeset != null && !attributeset.isStateful())
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                i = ThemeUtils.getDisabledThemeAttrColor(context, 0x1010038);
            } else
            {
                i = ThemeUtils.getThemeAttrColor(context, 0x1010038);
            }
            setTextColor(ThemeUtils.createDisabledStateList(attributeset.getDefaultColor(), i));
        }
    }

    private void applySupportBackgroundTint()
    {
        if (getBackground() != null)
        {
            if (mBackgroundTint != null)
            {
                TintManager.tintViewBackground(this, mBackgroundTint);
            } else
            if (mInternalBackgroundTint != null)
            {
                TintManager.tintViewBackground(this, mInternalBackgroundTint);
                return;
            }
        }
    }

    private void setInternalBackgroundTint(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (mInternalBackgroundTint == null)
            {
                mInternalBackgroundTint = new TintInfo();
            }
            mInternalBackgroundTint.mTintList = colorstatelist;
            mInternalBackgroundTint.mHasTintList = true;
        } else
        {
            mInternalBackgroundTint = null;
        }
        applySupportBackgroundTint();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        applySupportBackgroundTint();
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (mBackgroundTint != null)
        {
            return mBackgroundTint.mTintList;
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (mBackgroundTint != null)
        {
            return mBackgroundTint.mTintMode;
        } else
        {
            return null;
        }
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

    public void setAllCaps(boolean flag)
    {
        AllCapsTransformationMethod allcapstransformationmethod;
        if (flag)
        {
            allcapstransformationmethod = new AllCapsTransformationMethod(getContext());
        } else
        {
            allcapstransformationmethod = null;
        }
        setTransformationMethod(allcapstransformationmethod);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        setInternalBackgroundTint(null);
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        ColorStateList colorstatelist;
        if (mTintManager != null)
        {
            colorstatelist = mTintManager.getTintList(i);
        } else
        {
            colorstatelist = null;
        }
        setInternalBackgroundTint(colorstatelist);
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (mBackgroundTint == null)
        {
            mBackgroundTint = new TintInfo();
        }
        mBackgroundTint.mTintList = colorstatelist;
        mBackgroundTint.mHasTintList = true;
        applySupportBackgroundTint();
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (mBackgroundTint == null)
        {
            mBackgroundTint = new TintInfo();
        }
        mBackgroundTint.mTintMode = mode;
        mBackgroundTint.mHasTintMode = true;
        applySupportBackgroundTint();
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = context.obtainStyledAttributes(i, android.support.v7.appcompat.R.styleable.TextAppearance);
        if (context.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
        {
            setAllCaps(context.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
        }
        context.recycle();
    }

}
