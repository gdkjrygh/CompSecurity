// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class b
{
    static final class a
    {

        public Method a;
        public Method b;
        public ImageView c;

        a(Activity activity)
        {
            a = android/app/ActionBar.getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
                android/graphics/drawable/Drawable
            });
            b = android/app/ActionBar.getDeclaredMethod("setHomeActionContentDescription", new Class[] {
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
                        c = (ImageView)activity;
                        return;
                    }
                }
            }
              goto _L1
        }
    }


    private static final int a[] = {
        0x101030b
    };

    public static Drawable a(Activity activity)
    {
        activity = activity.obtainStyledAttributes(a);
        Drawable drawable = activity.getDrawable(0);
        activity.recycle();
        return drawable;
    }

    public static a a(Activity activity, Drawable drawable, int i)
    {
        a a1 = new a(activity);
        if (a1.a != null)
        {
            try
            {
                activity = activity.getActionBar();
                a1.a.invoke(activity, new Object[] {
                    drawable
                });
                a1.b.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", activity);
                return a1;
            }
            return a1;
        }
        if (a1.c != null)
        {
            a1.c.setImageDrawable(drawable);
            return a1;
        } else
        {
            Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
            return a1;
        }
    }

    public static a a(a a1, Activity activity, int i)
    {
        a a2 = a1;
        if (a1 == null)
        {
            a2 = new a(activity);
        }
        if (a2.a != null)
        {
            try
            {
                a1 = activity.getActionBar();
                a2.b.invoke(a1, new Object[] {
                    Integer.valueOf(i)
                });
                if (android.os.Build.VERSION.SDK_INT <= 19)
                {
                    a1.setSubtitle(a1.getSubtitle());
                }
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", a1);
                return a2;
            }
        }
        return a2;
    }

}
