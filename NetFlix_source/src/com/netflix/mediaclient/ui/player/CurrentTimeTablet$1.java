// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.view.animation.Animation;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            CurrentTimeTablet, BottomPanel

class val.bp
    implements android.view.animation.istener
{

    final CurrentTimeTablet this$0;
    final BottomPanel val$bp;

    public void onAnimationEnd(Animation animation)
    {
        animation = CurrentTimeTablet.access$100(CurrentTimeTablet.this);
        animation;
        JVM INSTR monitorenter ;
        int i;
        currentTimeAnimationInProgress = false;
        i = AndroidUtils.dipToPixels(context, 40);
        android.widget.tParams tparams = (android.widget.tParams)currentTime.getLayoutParams();
        tparams.setMargins(val$bp.getTimeX(currentTime), 0, 0, i);
        currentTime.setLayoutParams(tparams);
        if (!CurrentTimeTablet.access$100(CurrentTimeTablet.this).animationCanceled) goto _L2; else goto _L1
_L1:
        Log.d("screen", "Animation was canceled, do nothing!");
_L4:
        CurrentTimeTablet.access$100(CurrentTimeTablet.this).animationCanceled = false;
        return;
_L2:
        Log.d("screen", "Animation was NOT canceled, expand!");
        if (!mBifDownloaded.get())
        {
            break MISSING_BLOCK_LABEL_217;
        }
        Log.w("screen", "Bifs are downloaded, remove current time background");
        currentTime.setBackgroundResource(0);
_L5:
        android.widget.tParams tparams1 = (android.widget.tParams)currentTimeExp.getLayoutParams();
        tparams1.setMargins(val$bp.getTimeX(currentTimeExp), 0, 0, i);
        currentTimeExp.setLayoutParams(tparams1);
        currentTimeExp.setVisibility(0);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        animation;
        JVM INSTR monitorexit ;
        throw exception;
        Log.w("screen", "Bifs are not downloaded, do not remove current time background");
          goto _L5
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        synchronized (CurrentTimeTablet.access$100(CurrentTimeTablet.this))
        {
            currentTimeAnimationInProgress = true;
        }
        return;
        exception;
        animation;
        JVM INSTR monitorexit ;
        throw exception;
    }

    imationLock()
    {
        this$0 = final_currenttimetablet;
        val$bp = BottomPanel.this;
        super();
    }
}
