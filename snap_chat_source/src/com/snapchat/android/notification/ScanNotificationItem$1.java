// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import Jr;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;

// Referenced classes of package com.snapchat.android.notification:
//            ScanNotificationItem

final class a extends Jr
{

    private ScanNotificationItem a;

    public final void onAnimationEnd(Animator animator)
    {
        if (a.c == null)
        {
            return;
        }
        if (a.c.getVisibility() == 0)
        {
            a.a(a.e.getResources().getString(0x7f080235));
            a.k = deNotificationSteps.ERROR;
            a.c.setVisibility(8);
        }
        a.c.animate().setStartDelay(0L).setListener(null).cancel();
    }

    deNotificationSteps(ScanNotificationItem scannotificationitem)
    {
        a = scannotificationitem;
        super();
    }
}
