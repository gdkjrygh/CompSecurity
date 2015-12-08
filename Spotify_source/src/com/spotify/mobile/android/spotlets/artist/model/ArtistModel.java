// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.LinkedHashMap;
import java.util.List;

public class ArtistModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ArtistModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ArtistModel[i];
        }

    };
    public static final int TOP_TRACKS_LIMIT = 5;
    public final Optional biography;
    public final Optional customMessage;
    public final Optional gallery;
    public final HeaderImage headerImage;
    public final ArtistInfo info;
    public final Optional latestRelease;
    public final Optional merchandise;
    public final Optional monthlyListeners;
    public final List playlists;
    public final List relatedArtists;
    public final Releases releases;
    public final List topTracks;
    public final List upcomingConcerts;
    public final String uri;

    private ArtistModel(Parcel parcel)
    {
        uri = parcel.readString();
        info = (ArtistInfo)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$ArtistInfo.getClassLoader());
        headerImage = (HeaderImage)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$HeaderImage.getClassLoader());
        gallery = Optional.c((ArtistGallery)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$ArtistGallery.getClassLoader()));
        topTracks = readImmutableList(parcel, Track.CREATOR);
        upcomingConcerts = readImmutableList(parcel, Concert.CREATOR);
        merchandise = Optional.c(readImmutableList(parcel, MerchandiseItem.CREATOR));
        relatedArtists = readImmutableList(parcel, ArtistInfo.CREATOR);
        biography = Optional.c(parcel.readString());
        releases = (Releases)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Releases.getClassLoader());
        latestRelease = Optional.c((Release)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Release.getClassLoader()));
        playlists = readImmutableList(parcel, Playlist.CREATOR);
        customMessage = Optional.c((CustomMessage)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$CustomMessage.getClassLoader()));
        monthlyListeners = Optional.c((MonthlyListeners)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$MonthlyListeners.getClassLoader()));
    }


    public ArtistModel(String s, ArtistInfo artistinfo, HeaderImage headerimage, ArtistGallery artistgallery, LinkedHashMap linkedhashmap, LinkedHashMap linkedhashmap1, LinkedHashMap linkedhashmap2, 
            LinkedHashMap linkedhashmap3, LinkedHashMap linkedhashmap4, Releases releases1, Release release, LinkedHashMap linkedhashmap5, CustomMessage custommessage, MonthlyListeners monthlylisteners)
    {
        uri = (String)ctz.a(s);
        info = artistinfo;
        headerImage = headerimage;
        gallery = Optional.c(artistgallery);
        s = readNullableList("tracks", linkedhashmap);
        if (s.size() >= 5)
        {
            s = s.subList(0, 5);
        }
        topTracks = s;
        upcomingConcerts = readNullableList("concerts", linkedhashmap1);
        if (linkedhashmap2 == null)
        {
            s = null;
        } else
        {
            s = (List)linkedhashmap2.get("items");
        }
        merchandise = Optional.c(s);
        relatedArtists = readNullableList("artists", linkedhashmap3);
        if (linkedhashmap4 == null)
        {
            s = null;
        } else
        {
            s = (String)linkedhashmap4.get("text");
        }
        biography = Optional.c(s);
        releases = releases1;
        latestRelease = Optional.c(release);
        playlists = readNullableList("playlists", linkedhashmap5);
        customMessage = Optional.c(custommessage);
        monthlyListeners = Optional.c(monthlylisteners);
    }

    private static List readImmutableList(Parcel parcel, android.os.Parcelable.Creator creator)
    {
        parcel = parcel.createTypedArrayList(creator);
        if (parcel == null)
        {
            return null;
        } else
        {
            return ImmutableList.a(parcel);
        }
    }

    private static List readNullableList(String s, LinkedHashMap linkedhashmap)
    {
        if (linkedhashmap == null)
        {
            return ImmutableList.d();
        }
        s = (List)linkedhashmap.get(s);
        if (s == null)
        {
            return ImmutableList.d();
        } else
        {
            return ImmutableList.a(s);
        }
    }

    private static List readNullableList(List list)
    {
        if (list == null)
        {
            return ImmutableList.d();
        } else
        {
            return ImmutableList.a(list);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int findTopTrackIndex(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            int j = topTracks.size();
            for (int i = 0; i < j; i++)
            {
                if (s.equals(((Track)topTracks.get(i)).uri))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public ArtistInfo getInfoSafe()
    {
        return (ArtistInfo)ctz.a(info);
    }

    public ReleaseList getReleases(ReleaseType releasetype)
    {
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ReleaseType.values().length];
                try
                {
                    a[ReleaseType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ReleaseType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ReleaseType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ReleaseType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[releasetype.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown release type: ")).append(releasetype).toString());

        case 1: // '\001'
            return releases.albums;

        case 2: // '\002'
            return releases.singles;

        case 3: // '\003'
            return releases.appearsOn;

        case 4: // '\004'
            return releases.compilations;
        }
    }

    public boolean hasReleasesOfType(ReleaseType releasetype)
    {
        return !getReleases(releasetype).releases.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
        parcel.writeParcelable(info, 0);
        parcel.writeParcelable(headerImage, 0);
        parcel.writeParcelable((Parcelable)gallery.d(), 0);
        parcel.writeTypedList(topTracks);
        parcel.writeTypedList(upcomingConcerts);
        parcel.writeTypedList((List)merchandise.d());
        parcel.writeTypedList(relatedArtists);
        parcel.writeString((String)biography.d());
        parcel.writeParcelable(releases, 0);
        parcel.writeParcelable((Parcelable)latestRelease.d(), 0);
        parcel.writeTypedList(playlists);
        parcel.writeParcelable((Parcelable)customMessage.d(), 0);
        parcel.writeParcelable((Parcelable)monthlyListeners.d(), 0);
    }




    private class ArtistInfo
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new ArtistInfo(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new ArtistInfo[i];
            }

        };
        public final String name;
        public final List portraits;
        public final String uri;
        public final boolean verified;

        public int describeContents()
        {
            return 0;
        }

        public Uri getDefaultPortraitUri()
        {
            if (!portraits.isEmpty())
            {
                return dto.a(((Image)portraits.get(0)).uri);
            } else
            {
                return null;
            }
        }

        public String toString()
        {
            if (name != null)
            {
                return name;
            } else
            {
                return "null";
            }
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(uri);
            parcel.writeString(name);
            gen.a(parcel, verified);
            parcel.writeTypedList(portraits);
        }


        private ArtistInfo(Parcel parcel)
        {
            uri = parcel.readString();
            name = parcel.readString();
            verified = gen.a(parcel);
            portraits = ArtistModel.readImmutableList(parcel, Image.CREATOR);
        }


        public ArtistInfo(String s, String s1, Boolean boolean1, List list)
        {
            uri = s;
            name = s1;
            boolean flag;
            if (boolean1 != null && boolean1.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            verified = flag;
            portraits = ArtistModel.readNullableList(list);
        }
    }


    private class HeaderImage
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new HeaderImage(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new HeaderImage[i];
            }

        };
        public final String image;
        public final int offset;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(image);
            parcel.writeInt(offset);
        }


        private HeaderImage(Parcel parcel)
        {
            image = parcel.readString();
            offset = parcel.readInt();
        }


        public HeaderImage(String s, int i)
        {
            image = s;
            offset = i;
        }
    }


    private class ArtistGallery
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new ArtistGallery(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new ArtistGallery[i];
            }

        };
        public static final ArtistGallery EMPTY_GALLERY = new ArtistGallery(ImmutableList.d());
        public final List images;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeTypedList(images);
        }


        private ArtistGallery(Parcel parcel)
        {
            images = ArtistModel.readImmutableList(parcel, Image.CREATOR);
        }


        public ArtistGallery(List list)
        {
            images = ArtistModel.readNullableList(list);
        }
    }


    private class Track
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Track(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Track[i];
            }

        };
        public final boolean explicit;
        public final String name;
        public final int playcount;
        public final String uri;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(uri);
            parcel.writeInt(playcount);
            gen.a(parcel, explicit);
            parcel.writeString(name);
        }


        private Track(Parcel parcel)
        {
            uri = parcel.readString();
            playcount = parcel.readInt();
            explicit = gen.a(parcel);
            name = parcel.readString();
        }


        public Track(String s, int i, boolean flag, String s1)
        {
            uri = s;
            playcount = i;
            explicit = flag;
            name = s1;
        }
    }


    private class Concert
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Concert(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Concert[i];
            }

        };
        public final String appUri;
        public final String city;
        public final String localtime;
        public final String title;
        public final String venue;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(title);
            parcel.writeString(appUri);
            parcel.writeString(localtime);
            parcel.writeString(venue);
            parcel.writeString(city);
        }


        private Concert(Parcel parcel)
        {
            title = parcel.readString();
            appUri = parcel.readString();
            localtime = parcel.readString();
            venue = parcel.readString();
            city = parcel.readString();
        }


        public Concert(String s, String s1, String s2, String s3, String s4)
        {
            title = s;
            appUri = s1;
            localtime = s2;
            venue = s3;
            city = s4;
        }
    }


    private class MerchandiseItem
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new MerchandiseItem(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new MerchandiseItem[i];
            }

        };
        public final String description;
        public final String imageUri;
        public final String link;
        public final String name;
        public final String uuid;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(uuid);
            parcel.writeString(name);
            parcel.writeString(description);
            parcel.writeString(imageUri);
            parcel.writeString(link);
        }


        private MerchandiseItem(Parcel parcel)
        {
            uuid = parcel.readString();
            name = parcel.readString();
            description = parcel.readString();
            imageUri = parcel.readString();
            link = parcel.readString();
        }


        public MerchandiseItem(String s, String s1, String s2, String s3, String s4)
        {
            uuid = s;
            name = s1;
            description = s2;
            imageUri = s3;
            link = s4;
        }
    }


    private class Releases
        implements Parcelable, JacksonModel
    {
        private class ReleaseList
            implements Parcelable, JacksonModel
        {
            private class Release
                implements Parcelable, JacksonModel
            {

                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel)
                    {
                        return new Release(parcel);
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new Release[i];
                    }

                };
                public final Image cover;
                public final int day;
                public final int month;
                public final String name;
                public final int trackCount;
                public final String uri;
                public final int year;

                public int describeContents()
                {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int i)
                {
                    parcel.writeString(uri);
                    parcel.writeString(name);
                    parcel.writeParcelable(cover, 0);
                    parcel.writeInt(year);
                    parcel.writeInt(month);
                    parcel.writeInt(day);
                    parcel.writeInt(trackCount);
                }


                private Release(Parcel parcel)
                {
                    uri = parcel.readString();
                    name = parcel.readString();
                    cover = (Image)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/Image.getClassLoader());
                    year = parcel.readInt();
                    month = parcel.readInt();
                    day = parcel.readInt();
                    trackCount = parcel.readInt();
                }


                public Release(String s, String s1, Image image, int i, int j, int k, int l)
                {
                    uri = s;
                    name = s1;
                    cover = image;
                    year = i;
                    month = j;
                    day = k;
                    trackCount = l;
                }
            }

            private class ReleaseType extends Enum
            {

                public static final ReleaseType a;
                public static final ReleaseType b;
                public static final ReleaseType c;
                public static final ReleaseType d;
                private static final ReleaseType e[];

                public static ReleaseType valueOf(String s)
                {
                    return (ReleaseType)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$ReleaseType, s);
                }

                public static ReleaseType[] values()
                {
                    return (ReleaseType[])e.clone();
                }

                static 
                {
                    a = new ReleaseType("ALBUMS", 0);
                    b = new ReleaseType("SINGLES", 1);
                    c = new ReleaseType("APPEARS_ON", 2);
                    d = new ReleaseType("COMPILATIONS", 3);
                    e = (new ReleaseType[] {
                        a, b, c, d
                    });
                }

                private ReleaseType(String s, int i)
                {
                    super(s, i);
                }
            }

            private class ReleaseListTemp
                implements JacksonModel
            {

                public final List releases;
                public final int totalCount;

                public ReleaseListTemp(List list, int i)
                {
                    releases = ArtistModel.readNullableList(list);
                    totalCount = i;
                }
            }


            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final Object createFromParcel(Parcel parcel)
                {
                    return new ReleaseList(parcel);
                }

                public final volatile Object[] newArray(int i)
                {
                    return new ReleaseList[i];
                }

            };
            public final ReleaseType releaseType;
            public final List releases;
            public final int totalCount;

            public int describeContents()
            {
                return 0;
            }

            public boolean hasAllReleases()
            {
                return releases.size() == totalCount;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                parcel.writeTypedList(releases);
                parcel.writeInt(totalCount);
                parcel.writeInt(releaseType.ordinal());
            }


            private ReleaseList(Parcel parcel)
            {
                releases = ArtistModel.readImmutableList(parcel, Release.CREATOR);
                totalCount = parcel.readInt();
                releaseType = ReleaseType.values()[parcel.readInt()];
            }


            public ReleaseList(ReleaseListTemp releaselisttemp, ReleaseType releasetype)
            {
                if (releaselisttemp == null)
                {
                    releases = new ArrayList();
                    totalCount = 0;
                } else
                {
                    releases = releaselisttemp.releases;
                    totalCount = releaselisttemp.totalCount;
                }
                releaseType = releasetype;
            }
        }


        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Releases(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Releases[i];
            }

        };
        public final ReleaseList albums;
        public final ReleaseList appearsOn;
        public final ReleaseList compilations;
        public final ReleaseList singles;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeParcelable(albums, 0);
            parcel.writeParcelable(singles, 0);
            parcel.writeParcelable(appearsOn, 0);
            parcel.writeParcelable(compilations, 0);
        }


        private Releases(Parcel parcel)
        {
            albums = (ReleaseList)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Releases.getClassLoader());
            singles = (ReleaseList)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Releases.getClassLoader());
            appearsOn = (ReleaseList)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Releases.getClassLoader());
            compilations = (ReleaseList)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Releases.getClassLoader());
        }


        public Releases(ReleaseListTemp releaselisttemp, ReleaseListTemp releaselisttemp1, ReleaseListTemp releaselisttemp2, ReleaseListTemp releaselisttemp3)
        {
            albums = new ReleaseList(releaselisttemp, ReleaseType.a);
            singles = new ReleaseList(releaselisttemp1, ReleaseType.b);
            appearsOn = new ReleaseList(releaselisttemp2, ReleaseType.c);
            compilations = new ReleaseList(releaselisttemp3, ReleaseType.d);
        }
    }


    private class Playlist
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Playlist(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Playlist[i];
            }

        };
        public final Image cover;
        public final int followerCount;
        public final String name;
        public final String uri;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Playlist)obj;
            if (followerCount != ((Playlist) (obj)).followerCount)
            {
                return false;
            }
            if (uri == null ? ((Playlist) (obj)).uri != null : !uri.equals(((Playlist) (obj)).uri))
            {
                return false;
            }
            if (name == null ? ((Playlist) (obj)).name != null : !name.equals(((Playlist) (obj)).name))
            {
                return false;
            }
            if (cover == null) goto _L4; else goto _L3
_L3:
            if (cover.equals(((Playlist) (obj)).cover)) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (((Playlist) (obj)).cover == null)
            {
                return true;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public int hashCode()
        {
            int k = 0;
            int i;
            int j;
            if (uri != null)
            {
                i = uri.hashCode();
            } else
            {
                i = 0;
            }
            if (name != null)
            {
                j = name.hashCode();
            } else
            {
                j = 0;
            }
            if (cover != null)
            {
                k = cover.hashCode();
            }
            return ((j + i * 31) * 31 + k) * 31 + followerCount;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(uri);
            parcel.writeString(name);
            parcel.writeParcelable(cover, 0);
            parcel.writeInt(followerCount);
        }


        private Playlist(Parcel parcel)
        {
            uri = parcel.readString();
            name = parcel.readString();
            cover = (Image)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/Image.getClassLoader());
            followerCount = parcel.readInt();
        }


        public Playlist(String s, String s1, Image image, int i)
        {
            uri = s;
            name = s1;
            cover = image;
            followerCount = i;
        }
    }


    private class CustomMessage
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new CustomMessage(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new CustomMessage[i];
            }

        };
        public final String bodyText;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(bodyText);
        }


        private CustomMessage(Parcel parcel)
        {
            bodyText = parcel.readString();
        }


        public CustomMessage(String s)
        {
            bodyText = s;
        }
    }


    private class MonthlyListeners
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new MonthlyListeners(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new MonthlyListeners[i];
            }

        };
        public final String mListenerCount;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (MonthlyListeners)obj;
            if (mListenerCount == null) goto _L4; else goto _L3
_L3:
            if (mListenerCount.equals(((MonthlyListeners) (obj)).mListenerCount)) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (((MonthlyListeners) (obj)).mListenerCount == null)
            {
                return true;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public int hashCode()
        {
            if (mListenerCount != null)
            {
                return mListenerCount.hashCode();
            } else
            {
                return 0;
            }
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mListenerCount);
        }


        private MonthlyListeners(Parcel parcel)
        {
            mListenerCount = parcel.readString();
        }


        public MonthlyListeners(String s)
        {
            mListenerCount = s;
        }
    }

}
