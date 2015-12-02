// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.whitelist;

import android.os.Parcel;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.whitelist:
//            UserBWRecord

class 
    implements android.os.tor
{

    public UserBWRecord a(Parcel parcel)
    {
        return new UserBWRecord(parcel);
    }

    public UserBWRecord[] a(int i)
    {
        return new UserBWRecord[i];
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
