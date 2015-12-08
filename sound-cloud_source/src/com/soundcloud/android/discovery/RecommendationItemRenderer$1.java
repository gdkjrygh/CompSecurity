// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.view.View;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationItemRenderer, RecommendationItem

class val.recommendationItem
    implements android.view.ationItemRenderer._cls1
{

    final RecommendationItemRenderer this$0;
    final RecommendationItem val$recommendationItem;

    public void onClick(View view)
    {
        view = RecommendationItemRenderer.access$000(RecommendationItemRenderer.this);
        if (view != null)
        {
            view.onRecommendationReasonClicked(val$recommendationItem);
        }
    }

    RecommendationClickListener()
    {
        this$0 = final_recommendationitemrenderer;
        val$recommendationItem = RecommendationItem.this;
        super();
    }
}
