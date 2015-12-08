// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;

final class ApiDeletedLike
    implements PropertySetSource
{

    private final Urn targetUrn;

    public ApiDeletedLike(Urn urn)
    {
        targetUrn = urn;
    }

    public final Urn getTargetUrn()
    {
        return targetUrn;
    }

    public final PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            LikeProperty.TARGET_URN.bind(targetUrn)
        });
    }
}
