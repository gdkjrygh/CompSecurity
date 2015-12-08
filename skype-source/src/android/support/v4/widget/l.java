// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            m, n

public final class l
{
    static class a extends e
    {

        public void a(PopupWindow popupwindow, boolean flag)
        {
            m.a(popupwindow, flag);
        }

        a()
        {
        }
    }

    static final class b extends a
    {

        public final void a(PopupWindow popupwindow)
        {
            popupwindow.setWindowLayoutType(2);
        }

        public final void a(PopupWindow popupwindow, boolean flag)
        {
            popupwindow.setOverlapAnchor(flag);
        }

        b()
        {
        }
    }

    static class c
        implements f
    {

        public void a(PopupWindow popupwindow)
        {
        }

        public void a(PopupWindow popupwindow, View view, int i, int j, int k)
        {
            popupwindow.showAsDropDown(view, i, j);
        }

        public void a(PopupWindow popupwindow, boolean flag)
        {
        }

        c()
        {
        }
    }

    static class d extends c
    {

        public void a(PopupWindow popupwindow)
        {
            n.a(popupwindow);
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

        public abstract void a(PopupWindow popupwindow);

        public abstract void a(PopupWindow popupwindow, View view, int i, int j, int k);

        public abstract void a(PopupWindow popupwindow, boolean flag);
    }


    static final f a;

    public static void a(PopupWindow popupwindow)
    {
        a.a(popupwindow);
    }

    public static void a(PopupWindow popupwindow, View view, int i, int j, int k)
    {
        a.a(popupwindow, view, i, j, k);
    }

    public static void a(PopupWindow popupwindow, boolean flag)
    {
        a.a(popupwindow, flag);
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
