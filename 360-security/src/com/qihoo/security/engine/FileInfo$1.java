// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.engine:
//            FileInfo

class 
    implements android.os.Creator
{

    public FileInfo a(Parcel parcel)
    {
        return new FileInfo(parcel);
    }

    public FileInfo[] a(int i)
    {
        return new FileInfo[i];
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
