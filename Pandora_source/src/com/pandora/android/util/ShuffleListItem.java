// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.Parcel;
import android.os.Parcelable;

public class ShuffleListItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ShuffleListItem a(Parcel parcel)
        {
            return new ShuffleListItem(parcel);
        }

        public ShuffleListItem[] a(int i)
        {
            return new ShuffleListItem[i];
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
    private final String a;
    private final String b;
    private boolean c;
    private final boolean d;
    private final boolean e;

    public ShuffleListItem(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    public ShuffleListItem(String s, String s1, boolean flag, boolean flag1, boolean flag2)
    {
        a = s;
        b = s1;
        c = flag;
        d = flag1;
        e = flag2;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        return c;
    }

    public String b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeString(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (e)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
