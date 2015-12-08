// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

class PopupWindowCompatGingerbread
{

    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    PopupWindowCompatGingerbread()
    {
    }

    static int getWindowLayoutType(PopupWindow popupwindow)
    {
        if (!sGetWindowLayoutTypeMethodAttempted)
        {
            int i;
            try
            {
                sGetWindowLayoutTypeMethod = android/widget/PopupWindow.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                sGetWindowLayoutTypeMethod.setAccessible(true);
            }
            catch (Exception exception) { }
            sGetWindowLayoutTypeMethodAttempted = true;
        }
        if (sGetWindowLayoutTypeMethod == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        i = ((Integer)sGetWindowLayoutTypeMethod.invoke(popupwindow, new Object[0])).intValue();
        return i;
        popupwindow;
        return 0;
    }

    static void setWindowLayoutType(PopupWindow popupwindow, int i)
    {
        if (!sSetWindowLayoutTypeMethodAttempted)
        {
            try
            {
                sSetWindowLayoutTypeMethod = android/widget/PopupWindow.getDeclaredMethod("setWindowLayoutType", new Class[] {
                    Integer.TYPE
                });
                sSetWindowLayoutTypeMethod.setAccessible(true);
            }
            catch (Exception exception) { }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        if (sSetWindowLayoutTypeMethod == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        sSetWindowLayoutTypeMethod.invoke(popupwindow, new Object[] {
            Integer.valueOf(i)
        });
        return;
        popupwindow;
    }
}
