// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.gfx;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewConfiguration;

public class ViewConfigurationHelper
{

    static final boolean $assertionsDisabled;
    private static final float MIN_SCALING_SPAN_MM = 27F;
    private static final float MIN_SCALING_TOUCH_MAJOR_DIP = 48F;
    private final Context mAppContext;
    private ViewConfiguration mViewConfiguration;

    private ViewConfigurationHelper(Context context)
    {
        mAppContext = context.getApplicationContext();
        mViewConfiguration = ViewConfiguration.get(mAppContext);
    }

    private static ViewConfigurationHelper createWithListener(Context context)
    {
        context = new ViewConfigurationHelper(context);
        context.registerListener();
        return context;
    }

    private static int getDoubleTapTimeout()
    {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    private static int getLongPressTimeout()
    {
        return ViewConfiguration.getLongPressTimeout();
    }

    private int getScaledDoubleTapSlop()
    {
        return mViewConfiguration.getScaledDoubleTapSlop();
    }

    private int getScaledMaximumFlingVelocity()
    {
        return mViewConfiguration.getScaledMaximumFlingVelocity();
    }

    private int getScaledMinScalingSpan()
    {
        Resources resources = mAppContext.getResources();
        int j = resources.getIdentifier("config_minScalingSpan", "dimen", "android");
        int i = j;
        if (j == 0)
        {
            i = org.chromium.ui.R.dimen.config_min_scaling_span;
        }
        try
        {
            i = resources.getDimensionPixelSize(i);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            if (!$assertionsDisabled)
            {
                throw new AssertionError("MinScalingSpan resource lookup failed.");
            } else
            {
                return (int)TypedValue.applyDimension(5, 27F, resources.getDisplayMetrics());
            }
        }
        return i;
    }

    private int getScaledMinScalingTouchMajor()
    {
        Resources resources = mAppContext.getResources();
        int j = resources.getIdentifier("config_minScalingTouchMajor", "dimen", "android");
        int i = j;
        if (j == 0)
        {
            i = org.chromium.ui.R.dimen.config_min_scaling_touch_major;
        }
        try
        {
            i = resources.getDimensionPixelSize(i);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            if (!$assertionsDisabled)
            {
                throw new AssertionError("MinScalingTouchMajor resource lookup failed.");
            } else
            {
                return (int)TypedValue.applyDimension(1, 48F, resources.getDisplayMetrics());
            }
        }
        return i;
    }

    private int getScaledMinimumFlingVelocity()
    {
        return mViewConfiguration.getScaledMinimumFlingVelocity();
    }

    private int getScaledTouchSlop()
    {
        return mViewConfiguration.getScaledTouchSlop();
    }

    private static float getScrollFriction()
    {
        return ViewConfiguration.getScrollFriction();
    }

    private static int getTapTimeout()
    {
        return ViewConfiguration.getTapTimeout();
    }

    private native void nativeUpdateSharedViewConfiguration(int i, int j, int k, int l, int i1, int j1);

    private void registerListener()
    {
        mAppContext.registerComponentCallbacks(new ComponentCallbacks() {

            final ViewConfigurationHelper this$0;

            public void onConfigurationChanged(Configuration configuration)
            {
                updateNativeViewConfigurationIfNecessary();
            }

            public void onLowMemory()
            {
            }

            
            {
                this$0 = ViewConfigurationHelper.this;
                super();
            }
        });
    }

    private void updateNativeViewConfigurationIfNecessary()
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(mAppContext);
        if (mViewConfiguration == viewconfiguration)
        {
            return;
        } else
        {
            mViewConfiguration = viewconfiguration;
            nativeUpdateSharedViewConfiguration(getScaledMaximumFlingVelocity(), getScaledMinimumFlingVelocity(), getScaledTouchSlop(), getScaledDoubleTapSlop(), getScaledMinScalingSpan(), getScaledMinScalingTouchMajor());
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/gfx/ViewConfigurationHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
