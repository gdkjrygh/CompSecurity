// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public final class UnfinishedEpisodes
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new UnfinishedEpisodes(parcel.createTypedArrayList(Episode.CREATOR));
        }

        public final volatile Object[] newArray(int i)
        {
            return new UnfinishedEpisodes[i];
        }


        private class Episode
            implements Parcelable, JacksonModel
        {
            private class Show
                implements Parcelable, JacksonModel
            {
                private class MediaType extends Enum
                {

                    public static final MediaType a;
                    public static final MediaType b;
                    public static final MediaType c;
                    private static final MediaType d[];

                    public static MediaType valueOf(String s)
                    {
                        return (MediaType)Enum.valueOf(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodes$MediaType, s);
                    }

                    public static MediaType[] values()
                    {
                        return (MediaType[])d.clone();
                    }

                    static 
                    {
                        a = new MediaType("AUDIO", 0);
                        b = new MediaType("VIDEO", 1);
                        c = new MediaType("MIXED", 2);
                        d = (new MediaType[] {
                            a, b, c
                        });
                    }

                    private MediaType(String s, int i)
                    {
                        super(s, i);
                    }
                }


                private static final String COVERS = "covers";
                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel)
                    {
                        String s = parcel.readString();
                        String s1 = parcel.readString();
                        Cover cover = (Cover)parcel.readParcelable(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodes$Cover.getClassLoader());
                        return new Show(s1, s, parcel.readString(), MediaType.values()[parcel.readInt()], cover);
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new Show[i];
                    }

                };
                private static final String KEY_COVER = "cover";
                private static final String KEY_MEDIA_TYPE = "mediaType";
                private static final String KEY_NAME = "name";
                private static final String KEY_PUBLISHER = "publisher";
                private static final String KEY_URI = "link";
                private static final gdf TYPE_PARSER = gdf.a(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodes$MediaType);
                private final Cover mCover;
                private final MediaType mMediaType;
                private final String mName;
                private final String mPublisher;
                private final String mUri;

                public final int describeContents()
                {
                    return 0;
                }

                public final String getCover(CoverSize coversize)
                {
                    if (mCover == null)
                    {
                        return null;
                    }
                    class CoverSize extends Enum
                    {

                        public static final CoverSize a;
                        public static final CoverSize b;
                        public static final CoverSize c;
                        public static final CoverSize d;
                        private static final CoverSize e[];

                        public static CoverSize valueOf(String s)
                        {
                            return (CoverSize)Enum.valueOf(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodes$Show$CoverSize, s);
                        }

                        public static CoverSize[] values()
                        {
                            return (CoverSize[])e.clone();
                        }

                        static 
                        {
                            a = new CoverSize("NORMAL", 0);
                            b = new CoverSize("SMALL", 1);
                            c = new CoverSize("LARGE", 2);
                            d = new CoverSize("X_LARGE", 3);
                            e = (new CoverSize[] {
                                a, b, c, d
                            });
                        }

                        private CoverSize(String s, int i)
                        {
                            super(s, i);
                        }
                    }

                    final class _cls2
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[Show.CoverSize.values().length];
                            try
                            {
                                a[Show.CoverSize.d.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[Show.CoverSize.c.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[Show.CoverSize.a.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[Show.CoverSize.b.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    _cls2.a[coversize.ordinal()];
                    JVM INSTR tableswitch 1 4: default 48
                //                               1 56
                //                               2 77
                //                               3 98
                //                               4 119;
                       goto _L1 _L2 _L3 _L4 _L5
_L1:
                    return mCover.defaultCover;
_L2:
                    if (!TextUtils.isEmpty(mCover.xLargeCover))
                    {
                        return mCover.xLargeCover;
                    }
_L3:
                    if (!TextUtils.isEmpty(mCover.largeCover))
                    {
                        return mCover.largeCover;
                    }
                    continue; /* Loop/switch isn't completed */
_L4:
                    if (!TextUtils.isEmpty(mCover.defaultCover))
                    {
                        return mCover.defaultCover;
                    }
                    continue; /* Loop/switch isn't completed */
_L5:
                    if (!TextUtils.isEmpty(mCover.smallCover))
                    {
                        return mCover.smallCover;
                    }
                    if (true) goto _L1; else goto _L6
_L6:
                }

                public final MediaType getMediaType()
                {
                    return mMediaType;
                }

                public final String getName()
                {
                    return mName;
                }

                public final String getPublisher()
                {
                    return mPublisher;
                }

                public final String getUri()
                {
                    return mUri;
                }

                public final void writeToParcel(Parcel parcel, int i)
                {
                    parcel.writeString(mUri);
                    parcel.writeString(mName);
                    parcel.writeParcelable(mCover, 0);
                    parcel.writeString(mPublisher);
                    parcel.writeInt(mMediaType.ordinal());
                }


                private Show(String s, String s1, String s2, MediaType mediatype, Cover cover)
                {
                    mUri = (String)ctz.a(s1);
                    mName = (String)ctz.a(s);
                    mPublisher = (String)ctz.a(s2);
                    mMediaType = (MediaType)ctz.a(mediatype);
                    mCover = cover;
                }


                Show(String s, String s1, String s2, String s3, Cover cover)
                {
                    this(s, s1, s2, (MediaType)TYPE_PARSER.a(s3).a(MediaType.c), cover);
                }

                private class Cover
                    implements Parcelable, JacksonModel
                {

                    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                        public final Object createFromParcel(Parcel parcel)
                        {
                            return new Cover(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        public final volatile Object[] newArray(int i)
                        {
                            return new Cover[i];
                        }

                    };
                    public static final String KEY_DEFAULT = "default";
                    public static final String KEY_LARGE = "large";
                    public static final String KEY_SMALL = "small";
                    public static final String KEY_X_LARGE = "xlarge";
                    public final String defaultCover;
                    public final String largeCover;
                    public final String smallCover;
                    public final String xLargeCover;

                    public final int describeContents()
                    {
                        return 0;
                    }

                    public final void writeToParcel(Parcel parcel, int i)
                    {
                        parcel.writeString(defaultCover);
                        parcel.writeString(smallCover);
                        parcel.writeString(largeCover);
                        parcel.writeString(xLargeCover);
                    }


                    Cover(String s, String s1, String s2, String s3)
                    {
                        defaultCover = s;
                        smallCover = s1;
                        largeCover = s2;
                        xLargeCover = s3;
                    }
                }

            }


            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final Object createFromParcel(Parcel parcel)
                {
                    return new Episode(parcel.readString(), parcel.readString(), (Show)parcel.readParcelable(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodes$Show.getClassLoader()), parcel.readLong(), parcel.readLong(), Boolean.valueOf(gen.a(parcel)));
                }

                public final volatile Object[] newArray(int i)
                {
                    return new Episode[i];
                }

            };
            private static final String KEY_NAME = "name";
            private static final String KEY_PLAYABLE = "playable";
            private static final String KEY_SHOW = "show";
            private static final String KEY_TIME_LEFT = "timeLeft";
            private static final String KEY_TIME_TOTAL = "length";
            private static final String KEY_URI = "link";
            private final String mName;
            private final boolean mPlayable;
            private final Show mShow;
            private final long mTimeLeft;
            private final long mTimeTotal;
            private final String mUri;

            public final int describeContents()
            {
                return 0;
            }

            public final String getName()
            {
                return mName;
            }

            public final Show getShow()
            {
                return mShow;
            }

            public final long getTimeLeft()
            {
                return mTimeLeft;
            }

            public final long getTimeTotal()
            {
                return mTimeTotal;
            }

            public final String getUri()
            {
                return mUri;
            }

            public final boolean isPlayable()
            {
                return mPlayable;
            }

            public final void writeToParcel(Parcel parcel, int i)
            {
                parcel.writeString(mUri);
                parcel.writeString(mName);
                parcel.writeParcelable(mShow, 0);
                parcel.writeLong(mTimeLeft);
                parcel.writeLong(mTimeTotal);
                gen.a(parcel, mPlayable);
            }


            Episode(String s, String s1, Show show, long l, long l1, 
                    Boolean boolean1)
            {
                mShow = (Show)ctz.a(show);
                mUri = (String)ctz.a(s);
                mName = (String)ctz.a(s1);
                mTimeLeft = l;
                mTimeTotal = l1;
                boolean flag;
                if (boolean1 != null && boolean1.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mPlayable = flag;
            }
        }

    };
    private static final String KEY_ITEMS = "items";
    private final List mEpisodes;

    UnfinishedEpisodes(List list)
    {
        mEpisodes = ImmutableList.a(list);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final List getEpisodes()
    {
        return mEpisodes;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(mEpisodes);
    }

}
