// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.application;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.pinterest.activity.task.view.SystemNotificationContainer;
import com.pinterest.base.ApplicationInfo;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.kit.application:
//            CommonApplication, Resources

public class PApplication extends CommonApplication
{

    private static String lastToast = "";
    private static long lastToastTime;
    private static boolean sCanShowNoInternetToast = true;
    private static Handler sToastHandler = new Handler();

    public PApplication()
    {
    }

    public static void forceShowToast(String s)
    {
        showToast(s, 1, 0, 17, true);
    }

    public static void showDebugErrorToast(String s)
    {
        if (StringUtils.isNotEmpty(s) && ApplicationInfo.isNonProduction())
        {
            View view = LayoutInflater.from(context()).inflate(0x7f030205, null);
            view.findViewById(0x7f0f030b).getBackground().setColorFilter(Resources.color(0x7f0e009c), android.graphics.PorterDuff.Mode.ADD);
            TextView textview = (TextView)view.findViewById(0x7f0f0077);
            textview.setText(s);
            textview.setTypeface(Typeface.DEFAULT_BOLD);
            s = new Toast(context());
            s.setView(view);
            s.setGravity(17, 0, 0);
            s.setDuration(1);
            s.show();
        }
    }

    public static void showDebugToast(String s)
    {
        showDebugToast(s, 1);
    }

    public static void showDebugToast(final String string, final int length)
    {
        if (StringUtils.isEmpty(string) || !ApplicationInfo.isNonProduction())
        {
            return;
        }
        string = new _cls2();
        if (Looper.getMainLooper().equals(Looper.myLooper()))
        {
            string.run();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(string);
            return;
        }
    }

    public static void showNoInternetToast()
    {
        if (!sCanShowNoInternetToast || SystemNotificationContainer.isVisible())
        {
            return;
        } else
        {
            showToast(0x7f07039b, 0, 0x7f020173);
            sCanShowNoInternetToast = false;
            sToastHandler.postDelayed(new _cls1(), 5000L);
            return;
        }
    }

    public static void showToast(int i)
    {
        showToast(i, 1, 0);
    }

    public static void showToast(int i, int j)
    {
        showToast(i, 1, j);
    }

    public static void showToast(int i, int j, int k)
    {
        showToast(i, j, k, 17);
    }

    public static void showToast(int i, int j, int k, int l)
    {
        showToast(Resources.string(i), j, k, l, false);
    }

    public static void showToast(int i, Drawable drawable)
    {
        showToast(Resources.string(i), 1, drawable, 17, false);
    }

    public static void showToast(String s)
    {
        showToast(s, 1, 0, 17, false);
    }

    public static void showToast(String s, int i)
    {
        showToast(s, 1, i, 17, false);
    }

    public static void showToast(String s, int i, int j, int k, boolean flag)
    {
        showToast(s, i, Resources.drawable(j), k, flag);
    }

    public static void showToast(String s, int i, Drawable drawable, int j, boolean flag)
    {
        if (!StringUtils.isEmpty(s))
        {
            long l = System.currentTimeMillis();
            if (flag || !s.equalsIgnoreCase(lastToast) || Math.abs(l - lastToastTime) > 8000L)
            {
                View view = LayoutInflater.from(context()).inflate(0x7f030205, null);
                ((TextView)view.findViewById(0x7f0f0077)).setText(s);
                if (drawable != null)
                {
                    ImageView imageview = (ImageView)view.findViewById(0x7f0f0076);
                    imageview.setImageDrawable(drawable);
                    imageview.setVisibility(0);
                }
                drawable = new Toast(context());
                drawable.setView(view);
                drawable.setGravity(j, 0, 0);
                drawable.setDuration(i);
                drawable.show();
                lastToast = s;
                lastToastTime = System.currentTimeMillis();
                return;
            }
        }
    }

    public static void showToastShort(int i)
    {
        showToast(i, 0, 0);
    }

    public static void showToastShort(String s)
    {
        showToast(s, 0, 0, 17, false);
    }



/*
    static boolean access$002(boolean flag)
    {
        sCanShowNoInternetToast = flag;
        return flag;
    }

*/

    private class _cls2
        implements Runnable
    {

        final int val$length;
        final String val$string;

        public final void run()
        {
            View view = LayoutInflater.from(CommonApplication.context()).inflate(0x7f030205, null);
            ((TextView)view.findViewById(0x7f0f0077)).setText(string);
            ((TextView)view.findViewById(0x7f0f0077)).setTypeface(Typeface.MONOSPACE);
            Toast toast = new Toast(CommonApplication.context());
            toast.setView(view);
            toast.setGravity(81, 0, 0);
            toast.setDuration(length);
            toast.show();
        }

        _cls2()
        {
            string = s;
            length = i;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            PApplication.sCanShowNoInternetToast = true;
        }

        _cls1()
        {
        }
    }

}
