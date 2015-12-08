// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.strings.Strings;

public class TrackSourceInfo
{

    private Urn collectionUrn;
    private final String originScreen;
    private Urn playlistOwnerUrn;
    private int playlistPosition;
    private PromotedSourceInfo promotedSourceInfo;
    private Urn reposter;
    private SearchQuerySourceInfo searchQuerySourceInfo;
    private String source;
    private String sourceVersion;
    private final boolean userTriggered;

    public TrackSourceInfo(String s, boolean flag)
    {
        reposter = Urn.NOT_SET;
        collectionUrn = Urn.NOT_SET;
        playlistOwnerUrn = Urn.NOT_SET;
        originScreen = s;
        userTriggered = flag;
    }

    public Urn getCollectionUrn()
    {
        return collectionUrn;
    }

    public boolean getIsUserTriggered()
    {
        return userTriggered;
    }

    public String getOriginScreen()
    {
        return originScreen;
    }

    public Urn getPlaylistOwnerUrn()
    {
        return playlistOwnerUrn;
    }

    public int getPlaylistPosition()
    {
        return playlistPosition;
    }

    public PromotedSourceInfo getPromotedSourceInfo()
    {
        return promotedSourceInfo;
    }

    public Urn getReposter()
    {
        return reposter;
    }

    public SearchQuerySourceInfo getSearchQuerySourceInfo()
    {
        return searchQuerySourceInfo;
    }

    public String getSource()
    {
        return source;
    }

    public String getSourceVersion()
    {
        return sourceVersion;
    }

    public boolean hasReposter()
    {
        return reposter != Urn.NOT_SET;
    }

    public boolean hasSource()
    {
        return Strings.isNotBlank(source);
    }

    public boolean isFromPlaylist()
    {
        return collectionUrn != Urn.NOT_SET && collectionUrn.isPlaylist();
    }

    public boolean isFromPromoted()
    {
        return promotedSourceInfo != null;
    }

    public boolean isFromSearchQuery()
    {
        return searchQuerySourceInfo != null;
    }

    public boolean isFromStation()
    {
        return collectionUrn != Urn.NOT_SET && collectionUrn.isStation();
    }

    public void setOriginPlaylist(Urn urn, int i, Urn urn1)
    {
        collectionUrn = urn;
        playlistPosition = i;
        playlistOwnerUrn = urn1;
    }

    public void setOriginStation(Urn urn)
    {
        collectionUrn = urn;
    }

    public void setPromotedSourceInfo(PromotedSourceInfo promotedsourceinfo)
    {
        promotedSourceInfo = promotedsourceinfo;
    }

    public void setReposter(Urn urn)
    {
        reposter = urn;
    }

    public void setSearchQuerySourceInfo(SearchQuerySourceInfo searchquerysourceinfo)
    {
        searchQuerySourceInfo = searchquerysourceinfo;
    }

    public void setSource(String s, String s1)
    {
        source = s;
        sourceVersion = s1;
    }

    public String toString()
    {
        com.soundcloud.java.objects.MoreObjects.ToStringHelper tostringhelper = MoreObjects.toStringHelper(com/soundcloud/android/playback/TrackSourceInfo).add("originScreen", originScreen).add("userTriggered", userTriggered);
        if (hasSource())
        {
            tostringhelper.add("source", source).add("sourceVersion", sourceVersion);
        }
        tostringhelper.add("collectionUrn", collectionUrn);
        if (isFromPlaylist())
        {
            tostringhelper.add("playlistPos", playlistPosition).add("playlistOwnerUrn", playlistOwnerUrn);
        }
        if (isFromSearchQuery())
        {
            tostringhelper.add("searchQuerySourceInfo", searchQuerySourceInfo);
        }
        return tostringhelper.toString();
    }
}
