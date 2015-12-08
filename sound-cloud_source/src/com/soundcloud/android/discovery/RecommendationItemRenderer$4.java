// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;


// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationReason

class 
{

    static final int $SwitchMap$com$soundcloud$android$discovery$RecommendationReason[];

    static 
    {
        $SwitchMap$com$soundcloud$android$discovery$RecommendationReason = new int[RecommendationReason.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$discovery$RecommendationReason[RecommendationReason.LIKED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$discovery$RecommendationReason[RecommendationReason.LISTENED_TO.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
