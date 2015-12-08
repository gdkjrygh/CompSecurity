// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationReason

class RecommendationProperty
{

    static final Property REASON = Property.of(com/soundcloud/android/discovery/RecommendationProperty, com/soundcloud/android/discovery/RecommendationReason);
    static final Property RECOMMENDED_TRACKS_COUNT = Property.of(com/soundcloud/android/discovery/RecommendationProperty, java/lang/Integer);
    static final Property SEED_TRACK_LOCAL_ID = Property.of(com/soundcloud/android/discovery/RecommendationProperty, java/lang/Long);
    static final Property SEED_TRACK_TITLE = Property.of(com/soundcloud/android/discovery/RecommendationProperty, java/lang/String);
    static final Property SEED_TRACK_URN = Property.of(com/soundcloud/android/discovery/RecommendationProperty, com/soundcloud/android/model/Urn);

    RecommendationProperty()
    {
    }

}
