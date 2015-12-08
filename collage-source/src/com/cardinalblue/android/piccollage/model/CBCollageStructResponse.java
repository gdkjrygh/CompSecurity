// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

public class CBCollageStructResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CBCollageStructResponse a(Parcel parcel)
        {
            return new CBCollageStructResponse(parcel);
        }

        public CBCollageStructResponse[] a(int i)
        {
            return new CBCollageStructResponse[i];
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
    private WebPhoto a;

    public CBCollageStructResponse()
    {
    }

    private CBCollageStructResponse(Parcel parcel)
    {
        a = (WebPhoto)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/WebPhoto.getClassLoader());
    }


    public WebPhoto a()
    {
        return a;
    }

    public boolean b()
    {
        return a != null && !TextUtils.isEmpty(a.getId()) && !TextUtils.isEmpty(a.getUrl());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
    }

}
