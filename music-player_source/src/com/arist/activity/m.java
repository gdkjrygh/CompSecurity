// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.view.animation.Animation;

// Referenced classes of package com.arist.activity:
//            MusicPlayActivity, MainActivity

final class m
    implements android.view.animation.Animation.AnimationListener
{

    final MainActivity a;

    m(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        animation = new Intent(a, com/arist/activity/MusicPlayActivity);
        a.startActivity(animation);
        a.overridePendingTransition(0x7f04000b, 0x7f040004);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
