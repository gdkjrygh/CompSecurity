// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            VideoDetails

public interface ShowDetails
    extends VideoDetails
{

    public abstract String getCurrentEpisodeId();

    public abstract int getCurrentEpisodeNumber();

    public abstract String getCurrentEpisodeTitle();

    public abstract int getCurrentSeasonNumber();

    public abstract int getNumOfEpisodes();

    public abstract int getNumOfSeasons();

    public abstract boolean isShared();
}
