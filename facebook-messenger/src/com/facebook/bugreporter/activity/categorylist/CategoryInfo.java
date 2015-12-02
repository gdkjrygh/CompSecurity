// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.categorylist;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.bugreporter.activity.categorylist:
//            a

public class CategoryInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public final String a;
    public final long b;
    public final boolean c;

    private CategoryInfo(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readLong();
        boolean aflag[] = new boolean[1];
        parcel.readBooleanArray(aflag);
        c = aflag[0];
    }

    CategoryInfo(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public CategoryInfo(String s, long l)
    {
        a = s;
        b = l;
        c = false;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeLong(b);
        parcel.writeBooleanArray(new boolean[] {
            c
        });
    }

}
