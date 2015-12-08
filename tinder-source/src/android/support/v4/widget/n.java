// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//            o, p

public final class n
{
    static class a extends e
    {

        public void a(PopupWindow popupwindow, boolean flag)
        {
            o.a(popupwindow, flag);
        }

        public boolean a(PopupWindow popupwindow)
        {
            return o.a(popupwindow);
        }

        a()
        {
        }
    }

    static final class b extends a
    {

        public final void a(PopupWindow popupwindow, boolean flag)
        {
            popupwindow.setOverlapAnchor(flag);
        }

        public final boolean a(PopupWindow popupwindow)
        {
            return popupwindow.getOverlapAnchor();
        }

        public final void b(PopupWindow popupwindow)
        {
            popupwindow.setWindowLayoutType(2);
        }

        b()
        {
        }
    }

    static class c
        implements f
    {

        public void a(PopupWindow popupwindow, View view, int i, int j, int k)
        {
            popupwindow.showAsDropDown(view, i, j);
        }

        public void a(PopupWindow popupwindow, boolean flag)
        {
        }

        public boolean a(PopupWindow popupwindow)
        {
            return false;
        }

        public void b(PopupWindow popupwindow)
        {
        }

        c()
        {
        }
    }

    static class d extends c
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

        d()
        {
        }
    }

    static class e extends d
    {

        public final void a(PopupWindow popupwindow, View view, int i, int j, int k)
        {
            popupwindow.showAsDropDown(view, i, j, k);
        }

        e()
        {
        }
    }

    static interface f
    {

        public abstract void a(PopupWindow popupwindow, View view, int i, int j, int k);

        public abstract void a(PopupWindow popupwindow, boolean flag);

        public abstract boolean a(PopupWindow popupwindow);

        public abstract void b(PopupWindow popupwindow);
    }


    static final f a;

    public static void a(PopupWindow popupwindow, View view, int i, int j, int k)
    {
        a.a(popupwindow, view, i, j, k);
    }

    public static void a(PopupWindow popupwindow, boolean flag)
    {
        a.a(popupwindow, flag);
    }

    public static boolean a(PopupWindow popupwindow)
    {
        return a.a(popupwindow);
    }

    public static void b(PopupWindow popupwindow)
    {
        a.b(popupwindow);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new b();
        } else
        if (i >= 21)
        {
            a = new a();
        } else
        if (i >= 19)
        {
            a = new e();
        } else
        if (i >= 9)
        {
            a = new d();
        } else
        {
            a = new c();
        }
    }
}
