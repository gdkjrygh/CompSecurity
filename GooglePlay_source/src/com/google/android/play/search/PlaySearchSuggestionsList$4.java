// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchSuggestionsList

final class val.distanceToCover extends Animation
{

    final PlaySearchSuggestionsList this$0;
    final int val$currentHeight;
    final int val$distanceToCover;

    protected final void applyTransformation(float f, Transformation transformation)
    {
        PlaySearchSuggestionsList.access$100(PlaySearchSuggestionsList.this).getLayoutParams().t = val$currentHeight + (int)((float)val$distanceToCover * f);
        PlaySearchSuggestionsList.access$100(PlaySearchSuggestionsList.this).requestLayout();
    }

    public final boolean willChangeBounds()
    {
        return true;
    }

    ()
    {
        this$0 = final_playsearchsuggestionslist;
        val$currentHeight = i;
        val$distanceToCover = I.this;
        super();
    }
}
