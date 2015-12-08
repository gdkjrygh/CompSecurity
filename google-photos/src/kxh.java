// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

class kxh extends kxe
{

    kxh()
    {
    }

    public final void a(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
        }
    }

    public final void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
    }
}
