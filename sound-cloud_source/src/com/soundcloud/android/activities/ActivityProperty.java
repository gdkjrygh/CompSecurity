// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivityKind

public final class ActivityProperty
{

    public static final Property DATE = Property.of(com/soundcloud/android/activities/ActivityProperty, java/util/Date);
    public static final Property KIND = Property.of(com/soundcloud/android/activities/ActivityProperty, com/soundcloud/android/activities/ActivityKind);
    public static final Property PLAYABLE_TITLE = Property.of(com/soundcloud/android/activities/ActivityProperty, java/lang/String);
    public static final Property USER_NAME = Property.of(com/soundcloud/android/activities/ActivityProperty, java/lang/String);
    public static final Property USER_URN = Property.of(com/soundcloud/android/activities/ActivityProperty, com/soundcloud/android/model/Urn);

    public ActivityProperty()
    {
    }

}
