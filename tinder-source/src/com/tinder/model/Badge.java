// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.b.a;
import com.google.gson.e;
import com.tinder.utils.v;

public class Badge
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Badge createFromParcel(Parcel parcel)
        {
            return new Badge(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Badge[] newArray(int i)
        {
            return new Badge[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private int color;
    public String description;
    public String type;

    public Badge()
    {
        color = -1;
    }

    protected Badge(Parcel parcel)
    {
        color = -1;
        type = parcel.readString();
        description = parcel.readString();
        color = parcel.readInt();
    }

    public Badge(String s, String s1, String s2)
    {
        color = -1;
        type = s;
        description = s1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        color = Color.parseColor(s2);
        return;
        s;
        v.a("Failed to parse badge color", s);
        return;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getColor(Context context)
    {
        if (color == -1)
        {
            return a.b(context, 0x7f0d00ce);
        } else
        {
            return color;
        }
    }

    public String toString()
    {
        return (new e()).a(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(type);
        parcel.writeString(description);
        parcel.writeInt(color);
    }

}
