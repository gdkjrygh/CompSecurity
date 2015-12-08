// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ViewUtils
{

    private static final String TAG = "ViewUtils";
    private static Method sComputeFitSystemWindowsMethod;

    private ViewUtils()
    {
    }

    public static int combineMeasuredStates(int i, int j)
    {
        return i | j;
    }

    public static void computeFitSystemWindows(View view, Rect rect, Rect rect1)
    {
        if (sComputeFitSystemWindowsMethod == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        sComputeFitSystemWindowsMethod.invoke(view, new Object[] {
            rect, rect1
        });
        return;
        view;
    }

    public static boolean isLayoutRtl(View view)
    {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static void makeOptionalFitsSystemWindows(View view)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
        if (!method.isAccessible())
        {
            method.setAccessible(true);
        }
        method.invoke(view, new Object[0]);
        return;
        view;
        return;
        view;
        return;
        view;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        Method method = android/view/View.getDeclaredMethod("computeFitSystemWindows", new Class[] {
            android/graphics/Rect, android/graphics/Rect
        });
        sComputeFitSystemWindowsMethod = method;
        if (!method.isAccessible())
        {
            sComputeFitSystemWindowsMethod.setAccessible(true);
        }
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
    }
}
