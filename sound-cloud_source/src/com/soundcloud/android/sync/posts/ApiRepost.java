// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

public class ApiRepost
    implements PropertySetSource
{

    private final Date createdAt;
    private final Urn targetUrn;

    public ApiRepost(Urn urn, Date date)
    {
        targetUrn = urn;
        createdAt = date;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public Urn getTargetUrn()
    {
        return targetUrn;
    }

    public PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            PostProperty.TARGET_URN.bind(targetUrn), PostProperty.CREATED_AT.bind(createdAt), PostProperty.IS_REPOST.bind(Boolean.valueOf(true))
        });
    }
}
