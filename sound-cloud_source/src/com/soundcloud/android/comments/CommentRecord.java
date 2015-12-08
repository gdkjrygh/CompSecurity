// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.model.UserHolder;
import java.util.Date;

public interface CommentRecord
    extends UserHolder
{

    public abstract String getBody();

    public abstract Date getCreatedAt();

    public abstract long getTrackTime();

    public abstract Urn getTrackUrn();

    public abstract Urn getUrn();
}
