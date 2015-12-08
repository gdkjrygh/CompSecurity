// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

// Referenced classes of package com.google.android.gms.internal:
//            zzhp

static class outListener extends outListener
{

    public void zzb(Activity activity, android.view.bserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
        }
    }

    outListener()
    {
    }
}
