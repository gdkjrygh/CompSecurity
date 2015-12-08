// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona, NinaView

class val.onAnimationFinished
    implements Runnable
{

    final DominosNinaPersona this$0;
    final Runnable val$onAnimationFinished;

    private Animation getAnimation()
    {
        int i = DominosNinaPersona.access$000(DominosNinaPersona.this).getAnimationHeight();
        if (i == 0)
        {
            return new TranslateAnimation(0, 0.0F, 0, 0.0F, 2, 0.0F, 2, 1.0F);
        } else
        {
            return new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
        }
    }

    private void runCloseAnimation()
    {
        Animation animation;
        animation = getAnimation();
        animation.setDuration(350L);
        class _cls1
            implements android.view.animation.Animation.AnimationListener
        {

            final DominosNinaPersona._cls4 this$1;

            public void onAnimationEnd(Animation animation1)
            {
                Log.d("DominosNinaPersona", "Exit animation ended.");
                DominosNinaPersona.access$300(this$0).countDown();
                DominosNinaPersona.access$400(this$0).setVisibility(4);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
                Log.d("DominosNinaPersona", "Exit animation started.");
            }

            _cls1()
            {
                this$1 = DominosNinaPersona._cls4.this;
                super();
            }
        }

        animation.setAnimationListener(new _cls1());
        if (!DominosNinaPersona.access$200(DominosNinaPersona.this).await(700L, TimeUnit.MILLISECONDS))
        {
            break MISSING_BLOCK_LABEL_185;
        }
        DominosNinaPersona.access$000(DominosNinaPersona.this).setAnimation(animation);
        class _cls2
            implements Runnable
        {

            final DominosNinaPersona._cls4 this$1;

            public void run()
            {
                DominosNinaPersona.access$500(this$0).removeAllViews();
                DominosNinaPersona.access$000(this$0).invalidate();
            }

            _cls2()
            {
                this$1 = DominosNinaPersona._cls4.this;
                super();
            }
        }

        DominosNinaPersona.access$600(DominosNinaPersona.this).post(new _cls2());
        Log.d("DominosNinaPersona", "Exit animation set.");
        try
        {
            if (!DominosNinaPersona.access$300(DominosNinaPersona.this).await(700L, TimeUnit.MILLISECONDS))
            {
                Log.w("DominosNinaPersona", "Exit animation took too long.  Just closing.");
                DominosNinaPersona.access$300(DominosNinaPersona.this).countDown();
            }
        }
        catch (InterruptedException interruptedexception)
        {
            try
            {
                Log.w("DominosNinaPersona", "Interrupted while waiting for exit animation to finish.");
            }
            catch (InterruptedException interruptedexception1)
            {
                Log.e("DominosNinaPersona", "Interrupted while waiting for start animation to finish before starting close animation.");
            }
        }
_L1:
        DominosNinaPersona.access$200(DominosNinaPersona.this).countDown();
        DominosNinaPersona.access$202(DominosNinaPersona.this, new CountDownLatch(1));
        if (val$onAnimationFinished != null)
        {
            val$onAnimationFinished.run();
        }
        return;
        Log.i("DominosNinaPersona", "Skipping close animation because start animation didn't finish in time.");
        DominosNinaPersona.access$300(DominosNinaPersona.this).countDown();
          goto _L1
    }

    public void run()
    {
        runCloseAnimation();
    }

    _cls2()
    {
        this$0 = final_dominosninapersona;
        val$onAnimationFinished = Runnable.this;
        super();
    }
}
