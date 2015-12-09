// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.util.Log;
import android.view.animation.Animation;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona

class val.onAnimationFinished
    implements android.view.animation.stener
{

    final DominosNinaPersona this$0;
    final Runnable val$onAnimationFinished;

    public void onAnimationEnd(Animation animation)
    {
        Log.d("DominosNinaPersona", "Start animation finished.");
        DominosNinaPersona.access$200(DominosNinaPersona.this).countDown();
        if (val$onAnimationFinished != null)
        {
            (new Thread(val$onAnimationFinished)).start();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        Log.d("DominosNinaPersona", "Start animation started.");
    }

    ener()
    {
        this$0 = final_dominosninapersona;
        val$onAnimationFinished = Runnable.this;
        super();
    }
}
