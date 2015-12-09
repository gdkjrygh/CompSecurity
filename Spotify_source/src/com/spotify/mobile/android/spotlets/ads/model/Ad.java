// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.cosmos.android.util.Objects;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            CompanionAd

public class Ad
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Ad(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Ad[i];
        }

    };
    public static final String FEATURED_ACTION_OPT_IN = "optin";
    public static final String FEATURED_ACTION_OPT_OUT = "optout";
    public static final String FEATURED_ACTION_SAVE = "Save";
    public static final String FEATURE_DATA_FEATURED_ACTION_KEY = "featuredAction";
    public static final String FEATURE_DATA_FEATURED_ACTION_URI_KEY = "featuredActionURI";
    public static final String FEATURE_DATA_KEY_BUTTON_TEXT = "buttonMessage";
    public static final String FEATURE_DATA_NIELSEN_OCR_TAG = "nielsenOCRTag";
    private final AdType mAdType;
    private final int mAdTypeInt;
    private final String mAdvertiser;
    private final String mButtonText;
    private final String mCaption;
    private final String mClickTrackingUrl;
    private final String mClickUrl;
    private final CompanionAd mCompanionAd;
    private final long mDuration;
    private final Map mFeatureData;
    private final FeaturedActionType mFeaturedActionType;
    private final String mFeaturedActionUri;
    private final String mId;
    private final List mImages;
    private final boolean mNonExplicit;
    private final boolean mTestAd;
    private final String mTitle;
    private final String mUri;
    private final List mVideos;

    private Ad(Parcel parcel)
    {
        mId = parcel.readString();
        mUri = parcel.readString();
        mAdvertiser = parcel.readString();
        mTitle = parcel.readString();
        mClickUrl = parcel.readString();
        mClickTrackingUrl = parcel.readString();
        mDuration = parcel.readLong();
        mCaption = parcel.readString();
        mAdTypeInt = parcel.readInt();
        mAdType = AdType.getByValue(mAdTypeInt);
        mTestAd = gen.a(parcel);
        mNonExplicit = gen.a(parcel);
        mFeatureData = (Map)parcel.readSerializable();
        mFeaturedActionType = (FeaturedActionType)parcel.readSerializable();
        mFeaturedActionUri = parcel.readString();
        mButtonText = parcel.readString();
        mCompanionAd = (CompanionAd)parcel.readParcelable(getClass().getClassLoader());
        mVideos = new ArrayList();
        parcel.readList(mVideos, getClass().getClassLoader());
        mImages = new ArrayList();
        parcel.readList(mImages, getClass().getClassLoader());
    }


    public Ad(String s, String s1, String s2, String s3, String s4, String s5, long l, String s6, int i, boolean flag, boolean flag1, Map map, CompanionAd companionad, 
            List list, List list1)
    {
        mId = s;
        mUri = s1;
        mAdvertiser = s2;
        mTitle = s3;
        mClickUrl = s4;
        mClickTrackingUrl = s5;
        mDuration = l;
        mCaption = s6;
        mAdTypeInt = i;
        mAdType = AdType.getByValue(i);
        mTestAd = flag;
        mNonExplicit = flag1;
        mFeatureData = map;
        if (map == null)
        {
            s = FeaturedActionType.a;
        } else
        {
            s = FeaturedActionType.a((String)map.get("featuredAction"));
        }
        mFeaturedActionType = s;
        if (map == null)
        {
            s = null;
        } else
        {
            s = (String)map.get("featuredActionURI");
        }
        mFeaturedActionUri = s;
        if (map == null)
        {
            s = null;
        } else
        {
            s = (String)map.get("buttonMessage");
        }
        mButtonText = s;
        mCompanionAd = companionad;
        mVideos = list;
        s = list1;
        if (list1 == null)
        {
            s = new ArrayList();
        }
        mImages = s;
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
            obj = (Ad)obj;
            if (mAdType != ((Ad) (obj)).mAdType)
            {
                return false;
            }
            if (!Objects.equals(mUri, ((Ad) (obj)).mUri))
            {
                return false;
            }
            if (mDuration != ((Ad) (obj)).mDuration)
            {
                return false;
            }
            if (mNonExplicit != ((Ad) (obj)).mNonExplicit)
            {
                return false;
            }
            if (mTestAd != ((Ad) (obj)).mTestAd)
            {
                return false;
            }
            if (mAdvertiser == null ? ((Ad) (obj)).mAdvertiser != null : !mAdvertiser.equals(((Ad) (obj)).mAdvertiser))
            {
                return false;
            }
            if (mCaption == null ? ((Ad) (obj)).mCaption != null : !mCaption.equals(((Ad) (obj)).mCaption))
            {
                return false;
            }
            if (mClickTrackingUrl == null ? ((Ad) (obj)).mClickTrackingUrl != null : !mClickTrackingUrl.equals(((Ad) (obj)).mClickTrackingUrl))
            {
                return false;
            }
            if (mClickUrl == null ? ((Ad) (obj)).mClickUrl != null : !mClickUrl.equals(((Ad) (obj)).mClickUrl))
            {
                return false;
            }
            if (mCompanionAd == null ? ((Ad) (obj)).mCompanionAd != null : !mCompanionAd.equals(((Ad) (obj)).mCompanionAd))
            {
                return false;
            }
            if (mFeatureData == null ? ((Ad) (obj)).mFeatureData != null : !mFeatureData.equals(((Ad) (obj)).mFeatureData))
            {
                return false;
            }
            if (mId == null ? ((Ad) (obj)).mId != null : !mId.equals(((Ad) (obj)).mId))
            {
                return false;
            }
            if (mTitle == null ? ((Ad) (obj)).mTitle != null : !mTitle.equals(((Ad) (obj)).mTitle))
            {
                return false;
            }
            if (mVideos == null ? ((Ad) (obj)).mVideos != null : !mVideos.equals(((Ad) (obj)).mVideos))
            {
                return false;
            }
            if (mImages == null ? ((Ad) (obj)).mImages != null : !mImages.equals(((Ad) (obj)).mImages))
            {
                return false;
            }
        }
        return true;
    }

    public AdType getAdType()
    {
        return mAdType;
    }

    public String getAdvertiser()
    {
        return mAdvertiser;
    }

    public String getButtonText()
    {
        return mButtonText;
    }

    public String getCaption()
    {
        return mCaption;
    }

    public String getClickTrackingUrl()
    {
        return mClickTrackingUrl;
    }

    public String getClickUrl()
    {
        return mClickUrl;
    }

    public CompanionAd getCompanionAd()
    {
        return mCompanionAd;
    }

    public long getDuration()
    {
        return mDuration;
    }

    public Map getFeatureData()
    {
        return mFeatureData;
    }

    public FeaturedActionType getFeaturedActionType()
    {
        return mFeaturedActionType;
    }

    public String getFeaturedActionUri()
    {
        return mFeaturedActionUri;
    }

    public String getId()
    {
        return mId;
    }

    public List getImages()
    {
        return mImages;
    }

    public String getNielsenOcrTag()
    {
        if (getFeatureData().containsKey("nielsenOCRTag"))
        {
            return (String)getFeatureData().get("nielsenOCRTag");
        } else
        {
            return "";
        }
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUri()
    {
        return mUri;
    }

    public List getVideos()
    {
        return mVideos;
    }

    public int hashCode()
    {
        int j2 = 1;
        int j3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (mId != null)
        {
            i = mId.hashCode();
        } else
        {
            i = 0;
        }
        if (mUri != null)
        {
            j = mUri.hashCode();
        } else
        {
            j = 0;
        }
        if (mAdvertiser != null)
        {
            k = mAdvertiser.hashCode();
        } else
        {
            k = 0;
        }
        if (mTitle != null)
        {
            l = mTitle.hashCode();
        } else
        {
            l = 0;
        }
        if (mClickUrl != null)
        {
            i1 = mClickUrl.hashCode();
        } else
        {
            i1 = 0;
        }
        if (mClickTrackingUrl != null)
        {
            j1 = mClickTrackingUrl.hashCode();
        } else
        {
            j1 = 0;
        }
        k3 = (int)(mDuration ^ mDuration >>> 32);
        if (mCaption != null)
        {
            k1 = mCaption.hashCode();
        } else
        {
            k1 = 0;
        }
        if (mAdType != null)
        {
            l1 = mAdType.hashCode();
        } else
        {
            l1 = 0;
        }
        if (mTestAd)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (!mNonExplicit)
        {
            j2 = 0;
        }
        if (mFeatureData != null)
        {
            k2 = mFeatureData.hashCode();
        } else
        {
            k2 = 0;
        }
        if (mCompanionAd != null)
        {
            l2 = mCompanionAd.hashCode();
        } else
        {
            l2 = 0;
        }
        if (mVideos != null)
        {
            i3 = mVideos.hashCode();
        } else
        {
            i3 = 0;
        }
        if (mImages != null)
        {
            j3 = mImages.hashCode();
        }
        return (i3 + (l2 + (k2 + ((i2 + (l1 + (k1 + ((j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k3) * 31) * 31) * 31) * 31 + j2) * 31) * 31) * 31) * 31 + j3;
    }

    public boolean isNonExplicit()
    {
        return mNonExplicit;
    }

    public boolean isTestAd()
    {
        return mTestAd;
    }

    public String toString()
    {
        return (new StringBuilder("Ad{mId='")).append(mId).append('\'').append(", mAdvertiser='").append(mAdvertiser).append('\'').append(", mUri='").append(mUri).append('\'').append(", mTitle='").append(mTitle).append('\'').append(", mClickUrl='").append(mClickUrl).append('\'').append(", mClickTrackingUrl='").append(mClickTrackingUrl).append('\'').append(", mDuration=").append(mDuration).append(", mCaption='").append(mCaption).append('\'').append(", mAdType=").append(mAdType).append(", mTestAd=").append(mTestAd).append(", mNonExplicit=").append(mNonExplicit).append(", mFeatureData=").append(mFeatureData).append(", mCompanionAd=").append(mCompanionAd).append(", mVideos=").append(mVideos).append(", mImages=").append(mImages).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mUri);
        parcel.writeString(mAdvertiser);
        parcel.writeString(mTitle);
        parcel.writeString(mClickUrl);
        parcel.writeString(mClickTrackingUrl);
        parcel.writeLong(mDuration);
        parcel.writeString(mCaption);
        parcel.writeInt(mAdTypeInt);
        gen.a(parcel, mTestAd);
        gen.a(parcel, mNonExplicit);
        parcel.writeSerializable((Serializable)mFeatureData);
        parcel.writeSerializable(mFeaturedActionType);
        parcel.writeString(mFeaturedActionUri);
        parcel.writeString(mButtonText);
        parcel.writeParcelable(mCompanionAd, 0);
        parcel.writeList(mVideos);
        parcel.writeList(mImages);
    }


    private class AdType extends Enum
        implements JacksonModel
    {

        private static final AdType $VALUES[];
        public static final AdType END_CARD_AD;
        public static final AdType NORMAL;
        public static final AdType OFFER_AD;
        private static SparseArray sValueMap;
        private final int mValue;

        public static AdType getByValue(int i)
        {
            return (AdType)sValueMap.get(i);
        }

        public static AdType valueOf(String s)
        {
            return (AdType)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/Ad$AdType, s);
        }

        public static AdType[] values()
        {
            return (AdType[])$VALUES.clone();
        }

        public final int getValue()
        {
            return mValue;
        }

        static 
        {
            NORMAL = new AdType("NORMAL", 0, 0);
            OFFER_AD = new AdType("OFFER_AD", 1, 1);
            END_CARD_AD = new AdType("END_CARD_AD", 2, 2);
            $VALUES = (new AdType[] {
                NORMAL, OFFER_AD, END_CARD_AD
            });
            sValueMap = new SparseArray();
            AdType adtype;
            for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/spotlets/ads/model/Ad$AdType).iterator(); iterator.hasNext(); sValueMap.put(adtype.getValue(), adtype))
            {
                adtype = (AdType)iterator.next();
            }

        }

        private AdType(String s, int i, int j)
        {
            super(s, i);
            mValue = j;
        }
    }


    private class FeaturedActionType extends Enum
    {

        public static final FeaturedActionType a;
        public static final FeaturedActionType b;
        public static final FeaturedActionType c;
        public static final FeaturedActionType d;
        private static final FeaturedActionType e[];
        private final String mValue;

        public static FeaturedActionType a(String s)
        {
            FeaturedActionType afeaturedactiontype[] = values();
            int j = afeaturedactiontype.length;
            for (int i = 0; i < j; i++)
            {
                FeaturedActionType featuredactiontype = afeaturedactiontype[i];
                if (featuredactiontype.mValue.equals(s))
                {
                    return featuredactiontype;
                }
            }

            return a;
        }

        public static FeaturedActionType valueOf(String s)
        {
            return (FeaturedActionType)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/Ad$FeaturedActionType, s);
        }

        public static FeaturedActionType[] values()
        {
            return (FeaturedActionType[])e.clone();
        }

        static 
        {
            a = new FeaturedActionType("NONE", 0, "");
            b = new FeaturedActionType("SAVE", 1, "Save");
            c = new FeaturedActionType("OPT_IN", 2, "optin");
            d = new FeaturedActionType("OPT_OUT", 3, "optout");
            e = (new FeaturedActionType[] {
                a, b, c, d
            });
        }

        private FeaturedActionType(String s, int i, String s1)
        {
            super(s, i);
            mValue = s1;
        }
    }

}
