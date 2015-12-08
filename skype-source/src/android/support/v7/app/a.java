// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            b

public class android.support.v7.app.a
    implements android.support.v4.widget.DrawerLayout.f
{
    public static interface a
    {

        public abstract Drawable a();

        public abstract void a(int i);

        public abstract void a(Drawable drawable, int i);

        public abstract Context b();

        public abstract boolean c();
    }

    public static interface b
    {

        public abstract a getDrawerToggleDelegate();
    }

    static final class c extends DrawerArrowDrawable
        implements d
    {

        private final Activity a;

        public final void a(float f1)
        {
            if (f1 != 1.0F) goto _L2; else goto _L1
_L1:
            a(true);
_L4:
            b(f1);
            return;
_L2:
            if (f1 == 0.0F)
            {
                a(false);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public c(Activity activity, Context context)
        {
            super(context);
            a = activity;
        }
    }

    static interface d
    {

        public abstract void a(float f1);
    }

    static final class e
        implements a
    {

        final Activity a;

        public final Drawable a()
        {
            return null;
        }

        public final void a(int i)
        {
        }

        public final void a(Drawable drawable, int i)
        {
        }

        public final Context b()
        {
            return a;
        }

        public final boolean c()
        {
            return true;
        }

        e(Activity activity)
        {
            a = activity;
        }
    }

    private static final class f
        implements a
    {

        final Activity a;
        b.a b;

        public final Drawable a()
        {
            return android.support.v7.app.b.a(a);
        }

        public final void a(int i)
        {
            b = android.support.v7.app.b.a(b, a, i);
        }

        public final void a(Drawable drawable, int i)
        {
            a.getActionBar().setDisplayShowHomeEnabled(true);
            b = android.support.v7.app.b.a(a, drawable, i);
            a.getActionBar().setDisplayShowHomeEnabled(false);
        }

        public final Context b()
        {
            ActionBar actionbar = a.getActionBar();
            if (actionbar != null)
            {
                return actionbar.getThemedContext();
            } else
            {
                return a;
            }
        }

        public final boolean c()
        {
            ActionBar actionbar = a.getActionBar();
            return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
        }

        private f(Activity activity)
        {
            a = activity;
        }

        f(Activity activity, byte byte0)
        {
            this(activity);
        }
    }

    private static final class g
        implements a
    {

        final Activity a;

        public final Drawable a()
        {
            TypedArray typedarray = b().obtainStyledAttributes(null, new int[] {
                0x101030b
            }, 0x10102ce, 0);
            Drawable drawable = typedarray.getDrawable(0);
            typedarray.recycle();
            return drawable;
        }

        public final void a(int i)
        {
            ActionBar actionbar = a.getActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeActionContentDescription(i);
            }
        }

        public final void a(Drawable drawable, int i)
        {
            ActionBar actionbar = a.getActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeAsUpIndicator(drawable);
                actionbar.setHomeActionContentDescription(i);
            }
        }

        public final Context b()
        {
            ActionBar actionbar = a.getActionBar();
            if (actionbar != null)
            {
                return actionbar.getThemedContext();
            } else
            {
                return a;
            }
        }

        public final boolean c()
        {
            ActionBar actionbar = a.getActionBar();
            return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
        }

        private g(Activity activity)
        {
            a = activity;
        }

        g(Activity activity, byte byte0)
        {
            this(activity);
        }
    }

    static final class h
        implements a
    {

        final Toolbar a;
        final Drawable b;
        final CharSequence c;

        public final Drawable a()
        {
            return b;
        }

        public final void a(int i)
        {
            if (i == 0)
            {
                a.setNavigationContentDescription(c);
                return;
            } else
            {
                a.setNavigationContentDescription(i);
                return;
            }
        }

        public final void a(Drawable drawable, int i)
        {
            a.setNavigationIcon(drawable);
            a(i);
        }

        public final Context b()
        {
            return a.getContext();
        }

        public final boolean c()
        {
            return true;
        }

        h(Toolbar toolbar)
        {
            a = toolbar;
            b = toolbar.l();
            c = toolbar.k();
        }
    }


    private final a mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    private boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mHasCustomUpIndicator;
    private Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private d mSlider;
    private android.view.View.OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;

    public android.support.v7.app.a(Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this(activity, null, drawerlayout, null, i, j);
    }

    public android.support.v7.app.a(Activity activity, DrawerLayout drawerlayout, Toolbar toolbar, int i, int j)
    {
        this(activity, toolbar, drawerlayout, null, i, j);
    }

    android.support.v7.app.a(Activity activity, Toolbar toolbar, DrawerLayout drawerlayout, Drawable drawable, int i, int j)
    {
        mDrawerIndicatorEnabled = true;
        mWarnedForDisplayHomeAsUp = false;
        if (toolbar != null)
        {
            mActivityImpl = new h(toolbar);
            toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {

                final android.support.v7.app.a a;

                public final void onClick(View view)
                {
                    if (a.mDrawerIndicatorEnabled)
                    {
                        a.toggle();
                    } else
                    if (a.mToolbarNavigationClickListener != null)
                    {
                        a.mToolbarNavigationClickListener.onClick(view);
                        return;
                    }
                }

            
            {
                a = android.support.v7.app.a.this;
                super();
            }
            });
        } else
        if (activity instanceof b)
        {
            mActivityImpl = ((b)activity).getDrawerToggleDelegate();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            mActivityImpl = new g(activity, (byte)0);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mActivityImpl = new f(activity, (byte)0);
        } else
        {
            mActivityImpl = new e(activity);
        }
        mDrawerLayout = drawerlayout;
        mOpenDrawerContentDescRes = i;
        mCloseDrawerContentDescRes = j;
        if (drawable == null)
        {
            mSlider = new c(activity, mActivityImpl.b());
        } else
        {
            mSlider = (d)drawable;
        }
        mHomeAsUpIndicator = getThemeUpIndicator();
    }

    private void toggle()
    {
        if (mDrawerLayout.d())
        {
            mDrawerLayout.b();
            return;
        } else
        {
            mDrawerLayout.a();
            return;
        }
    }

    Drawable getThemeUpIndicator()
    {
        return mActivityImpl.a();
    }

    public android.view.View.OnClickListener getToolbarNavigationClickListener()
    {
        return mToolbarNavigationClickListener;
    }

    public boolean isDrawerIndicatorEnabled()
    {
        return mDrawerIndicatorEnabled;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!mHasCustomUpIndicator)
        {
            mHomeAsUpIndicator = getThemeUpIndicator();
        }
        syncState();
    }

    public void onDrawerClosed(View view)
    {
        mSlider.a(0.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mOpenDrawerContentDescRes);
        }
    }

    public void onDrawerOpened(View view)
    {
        mSlider.a(1.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mCloseDrawerContentDescRes);
        }
    }

    public void onDrawerSlide(View view, float f1)
    {
        mSlider.a(Math.min(1.0F, Math.max(0.0F, f1)));
    }

    public void onDrawerStateChanged(int i)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem != null && menuitem.getItemId() == 0x102002c && mDrawerIndicatorEnabled)
        {
            toggle();
            return true;
        } else
        {
            return false;
        }
    }

    void setActionBarDescription(int i)
    {
        mActivityImpl.a(i);
    }

    void setActionBarUpIndicator(Drawable drawable, int i)
    {
        if (!mWarnedForDisplayHomeAsUp && !mActivityImpl.c())
        {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            mWarnedForDisplayHomeAsUp = true;
        }
        mActivityImpl.a(drawable, i);
    }

    public void setDrawerIndicatorEnabled(boolean flag)
    {
        if (flag != mDrawerIndicatorEnabled)
        {
            if (flag)
            {
                Drawable drawable = (Drawable)mSlider;
                int i;
                if (mDrawerLayout.c())
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

    public void setHomeAsUpIndicator(int i)
    {
        Drawable drawable = null;
        if (i != 0)
        {
            drawable = mDrawerLayout.getResources().getDrawable(i);
        }
        setHomeAsUpIndicator(drawable);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        if (drawable == null)
        {
            mHomeAsUpIndicator = getThemeUpIndicator();
            mHasCustomUpIndicator = false;
        } else
        {
            mHomeAsUpIndicator = drawable;
            mHasCustomUpIndicator = true;
        }
        if (!mDrawerIndicatorEnabled)
        {
            setActionBarUpIndicator(mHomeAsUpIndicator, 0);
        }
    }

    public void setToolbarNavigationClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mToolbarNavigationClickListener = onclicklistener;
    }

    public void syncState()
    {
        if (mDrawerLayout.c())
        {
            mSlider.a(1.0F);
        } else
        {
            mSlider.a(0.0F);
        }
        if (mDrawerIndicatorEnabled)
        {
            Drawable drawable = (Drawable)mSlider;
            int i;
            if (mDrawerLayout.c())
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
