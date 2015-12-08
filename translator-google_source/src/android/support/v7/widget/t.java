// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.widget:
//            q, AppCompatSpinner

final class t
    implements android.widget.PopupWindow.OnDismissListener
{

    final android.view.ViewTreeObserver.OnGlobalLayoutListener a;
    final q b;

    t(q q1, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        b = q1;
        a = ongloballayoutlistener;
        super();
    }

    public final void onDismiss()
    {
        ViewTreeObserver viewtreeobserver = b.b.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(a);
        }
    }
}
