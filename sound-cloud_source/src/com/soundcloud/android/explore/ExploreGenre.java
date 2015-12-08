// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.api.model.Link;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExploreGenre
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String EXPLORE_GENRE_EXTRA = "genre";
    public static final ExploreGenre POPULAR_AUDIO_CATEGORY = new ExploreGenre("Trending Audio");
    private static final int POPULAR_AUDIO_DESCRIPTION = 2;
    public static final ExploreGenre POPULAR_MUSIC_CATEGORY = new ExploreGenre("Trending Music");
    private static final int POPULAR_MUSIC_DESCRIPTION = 1;
    static final String SUGGESTED_TRACKS_LINK_REL = "suggested_tracks";
    private Map links;
    private String title;

    public ExploreGenre()
    {
        links = Collections.emptyMap();
    }

    public ExploreGenre(Parcel parcel)
    {
        links = Collections.emptyMap();
        parcel = parcel.readBundle(com/soundcloud/android/api/model/Link.getClassLoader());
        title = parcel.getString("title");
        links = (Map)parcel.getSerializable("links");
    }

    public ExploreGenre(String s)
    {
        links = Collections.emptyMap();
        title = s;
    }

    public ExploreGenre(String s, String s1)
    {
        links = Collections.emptyMap();
        title = s;
        links = new HashMap();
        links.put("suggested_tracks", new Link(s1));
    }

    public int describeContents()
    {
        if (this == POPULAR_MUSIC_CATEGORY)
        {
            return 1;
        }
        return this != POPULAR_AUDIO_CATEGORY ? 0 : 2;
    }

    public Map getLinks()
    {
        return links;
    }

    public String getSuggestedTracksPath()
    {
        return ((Link)links.get("suggested_tracks")).getHref();
    }

    public String getTitle()
    {
        return title;
    }

    public void setLinks(Map map)
    {
        links = map;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(describeContents());
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/soundcloud/android/api/model/Link.getClassLoader());
        bundle.putString("title", title);
        bundle.putSerializable("links", (Serializable)links);
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ExploreGenre createFromParcel(Parcel parcel)
        {
            switch (parcel.readInt())
            {
            default:
                return new ExploreGenre(parcel);

            case 1: // '\001'
                return ExploreGenre.POPULAR_MUSIC_CATEGORY;

            case 2: // '\002'
                return ExploreGenre.POPULAR_AUDIO_CATEGORY;
            }
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ExploreGenre[] newArray(int i)
        {
            return new ExploreGenre[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
