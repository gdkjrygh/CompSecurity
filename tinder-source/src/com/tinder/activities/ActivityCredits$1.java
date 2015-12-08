// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.os.CountDownTimer;
import android.widget.ScrollView;

// Referenced classes of package com.tinder.activities:
//            ActivityCredits

final class a extends CountDownTimer
{

    final ActivityCredits a;

    public final void onFinish()
    {
        if (android.os.INT > 14)
        {
            ActivityCredits.a(a).setScrollY(0);
        }
    }

    public final void onTick(long l)
    {
        ActivityCredits.a(a).scrollBy(0, 1);
    }

    (ActivityCredits activitycredits)
    {
        a = activitycredits;
        super(40000L, 25L);
    }
}
