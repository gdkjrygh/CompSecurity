// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.services:
//            ScanResult

class 
    implements android.os.eator
{

    public ScanResult a(Parcel parcel)
    {
        return new ScanResult(parcel);
    }

    public ScanResult[] a(int i)
    {
        return new ScanResult[i];
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
