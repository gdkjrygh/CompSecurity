// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class CountryCode
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new CountryCode(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new CountryCode[0];
        }

    };
    private String a;
    private String b;
    private int c;

    public CountryCode()
    {
        this(null, null, -1);
    }

    public CountryCode(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readInt();
    }

    public CountryCode(String s, String s1, int i)
    {
        a = s;
        b = s1;
        c = i;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final String d()
    {
        return (new StringBuilder("+")).append(c).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof CountryCode)
        {
            obj = (CountryCode)obj;
            flag = flag1;
            if (((CountryCode) (obj)).c == c)
            {
                flag = flag1;
                if (TextUtils.equals(((CountryCode) (obj)).a, a))
                {
                    flag = flag1;
                    if (TextUtils.equals(((CountryCode) (obj)).b, b))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int j = 0;
        int k = c;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i + k + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c);
    }

}
