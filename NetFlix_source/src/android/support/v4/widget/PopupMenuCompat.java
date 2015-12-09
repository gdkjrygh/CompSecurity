// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            PopupMenuCompatKitKat

public class PopupMenuCompat
{
    static class BasePopupMenuImpl
        implements PopupMenuImpl
    {

        public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
        {
            return null;
        }

        BasePopupMenuImpl()
        {
        }
    }

    static class KitKatPopupMenuImpl extends BasePopupMenuImpl
    {

        public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
        {
            return PopupMenuCompatKitKat.getDragToOpenListener(obj);
        }

        KitKatPopupMenuImpl()
        {
        }
    }

    static interface PopupMenuImpl
    {

        public abstract android.view.View.OnTouchListener getDragToOpenListener(Object obj);
    }


    static final PopupMenuImpl IMPL;

    private PopupMenuCompat()
    {
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(Object obj)
    {
        return IMPL.getDragToOpenListener(obj);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new KitKatPopupMenuImpl();
        } else
        {
            IMPL = new BasePopupMenuImpl();
        }
    }
}
