// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//            n, p

static class  extends 
{

    public void b(PopupWindow popupwindow)
    {
        if (!p.b)
        {
            try
            {
                Method method = android/widget/PopupWindow.getDeclaredMethod("setWindowLayoutType", new Class[] {
                    Integer.TYPE
                });
                p.a = method;
                method.setAccessible(true);
            }
            catch (Exception exception) { }
            p.b = true;
        }
        if (p.a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        p.a.invoke(popupwindow, new Object[] {
            Integer.valueOf(2)
        });
        return;
        popupwindow;
    }

    ()
    {
    }
}
