// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            dl

final class dt
    implements android.widget.PopupWindow.OnDismissListener
{

    final dl a;

    dt(dl dl1)
    {
        a = dl1;
        super();
    }

    public final void onDismiss()
    {
        a.d();
    }
}
