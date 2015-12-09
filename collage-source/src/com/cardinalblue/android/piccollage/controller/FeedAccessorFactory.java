// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.os.Parcel;
import android.os.Parcelable;
import bolts.j;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.lib.d;
import com.cardinalblue.android.piccollage.model.gson.BaseNativeAdWebPhoto;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.NativeAdFactory;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import java.util.List;

public class FeedAccessorFactory
{
    private static class ContestFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public ContestFeedAccessor a(Parcel parcel)
            {
                return new ContestFeedAccessor(parcel);
            }

            public ContestFeedAccessor[] a(int i)
            {
                return new ContestFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };

        public CBCollagesResponse a()
            throws Exception
        {
            return f.m();
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        }


        public ContestFeedAccessor()
        {
        }

        private ContestFeedAccessor(Parcel parcel)
        {
        }

    }

    private static class FeatureFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public FeatureFeedAccessor a(Parcel parcel)
            {
                return new FeatureFeedAccessor(parcel);
            }

            public FeatureFeedAccessor[] a(int i)
            {
                return new FeatureFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };

        private BaseNativeAdWebPhoto b()
            throws InterruptedException
        {
            if (((d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().isNativeAdsEnabled())
            {
                BaseNativeAdWebPhoto basenativeadwebphoto = NativeAdFactory.create(((d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getNativeAdProvider());
                j j1 = basenativeadwebphoto.getLoadingResult();
                j1.g();
                if (j1.d() || j1.c())
                {
                    basenativeadwebphoto = null;
                }
                return basenativeadwebphoto;
            } else
            {
                return null;
            }
        }

        public CBCollagesResponse a()
            throws Exception
        {
            CBCollagesResponse cbcollagesresponse = f.i();
            BaseNativeAdWebPhoto basenativeadwebphoto = b();
            if (basenativeadwebphoto != null)
            {
                cbcollagesresponse.getPhotos().add(3, basenativeadwebphoto);
            }
            return cbcollagesresponse;
        }

        public CBCollagesResponse a(String s)
            throws Exception
        {
            s = super.a(s);
            BaseNativeAdWebPhoto basenativeadwebphoto = b();
            if (basenativeadwebphoto != null)
            {
                s.getPhotos().add(3, basenativeadwebphoto);
            }
            return s;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        }


        public FeatureFeedAccessor()
        {
        }

        private FeatureFeedAccessor(Parcel parcel)
        {
        }

    }

    public static abstract class FeedAccessor
        implements Parcelable
    {

        public abstract CBCollagesResponse a()
            throws Exception;

        public CBCollagesResponse a(String s)
            throws Exception
        {
            return f.i(s);
        }

        public FeedAccessor()
        {
        }
    }

    private static class FollowingFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public FollowingFeedAccessor a(Parcel parcel)
            {
                return new FollowingFeedAccessor(parcel);
            }

            public FollowingFeedAccessor[] a(int i)
            {
                return new FollowingFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };

        public CBCollagesResponse a()
            throws Exception
        {
            if (!PicAuth.h().b())
            {
                throw new com.cardinalblue.android.piccollage.auth.PicAuth.a(1);
            } else
            {
                return f.l();
            }
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        }


        public FollowingFeedAccessor()
        {
        }

        private FollowingFeedAccessor(Parcel parcel)
        {
        }

    }

    private static class RemixFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public RemixFeedAccessor a(Parcel parcel)
            {
                return new RemixFeedAccessor(parcel);
            }

            public RemixFeedAccessor[] a(int i)
            {
                return new RemixFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };

        public CBCollagesResponse a()
            throws Exception
        {
            return f.k();
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        }


        public RemixFeedAccessor()
        {
        }

        private RemixFeedAccessor(Parcel parcel)
        {
        }

    }

    private static class SimpleAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SimpleAccessor a(Parcel parcel)
            {
                return new SimpleAccessor(parcel);
            }

            public SimpleAccessor[] a(int i)
            {
                return new SimpleAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };

        public CBCollagesResponse a()
            throws Exception
        {
            return null;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        }


        public SimpleAccessor()
        {
        }

        private SimpleAccessor(Parcel parcel)
        {
        }

    }

    private static class UserEchoFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public UserEchoFeedAccessor a(Parcel parcel)
            {
                return new UserEchoFeedAccessor(parcel);
            }

            public UserEchoFeedAccessor[] a(int i)
            {
                return new UserEchoFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private final String a;

        public CBCollagesResponse a()
            throws Exception
        {
            return f.q(a);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
        }


        private UserEchoFeedAccessor(Parcel parcel)
        {
            a = parcel.readString();
        }


        public UserEchoFeedAccessor(Object obj)
        {
            a = (String)obj;
        }
    }

    private static class UserLikeFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public UserLikeFeedAccessor a(Parcel parcel)
            {
                return new UserLikeFeedAccessor(parcel);
            }

            public UserLikeFeedAccessor[] a(int i)
            {
                return new UserLikeFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private final String a;

        public CBCollagesResponse a()
            throws Exception
        {
            return f.p(a);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
        }


        private UserLikeFeedAccessor(Parcel parcel)
        {
            a = parcel.readString();
        }


        public UserLikeFeedAccessor(Object obj)
        {
            a = (String)obj;
        }
    }

    private static class UserPostFeedAccessor extends FeedAccessor
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public UserPostFeedAccessor a(Parcel parcel)
            {
                return new UserPostFeedAccessor(parcel);
            }

            public UserPostFeedAccessor[] a(int i)
            {
                return new UserPostFeedAccessor[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private final String a;

        public CBCollagesResponse a()
            throws Exception
        {
            return f.o(a);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
        }


        private UserPostFeedAccessor(Parcel parcel)
        {
            a = parcel.readString();
        }


        public UserPostFeedAccessor(Object obj)
        {
            a = (String)obj;
        }
    }


    public FeedAccessorFactory()
    {
    }

    public static FeedAccessor a(int i, Object obj)
    {
        switch (i)
        {
        default:
            return new SimpleAccessor();

        case 4: // '\004'
            b.j();
            return new RemixFeedAccessor();

        case 3: // '\003'
            return new FollowingFeedAccessor();

        case 2: // '\002'
            return new ContestFeedAccessor();

        case 1: // '\001'
            return new FeatureFeedAccessor();

        case 5: // '\005'
            return new UserPostFeedAccessor(obj);

        case 6: // '\006'
            return new UserLikeFeedAccessor(obj);

        case 7: // '\007'
            return new UserEchoFeedAccessor(obj);
        }
    }
}
