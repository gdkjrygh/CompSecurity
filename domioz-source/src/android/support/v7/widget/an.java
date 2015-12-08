// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class an
    implements Runnable
{

    final ListPopupWindow a;

    private an(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    an(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void run()
    {
        a.h();
    }
}
