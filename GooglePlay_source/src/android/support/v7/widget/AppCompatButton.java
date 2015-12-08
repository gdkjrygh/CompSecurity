// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.support.v7.internal.widget.ThemeUtils;
import android.support.v7.internal.widget.TintInfo;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public final class AppCompatButton extends Button
{

    private static final int TINT_ATTRS[] = {
        0x10100d4
    };
    private TintInfo mInternalBackgroundTint;
    private TintManager mTintManager;

    public AppCompatButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01014d);
    }

    private AppCompatButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0x7f01014d);
        if (TintManager.SHOULD_BE_USED)
        {
            TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes$1a6c1917(getContext(), attributeset, TINT_ATTRS, 0x7f01014d);
            if (tinttypedarray.hasValue(0))
            {
                ColorStateList colorstatelist = tinttypedarray.getTintManager().getTintList(tinttypedarray.getResourceId(0, -1));
                if (colorstatelist != null)
                {
                    setInternalBackgroundTint(colorstatelist);
                }
            }
            mTintManager = tinttypedarray.getTintManager();
            tinttypedarray.mWrapped.recycle();
        }
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, 0x7f01014d, 0);
        i = typedarray.getResourceId(0, -1);
        typedarray.recycle();
        if (i != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(i, android.support.v7.appcompat.R.styleable.TextAppearance);
            if (typedarray1.hasValue(4))
            {
                setAllCaps(typedarray1.getBoolean(4, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, 0x7f01014d, 0);
        if (attributeset.hasValue(1))
        {
            setAllCaps(attributeset.getBoolean(1, false));
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
        if (getBackground() != null && mInternalBackgroundTint != null)
        {
            TintManager.tintViewBackground(this, mInternalBackgroundTint);
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

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        applySupportBackgroundTint();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/Button.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/Button.getName());
    }

    public final void setAllCaps(boolean flag)
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

    public final void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        setInternalBackgroundTint(null);
    }

    public final void setBackgroundResource(int i)
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

    public final void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = context.obtainStyledAttributes(i, android.support.v7.appcompat.R.styleable.TextAppearance);
        if (context.hasValue(4))
        {
            setAllCaps(context.getBoolean(4, false));
        }
        context.recycle();
    }

}
