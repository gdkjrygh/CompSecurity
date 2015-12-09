// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.viewuri;

import android.os.Parcel;
import android.os.Parcelable;
import ctz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verified
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Verified(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Verified[i];
        }

    };
    private final String a;
    private Pattern b;

    Verified(Parcel parcel)
    {
        a = parcel.readString();
        ctz.a(a);
    }

    public Verified(String s)
    {
        ctz.a(s);
        a = s;
    }

    public final boolean a(String s)
    {
        if (b == null)
        {
            b = Pattern.compile(a);
        }
        return b.matcher(s).matches();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Verified))
        {
            return false;
        } else
        {
            return ((Verified)obj).a.equals(a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
