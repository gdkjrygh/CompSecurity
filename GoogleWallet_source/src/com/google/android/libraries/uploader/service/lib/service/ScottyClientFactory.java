// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.uploader.client.HttpClient;
import com.google.uploader.client.UploadClient;
import com.google.uploader.client.UploadClientImpl;

public final class ScottyClientFactory
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static ScottyClientFactory createFromParcel(Parcel parcel)
        {
            return new ScottyClientFactory(parcel);
        }

        private static ScottyClientFactory[] newArray(int i)
        {
            return new ScottyClientFactory[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };

    public ScottyClientFactory()
    {
    }

    public ScottyClientFactory(Parcel parcel)
    {
    }

    public static UploadClient generateClient(HttpClient httpclient)
    {
        return UploadClientImpl.newBuilder(httpclient).build();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
    }

}
