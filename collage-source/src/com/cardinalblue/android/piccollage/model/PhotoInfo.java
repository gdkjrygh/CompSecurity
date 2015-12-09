// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.b;

public class PhotoInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PhotoInfo a(Parcel parcel)
        {
            return new PhotoInfo(parcel);
        }

        public PhotoInfo[] a(int i)
        {
            return new PhotoInfo[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    protected final String a;
    protected final String b;
    protected final String c;
    protected boolean d;

    private PhotoInfo(Parcel parcel)
    {
        boolean flag = false;
        super();
        d = false;
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        if (parcel.readByte() != 0)
        {
            flag = true;
        }
        d = flag;
    }


    public PhotoInfo(String s, String s1)
    {
        this(s, s, s1);
    }

    public PhotoInfo(String s, String s1, String s2)
    {
        d = false;
        a = s;
        b = s1;
        c = s2;
    }

    public String a()
    {
        return a;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
    {
        return d;
    }

    public void d()
    {
        if ("camera".equals(c))
        {
            com.cardinalblue.android.piccollage.a.b.aG();
        }
        if ("facebook".equals(c))
        {
            com.cardinalblue.android.piccollage.a.b.aH();
        }
        if ("gallery".equals(c))
        {
            com.cardinalblue.android.piccollage.a.b.aF();
        }
        if ("googleplus".equals(c))
        {
            com.cardinalblue.android.piccollage.a.b.aI();
        }
        com.cardinalblue.android.piccollage.a.b.K(c);
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
            obj = (PhotoInfo)obj;
            if (!a.equals(((PhotoInfo) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        byte byte0;
        if (d)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}
