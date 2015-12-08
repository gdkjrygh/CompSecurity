// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Playable

public interface CWVideo
    extends Playable
{

    public abstract long getBookmarkLastUpdateTime();

    public abstract int getBookmarkPosition();

    public abstract String getCurrentEpisodeId();

    public abstract int getCurrentEpisodeNumber();

    public abstract String getCurrentEpisodeTitle();

    public abstract int getCurrentSeasonNumber();

    public abstract int getEndtime();

    public abstract List getFacebookFriends();

    public abstract String getInterestingUrl();

    public abstract String getNextEpisodeId();

    public abstract int getRuntime();

    public abstract String getStillUrl();
}
