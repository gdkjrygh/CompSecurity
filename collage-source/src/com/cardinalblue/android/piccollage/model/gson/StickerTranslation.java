// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StickerTranslation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public StickerTranslation createFromParcel(Parcel parcel)
        {
            return new StickerTranslation(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public StickerTranslation[] newArray(int i)
        {
            return new StickerTranslation[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public Map title;

    public StickerTranslation()
    {
        title = new HashMap();
    }

    private StickerTranslation(Parcel parcel)
    {
        title = new HashMap();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            String s = parcel.readString();
            String s1 = parcel.readString();
            title.put(s, s1);
        }

    }


    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(title.size());
        String s;
        for (Iterator iterator = title.keySet().iterator(); iterator.hasNext(); parcel.writeString((String)title.get(s)))
        {
            s = (String)iterator.next();
            parcel.writeString(s);
        }

    }

}
