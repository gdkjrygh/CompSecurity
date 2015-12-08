// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.b.h;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class FontModel
    implements Parcelable, IGsonable, h
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public FontModel createFromParcel(Parcel parcel)
        {
            return new FontModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FontModel[] newArray(int i)
        {
            return new FontModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private String mFontName;
    private float mPointSize;

    FontModel()
    {
    }

    FontModel(Parcel parcel)
    {
        setFontName(parcel.readString());
        setPointSize(parcel.readFloat());
    }

    public FontModel(String s, int i)
    {
        setFontName(s);
        setPointSize(i);
    }

    public FontModel createInstance(Type type)
    {
        return new FontModel();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getFontName()
    {
        return mFontName;
    }

    public float getPointSize()
    {
        return mPointSize;
    }

    public void setFontName(String s)
    {
        mFontName = s;
    }

    public void setPointSize(float f)
    {
        mPointSize = f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getFontName());
        parcel.writeFloat(getPointSize());
    }

}
