// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintInfo;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import java.lang.reflect.Field;

public final class AppCompatSpinner extends Spinner
{

    private static final int TINT_ATTRS[] = {
        0x10100d4, 0x1010176
    };
    private TintInfo mInternalBackgroundTint;
    private TintManager mTintManager;

    public AppCompatSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010154);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0x7f010154);
        if (!TintManager.SHOULD_BE_USED) goto _L2; else goto _L1
_L1:
        context = TintTypedArray.obtainStyledAttributes$1a6c1917(getContext(), attributeset, TINT_ATTRS, 0x7f010154);
        if (context.hasValue(0))
        {
            attributeset = context.getTintManager().getTintList(context.getResourceId(0, -1));
            if (attributeset != null)
            {
                setInternalBackgroundTint(attributeset);
            }
        }
        if (!context.hasValue(1)) goto _L4; else goto _L3
_L3:
        attributeset = context.getDrawable(1);
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L6; else goto _L5
_L5:
        setPopupBackgroundDrawable(attributeset);
_L4:
        mTintManager = context.getTintManager();
        ((TintTypedArray) (context)).mWrapped.recycle();
_L2:
        return;
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            try
            {
                Object obj = android/widget/Spinner.getDeclaredField("mPopup");
                ((Field) (obj)).setAccessible(true);
                obj = ((Field) (obj)).get(this);
                if (obj instanceof ListPopupWindow)
                {
                    ((ListPopupWindow)obj).setBackgroundDrawable(attributeset);
                }
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                attributeset.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                attributeset.printStackTrace();
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
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

}
