// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

public interface PlaylistRecord
{

    public abstract Date getCreatedAt();

    public abstract long getDuration();

    public abstract int getLikesCount();

    public abstract String getPermalinkUrl();

    public abstract int getRepostsCount();

    public abstract Sharing getSharing();

    public abstract Iterable getTags();

    public abstract String getTitle();

    public abstract int getTrackCount();

    public abstract Urn getUrn();

    public abstract UserRecord getUser();
}
