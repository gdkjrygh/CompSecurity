// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;

// Referenced classes of package com.pandora.android.daydream:
//            a

static final class b
    implements Runnable
{

    final LinearLayout a;
    final Runnable b;

    public void run()
    {
        a.animate().alpha(0.0F).setDuration(300L).setStartDelay(5000L).withEndAction(b).start();
    }

    (LinearLayout linearlayout, Runnable runnable)
    {
        a = linearlayout;
        b = runnable;
        super();
    }
}
