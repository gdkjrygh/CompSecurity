// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.processclear;

import android.os.Parcel;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.processclear:
//            AppPackageInfo

class 
    implements android.os.r
{

    public AppPackageInfo a(Parcel parcel)
    {
        return new AppPackageInfo(parcel, null);
    }

    public AppPackageInfo[] a(int i)
    {
        return new AppPackageInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
