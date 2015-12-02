// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.engine:
//            ApkInfo

class 
    implements android.os..Creator
{

    public ApkInfo a(Parcel parcel)
    {
        return new ApkInfo(parcel);
    }

    public ApkInfo[] a(int i)
    {
        return new ApkInfo[i];
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
