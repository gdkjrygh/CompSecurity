// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewTreeObserver;

final class acd
    implements android.widget.PopupWindow.OnDismissListener
{

    private android.view.ViewTreeObserver.OnGlobalLayoutListener a;
    private aca b;

    acd(aca aca1, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        b = aca1;
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
