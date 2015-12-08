// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.optional.Optional;
import java.util.Date;

public interface TrackRecord
{

    public abstract int getCommentsCount();

    public abstract Date getCreatedAt();

    public abstract Optional getDescription();

    public abstract long getDuration();

    public abstract String getGenre();

    public abstract int getLikesCount();

    public abstract Optional getMonetizationModel();

    public abstract String getPermalinkUrl();

    public abstract int getPlaybackCount();

    public abstract String getPolicy();

    public abstract int getRepostsCount();

    public abstract Sharing getSharing();

    public abstract String getStreamUrl();

    public abstract String getTitle();

    public abstract Urn getUrn();

    public abstract UserRecord getUser();

    public abstract String getWaveformUrl();

    public abstract boolean isCommentable();

    public abstract boolean isMonetizable();

    public abstract Optional isSubHighTier();

    public abstract Optional isSubMidTier();

    public abstract boolean isSyncable();
}
