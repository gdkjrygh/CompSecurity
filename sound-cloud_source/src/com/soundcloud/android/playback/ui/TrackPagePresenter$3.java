// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPagePresenter, TrackPageListener

class ackPageHolder
    implements com.soundcloud.android.playback.ui.progress.ubListener
{

    final TrackPagePresenter this$0;
    final ackPageHolder val$holder;

    public void displayScrubPosition(float f)
    {
    }

    public void scrubStateChanged(int i)
    {
        TrackPagePresenter.access$200(TrackPagePresenter.this).onScrub(i);
        Iterator iterator = val$holder.hideOnScrubViews.iterator();
        while (iterator.hasNext()) 
        {
            Object obj = (View)iterator.next();
            float f1 = ((View) (obj)).getAlpha();
            float f;
            if (i == 1)
            {
                f = 0.0F;
            } else
            {
                f = 1.0F;
            }
            obj = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
                f1, f
            });
            ((ObjectAnimator) (obj)).setDuration(100L);
            ((ObjectAnimator) (obj)).start();
        }
    }

    ackPageHolder()
    {
        this$0 = final_trackpagepresenter;
        val$holder = ackPageHolder.this;
        super();
    }
}
