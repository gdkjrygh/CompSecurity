// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.Context;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationItemRenderer, RecommendationItem

static interface 
{

    public abstract void onRecommendationArtworkClicked(RecommendationItem recommendationitem);

    public abstract void onRecommendationReasonClicked(RecommendationItem recommendationitem);

    public abstract void onRecommendationViewAllClicked(Context context, RecommendationItem recommendationitem);
}
