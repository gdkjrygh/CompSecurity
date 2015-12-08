// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.app:
//            k

class j
{

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

    public static Object a(Object obj, Activity activity, int i)
    {
        if (obj == null)
        {
            obj = new k(activity);
        }
        k k1 = (k)obj;
        if (k1.a != null)
        {
            try
            {
                activity = activity.getActionBar();
                k1.b.invoke(activity, new Object[] {
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
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", activity);
                return obj;
            }
        }
        return obj;
    }

    public static Object a(Object obj, Activity activity, Drawable drawable, int i)
    {
        if (obj == null)
        {
            obj = new k(activity);
        }
        k k1 = (k)obj;
        if (k1.a != null)
        {
            try
            {
                activity = activity.getActionBar();
                k1.a.invoke(activity, new Object[] {
                    drawable
                });
                k1.b.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", activity);
                return obj;
            }
            return obj;
        }
        if (k1.c != null)
        {
            k1.c.setImageDrawable(drawable);
            return obj;
        } else
        {
            Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
            return obj;
        }
    }

}
