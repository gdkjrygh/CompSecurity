// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.strings.Strings;
import java.util.Locale;

public class PlaySessionSource
    implements Parcelable
{
    public static final class DiscoverySource extends Enum
    {

        private static final DiscoverySource $VALUES[];
        public static final DiscoverySource EXPLORE;
        public static final DiscoverySource RECOMMENDER;
        public static final DiscoverySource STATIONS;

        public static DiscoverySource valueOf(String s)
        {
            return (DiscoverySource)Enum.valueOf(com/soundcloud/android/playback/PlaySessionSource$DiscoverySource, s);
        }

        public static DiscoverySource[] values()
        {
            return (DiscoverySource[])$VALUES.clone();
        }

        public final String value()
        {
            return toString().toLowerCase(Locale.ENGLISH);
        }

        static 
        {
            RECOMMENDER = new DiscoverySource("RECOMMENDER", 0);
            EXPLORE = new DiscoverySource("EXPLORE", 1);
            STATIONS = new DiscoverySource("STATIONS", 2);
            $VALUES = (new DiscoverySource[] {
                RECOMMENDER, EXPLORE, STATIONS
            });
        }

        private DiscoverySource(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final PlaySessionSource EMPTY = new PlaySessionSource();
    static final String PREF_KEY_COLLECTION_OWNER_URN = "collection_owner_urn";
    static final String PREF_KEY_COLLECTION_SIZE = "collection_size";
    static final String PREF_KEY_COLLECTION_URN = "collection_urn";
    static final String PREF_KEY_ORIGIN_SCREEN_TAG = "origin_url";
    private Urn collectionOwnerUrn;
    private int collectionSize;
    private Urn collectionUrn;
    private String exploreVersion;
    private final String originScreen;
    private PromotedSourceInfo promotedSourceInfo;
    private SearchQuerySourceInfo searchQuerySourceInfo;

    private PlaySessionSource()
    {
        this("");
    }

    public PlaySessionSource(SharedPreferences sharedpreferences)
    {
        collectionUrn = Urn.NOT_SET;
        collectionOwnerUrn = Urn.NOT_SET;
        collectionSize = -1;
        originScreen = sharedpreferences.getString("origin_url", "");
        collectionUrn = readUrn(sharedpreferences, "collection_urn");
        collectionOwnerUrn = readUrn(sharedpreferences, "collection_owner_urn");
        collectionSize = sharedpreferences.getInt("collection_size", -1);
    }

    public PlaySessionSource(Parcel parcel)
    {
        collectionUrn = Urn.NOT_SET;
        collectionOwnerUrn = Urn.NOT_SET;
        collectionSize = -1;
        originScreen = parcel.readString();
        exploreVersion = parcel.readString();
        collectionSize = parcel.readInt();
        collectionUrn = (Urn)parcel.readParcelable(com/soundcloud/android/playback/PlaySessionSource.getClassLoader());
        collectionOwnerUrn = (Urn)parcel.readParcelable(com/soundcloud/android/playback/PlaySessionSource.getClassLoader());
        searchQuerySourceInfo = (SearchQuerySourceInfo)parcel.readParcelable(com/soundcloud/android/analytics/SearchQuerySourceInfo.getClassLoader());
        promotedSourceInfo = (PromotedSourceInfo)parcel.readParcelable(com/soundcloud/android/analytics/PromotedSourceInfo.getClassLoader());
    }

    public PlaySessionSource(Screen screen)
    {
        this(screen.get());
    }

    public PlaySessionSource(String s)
    {
        collectionUrn = Urn.NOT_SET;
        collectionOwnerUrn = Urn.NOT_SET;
        collectionSize = -1;
        originScreen = s;
    }

    public static void clearPreferenceKeys(android.content.SharedPreferences.Editor editor)
    {
        editor.remove("origin_url");
        editor.remove("collection_urn");
        editor.remove("collection_owner_urn");
        editor.remove("collection_size");
    }

    public static PlaySessionSource forExplore(Screen screen, String s)
    {
        return forExplore(screen.get(), s);
    }

    public static PlaySessionSource forExplore(String s, String s1)
    {
        s = new PlaySessionSource(s);
        s.exploreVersion = s1;
        return s;
    }

    public static PlaySessionSource forPlaylist(Screen screen, Urn urn, Urn urn1, int i)
    {
        return forPlaylist(screen.get(), urn, urn1, i);
    }

    public static PlaySessionSource forPlaylist(String s, Urn urn, Urn urn1, int i)
    {
        s = new PlaySessionSource(s);
        s.collectionUrn = urn;
        s.collectionOwnerUrn = urn1;
        s.collectionSize = i;
        return s;
    }

    public static PlaySessionSource forStation(Screen screen, Urn urn)
    {
        return forStation(screen.get(), urn);
    }

    public static PlaySessionSource forStation(String s, Urn urn)
    {
        s = new PlaySessionSource(s);
        s.collectionUrn = urn;
        return s;
    }

    private Urn readUrn(SharedPreferences sharedpreferences, String s)
    {
        sharedpreferences = sharedpreferences.getString(s, "");
        if (sharedpreferences.isEmpty())
        {
            return Urn.NOT_SET;
        } else
        {
            return new Urn(sharedpreferences);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PlaySessionSource)obj;
            if (!MoreObjects.equal(collectionUrn, ((PlaySessionSource) (obj)).collectionUrn) || !MoreObjects.equal(collectionOwnerUrn, ((PlaySessionSource) (obj)).collectionOwnerUrn) || collectionSize != ((PlaySessionSource) (obj)).collectionSize || !MoreObjects.equal(exploreVersion, ((PlaySessionSource) (obj)).exploreVersion) || !MoreObjects.equal(originScreen, ((PlaySessionSource) (obj)).originScreen) || !MoreObjects.equal(promotedSourceInfo, ((PlaySessionSource) (obj)).promotedSourceInfo))
            {
                return false;
            }
        }
        return true;
    }

    public Urn getCollectionOwnerUrn()
    {
        return collectionOwnerUrn;
    }

    public int getCollectionSize()
    {
        return collectionSize;
    }

    public Urn getCollectionUrn()
    {
        return collectionUrn;
    }

    public String getInitialSource()
    {
        if (Strings.isNotBlank(exploreVersion))
        {
            return DiscoverySource.EXPLORE.value();
        } else
        {
            return "";
        }
    }

    public String getInitialSourceVersion()
    {
        if (Strings.isNotBlank(exploreVersion))
        {
            return exploreVersion;
        } else
        {
            return "";
        }
    }

    public String getOriginScreen()
    {
        return originScreen;
    }

    public PromotedSourceInfo getPromotedSourceInfo()
    {
        return promotedSourceInfo;
    }

    public SearchQuerySourceInfo getSearchQuerySourceInfo()
    {
        return searchQuerySourceInfo;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            collectionUrn, collectionOwnerUrn, Integer.valueOf(collectionSize), exploreVersion, originScreen
        });
    }

    public boolean isFromPromotedItem()
    {
        return promotedSourceInfo != null;
    }

    public boolean isFromQuery()
    {
        return searchQuerySourceInfo != null;
    }

    public boolean isFromStations()
    {
        return getCollectionUrn().isStation();
    }

    public boolean originatedFromDeeplink()
    {
        return originScreen.equals(Screen.DEEPLINK.get());
    }

    public boolean originatedInExplore()
    {
        return originScreen.startsWith("explore");
    }

    public boolean originatedInSearchSuggestions()
    {
        return originScreen.startsWith(Screen.SEARCH_SUGGESTIONS.get());
    }

    public void saveToPreferences(android.content.SharedPreferences.Editor editor)
    {
        editor.putString("origin_url", originScreen);
        editor.putString("collection_urn", collectionUrn.toString());
        editor.putString("collection_owner_urn", collectionOwnerUrn.toString());
        editor.putInt("collection_size", collectionSize);
    }

    public void setPromotedSourceInfo(PromotedSourceInfo promotedsourceinfo)
    {
        promotedSourceInfo = promotedsourceinfo;
    }

    public void setSearchQuerySourceInfo(SearchQuerySourceInfo searchquerysourceinfo)
    {
        searchQuerySourceInfo = searchquerysourceinfo;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("originScreen", originScreen).add("collectionUrn", collectionUrn).add("collectionOwnerUrn", collectionOwnerUrn).add("exploreVersion", exploreVersion).add("searchQuerySourceInfo", searchQuerySourceInfo).add("promotedSourceInfo", promotedSourceInfo).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(originScreen);
        parcel.writeString(exploreVersion);
        parcel.writeInt(collectionSize);
        parcel.writeParcelable(collectionUrn, 0);
        parcel.writeParcelable(collectionOwnerUrn, 0);
        parcel.writeParcelable(searchQuerySourceInfo, 0);
        parcel.writeParcelable(promotedSourceInfo, 0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PlaySessionSource createFromParcel(Parcel parcel)
        {
            return new PlaySessionSource(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlaySessionSource[] newArray(int i)
        {
            return new PlaySessionSource[i];
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
