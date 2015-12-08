// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import java.io.Serializable;

public class School
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final School createFromParcel(Parcel parcel)
        {
            return new School(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final School[] newArray(int i)
        {
            return new School[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String id;
    public boolean isDisplayed;
    private String mName;

    protected School(Parcel parcel)
    {
        mName = parcel.readString();
        id = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isDisplayed = flag;
    }

    public School(String s, String s1, boolean flag)
    {
        mName = s1;
        id = s;
        isDisplayed = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof School))
            {
                return false;
            }
            obj = (School)obj;
            if (isDisplayed != ((School) (obj)).isDisplayed)
            {
                return false;
            }
            if (mName == null ? ((School) (obj)).mName != null : !mName.equals(((School) (obj)).mName))
            {
                return false;
            }
            if (id == null ? ((School) (obj)).id != null : !id.equals(((School) (obj)).id))
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return mName;
    }

    public Spanned getSpanned()
    {
        return Html.fromHtml(mName);
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (mName != null)
        {
            i = mName.hashCode();
        } else
        {
            i = 0;
        }
        if (id != null)
        {
            j = id.hashCode();
        } else
        {
            j = 0;
        }
        if (isDisplayed)
        {
            k = 1;
        }
        return (j + i * 31) * 31 + k;
    }

    public String toString()
    {
        return mName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mName);
        parcel.writeString(id);
        if (isDisplayed)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
