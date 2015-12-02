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
    implements android.view.animation.ner
{

    final a a;

    public void onAnimationEnd(Animation animation)
    {
        GameBoosterActivity.a(a.a).setVisibility(8);
        GameBoosterActivity.b(a.a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/gamebooster/GameBoosterActivity$2

/* anonymous class */
    class GameBoosterActivity._cls2
        implements com.qihoo.security.floatview.ui.FloatViewWndmillView.a
    {

        final GameBoosterActivity a;

        public void a()
        {
            Animation animation = AnimationUtils.loadAnimation(a, 0x7f04000a);
            GameBoosterActivity.a(a).startAnimation(animation);
            animation.setAnimationListener(new GameBoosterActivity._cls2._cls1(this));
        }

            
            {
                a = gameboosteractivity;
                super();
            }
    }

}
