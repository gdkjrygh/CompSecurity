// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

public class NineFrameLayout extends FrameLayout
{

    private final AnimatorProxy mProxy;

    public NineFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (AnimatorProxy.NEEDS_PROXY)
        {
            context = AnimatorProxy.wrap(this);
        } else
        {
            context = null;
        }
        mProxy = context;
    }

    public float getAlpha()
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            return mProxy.getAlpha();
        } else
        {
            return super.getAlpha();
        }
    }

    public float getTranslationY()
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            return mProxy.getTranslationY();
        } else
        {
            return super.getTranslationY();
        }
    }

    public void setAlpha(float f)
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            mProxy.setAlpha(f);
            return;
        } else
        {
            super.setAlpha(f);
            return;
        }
    }

    public void setTranslationY(float f)
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            mProxy.setTranslationY(f);
            return;
        } else
        {
            super.setTranslationY(f);
            return;
        }
    }

    public void setVisibility(int i)
    {
        if (mProxy == null) goto _L2; else goto _L1
_L1:
        if (i != 8) goto _L4; else goto _L3
_L3:
        clearAnimation();
_L2:
        super.setVisibility(i);
        return;
_L4:
        if (i == 0)
        {
            setAnimation(mProxy);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
