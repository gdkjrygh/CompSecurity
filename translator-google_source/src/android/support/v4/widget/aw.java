// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//            av, ba

class aw extends av
{

    aw()
    {
    }

    public void a(PopupWindow popupwindow)
    {
        if (!ba.b)
        {
            try
            {
                Method method = android/widget/PopupWindow.getDeclaredMethod("setWindowLayoutType", new Class[] {
                    Integer.TYPE
                });
                ba.a = method;
                method.setAccessible(true);
            }
            catch (Exception exception) { }
            ba.b = true;
        }
        if (ba.a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        ba.a.invoke(popupwindow, new Object[] {
            Integer.valueOf(2)
        });
        return;
        popupwindow;
    }
}
