// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.millennialmedia.android:
//            MMAdView, MMSDK

class ientListener extends ientListener
{

    final MMAdView this$0;

    void animateTransition()
    {
        if (refreshAnimationimageView.getDrawable() == null) goto _L2; else goto _L1
_L1:
        int i;
        int j = transitionType;
        i = j;
        if (j == 4)
        {
            i = (new Random()).nextInt(4);
        }
        i;
        JVM INSTR tableswitch 2 3: default 64
    //                   2 117
    //                   3 140;
           goto _L3 _L4 _L5
_L3:
        final Object animFinal = new AlphaAnimation(1.0F, 0.0F);
_L7:
        ((Animation) (animFinal)).setDuration(1000L);
        ((Animation) (animFinal)).setAnimationListener(MMAdView.this);
        ((Animation) (animFinal)).setFillEnabled(true);
        ((Animation) (animFinal)).setFillBefore(true);
        ((Animation) (animFinal)).setFillAfter(true);
        MMSDK.runOnUiThread(new Runnable() {

            final MMAdView.MMAdViewMMAdImpl this$1;
            final Animation val$animFinal;

            public void run()
            {
                refreshAnimationimageView.startAnimation(animFinal);
            }

            
            {
                this$1 = MMAdView.MMAdViewMMAdImpl.this;
                animFinal = animation;
                super();
            }
        });
_L2:
        return;
_L4:
        animFinal = new TranslateAnimation(0.0F, 0.0F, 0.0F, -(float)getHeight());
        continue; /* Loop/switch isn't completed */
_L5:
        animFinal = new TranslateAnimation(0.0F, 0.0F, 0.0F, getHeight());
        if (true) goto _L7; else goto _L6
_L6:
    }

    String getReqType()
    {
        return "getad";
    }

    String getRequestCompletedAction()
    {
        return "millennialmedia.action.ACTION_GETAD_SUCCEEDED";
    }

    String getRequestFailedAction()
    {
        return "millennialmedia.action.ACTION_GETAD_FAILED";
    }

    public boolean hasCachedVideoSupport()
    {
        return false;
    }

    void insertUrlAdMetaValues(Map map)
    {
        if (height > 0)
        {
            map.put("hsht", String.valueOf(height));
        }
        if (width > 0)
        {
            map.put("hswd", String.valueOf(width));
        }
        super.insertUrlAdMetaValues(map);
    }

    public boolean isBanner()
    {
        return true;
    }

    boolean isLifecycleObservable()
    {
        return getWindowToken() != null;
    }

    boolean isTransitionAnimated()
    {
        return transitionType != 0;
    }

    void prepareTransition(Bitmap bitmap)
    {
        refreshAnimationimageView.setImageBitmap(bitmap);
        refreshAnimationimageView.setVisibility(0);
        refreshAnimationimageView.bringToFront();
    }

    public _cls1.val.animFinal(Context context)
    {
        this$0 = MMAdView.this;
        super(MMAdView.this, context);
        mmWebViewClientListener = new ientListener(this);
    }
}
