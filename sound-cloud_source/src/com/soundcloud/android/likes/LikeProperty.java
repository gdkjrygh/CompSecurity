// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.Property;
import java.util.Date;

public class LikeProperty
{

    public static final Property ADDED_AT = Property.of(com/soundcloud/android/likes/LikeProperty, java/util/Date);
    public static final Property CREATED_AT = Property.of(com/soundcloud/android/likes/LikeProperty, java/util/Date);
    public static final Property REMOVED_AT = Property.of(com/soundcloud/android/likes/LikeProperty, java/util/Date);
    public static final Property TARGET_URN;

    public LikeProperty()
    {
    }

    static 
    {
        TARGET_URN = PlayableProperty.URN;
    }
}
