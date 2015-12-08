// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            DrawerArrowDrawable, ActionBarDrawerToggleHoneycomb

public final class ActionBarDrawerToggle
    implements android.support.v4.widget.DrawerLayout.DrawerListener
{
    public static interface Delegate
    {

        public abstract Context getActionBarThemedContext();

        public abstract Drawable getThemeUpIndicator();

        public abstract boolean isNavigationVisible();

        public abstract void setActionBarDescription(int i);

        public abstract void setActionBarUpIndicator(Drawable drawable, int i);
    }

    public static interface DelegateProvider
    {

        public abstract Delegate getDrawerToggleDelegate();
    }

    static final class DrawerArrowDrawableToggle extends DrawerArrowDrawable
        implements DrawerToggle
    {

        private final Activity mActivity;

        final boolean isLayoutRtl()
        {
            return ViewCompat.getLayoutDirection(mActivity.getWindow().getDecorView()) == 1;
        }

        public final void setPosition(float f)
        {
            if (f != 1.0F) goto _L2; else goto _L1
_L1:
            super.mVerticalMirror = true;
_L4:
            super.mProgress = f;
            invalidateSelf();
            return;
_L2:
            if (f == 0.0F)
            {
                super.mVerticalMirror = false;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public DrawerArrowDrawableToggle(Activity activity, Context context)
        {
            super(context);
            mActivity = activity;
        }
    }

    public static interface DrawerToggle
    {

        public abstract void setPosition(float f);
    }

    static final class DummyDelegate
        implements Delegate
    {

        final Activity mActivity;

        public final Context getActionBarThemedContext()
        {
            return mActivity;
        }

        public final Drawable getThemeUpIndicator()
        {
            return null;
        }

        public final boolean isNavigationVisible()
        {
            return true;
        }

        public final void setActionBarDescription(int i)
        {
        }

        public final void setActionBarUpIndicator(Drawable drawable, int i)
        {
        }

        DummyDelegate(Activity activity)
        {
            mActivity = activity;
        }
    }

    private static final class HoneycombDelegate
        implements Delegate
    {

        final Activity mActivity;
        ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;

        public final Context getActionBarThemedContext()
        {
            ActionBar actionbar = mActivity.getActionBar();
            if (actionbar != null)
            {
                return actionbar.getThemedContext();
            } else
            {
                return mActivity;
            }
        }

        public final Drawable getThemeUpIndicator()
        {
            return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(mActivity);
        }

        public final boolean isNavigationVisible()
        {
            ActionBar actionbar = mActivity.getActionBar();
            return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
        }

        public final void setActionBarDescription(int i)
        {
            mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
        }

        public final void setActionBarUpIndicator(Drawable drawable, int i)
        {
            mActivity.getActionBar().setDisplayShowHomeEnabled(true);
            mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator$3bf15dea(mActivity, drawable, i);
            mActivity.getActionBar().setDisplayShowHomeEnabled(false);
        }

        private HoneycombDelegate(Activity activity)
        {
            mActivity = activity;
        }

        HoneycombDelegate(Activity activity, byte byte0)
        {
            this(activity);
        }
    }

    private static final class JellybeanMr2Delegate
        implements Delegate
    {

        final Activity mActivity;

        public final Context getActionBarThemedContext()
        {
            ActionBar actionbar = mActivity.getActionBar();
            if (actionbar != null)
            {
                return actionbar.getThemedContext();
            } else
            {
                return mActivity;
            }
        }

        public final Drawable getThemeUpIndicator()
        {
            TypedArray typedarray = getActionBarThemedContext().obtainStyledAttributes(null, new int[] {
                0x101030b
            }, 0x10102ce, 0);
            Drawable drawable = typedarray.getDrawable(0);
            typedarray.recycle();
            return drawable;
        }

        public final boolean isNavigationVisible()
        {
            ActionBar actionbar = mActivity.getActionBar();
            return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
        }

        public final void setActionBarDescription(int i)
        {
            ActionBar actionbar = mActivity.getActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeActionContentDescription(i);
            }
        }

        public final void setActionBarUpIndicator(Drawable drawable, int i)
        {
            ActionBar actionbar = mActivity.getActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeAsUpIndicator(drawable);
                actionbar.setHomeActionContentDescription(i);
            }
        }

        private JellybeanMr2Delegate(Activity activity)
        {
            mActivity = activity;
        }

        JellybeanMr2Delegate(Activity activity, byte byte0)
        {
            this(activity);
        }
    }


    private final Delegate mActivityImpl;
    public final int mCloseDrawerContentDescRes;
    public boolean mDrawerIndicatorEnabled;
    public final DrawerLayout mDrawerLayout;
    public Drawable mHomeAsUpIndicator;
    public final int mOpenDrawerContentDescRes;
    public DrawerToggle mSlider;
    private boolean mWarnedForDisplayHomeAsUp;

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout)
    {
        this(activity, drawerlayout, 0x7f100109, 0x7f1000ff);
    }

    private ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        mDrawerIndicatorEnabled = true;
        mWarnedForDisplayHomeAsUp = false;
        if (activity instanceof DelegateProvider)
        {
            mActivityImpl = ((DelegateProvider)activity).getDrawerToggleDelegate();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            mActivityImpl = new JellybeanMr2Delegate(activity, (byte)0);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mActivityImpl = new HoneycombDelegate(activity, (byte)0);
        } else
        {
            mActivityImpl = new DummyDelegate(activity);
        }
        mDrawerLayout = drawerlayout;
        mOpenDrawerContentDescRes = 0x7f100109;
        mCloseDrawerContentDescRes = 0x7f1000ff;
        mSlider = new DrawerArrowDrawableToggle(activity, mActivityImpl.getActionBarThemedContext());
        mHomeAsUpIndicator = mActivityImpl.getThemeUpIndicator();
    }

    private void setActionBarDescription(int i)
    {
        mActivityImpl.setActionBarDescription(i);
    }

    public final void onDrawerClosed(View view)
    {
        mSlider.setPosition(0.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mOpenDrawerContentDescRes);
        }
    }

    public final void onDrawerOpened(View view)
    {
        mSlider.setPosition(1.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mCloseDrawerContentDescRes);
        }
    }

    public final void onDrawerSlide(View view, float f)
    {
        mSlider.setPosition(Math.min(1.0F, Math.max(0.0F, f)));
    }

    public final void onDrawerStateChanged(int i)
    {
    }

    public final void setActionBarUpIndicator(Drawable drawable, int i)
    {
        if (!mWarnedForDisplayHomeAsUp && !mActivityImpl.isNavigationVisible())
        {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            mWarnedForDisplayHomeAsUp = true;
        }
        mActivityImpl.setActionBarUpIndicator(drawable, i);
    }
}
