// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.model;

import com.soundcloud.java.collections.Property;

// Referenced classes of package com.soundcloud.android.model:
//            PlayableProperty, Urn

public class PromotedItemProperty extends PlayableProperty
{

    public static final Property AD_URN = Property.of(com/soundcloud/android/model/PromotedItemProperty, java/lang/String);
    public static final Property PROMOTER_CLICKED_URLS = Property.ofList(com/soundcloud/android/model/PromotedItemProperty, java/lang/String);
    public static final Property PROMOTER_NAME = Property.ofOptional(com/soundcloud/android/model/PromotedItemProperty, java/lang/String);
    public static final Property PROMOTER_URN = Property.ofOptional(com/soundcloud/android/model/PromotedItemProperty, com/soundcloud/android/model/Urn);
    public static final Property TRACK_CLICKED_URLS = Property.ofList(com/soundcloud/android/model/PromotedItemProperty, java/lang/String);
    public static final Property TRACK_IMPRESSION_URLS = Property.ofList(com/soundcloud/android/model/PromotedItemProperty, java/lang/String);
    public static final Property TRACK_PLAYED_URLS = Property.ofList(com/soundcloud/android/model/PromotedItemProperty, java/lang/String);

    public PromotedItemProperty()
    {
    }

}
