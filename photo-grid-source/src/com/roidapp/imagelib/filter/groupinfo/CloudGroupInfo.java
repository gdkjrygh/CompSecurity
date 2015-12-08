// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.groupinfo;

import android.content.Context;
import android.os.Parcel;

// Referenced classes of package com.roidapp.imagelib.filter.groupinfo:
//            BaseGroupInfo, a

public class CloudGroupInfo extends BaseGroupInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public int g;

    public CloudGroupInfo(long l)
    {
        super(l);
        f = true;
    }

    public CloudGroupInfo(Parcel parcel)
    {
        super(parcel);
        f = true;
    }

    public final String a(Context context)
    {
        return b;
    }

    public final int b(Context context)
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String f()
    {
        return c;
    }

    public final boolean g()
    {
        return f;
    }

    public final Object h()
    {
        return d;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeInt(g);
        parcel.writeInt(e);
    }

}
