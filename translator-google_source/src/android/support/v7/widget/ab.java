// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class ab
    implements Runnable
{

    final ListPopupWindow a;

    ab(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public final void run()
    {
        a.f();
    }
}
