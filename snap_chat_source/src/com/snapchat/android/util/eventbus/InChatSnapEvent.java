// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;

import android.os.Parcel;
import android.os.Parcelable;

public class InChatSnapEvent
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new InChatSnapEvent(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new InChatSnapEvent[i];
        }

    };
    public String mCaption;
    public int mOriginatingFragment;
    public String mRecipients;

    public InChatSnapEvent(Parcel parcel)
    {
        mRecipients = parcel.readString();
        mCaption = parcel.readString();
        mOriginatingFragment = parcel.readInt();
    }

    public InChatSnapEvent(String s, String s1)
    {
        mRecipients = s;
        mCaption = s1;
        mOriginatingFragment = 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mRecipients);
        parcel.writeString(mCaption);
        parcel.writeInt(mOriginatingFragment);
    }

}
