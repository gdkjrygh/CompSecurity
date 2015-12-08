// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            PopupWindowCompatApi21, PopupWindowCompatKitKat, PopupWindowCompatGingerbread, PopupWindowCompatApi23

public class PopupWindowCompat
{
    static class Api21PopupWindowImpl extends KitKatPopupWindowImpl
    {

        public boolean getOverlapAnchor(PopupWindow popupwindow)
        {
            return PopupWindowCompatApi21.getOverlapAnchor(popupwindow);
        }

        public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
        {
            PopupWindowCompatApi21.setOverlapAnchor(popupwindow, flag);
        }

        Api21PopupWindowImpl()
        {
        }
    }

    static class Api23PopupWindowImpl extends Api21PopupWindowImpl
    {

        public boolean getOverlapAnchor(PopupWindow popupwindow)
        {
            return PopupWindowCompatApi23.getOverlapAnchor(popupwindow);
        }

        public int getWindowLayoutType(PopupWindow popupwindow)
        {
            return PopupWindowCompatApi23.getWindowLayoutType(popupwindow);
        }

        public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
        {
            PopupWindowCompatApi23.setOverlapAnchor(popupwindow, flag);
        }

        public void setWindowLayoutType(PopupWindow popupwindow, int i)
        {
            PopupWindowCompatApi23.setWindowLayoutType(popupwindow, i);
        }

        Api23PopupWindowImpl()
        {
        }
    }

    static class BasePopupWindowImpl
        implements PopupWindowImpl
    {

        public boolean getOverlapAnchor(PopupWindow popupwindow)
        {
            return false;
        }

        public int getWindowLayoutType(PopupWindow popupwindow)
        {
            return 0;
        }

        public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
        {
        }

        public void setWindowLayoutType(PopupWindow popupwindow, int i)
        {
        }

        public void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
        {
            popupwindow.showAsDropDown(view, i, j);
        }

        BasePopupWindowImpl()
        {
        }
    }

    static class GingerbreadPopupWindowImpl extends BasePopupWindowImpl
    {

        public int getWindowLayoutType(PopupWindow popupwindow)
        {
            return PopupWindowCompatGingerbread.getWindowLayoutType(popupwindow);
        }

        public void setWindowLayoutType(PopupWindow popupwindow, int i)
        {
            PopupWindowCompatGingerbread.setWindowLayoutType(popupwindow, i);
        }

        GingerbreadPopupWindowImpl()
        {
        }
    }

    static class KitKatPopupWindowImpl extends GingerbreadPopupWindowImpl
    {

        public void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
        {
            PopupWindowCompatKitKat.showAsDropDown(popupwindow, view, i, j, k);
        }

        KitKatPopupWindowImpl()
        {
        }
    }

    static interface PopupWindowImpl
    {

        public abstract boolean getOverlapAnchor(PopupWindow popupwindow);

        public abstract int getWindowLayoutType(PopupWindow popupwindow);

        public abstract void setOverlapAnchor(PopupWindow popupwindow, boolean flag);

        public abstract void setWindowLayoutType(PopupWindow popupwindow, int i);

        public abstract void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k);
    }


    static final PopupWindowImpl IMPL;

    private PopupWindowCompat()
    {
    }

    public static boolean getOverlapAnchor(PopupWindow popupwindow)
    {
        return IMPL.getOverlapAnchor(popupwindow);
    }

    public static int getWindowLayoutType(PopupWindow popupwindow)
    {
        return IMPL.getWindowLayoutType(popupwindow);
    }

    public static void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
    {
        IMPL.setOverlapAnchor(popupwindow, flag);
    }

    public static void setWindowLayoutType(PopupWindow popupwindow, int i)
    {
        IMPL.setWindowLayoutType(popupwindow, i);
    }

    public static void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
    {
        IMPL.showAsDropDown(popupwindow, view, i, j, k);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            IMPL = new Api23PopupWindowImpl();
        } else
        if (i >= 21)
        {
            IMPL = new Api21PopupWindowImpl();
        } else
        if (i >= 19)
        {
            IMPL = new KitKatPopupWindowImpl();
        } else
        if (i >= 9)
        {
            IMPL = new GingerbreadPopupWindowImpl();
        } else
        {
            IMPL = new BasePopupWindowImpl();
        }
    }
}
