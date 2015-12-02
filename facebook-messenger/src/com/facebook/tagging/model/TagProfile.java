// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tagging.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.tagging.model:
//            a

public class TagProfile
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public final String photoUri;
    public final String subtext;
    public final String text;
    public final String type;
    public final long uid;

    public TagProfile()
    {
        uid = 0L;
        photoUri = null;
        subtext = null;
        text = null;
        type = null;
    }

    public TagProfile(Parcel parcel)
    {
        uid = parcel.readLong();
        type = parcel.readString();
        text = parcel.readString();
        subtext = parcel.readString();
        photoUri = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(uid);
        parcel.writeString(type);
        parcel.writeString(text);
        parcel.writeString(subtext);
        parcel.writeString(photoUri);
    }

}
