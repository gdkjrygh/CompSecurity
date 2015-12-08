// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.widget:
//            AppCompatSpinner

final class a
    implements android.widget.Listener
{

    final android.view.obalLayoutListener a;
    final tener b;

    public final void onDismiss()
    {
        ViewTreeObserver viewtreeobserver = b.b.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(a);
        }
    }

    tener(tener tener, android.view.obalLayoutListener oballayoutlistener)
    {
        b = tener;
        a = oballayoutlistener;
        super();
    }
}
