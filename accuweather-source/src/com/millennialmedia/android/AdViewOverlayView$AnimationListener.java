// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.Button;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            AdViewOverlayView, MMLog

private static class overlayRef
    implements android.view.animation.ener
{

    private WeakReference overlayRef;

    public void onAnimationEnd(Animation animation)
    {
        animation = (AdViewOverlayView)overlayRef.get();
        if (animation != null)
        {
            animation = (Activity)animation.getContext();
            MMLog.d("AdViewOverlayView", "Finishing overlay this is in w/ anim finishOverLayWithAnim()");
            animation.finish();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        animation = (AdViewOverlayView)overlayRef.get();
        if (animation != null && AdViewOverlayView.access$300(animation) != null)
        {
            AdViewOverlayView.access$300(animation).setVisibility(8);
        }
    }

    public (AdViewOverlayView adviewoverlayview)
    {
        overlayRef = new WeakReference(adviewoverlayview);
    }
}
