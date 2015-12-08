// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.groupinfo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;

// Referenced classes of package com.roidapp.imagelib.filter.groupinfo:
//            BaseGroupInfo, c

public class LocalGroupInfo extends BaseGroupInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public int b;
    public int c;
    public int d;
    protected boolean e;

    public LocalGroupInfo(int i, int j, int k, IFilterInfo aifilterinfo[], int l)
    {
        super(l);
        b = i;
        d = j;
        c = k;
        a = aifilterinfo;
    }

    private LocalGroupInfo(Parcel parcel)
    {
        super(parcel);
    }

    LocalGroupInfo(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final String a(Context context)
    {
        return context.getResources().getString(b);
    }

    public final int b(Context context)
    {
        return context.getResources().getColor(c);
    }

    public int describeContents()
    {
        return 0;
    }

    public final String f()
    {
        return "";
    }

    public final boolean g()
    {
        return e;
    }

    public final Object h()
    {
        return Integer.valueOf(d);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
    }

}
