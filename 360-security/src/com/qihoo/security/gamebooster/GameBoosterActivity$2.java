// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

class a
    implements com.qihoo.security.floatview.ui.
{

    final GameBoosterActivity a;

    public void a()
    {
        Animation animation = AnimationUtils.loadAnimation(a, 0x7f04000a);
        GameBoosterActivity.a(a).startAnimation(animation);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final GameBoosterActivity._cls2 a;

            public void onAnimationEnd(Animation animation1)
            {
                GameBoosterActivity.a(a.a).setVisibility(8);
                GameBoosterActivity.b(a.a);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                a = GameBoosterActivity._cls2.this;
                super();
            }
        });
    }

    _cls1.a(GameBoosterActivity gameboosteractivity)
    {
        a = gameboosteractivity;
        super();
    }
}
