// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            ScreenWidthContainer

final class dj
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ScreenWidthContainer a;

    dj(ScreenWidthContainer screenwidthcontainer)
    {
        a = screenwidthcontainer;
        super();
    }

    public final void onGlobalLayout()
    {
        ScreenWidthContainer.a(a);
    }
}
