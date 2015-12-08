// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Date;

public class InvitationCodeModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new InvitationCodeModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new InvitationCodeModel[i];
        }

    };
    private final String mClaimedByDisplayName;
    private final String mClaimedByUri;
    private final Date mClaimedDate;
    private final String mCode;

    private InvitationCodeModel(Parcel parcel)
    {
        mCode = parcel.readString();
        long l = parcel.readLong();
        Date date;
        if (l > 0L)
        {
            date = new Date(l);
        } else
        {
            date = null;
        }
        mClaimedDate = date;
        mClaimedByDisplayName = parcel.readString();
        mClaimedByUri = parcel.readString();
    }


    public InvitationCodeModel(String s, Date date, String s1, String s2)
    {
        mCode = s;
        mClaimedDate = date;
        mClaimedByDisplayName = s1;
        mClaimedByUri = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof InvitationCodeModel))
            {
                return false;
            }
            obj = (InvitationCodeModel)obj;
            if (!TextUtils.equals(mClaimedByDisplayName, ((InvitationCodeModel) (obj)).mClaimedByDisplayName) || !TextUtils.equals(mClaimedByUri, ((InvitationCodeModel) (obj)).mClaimedByUri) || (mClaimedDate == null ? ((InvitationCodeModel) (obj)).mClaimedDate != null : !mClaimedDate.equals(((InvitationCodeModel) (obj)).mClaimedDate)) || !TextUtils.equals(mCode, ((InvitationCodeModel) (obj)).mCode))
            {
                return false;
            }
        }
        return true;
    }

    public String getClaimedByDisplayName()
    {
        return mClaimedByDisplayName;
    }

    public String getClaimedByUri()
    {
        return mClaimedByUri;
    }

    public Date getClaimedDate()
    {
        return mClaimedDate;
    }

    public String getCode()
    {
        return mCode;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (mCode != null)
        {
            i = mCode.hashCode();
        } else
        {
            i = 0;
        }
        if (mClaimedDate != null)
        {
            j = mClaimedDate.hashCode();
        } else
        {
            j = 0;
        }
        if (mClaimedByDisplayName != null)
        {
            k = mClaimedByDisplayName.hashCode();
        } else
        {
            k = 0;
        }
        if (mClaimedByUri != null)
        {
            l = mClaimedByUri.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public boolean isClaimed()
    {
        return mClaimedDate != null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mCode);
        long l;
        if (mClaimedDate != null)
        {
            l = mClaimedDate.getTime();
        } else
        {
            l = 0L;
        }
        parcel.writeLong(l);
        parcel.writeString(mClaimedByDisplayName);
        parcel.writeString(mClaimedByUri);
    }

}
