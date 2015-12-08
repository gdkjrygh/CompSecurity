// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.analytics:
//            EngagementsTracking

class val.isFollow
    implements f
{

    final EngagementsTracking this$0;
    final boolean val$isFollow;

    public UIEvent call(PropertySet propertyset)
    {
        return UIEvent.fromToggleFollow(val$isFollow, EntityMetadata.fromUser(propertyset));
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_engagementstracking;
        val$isFollow = Z.this;
        super();
    }
}
