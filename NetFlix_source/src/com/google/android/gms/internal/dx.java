// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            dy

public final class dx
    implements SafeParcelable
{

    public static final dy CREATOR = new dy();
    public String rq;
    public int rr;
    public int rs;
    public boolean rt;
    public final int versionCode;

    public dx(int i, int j, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("afma-sdk-a-v").append(i).append(".").append(j).append(".");
        String s;
        if (flag)
        {
            s = "0";
        } else
        {
            s = "1";
        }
        this(1, stringbuilder.append(s).toString(), i, j, flag);
    }

    dx(int i, String s, int j, int k, boolean flag)
    {
        versionCode = i;
        rq = s;
        rr = j;
        rs = k;
        rt = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dy.a(this, parcel, i);
    }

}
