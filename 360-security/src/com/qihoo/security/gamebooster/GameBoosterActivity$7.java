// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

class a
    implements android.view.animation.tener
{

    final int a;
    final GameBoosterActivity b;

    public void onAnimationEnd(Animation animation)
    {
        GameBoosterActivity.h(b).clearAnimation();
        GameBoosterActivity.h(b).setPadding(a, 0, a, 0);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    (GameBoosterActivity gameboosteractivity, int i)
    {
        b = gameboosteractivity;
        a = i;
        super();
    }
}
