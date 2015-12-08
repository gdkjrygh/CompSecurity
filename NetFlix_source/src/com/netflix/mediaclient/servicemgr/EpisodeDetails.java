// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            InterestingVideoDetails

public interface EpisodeDetails
    extends InterestingVideoDetails
{

    public abstract int getBookmarkPosition();

    public abstract String getEpisodeIdUrl();

    public abstract int getEpisodeNumber();

    public abstract String getInterestingUrl();

    public abstract String getNextEpisodeId();

    public abstract String getNextEpisodeTitle();

    public abstract String getSeasonId();

    public abstract int getSeasonNumber();

    public abstract String getShowId();
}
