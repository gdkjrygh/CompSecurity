// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;

public class DiscoverStoryModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new DiscoverStoryModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new DiscoverStoryModel[i];
        }

    };
    public final String imageUrl;
    public final String subtitle;
    public final String subtitleUri;
    public final String title;
    public final String titleUri;

    public DiscoverStoryModel(String s, String s1, String s2, String s3, String s4)
    {
        title = s;
        titleUri = s1;
        imageUrl = s2;
        subtitle = s3;
        subtitleUri = s4;
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
            obj = (DiscoverStoryModel)obj;
            if (!cty.a(title, ((DiscoverStoryModel) (obj)).title) || !cty.a(titleUri, ((DiscoverStoryModel) (obj)).titleUri) || !cty.a(imageUrl, ((DiscoverStoryModel) (obj)).imageUrl) || !cty.a(subtitle, ((DiscoverStoryModel) (obj)).subtitle) || !cty.a(subtitleUri, ((DiscoverStoryModel) (obj)).subtitleUri))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
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
        } else
        {
            j = 0;
        }
        if (imageUrl != null)
        {
            k = imageUrl.hashCode();
        } else
        {
            k = 0;
        }
        if (subtitle != null)
        {
            l = subtitle.hashCode();
        } else
        {
            l = 0;
        }
        if (subtitleUri != null)
        {
            i1 = subtitleUri.hashCode();
        }
        return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(title);
        parcel.writeString(titleUri);
        parcel.writeString(imageUrl);
        parcel.writeString(subtitle);
        parcel.writeString(subtitleUri);
    }

}
