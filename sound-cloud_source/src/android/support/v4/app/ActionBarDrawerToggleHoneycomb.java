// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
    private static class SetIndicatorInfo
    {

        public Method setHomeActionContentDescription;
        public Method setHomeAsUpIndicator;
        public ImageView upIndicatorView;

        SetIndicatorInfo(Activity activity)
        {
            setHomeAsUpIndicator = android/app/ActionBar.getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
                android/graphics/drawable/Drawable
            });
            setHomeActionContentDescription = android/app/ActionBar.getDeclaredMethod("setHomeActionContentDescription", new Class[] {
                Integer.TYPE
            });
_L1:
            return;
            NoSuchMethodException nosuchmethodexception;
            nosuchmethodexception;
            activity = activity.findViewById(0x102002c);
            if (activity != null)
            {
                Object obj = (ViewGroup)activity.getParent();
                if (((ViewGroup) (obj)).getChildCount() == 2)
                {
                    activity = ((ViewGroup) (obj)).getChildAt(0);
                    obj = ((ViewGroup) (obj)).getChildAt(1);
                    if (activity.getId() == 0x102002c)
                    {
                        activity = ((Activity) (obj));
                    }
                    if (activity instanceof ImageView)
                    {
                        upIndicatorView = (ImageView)activity;
                        return;
                    }
                }
            }
              goto _L1
        }
    }


    private static final String TAG = "ActionBarDrawerToggleHoneycomb";
    private static final int THEME_ATTRS[] = {
        0x101030b
    };

    ActionBarDrawerToggleHoneycomb()
    {
    }

    public static Drawable getThemeUpIndicator(Activity activity)
    {
        activity = activity.obtainStyledAttributes(THEME_ATTRS);
        Drawable drawable = activity.getDrawable(0);
        activity.recycle();
        return drawable;
    }

    public static Object setActionBarDescription(Object obj, Activity activity, int i)
    {
        if (obj == null)
        {
            obj = new SetIndicatorInfo(activity);
        }
        SetIndicatorInfo setindicatorinfo = (SetIndicatorInfo)obj;
        if (setindicatorinfo.setHomeAsUpIndicator != null)
        {
            try
            {
                activity = activity.getActionBar();
                setindicatorinfo.setHomeActionContentDescription.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
                if (android.os.Build.VERSION.SDK_INT <= 19)
                {
                    activity.setSubtitle(activity.getSubtitle());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return obj;
            }
        }
        return obj;
    }

    public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
    {
        if (obj == null)
        {
            obj = new SetIndicatorInfo(activity);
        }
        SetIndicatorInfo setindicatorinfo = (SetIndicatorInfo)obj;
        if (setindicatorinfo.setHomeAsUpIndicator != null)
        {
            try
            {
                activity = activity.getActionBar();
                setindicatorinfo.setHomeAsUpIndicator.invoke(activity, new Object[] {
                    drawable
                });
                setindicatorinfo.setHomeActionContentDescription.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return obj;
            }
        } else
        if (setindicatorinfo.upIndicatorView != null)
        {
            setindicatorinfo.upIndicatorView.setImageDrawable(drawable);
            return obj;
        }
        return obj;
    }

}
