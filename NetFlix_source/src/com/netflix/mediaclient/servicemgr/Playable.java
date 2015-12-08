// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Video

public interface Playable
    extends Video
{

    public abstract int getEndtime();

    public abstract int getEpisodeNumber();

    public abstract boolean getFbDntShare();

    public abstract String getParentId();

    public abstract String getParentTitle();

    public abstract int getPlayableBookmarkPosition();

    public abstract long getPlayableBookmarkUpdateTime();

    public abstract String getPlayableId();

    public abstract String getPlayableTitle();

    public abstract int getRuntime();

    public abstract int getSeasonNumber();

    public abstract boolean isAutoPlayEnabled();

    public abstract boolean isNextPlayableEpisode();

    public abstract boolean isPinProtected();

    public abstract boolean isPlayableEpisode();

    public abstract boolean isUserConnectedToFacebook();
}
