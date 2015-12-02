// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.service;

import android.os.Parcel;

// Referenced classes of package com.qihoo360.mobilesafe.service:
//            ProcessInfo

class 
    implements android.os.ator
{

    public ProcessInfo a(Parcel parcel)
    {
        return new ProcessInfo(parcel, null);
    }

    public ProcessInfo[] a(int i)
    {
        return new ProcessInfo[i];
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
