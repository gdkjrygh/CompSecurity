// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.model;

import com.soundcloud.java.collections.Property;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.model:
//            EntityProperty, Urn

public class PlayableProperty extends EntityProperty
{

    public static final Property CREATED_AT = Property.of(com/soundcloud/android/model/PlayableProperty, java/util/Date);
    public static final Property CREATOR_NAME = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/String);
    public static final Property CREATOR_URN = Property.of(com/soundcloud/android/model/PlayableProperty, com/soundcloud/android/model/Urn);
    public static final Property DURATION = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Long);
    public static final Property IS_LIKED = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Boolean);
    public static final Property IS_PRIVATE = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Boolean);
    public static final Property IS_REPOSTED = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Boolean);
    public static final Property LIKES_COUNT = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Integer);
    public static final Property PERMALINK_URL = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/String);
    public static final Property REPOSTS_COUNT = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Integer);
    public static final Property TITLE = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/String);

    public PlayableProperty()
    {
    }

}
