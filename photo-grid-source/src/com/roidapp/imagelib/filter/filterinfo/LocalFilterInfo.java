// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.filterinfo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;

// Referenced classes of package com.roidapp.imagelib.filter.filterinfo:
//            IFilterInfo, b

public class LocalFilterInfo
    implements IFilterInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public int a;
    public int b;
    public String c;
    public int d;

    public LocalFilterInfo()
    {
    }

    public LocalFilterInfo(byte byte0)
    {
        a = 0;
    }

    public LocalFilterInfo(int i, int j, String s, int k)
    {
        d = k;
        a = i;
        b = j;
        c = s;
    }

    public final int a()
    {
        return a;
    }

    public final Drawable a(Context context)
    {
        return context.getResources().getDrawable(b);
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeInt(d);
    }

}
