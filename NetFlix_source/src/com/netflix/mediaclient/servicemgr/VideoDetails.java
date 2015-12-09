// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Playable

public interface VideoDetails
    extends Playable
{

    public abstract String getActors();

    public abstract String getBifUrl();

    public abstract String getCatalogIdUrl();

    public abstract String getCertification();

    public abstract String getCreators();

    public abstract List getFacebookFriends();

    public abstract String getGenres();

    public abstract String getHighResolutionLandscapeBoxArtUrl();

    public abstract String getHighResolutionPortraitBoxArtUrl();

    public abstract float getPredictedRating();

    public abstract String getQuality();

    public abstract String getStoryUrl();

    public abstract String getSynopsis();

    public abstract String getTvCardUrl();

    public abstract float getUserRating();

    public abstract int getYear();

    public abstract boolean isInQueue();

    public abstract boolean isVideoHd();

    public abstract void setUserRating(float f);
}
