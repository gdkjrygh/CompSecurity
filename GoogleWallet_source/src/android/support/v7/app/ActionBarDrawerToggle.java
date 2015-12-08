// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            DrawerArrowDrawable, ActionBarDrawerToggleHoneycomb

public class ActionBarDrawerToggle
    implements android.support.v4.widget.DrawerLayout.DrawerListener
{
    public static interface Delegate
    {

        public abstract Context getActionBarThemedContext();

        public abstract Drawable getThemeUpIndicator();

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
            setVerticalMirror(true);
_L4:
            super.setProgress(f);
            return;
_L2:
            if (f == 0.0F)
            {
                setVerticalMirror(false);
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

    static interface DrawerToggle
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

    static final class HoneycombDelegate
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

        public final void setActionBarDescription(int i)
        {
            mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
        }

        public final void setActionBarUpIndicator(Drawable drawable, int i)
        {
            mActivity.getActionBar().setDisplayShowHomeEnabled(true);
            mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
            mActivity.getActionBar().setDisplayShowHomeEnabled(false);
        }

        private HoneycombDelegate(Activity activity)
        {
            mActivity = activity;
        }

    }

    static final class JellybeanMr2Delegate
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

    }

    static interface TmpDelegateProvider
    {

        public abstract Delegate getV7DrawerToggleDelegate();
    }

    static final class ToolbarCompatDelegate
        implements Delegate
    {

        final Toolbar mToolbar;

        public final Context getActionBarThemedContext()
        {
            return mToolbar.getContext();
        }

        public final Drawable getThemeUpIndicator()
        {
            TypedArray typedarray = mToolbar.getContext().obtainStyledAttributes(new int[] {
                0x102002c
            });
            Drawable drawable = typedarray.getDrawable(0);
            typedarray.recycle();
            return drawable;
        }

        public final void setActionBarDescription(int i)
        {
            mToolbar.setNavigationContentDescription(i);
        }

        public final void setActionBarUpIndicator(Drawable drawable, int i)
        {
            mToolbar.setNavigationIcon(drawable);
            mToolbar.setNavigationContentDescription(i);
        }

        ToolbarCompatDelegate(Toolbar toolbar)
        {
            mToolbar = toolbar;
        }
    }


    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    private boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mHasCustomUpIndicator;
    private Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private DrawerToggle mSlider;
    private android.view.View.OnClickListener mToolbarNavigationClickListener;

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this(activity, null, drawerlayout, null, i, j);
    }

    private ActionBarDrawerToggle(Activity activity, Toolbar toolbar, DrawerLayout drawerlayout, Drawable drawable, int i, int j)
    {
        mDrawerIndicatorEnabled = true;
        if (toolbar != null)
        {
            mActivityImpl = new ToolbarCompatDelegate(toolbar);
            toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {

                final ActionBarDrawerToggle this$0;

                public final void onClick(View view)
                {
                    if (mDrawerIndicatorEnabled)
                    {
                        toggle();
                    } else
                    if (mToolbarNavigationClickListener != null)
                    {
                        mToolbarNavigationClickListener.onClick(view);
                        return;
                    }
                }

            
            {
                this$0 = ActionBarDrawerToggle.this;
                super();
            }
            });
        } else
        if (activity instanceof DelegateProvider)
        {
            mActivityImpl = ((DelegateProvider)activity).getDrawerToggleDelegate();
        } else
        if (activity instanceof TmpDelegateProvider)
        {
            mActivityImpl = ((TmpDelegateProvider)activity).getV7DrawerToggleDelegate();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            mActivityImpl = new JellybeanMr2Delegate(activity);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mActivityImpl = new HoneycombDelegate(activity);
        } else
        {
            mActivityImpl = new DummyDelegate(activity);
        }
        mDrawerLayout = drawerlayout;
        mOpenDrawerContentDescRes = i;
        mCloseDrawerContentDescRes = j;
        if (drawable == null)
        {
            mSlider = new DrawerArrowDrawableToggle(activity, mActivityImpl.getActionBarThemedContext());
        } else
        {
            mSlider = (DrawerToggle)drawable;
        }
        mHomeAsUpIndicator = getThemeUpIndicator();
    }

    private Drawable getThemeUpIndicator()
    {
        return mActivityImpl.getThemeUpIndicator();
    }

    private void setActionBarDescription(int i)
    {
        mActivityImpl.setActionBarDescription(i);
    }

    private void setActionBarUpIndicator(Drawable drawable, int i)
    {
        mActivityImpl.setActionBarUpIndicator(drawable, i);
    }

    private void toggle()
    {
        if (mDrawerLayout.isDrawerVisible(0x800003))
        {
            mDrawerLayout.closeDrawer(0x800003);
            return;
        } else
        {
            mDrawerLayout.openDrawer(0x800003);
            return;
        }
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        if (!mHasCustomUpIndicator)
        {
            mHomeAsUpIndicator = getThemeUpIndicator();
        }
        syncState();
    }

    public void onDrawerClosed(View view)
    {
        mSlider.setPosition(0.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mOpenDrawerContentDescRes);
        }
    }

    public void onDrawerOpened(View view)
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

    public final void setDrawerIndicatorEnabled(boolean flag)
    {
        if (flag != mDrawerIndicatorEnabled)
        {
            if (flag)
            {
                Drawable drawable = (Drawable)mSlider;
                int i;
                if (mDrawerLayout.isDrawerOpen(0x800003))
                {
                    i = mCloseDrawerContentDescRes;
                } else
                {
                    i = mOpenDrawerContentDescRes;
                }
                setActionBarUpIndicator(drawable, i);
            } else
            {
                setActionBarUpIndicator(mHomeAsUpIndicator, 0);
            }
            mDrawerIndicatorEnabled = flag;
        }
    }

    public final void syncState()
    {
        if (mDrawerLayout.isDrawerOpen(0x800003))
        {
            mSlider.setPosition(1.0F);
        } else
        {
            mSlider.setPosition(0.0F);
        }
        if (mDrawerIndicatorEnabled)
        {
            Drawable drawable = (Drawable)mSlider;
            int i;
            if (mDrawerLayout.isDrawerOpen(0x800003))
            {
                i = mCloseDrawerContentDescRes;
            } else
            {
                i = mOpenDrawerContentDescRes;
            }
            setActionBarUpIndicator(drawable, i);
        }
    }



}
