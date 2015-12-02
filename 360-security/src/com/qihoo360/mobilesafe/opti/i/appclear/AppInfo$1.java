// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.appclear;

import android.os.Parcel;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.appclear:
//            AppInfo

class 
    implements android.os..Creator
{

    public AppInfo a(Parcel parcel)
    {
        return new AppInfo(parcel);
    }

    public AppInfo[] a(int i)
    {
        return new AppInfo[i];
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
