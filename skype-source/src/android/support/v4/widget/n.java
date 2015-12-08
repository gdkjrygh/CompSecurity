// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

final class n
{

    private static Method a;
    private static boolean b;

    static void a(PopupWindow popupwindow)
    {
        if (!b)
        {
            try
            {
                Method method = android/widget/PopupWindow.getDeclaredMethod("setWindowLayoutType", new Class[] {
                    Integer.TYPE
                });
                a = method;
                method.setAccessible(true);
            }
            catch (Exception exception) { }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a.invoke(popupwindow, new Object[] {
            Integer.valueOf(2)
        });
        return;
        popupwindow;
    }
}
