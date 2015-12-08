// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;

public class DiscoverReasonModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new DiscoverReasonModel(parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new DiscoverReasonModel[i];
        }

    };
    public final String title;
    public final String titleUri;

    public DiscoverReasonModel(String s, String s1)
    {
        title = s;
        titleUri = s1;
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
            obj = (DiscoverReasonModel)obj;
            if (!cty.a(title, ((DiscoverReasonModel) (obj)).title) || !cty.a(titleUri, ((DiscoverReasonModel) (obj)).titleUri))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (title != null)
        {
            i = title.hashCode();
        } else
        {
            i = 0;
        }
        if (titleUri != null)
        {
            j = titleUri.hashCode();
        }
        return i * 31 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(title);
        parcel.writeString(titleUri);
    }

}
