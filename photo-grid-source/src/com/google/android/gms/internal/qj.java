// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

// Referenced classes of package com.google.android.gms.internal:
//            qg

public class qj extends qg
{

    public qj()
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

    public final void a(View view, Drawable drawable)
    {
        view.setBackground(drawable);
    }

    public final void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
    }
}
