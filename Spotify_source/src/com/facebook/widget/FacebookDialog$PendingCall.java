// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

public class <init>
    implements Parcelable
{

    public static final android.os.dingCall.c CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new FacebookDialog.PendingCall(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new FacebookDialog.PendingCall[i];
        }

    };
    public UUID a;
    public Intent b;
    public int c;

    public static void a(<init> <init>1, Intent intent)
    {
        <init>1.b = intent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeParcelable(b, 0);
        parcel.writeInt(c);
    }


    public _cls1()
    {
        a = UUID.randomUUID();
        c = 64207;
    }

    private c(Parcel parcel)
    {
        a = UUID.fromString(parcel.readString());
        b = (Intent)parcel.readParcelable(null);
        c = parcel.readInt();
    }

    c(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
