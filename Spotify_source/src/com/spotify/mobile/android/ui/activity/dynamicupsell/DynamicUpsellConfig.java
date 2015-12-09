// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import dmz;
import gcf;
import gng;
import gni;
import java.util.HashMap;

public class DynamicUpsellConfig extends HashMap
    implements JacksonModel
{

    public static final long NO_EXPIRY_FOUND = -1L;
    private static final String UNWRAPPED_AD_SLOT_CONFIG = " {     \"type\":\"OVERLAY\",\n      \"heading\":\"PREMIUM ONLY\",\n      \"title\":\"UNLIMITED SKIPS\",\n      \"message\":\"Skip a song whenever you like\",\n      \"icon\":\"http://somehost.com/path/to/icon.jpg\",\n      \"impression_url\":\"http://google.com\",\n      \"expiry_length_seconds\":10,\n      \"action_button\":{\n        \"type\":\"URL\",\n        \"title\":\"GET PREMIUM NOW\",\n        \"url\":\"http://www.dn.se\",\n        \"product\":\"basic\",\n        \"tracking_url\":\"http://google.com\"\n      },\n      \"close_title\":\"NO THANKS\",\n      \"id\":\"70832172732\",\n      \"reason\":\"skip-limit-reached\",\n      \"background_image_url\":\"http://somehost.com/path/to/background.jpg\" }";
    private static final String UNWRAPPED_AD_SLOT_CONFIG_WITH_SHOW_UNTIL = " {     \"type\":\"OVERLAY\",\n      \"heading\":\"PREMIUM ONLY\",\n      \"title\":\"UNLIMITED SKIPS\",\n      \"message\":\"Skip a song whenever you like\",\n      \"icon\":\"http://somehost.com/path/to/icon.jpg\",\n      \"impression_url\":\"http://google.com\",\n      \"expiry_length_seconds\":10,\n      \"show_until\":\"2015-12-31T23:59:59Z\",\n      \"action_button\":{\n        \"type\":\"URL\",\n        \"title\":\"GET PREMIUM NOW\",\n        \"url\":\"http://www.dn.se\",\n        \"product\":\"basic\",\n        \"tracking_url\":\"http://google.com\"\n      },\n      \"close_title\":\"NO THANKS\",\n      \"id\":\"70832172732\",\n      \"reason\":\"skip-limit-reached\",\n      \"background_image_url\":\"http://somehost.com/path/to/background.jpg\" }";
    private static gcf sClock;
    public static final long serialVersionUID = 42L;

    public DynamicUpsellConfig()
    {
    }

    public static String getAdSlotSample1Json()
    {
        return " {     \"type\":\"OVERLAY\",\n      \"heading\":\"PREMIUM ONLY\",\n      \"title\":\"UNLIMITED SKIPS\",\n      \"message\":\"Skip a song whenever you like\",\n      \"icon\":\"http://somehost.com/path/to/icon.jpg\",\n      \"impression_url\":\"http://google.com\",\n      \"expiry_length_seconds\":10,\n      \"action_button\":{\n        \"type\":\"URL\",\n        \"title\":\"GET PREMIUM NOW\",\n        \"url\":\"http://www.dn.se\",\n        \"product\":\"basic\",\n        \"tracking_url\":\"http://google.com\"\n      },\n      \"close_title\":\"NO THANKS\",\n      \"id\":\"70832172732\",\n      \"reason\":\"skip-limit-reached\",\n      \"background_image_url\":\"http://somehost.com/path/to/background.jpg\" }";
    }

    public static DynamicUpsellConfig getDynamicUpsellConfigFrom(String s)
    {
        return (DynamicUpsellConfig)((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL).a().reader(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig).readValue(s);
    }

    public static AdSlotConfiguration getEmptyConfig()
    {
        class AdSlotConfiguration.ActionButton
            implements Parcelable, JacksonModel
        {

            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final Object createFromParcel(Parcel parcel)
                {
                    return new AdSlotConfiguration.ActionButton(parcel);
                }

                public final volatile Object[] newArray(int i)
                {
                    return new AdSlotConfiguration.ActionButton[i];
                }

            };
            Product mProduct;
            public String mTitle;
            public String mTrackingUrl;
            public Type mType;
            public String mUrl;

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
                    obj = (AdSlotConfiguration.ActionButton)obj;
                    if (!cty.a(mType, ((AdSlotConfiguration.ActionButton) (obj)).mType) || !cty.a(mTitle, ((AdSlotConfiguration.ActionButton) (obj)).mTitle) || !cty.a(mUrl, ((AdSlotConfiguration.ActionButton) (obj)).mUrl) || !cty.a(mTrackingUrl, ((AdSlotConfiguration.ActionButton) (obj)).mTrackingUrl))
                    {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode()
            {
                return Arrays.hashCode(new Object[] {
                    mType, mTitle, mUrl, mTrackingUrl
                });
            }

            public String toString()
            {
                return (new StringBuilder("ActionButton{mType=")).append(mType).append(", mTitle='").append(mTitle).append('\'').append(", mUrl='").append(mUrl).append('\'').append(", mProduct=").append(mProduct).append(", mTrackingUrl='").append(mTrackingUrl).append('\'').append('}').toString();
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                parcel.writeParcelable(mType, i);
                parcel.writeParcelable(mProduct, i);
                parcel.writeString(mTitle);
                parcel.writeString(mUrl);
                parcel.writeString(mTrackingUrl);
            }


            protected AdSlotConfiguration.ActionButton(Parcel parcel)
            {
                class Type extends Enum
                    implements Parcelable, JacksonModel
                {

                    private static final Type $VALUES[];
                    public static final Type CALLBACK;
                    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                        public final Object createFromParcel(Parcel parcel1)
                        {
                            return Type.values()[parcel1.readInt()];
                        }

                        public final volatile Object[] newArray(int i)
                        {
                            return new Type[i];
                        }

                    };
                    public static final Type IAP;
                    public static final Type TRIAL;
                    public static final Type URL;

                    public static Type fromString(String s)
                    {
                        return valueOf(s.toUpperCase(Locale.US));
                    }

                    public static Type valueOf(String s)
                    {
                        return (Type)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$ActionButton$Type, s);
                    }

                    public static Type[] values()
                    {
                        return (Type[])$VALUES.clone();
                    }

                    public final int describeContents()
                    {
                        return 0;
                    }

                    public final void writeToParcel(Parcel parcel1, int i)
                    {
                        parcel1.writeInt(ordinal());
                    }

                    static 
                    {
                        CALLBACK = new Type("CALLBACK", 0);
                        IAP = new Type("IAP", 1);
                        URL = new Type("URL", 2);
                        TRIAL = new Type("TRIAL", 3);
                        $VALUES = (new Type[] {
                            CALLBACK, IAP, URL, TRIAL
                        });
                    }

                        private Type(String s, int i)
                        {
                            super(s, i);
                        }
                }

                mType = (Type)parcel.readParcelable(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$ActionButton$Type.getClassLoader());
                class Product extends Enum
                    implements Parcelable, JacksonModel
                {

                    private static final Product $VALUES[];
                    public static final Product BASIC;
                    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                        public final Object createFromParcel(Parcel parcel1)
                        {
                            return Product.values()[parcel1.readInt()];
                        }

                        public final volatile Object[] newArray(int i)
                        {
                            return new Product[i];
                        }

                    };
                    public static final Product PREMIUM;
                    public static final Product PREMIUM_TRIAL_30D;

                    public static Product fromString(String s)
                    {
                        return valueOf(s.toUpperCase(Locale.US));
                    }

                    public static Product valueOf(String s)
                    {
                        return (Product)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$ActionButton$Product, s);
                    }

                    public static Product[] values()
                    {
                        return (Product[])$VALUES.clone();
                    }

                    public final int describeContents()
                    {
                        return 0;
                    }

                    public final void writeToParcel(Parcel parcel1, int i)
                    {
                        parcel1.writeInt(ordinal());
                    }

                    static 
                    {
                        PREMIUM = new Product("PREMIUM", 0);
                        PREMIUM_TRIAL_30D = new Product("PREMIUM_TRIAL_30D", 1);
                        BASIC = new Product("BASIC", 2);
                        $VALUES = (new Product[] {
                            PREMIUM, PREMIUM_TRIAL_30D, BASIC
                        });
                    }

                        private Product(String s, int i)
                        {
                            super(s, i);
                        }
                }

                mProduct = (Product)parcel.readParcelable(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$ActionButton$Product.getClassLoader());
                mTitle = parcel.readString();
                mUrl = parcel.readString();
                mTrackingUrl = parcel.readString();
            }

            public AdSlotConfiguration.ActionButton(Type type, String s, String s1, Product product, String s2)
            {
                mType = type;
                mTitle = s;
                mUrl = s1;
                mProduct = product;
                mTrackingUrl = s2;
            }
        }

        return getEmptyConfig(new AdSlotConfiguration.ActionButton(AdSlotConfiguration.ActionButton.Type.URL, "", "http://test.action.url", null, "http://test.tracking.url"));
    }

    public static AdSlotConfiguration getEmptyConfig(AdSlotConfiguration.ActionButton actionbutton)
    {
        return new AdSlotConfiguration(AdSlotConfiguration.Type.OVERLAY, "", "", "", "", "http://test.impression.url", actionbutton, "", Long.valueOf(12015L), Long.valueOf(0L), null, "id", null, "", "");
    }

    public static String getUnwrappedSample1Json()
    {
        return getWrappedSample1Json().replace("\"ads\":{\n", "").replace("}\n}", "}");
    }

    public static String getWrappedSample1Json()
    {
        return "{  \"ads\":{\n    \"skip-limit-reached\":\n {     \"type\":\"OVERLAY\",\n      \"heading\":\"PREMIUM ONLY\",\n      \"title\":\"UNLIMITED SKIPS\",\n      \"message\":\"Skip a song whenever you like\",\n      \"icon\":\"http://somehost.com/path/to/icon.jpg\",\n      \"impression_url\":\"http://google.com\",\n      \"expiry_length_seconds\":10,\n      \"action_button\":{\n        \"type\":\"URL\",\n        \"title\":\"GET PREMIUM NOW\",\n        \"url\":\"http://www.dn.se\",\n        \"product\":\"basic\",\n        \"tracking_url\":\"http://google.com\"\n      },\n      \"close_title\":\"NO THANKS\",\n      \"id\":\"70832172732\",\n      \"reason\":\"skip-limit-reached\",\n      \"background_image_url\":\"http://somehost.com/path/to/background.jpg\" }  }}";
    }

    public static String getWrappedSample1JsonWithShowUntil()
    {
        return "{  \"ads\":{\n    \"skip-limit-reached\":\n {     \"type\":\"OVERLAY\",\n      \"heading\":\"PREMIUM ONLY\",\n      \"title\":\"UNLIMITED SKIPS\",\n      \"message\":\"Skip a song whenever you like\",\n      \"icon\":\"http://somehost.com/path/to/icon.jpg\",\n      \"impression_url\":\"http://google.com\",\n      \"expiry_length_seconds\":10,\n      \"show_until\":\"2015-12-31T23:59:59Z\",\n      \"action_button\":{\n        \"type\":\"URL\",\n        \"title\":\"GET PREMIUM NOW\",\n        \"url\":\"http://www.dn.se\",\n        \"product\":\"basic\",\n        \"tracking_url\":\"http://google.com\"\n      },\n      \"close_title\":\"NO THANKS\",\n      \"id\":\"70832172732\",\n      \"reason\":\"skip-limit-reached\",\n      \"background_image_url\":\"http://somehost.com/path/to/background.jpg\" }  }}";
    }

    public static String getWrappedSample2Json()
    {
        return getWrappedSample1Json().replace("1436812255204", "1436812255205").replace("skip-limit-reached", "disable-shuffle");
    }

    public static String getWrappedSample3Json()
    {
        return "{  \"ads\":{\n    \"showcase\":\n {     \"type\":\"OVERLAY\",\n      \"heading\":\"PREMIUM ONLY\",\n      \"title\":\"UNLIMITED SKIPS\",\n      \"message\":\"Skip a song whenever you like\",\n      \"icon\":\"http://somehost.com/path/to/icon.jpg\",\n      \"impression_url\":\"http://google.com\",\n      \"expiry_length_seconds\":10,\n      \"action_button\":{\n        \"type\":\"URL\",\n        \"title\":\"GET PREMIUM NOW\",\n        \"url\":\"http://www.dn.se\",\n        \"product\":\"basic\",\n        \"tracking_url\":\"http://google.com\"\n      },\n      \"close_title\":\"NO THANKS\",\n      \"id\":\"70832172732\",\n      \"reason\":\"skip-limit-reached\",\n      \"background_image_url\":\"http://somehost.com/path/to/background.jpg\" }  }}";
    }

    public static void setClock(gcf gcf1)
    {
        sClock = gcf1;
    }

    public long findEarliestExpiry(com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        reasongroup = reasongroup.mReasons;
        int j = reasongroup.length;
        int i = 0;
        long l;
        long l1;
        for (l = 0x7fffffffffffffffL; i < j; l = l1)
        {
            AdSlotConfiguration adslotconfiguration = getConfigForType(reasongroup[i]);
            l1 = l;
            if (adslotconfiguration != null)
            {
                l1 = Math.min(l, adslotconfiguration.mExpiryTime);
            }
            i++;
        }

        long l2 = l;
        if (l == 0x7fffffffffffffffL)
        {
            l2 = -1L;
        }
        return l2;
    }

    public AdSlotConfiguration getConfigForType(Reason reason)
    {
        return (AdSlotConfiguration)super.get(reason.mAdSlotName);
    }

    static 
    {
        sClock = gcf.a;
    }


    private class AdSlotConfiguration
        implements Parcelable, JacksonModel
    {

        public static final int BACKGROUND_COLOR_UNSET = -1;
        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new AdSlotConfiguration(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new AdSlotConfiguration[i];
            }

        };
        public static final AdSlotConfiguration EMPTY;
        public ActionButton mActionButton;
        public String mBackgroundImage;
        public int mBackgroundProminentColor;
        public String mCloseTitle;
        public long mExpiryLengthSeconds;
        public long mExpiryTime;
        public String mHeading;
        public String mIcon;
        public String mId;
        public String mImpression;
        public String mMessage;
        public PromotedProduct mPromotedProduct;
        public String mReason;
        public Date mShowUntil;
        public String mTitle;
        public Type mType;

        private long calculateExpiryTime()
        {
            if (mExpiryLengthSeconds == -1L || mExpiryLengthSeconds > 0x20c49ba5e353f7L)
            {
                return 0x7fffffffffffffffL;
            } else
            {
                long l = TimeUnit.SECONDS.toMillis(mExpiryLengthSeconds);
                gcf _tmp = DynamicUpsellConfig.sClock;
                return l + gcf.a();
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
                obj = (AdSlotConfiguration)obj;
                if (!cty.a(mType, ((AdSlotConfiguration) (obj)).mType) || !cty.a(mHeading, ((AdSlotConfiguration) (obj)).mHeading) || !cty.a(mTitle, ((AdSlotConfiguration) (obj)).mTitle) || !cty.a(mMessage, ((AdSlotConfiguration) (obj)).mMessage) || !cty.a(mIcon, ((AdSlotConfiguration) (obj)).mIcon) || !cty.a(mImpression, ((AdSlotConfiguration) (obj)).mImpression) || !cty.a(mActionButton, ((AdSlotConfiguration) (obj)).mActionButton) || !cty.a(mCloseTitle, ((AdSlotConfiguration) (obj)).mCloseTitle) || !cty.a(Long.valueOf(mExpiryLengthSeconds), Long.valueOf(((AdSlotConfiguration) (obj)).mExpiryLengthSeconds)) || !cty.a(Long.valueOf(mExpiryTime), Long.valueOf(((AdSlotConfiguration) (obj)).mExpiryTime)) || !cty.a(mShowUntil, ((AdSlotConfiguration) (obj)).mShowUntil) || !cty.a(mId, ((AdSlotConfiguration) (obj)).mId) || !cty.a(mPromotedProduct, ((AdSlotConfiguration) (obj)).mPromotedProduct) || !cty.a(mReason, ((AdSlotConfiguration) (obj)).mReason) || !cty.a(mBackgroundImage, ((AdSlotConfiguration) (obj)).mBackgroundImage))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                mType, mHeading, mTitle, mMessage, mIcon, mImpression, mActionButton, mCloseTitle, Long.valueOf(mExpiryLengthSeconds), Long.valueOf(mExpiryTime), 
                mShowUntil, mId, mPromotedProduct, mReason, mBackgroundImage
            });
        }

        public String toString()
        {
            return (new StringBuilder("AdSlotConfiguration{mType=")).append(mType).append(", mHeading='").append(mHeading).append('\'').append(", mTitle='").append(mTitle).append('\'').append(", mMessage='").append(mMessage).append('\'').append(", mIcon='").append(mIcon).append('\'').append(", mImpression='").append(mImpression).append('\'').append(", mActionButton=").append(mActionButton).append(", mCloseTitle='").append(mCloseTitle).append('\'').append(", mExpiryLengthSeconds=").append(mExpiryLengthSeconds).append(", mExpiryTime=").append(mExpiryTime).append(", mShowUntil=").append(mShowUntil).append(", mId='").append(mId).append('\'').append(", mPromotedProduct=").append(mPromotedProduct).append(", mReason='").append(mReason).append('\'').append(", mBackgroundImage='").append(mBackgroundImage).append('\'').append(", mBackgroundProminentColor=").append(mBackgroundProminentColor).append('}').toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeParcelable(mType, i);
            parcel.writeParcelable(mPromotedProduct, i);
            parcel.writeString(mHeading);
            parcel.writeString(mTitle);
            parcel.writeString(mMessage);
            parcel.writeString(mBackgroundImage);
            parcel.writeString(mReason);
            parcel.writeString(mIcon);
            parcel.writeString(mImpression);
            parcel.writeLong(mExpiryLengthSeconds);
            parcel.writeLong(mExpiryTime);
            parcel.writeSerializable(mShowUntil);
            parcel.writeParcelable(mActionButton, i);
            parcel.writeString(mCloseTitle);
            parcel.writeString(mId);
            parcel.writeInt(mBackgroundProminentColor);
        }

        static 
        {
            EMPTY = new AdSlotConfiguration(Type.EMPTY);
        }

        protected AdSlotConfiguration(Parcel parcel)
        {
            class Type extends Enum
                implements Parcelable, JacksonModel
            {

                private static final Type $VALUES[];
                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel1)
                    {
                        return Type.values()[parcel1.readInt()];
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new Type[i];
                    }

                };
                public static final Type EMPTY;
                public static final Type NOTHING;
                public static final Type OVERLAY;
                public static final Type PREVIEW;

                public static Type fromString(String s)
                {
                    return valueOf(s.toUpperCase(Locale.US));
                }

                public static Type valueOf(String s)
                {
                    return (Type)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$Type, s);
                }

                public static Type[] values()
                {
                    return (Type[])$VALUES.clone();
                }

                public final int describeContents()
                {
                    return 0;
                }

                public final void writeToParcel(Parcel parcel1, int i)
                {
                    parcel1.writeInt(ordinal());
                }

                static 
                {
                    PREVIEW = new Type("PREVIEW", 0);
                    OVERLAY = new Type("OVERLAY", 1);
                    NOTHING = new Type("NOTHING", 2);
                    EMPTY = new Type("EMPTY", 3);
                    $VALUES = (new Type[] {
                        PREVIEW, OVERLAY, NOTHING, EMPTY
                    });
                }

                private Type(String s, int i)
                {
                    super(s, i);
                }
            }

            mType = (Type)parcel.readParcelable(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$Type.getClassLoader());
            class PromotedProduct extends Enum
                implements Parcelable, JacksonModel
            {

                private static final PromotedProduct $VALUES[];
                public static final PromotedProduct BASIC;
                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel1)
                    {
                        return PromotedProduct.values()[parcel1.readInt()];
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new PromotedProduct[i];
                    }

                };
                public static final PromotedProduct PREMIUM;
                public static final PromotedProduct PREMIUM_TRIAL_30D;
                public static final PromotedProduct PREMIUM_TRIAL_7D;

                public static PromotedProduct fromString(String s)
                {
                    return valueOf(s.toUpperCase(Locale.US));
                }

                public static PromotedProduct valueOf(String s)
                {
                    return (PromotedProduct)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$PromotedProduct, s);
                }

                public static PromotedProduct[] values()
                {
                    return (PromotedProduct[])$VALUES.clone();
                }

                public final int describeContents()
                {
                    return 0;
                }

                public final void writeToParcel(Parcel parcel1, int i)
                {
                    parcel1.writeInt(ordinal());
                }

                static 
                {
                    PREMIUM = new PromotedProduct("PREMIUM", 0);
                    PREMIUM_TRIAL_7D = new PromotedProduct("PREMIUM_TRIAL_7D", 1);
                    PREMIUM_TRIAL_30D = new PromotedProduct("PREMIUM_TRIAL_30D", 2);
                    BASIC = new PromotedProduct("BASIC", 3);
                    $VALUES = (new PromotedProduct[] {
                        PREMIUM, PREMIUM_TRIAL_7D, PREMIUM_TRIAL_30D, BASIC
                    });
                }

                private PromotedProduct(String s, int i)
                {
                    super(s, i);
                }
            }

            mPromotedProduct = (PromotedProduct)parcel.readParcelable(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$PromotedProduct.getClassLoader());
            mHeading = parcel.readString();
            mTitle = parcel.readString();
            mMessage = parcel.readString();
            mBackgroundImage = parcel.readString();
            mReason = parcel.readString();
            mIcon = parcel.readString();
            mImpression = parcel.readString();
            mExpiryLengthSeconds = parcel.readLong();
            mExpiryTime = parcel.readLong();
            mShowUntil = (Date)parcel.readSerializable();
            mActionButton = (ActionButton)parcel.readParcelable(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig$AdSlotConfiguration$ActionButton.getClassLoader());
            mCloseTitle = parcel.readString();
            mId = parcel.readString();
            mBackgroundProminentColor = parcel.readInt();
        }

        private AdSlotConfiguration(Type type)
        {
            mType = type;
            mExpiryLengthSeconds = 0x7fffffffffffffffL;
            mExpiryTime = 0x7fffffffffffffffL;
        }

        public AdSlotConfiguration(Type type, String s, String s1, String s2, String s3, String s4, ActionButton actionbutton, 
                String s5, Long long1, Long long2, Date date, String s6, PromotedProduct promotedproduct, String s7, 
                String s8)
        {
            mType = type;
            if (type == null)
            {
                Assertion.b("Type is null");
            }
            mHeading = s;
            mTitle = s1;
            mMessage = s2;
            mIcon = s3;
            mImpression = s4;
            mActionButton = actionbutton;
            mCloseTitle = s5;
            long l;
            if (long1 != null)
            {
                l = long1.longValue();
            } else
            {
                l = 0x7fffffffffffffffL;
            }
            mExpiryLengthSeconds = l;
            if (long2 == null)
            {
                mExpiryTime = calculateExpiryTime();
            } else
            {
                mExpiryTime = long2.longValue();
            }
            mShowUntil = date;
            mId = s6;
            mPromotedProduct = promotedproduct;
            mReason = s7;
            mBackgroundImage = s8;
            mBackgroundProminentColor = -1;
        }
    }

}
