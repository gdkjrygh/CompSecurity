// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.taste.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import gdw;
import gen;
import java.util.List;

public class Question
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Question(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Question[i];
        }

    };
    public final List audioPreviews;
    public final String id;
    public final List images;
    public boolean isSelected;
    public final String name;

    protected Question(Parcel parcel)
    {
        id = parcel.readString();
        name = parcel.readString();
        images = parcel.createStringArrayList();
        audioPreviews = parcel.createStringArrayList();
        isSelected = gen.a(parcel);
    }

    public Question(String s, String s1, List list, List list1)
    {
        id = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        images = gdw.a(list);
        audioPreviews = gdw.a(list1);
        isSelected = false;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(name);
        parcel.writeStringList(images);
        parcel.writeStringList(audioPreviews);
        gen.a(parcel, isSelected);
    }

}
