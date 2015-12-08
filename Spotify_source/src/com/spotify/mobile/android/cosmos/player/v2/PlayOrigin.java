// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;

public class PlayOrigin
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayOrigin createFromParcel(Parcel parcel)
        {
            return new PlayOrigin(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayOrigin[] newArray(int i)
        {
            return new PlayOrigin[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String mExternalReferrer;
    private final String mFeatureIdentifier;
    private final String mFeatureVersion;
    private final String mReferrerIdentifier;
    private final String mViewUri;

    protected PlayOrigin(Parcel parcel)
    {
        mFeatureIdentifier = parcel.readString();
        mFeatureVersion = parcel.readString();
        mViewUri = parcel.readString();
        mExternalReferrer = parcel.readString();
        mReferrerIdentifier = parcel.readString();
    }

    public PlayOrigin(String s, String s1, String s2, String s3)
    {
        this(s, s1, s2, s3, null);
    }

    public PlayOrigin(String s, String s1, String s2, String s3, String s4)
    {
        mFeatureIdentifier = s;
        mFeatureVersion = s1;
        mViewUri = s2;
        mExternalReferrer = s3;
        mReferrerIdentifier = s4;
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
            obj = (PlayOrigin)obj;
            if (!cty.a(mFeatureIdentifier, ((PlayOrigin) (obj)).mFeatureIdentifier) || !cty.a(mFeatureVersion, ((PlayOrigin) (obj)).mFeatureVersion) || !cty.a(mViewUri, ((PlayOrigin) (obj)).mViewUri) || !cty.a(mExternalReferrer, ((PlayOrigin) (obj)).mExternalReferrer) || !cty.a(mReferrerIdentifier, ((PlayOrigin) (obj)).mReferrerIdentifier))
            {
                return false;
            }
        }
        return true;
    }

    public String externalReferrer()
    {
        return mExternalReferrer;
    }

    public String featureIdentifier()
    {
        return mFeatureIdentifier;
    }

    public String featureVersion()
    {
        return mFeatureVersion;
    }

    public int hashCode()
    {
        int k = 0;
        int l = mFeatureIdentifier.hashCode();
        int i1 = mFeatureVersion.hashCode();
        int i;
        int j;
        if (mViewUri != null)
        {
            i = mViewUri.hashCode();
        } else
        {
            i = 0;
        }
        if (mExternalReferrer != null)
        {
            j = mExternalReferrer.hashCode();
        } else
        {
            j = 0;
        }
        if (mReferrerIdentifier != null)
        {
            k = mReferrerIdentifier.hashCode();
        }
        return (j + (i + (l * 31 + i1) * 31) * 31) * 31 + k;
    }

    public String referrerIdentifier()
    {
        return mReferrerIdentifier;
    }

    public String viewUri()
    {
        return mViewUri;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mFeatureIdentifier);
        parcel.writeString(mFeatureVersion);
        parcel.writeString(mViewUri);
        parcel.writeString(mExternalReferrer);
        parcel.writeString(mReferrerIdentifier);
    }

}
