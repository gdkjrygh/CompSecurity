// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.legacy.model.PublicApiComment;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

public class Comment
    implements ListItem
{

    private final PublicApiComment apiComment;

    Comment(PublicApiComment publicapicomment)
    {
        apiComment = publicapicomment;
    }

    Date getDate()
    {
        return apiComment.getCreatedAt();
    }

    public Urn getEntityUrn()
    {
        return apiComment.getUrn();
    }

    String getText()
    {
        return apiComment.body;
    }

    long getTimeStamp()
    {
        return apiComment.timestamp;
    }

    Urn getUserUrn()
    {
        return apiComment.getUser().getUrn();
    }

    String getUsername()
    {
        return apiComment.getUser().getUsername();
    }

    public Comment update(PropertySet propertyset)
    {
        return this;
    }

    public volatile ListItem update(PropertySet propertyset)
    {
        return update(propertyset);
    }
}
