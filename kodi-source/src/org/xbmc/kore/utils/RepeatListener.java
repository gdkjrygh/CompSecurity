// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;

// Referenced classes of package org.xbmc.kore.utils:
//            LogUtils, UIUtils

public class RepeatListener
    implements android.view.View.OnTouchListener
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/utils/RepeatListener);
    private static Handler repeatHandler = new Handler();
    private Animation animDown;
    private Animation animUp;
    private final android.view.View.OnClickListener clickListener;
    private Context context;
    private View downView;
    private Runnable handlerRunnable = new Runnable() {

        final RepeatListener this$0;

        public void run()
        {
            if (downView.isShown())
            {
                if (repeatInterval >= 0)
                {
                    RepeatListener.repeatHandler.postDelayed(this, repeatInterval);
                }
                clickListener.onClick(downView);
            }
        }

            
            {
                this$0 = RepeatListener.this;
                super();
            }
    };
    private int initialInterval;
    private final int repeatInterval;

    public RepeatListener(int i, int j, android.view.View.OnClickListener onclicklistener)
    {
        this(i, j, onclicklistener, null, null, null);
    }

    public RepeatListener(int i, int j, android.view.View.OnClickListener onclicklistener, Animation animation, Animation animation1, Context context1)
    {
        initialInterval = i;
        repeatInterval = j;
        clickListener = onclicklistener;
        animDown = animation;
        animUp = animation1;
        context = context1;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 52
    //                   1 123
    //                   2 36
    //                   3 138;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_138;
_L5:
        return !(view instanceof Button) && !(view instanceof ImageButton);
_L2:
        UIUtils.handleVibration(context);
        repeatHandler.removeCallbacks(handlerRunnable);
        if (initialInterval >= 0)
        {
            repeatHandler.postDelayed(handlerRunnable, initialInterval);
        }
        downView = view;
        if (animDown != null)
        {
            animDown.setFillAfter(true);
            view.startAnimation(animDown);
        }
          goto _L5
_L3:
        clickListener.onClick(view);
        view.playSoundEffect(0);
        repeatHandler.removeCallbacks(handlerRunnable);
        downView = null;
        if (animUp != null)
        {
            view.startAnimation(animUp);
        }
          goto _L5
    }





}
