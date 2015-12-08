// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

public class UiUtils
{
    public static interface KeyboardShowingDelegate
    {

        public abstract boolean disableKeyboardCheck(Context context, View view);
    }


    private static final float KEYBOARD_DETECT_BOTTOM_THRESHOLD_DP = 100F;
    private static final String TAG = "UiUtils";
    private static KeyboardShowingDelegate sKeyboardShowingDelegate;

    private UiUtils()
    {
    }

    public static Bitmap generateScaledScreenshot(View view, int i, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap1;
        Object obj;
        Bitmap bitmap2;
        boolean flag;
        obj = null;
        bitmap2 = null;
        flag = view.isDrawingCacheEnabled();
        bitmap1 = obj;
        prepareViewHierarchyForScreenshot(view, true);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        bitmap1 = obj;
        view.setDrawingCacheEnabled(true);
        bitmap1 = obj;
        Bitmap bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        bitmap1 = obj;
        double d = bitmap.getHeight();
        bitmap1 = obj;
        double d1 = bitmap.getWidth();
        int j;
        int k;
        k = (int)d1;
        j = (int)d;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        bitmap1 = obj;
        double d2 = (double)i / Math.max(d1, d);
        bitmap1 = obj;
        k = (int)Math.round(d1 * d2);
        bitmap1 = obj;
        j = (int)Math.round(d * d2);
        bitmap1 = obj;
        bitmap2 = Bitmap.createScaledBitmap(bitmap, k, j, true);
        bitmap1 = obj;
        if (bitmap2.getConfig() == config) goto _L4; else goto _L3
_L3:
        bitmap1 = obj;
        bitmap = bitmap2.copy(config, false);
        bitmap1 = bitmap;
        bitmap2.recycle();
_L5:
        if (!flag)
        {
            view.setDrawingCacheEnabled(false);
        }
        prepareViewHierarchyForScreenshot(view, false);
        return bitmap;
_L4:
        bitmap = bitmap2;
          goto _L5
_L2:
        bitmap = bitmap2;
        bitmap1 = obj;
        if (view.getMeasuredHeight() <= 0) goto _L5; else goto _L6
_L6:
        bitmap = bitmap2;
        bitmap1 = obj;
        if (view.getMeasuredWidth() <= 0) goto _L5; else goto _L7
_L7:
        bitmap1 = obj;
        d = view.getMeasuredHeight();
        bitmap1 = obj;
        d1 = view.getMeasuredWidth();
        k = (int)d1;
        j = (int)d;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        bitmap1 = obj;
        d2 = (double)i / Math.max(d1, d);
        bitmap1 = obj;
        k = (int)Math.round(d1 * d2);
        bitmap1 = obj;
        j = (int)Math.round(d * d2);
        bitmap1 = obj;
        bitmap = Bitmap.createBitmap(k, j, config);
        bitmap1 = obj;
        config = new Canvas(bitmap);
        bitmap1 = obj;
        config.scale((float)((double)k / d1), (float)((double)j / d));
        bitmap1 = obj;
        view.draw(config);
          goto _L5
        config;
        Log.d("UiUtils", (new StringBuilder()).append("Unable to capture screenshot and scale it down.").append(config.getMessage()).toString());
        if (!flag)
        {
            view.setDrawingCacheEnabled(false);
        }
        prepareViewHierarchyForScreenshot(view, false);
        return bitmap1;
        config;
        if (!flag)
        {
            view.setDrawingCacheEnabled(false);
        }
        prepareViewHierarchyForScreenshot(view, false);
        throw config;
    }

    public static boolean hideKeyboard(View view)
    {
        return ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static int insertAfter(ViewGroup viewgroup, View view, View view1)
    {
        return insertView(viewgroup, view, view1, true);
    }

    public static int insertBefore(ViewGroup viewgroup, View view, View view1)
    {
        return insertView(viewgroup, view, view1, false);
    }

    private static int insertView(ViewGroup viewgroup, View view, View view1, boolean flag)
    {
        int i = viewgroup.indexOfChild(view);
        if (i >= 0)
        {
            return i;
        }
        int j = viewgroup.indexOfChild(view1);
        if (j < 0)
        {
            return -1;
        }
        i = j;
        if (flag)
        {
            i = j + 1;
        }
        viewgroup.addView(view, i);
        return i;
    }

    public static boolean isKeyboardShowing(Context context, View view)
    {
        if (sKeyboardShowingDelegate == null || !sKeyboardShowingDelegate.disableKeyboardCheck(context, view))
        {
            if ((view = view.getRootView()) != null)
            {
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                float f = context.getResources().getDisplayMetrics().density;
                if ((float)Math.abs(view.getHeight() - rect.height()) / f > 100F)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static void prepareViewHierarchyForScreenshot(View view, boolean flag)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                prepareViewHierarchyForScreenshot(view.getChildAt(i), flag);
            }

        } else
        if (view instanceof SurfaceView)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setWillNotDraw(flag);
        }
    }

    public static void setKeyboardShowingDelegate(KeyboardShowingDelegate keyboardshowingdelegate)
    {
        sKeyboardShowingDelegate = keyboardshowingdelegate;
    }

    public static void showKeyboard(View view)
    {
        ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
