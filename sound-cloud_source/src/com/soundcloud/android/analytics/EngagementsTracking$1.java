// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.analytics:
//            EngagementsTracking, PromotedSourceInfo

class val.promotedSourceInfo
    implements f
{

    final EngagementsTracking this$0;
    final boolean val$addLike;
    final String val$contextScreen;
    final String val$invokerScreen;
    final String val$pageName;
    final Urn val$pageUrn;
    final PromotedSourceInfo val$promotedSourceInfo;
    final Urn val$trackUrn;

    public UIEvent call(PropertySet propertyset)
    {
        return UIEvent.fromToggleLike(val$addLike, val$invokerScreen, val$contextScreen, val$pageName, val$trackUrn, val$pageUrn, val$promotedSourceInfo, EntityMetadata.from(propertyset));
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_engagementstracking;
        val$addLike = flag;
        val$invokerScreen = s;
        val$contextScreen = s1;
        val$pageName = s2;
        val$trackUrn = urn;
        val$pageUrn = urn1;
        val$promotedSourceInfo = PromotedSourceInfo.this;
        super();
    }
}
