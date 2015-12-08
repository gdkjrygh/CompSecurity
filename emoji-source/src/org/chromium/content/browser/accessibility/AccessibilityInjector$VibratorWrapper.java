// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.content.Context;
import android.os.Vibrator;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            AccessibilityInjector

private static class mVibrator
{

    private static final long MAX_VIBRATE_DURATION_MS = 5000L;
    private final Vibrator mVibrator;

    public void cancel()
    {
        mVibrator.cancel();
    }

    public boolean hasVibrator()
    {
        return mVibrator.hasVibrator();
    }

    public void vibrate(long l)
    {
        l = Math.min(l, 5000L);
        mVibrator.vibrate(l);
    }

    public void vibrate(long al[], int i)
    {
        for (i = 0; i < al.length; i++)
        {
            al[i] = Math.min(al[i], 5000L);
        }

        mVibrator.vibrate(al, -1);
    }

    public (Context context)
    {
        mVibrator = (Vibrator)context.getSystemService("vibrator");
    }
}
