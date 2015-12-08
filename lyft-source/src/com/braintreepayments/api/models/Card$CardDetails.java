// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

class <init>
    implements Parcelable, Serializable
{

    public static final android.os.r CREATOR = new android.os.Parcelable.Creator() {

        public Card.CardDetails createFromParcel(Parcel parcel)
        {
            return new Card.CardDetails(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Card.CardDetails[] newArray(int i)
        {
            return new Card.CardDetails[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String cardType;
    private String lastTwo;

    public int describeContents()
    {
        return 0;
    }

    protected String getCardType()
    {
        return cardType;
    }

    protected String getLastTwo()
    {
        return lastTwo;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(cardType);
        parcel.writeString(lastTwo);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        cardType = parcel.readString();
        lastTwo = parcel.readString();
    }

    lastTwo(Parcel parcel, lastTwo lasttwo)
    {
        this(parcel);
    }
}
