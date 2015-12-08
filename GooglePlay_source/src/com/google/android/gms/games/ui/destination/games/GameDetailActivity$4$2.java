// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.animation.Animator;
import android.transition.Transition;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.play.animation.BaseAnimatorListener;
import com.google.android.play.transition.BaseTransitionListener;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

final class this._cls1 extends BaseAnimatorListener
{

    final is._cls0 this$1;

    public final void onAnimationEnd(Animator animator)
    {
        if (isDestroyed())
        {
            return;
        } else
        {
            GameDetailActivity.access$1800(_fld0);
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/destination/games/GameDetailActivity$4

/* anonymous class */
    final class GameDetailActivity._cls4 extends BaseTransitionListener
    {

        final GameDetailActivity this$0;

        public final void onTransitionEnd(Transition transition)
        {
            while (isDestroyed() || !GameDetailActivity.access$2600(GameDetailActivity.this)) 
            {
                return;
            }
            boolean _tmp = GameDetailActivity.access$2602$1b0751c8(GameDetailActivity.this);
            GameDetailActivity.access$2500(GameDetailActivity.this).setAlpha(0.0F);
            GameDetailActivity.access$2500(GameDetailActivity.this).setClipToOutline(false);
            findViewById(0x7f0d0156).setBackgroundColor(GameDetailActivity.access$1200(GameDetailActivity.this));
            boolean _tmp1 = GameDetailActivity.access$1302$1b0751c8(GameDetailActivity.this);
            GameDetailActivity.access$2000(GameDetailActivity.this).setVisibility(0);
            if (GameDetailActivity.access$1400(GameDetailActivity.this).mIsInstalled)
            {
                GameDetailActivity.access$1500(GameDetailActivity.this);
            }
            transition = new ArrayList();
            transition.add(Integer.valueOf(0x7f0d0159));
            transition.add(Integer.valueOf(0x7f0d015c));
            transition.add(Integer.valueOf(0x7f0d0161));
            transition.add(Integer.valueOf(0x7f0d0157));
            transition.add(Integer.valueOf(0x7f0d031d));
            transition.add(Integer.valueOf(0x7f0d0158));
            if (!GameDetailActivity.access$1600(GameDetailActivity.this))
            {
                transition.add(Integer.valueOf(0x7f0d0029));
            }
            GameDetailActivity.access$1700$1241a7bc(GameDetailActivity.this, GameDetailActivity.access$600(GameDetailActivity.this), transition).setAnimationListener(new GameDetailActivity._cls4._cls1());
            transition = GameDetailActivity.access$2800$e8bdee3(GameDetailActivity.this, GameDetailActivity.access$600(GameDetailActivity.this));
            transition.addListener(new GameDetailActivity._cls4._cls2());
            transition.start();
        }

            
            {
                this$0 = GameDetailActivity.this;
                super();
            }

        // Unreferenced inner class com/google/android/gms/games/ui/destination/games/GameDetailActivity$4$1

/* anonymous class */
        final class GameDetailActivity._cls4._cls1
            implements android.view.animation.Animation.AnimationListener
        {

            final GameDetailActivity._cls4 this$1;

            public final void onAnimationEnd(Animation animation)
            {
                if (isDestroyed())
                {
                    return;
                } else
                {
                    GameDetailActivity.access$2700$6f1b1d48(this$0, GameDetailActivity.access$600(this$0), new int[] {
                        0x7f0d0027
                    }).setAnimationListener(new GameDetailActivity._cls4._cls1._cls1());
                    return;
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

                    
                    {
                        this$1 = GameDetailActivity._cls4.this;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/games/ui/destination/games/GameDetailActivity$4$1$1

/* anonymous class */
        final class GameDetailActivity._cls4._cls1._cls1
            implements android.view.animation.Animation.AnimationListener
        {

            final GameDetailActivity._cls4._cls1 this$2;

            public final void onAnimationEnd(Animation animation)
            {
                if (isDestroyed())
                {
                    return;
                } else
                {
                    GameDetailActivity.access$2000(this$0).setVisibility(4);
                    return;
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

                    
                    {
                        this$2 = GameDetailActivity._cls4._cls1.this;
                        super();
                    }
        }

    }

}
