// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona

class this._cls1
    implements android.view.animation.ener
{

    final is._cls0 this$1;

    public void onAnimationEnd(Animation animation)
    {
        Log.d("DominosNinaPersona", "Exit animation ended.");
        DominosNinaPersona.access$300(_fld0).countDown();
        DominosNinaPersona.access$400(_fld0).setVisibility(4);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        Log.d("DominosNinaPersona", "Exit animation started.");
    }

    er()
    {
        this$1 = this._cls1.this;
        super();
    }
}
