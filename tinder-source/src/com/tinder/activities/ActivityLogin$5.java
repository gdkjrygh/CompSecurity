// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.animation.Animator;
import android.content.Intent;
import com.tinder.e.av;

// Referenced classes of package com.tinder.activities:
//            ActivityLogin, ActivityMain

final class a extends av
{

    final ActivityLogin a;

    public final void onAnimationEnd(Animator animator)
    {
        a.startActivity(new Intent(a, com/tinder/activities/ActivityMain));
        a.overridePendingTransition(0, 0x7f04000d);
        a.finish();
    }

    (ActivityLogin activitylogin)
    {
        a = activitylogin;
        super();
    }
}
