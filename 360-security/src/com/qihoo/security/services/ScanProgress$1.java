// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.services:
//            ScanProgress

class 
    implements android.os.tor
{

    public ScanProgress a(Parcel parcel)
    {
        return new ScanProgress(parcel);
    }

    public ScanProgress[] a(int i)
    {
        return new ScanProgress[i];
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
