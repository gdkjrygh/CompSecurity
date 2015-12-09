// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchSuggestionsList

final class val.show
    implements android.view.animation.sList._cls5
{

    final PlaySearchSuggestionsList this$0;
    final boolean val$show;

    public final void onAnimationEnd(Animation animation)
    {
        if (!val$show)
        {
            setVisibility(8);
            PlaySearchSuggestionsList.access$100(PlaySearchSuggestionsList.this).setVisibility(8);
        }
        Animation _tmp = PlaySearchSuggestionsList.access$202$2ea0f9f1(PlaySearchSuggestionsList.this);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = final_playsearchsuggestionslist;
        val$show = Z.this;
        super();
    }
}
