// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ctz;
import geh;
import gen;

public class TermsAndConditionsModel
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new TermsAndConditionsModel(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new TermsAndConditionsModel[i];
        }

    };
    public final boolean a;
    public final long b;
    public final String c;
    public final String d;

    private TermsAndConditionsModel(Parcel parcel)
    {
        a = gen.a(parcel);
        b = parcel.readLong();
        c = parcel.readString();
        d = parcel.readString();
    }

    TermsAndConditionsModel(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public TermsAndConditionsModel(boolean flag, long l, String s, String s1)
    {
        ctz.a(s);
        geh.a(s, "Terms version is empty");
        boolean flag1;
        if (l >= 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.a(flag1, "client timestamp must be a valid epoch timestamp");
        a = flag;
        b = l;
        c = s;
        s = "";
        if (s1 != null)
        {
            s = s1;
        }
        d = (String)s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TermsAndConditionsModel)obj;
            if (a != ((TermsAndConditionsModel) (obj)).a)
            {
                return false;
            }
            if (b != ((TermsAndConditionsModel) (obj)).b)
            {
                return false;
            }
            if (!d.equals(((TermsAndConditionsModel) (obj)).d))
            {
                return false;
            }
            if (!c.equals(((TermsAndConditionsModel) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return ((i * 31 + (int)(b ^ b >>> 32)) * 31 + c.hashCode()) * 31 + d.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, a);
        parcel.writeLong(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
