// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.util.Pair;
import android.view.View;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerOverlayController

class SlideAnimationHelper
{

    private static final Pair SLIDE_TRANSITION_BOUNDS_ARTWORK = new Pair(Float.valueOf(0.4F), Float.valueOf(1.0F));
    private static final Pair SLIDE_TRANSITION_BOUNDS_FOOTER = new Pair(Float.valueOf(0.6F), Float.valueOf(1.0F));
    private static final Pair SLIDE_TRANSITION_BOUNDS_FULLSCREEN = new Pair(Float.valueOf(0.4F), Float.valueOf(0.9F));

    SlideAnimationHelper()
    {
    }

    private transient void configureViewsFromSlide(float f, View view, PlayerOverlayController aplayeroverlaycontroller[])
    {
        int j = aplayeroverlaycontroller.length;
        for (int i = 0; i < j; i++)
        {
            aplayeroverlaycontroller[i].setAlphaFromCollapse(getSlideAnimateValue(1.0F - f, SLIDE_TRANSITION_BOUNDS_ARTWORK));
        }

        setAlpha(getSlideAnimateValue(1.0F - f, SLIDE_TRANSITION_BOUNDS_FOOTER), view);
    }

    private float getSlideAnimateValue(float f, Pair pair)
    {
        return Math.min(1.0F, Math.max(0.0F, (f - ((Float)pair.first).floatValue()) / (((Float)pair.second).floatValue() - ((Float)pair.first).floatValue())));
    }

    private void setAlpha(float f, View view)
    {
        view.setAlpha(Math.min(1.0F, Math.max(0.0F, f)));
    }

    private void setAlpha(float f, Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); setAlpha(f, (View)iterable.next())) { }
    }

    transient void configureViewsFromSlide(float f, View view, View view1, PlayerOverlayController aplayeroverlaycontroller[])
    {
        configureViewsFromSlide(f, view, aplayeroverlaycontroller);
        setAlpha(getSlideAnimateValue(f, SLIDE_TRANSITION_BOUNDS_FULLSCREEN), view1);
    }

    transient void configureViewsFromSlide(float f, View view, Iterable iterable, PlayerOverlayController aplayeroverlaycontroller[])
    {
        configureViewsFromSlide(f, view, aplayeroverlaycontroller);
        setAlpha(getSlideAnimateValue(f, SLIDE_TRANSITION_BOUNDS_FULLSCREEN), iterable);
    }

}
