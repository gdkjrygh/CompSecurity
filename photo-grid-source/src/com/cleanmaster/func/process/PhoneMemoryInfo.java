// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.func.process;

import android.os.Parcel;

// Referenced classes of package com.cleanmaster.func.process:
//            IPhoneMemoryInfo

public class PhoneMemoryInfo
    implements IPhoneMemoryInfo
{

    long a;
    long b;
    int c;
    int d;
    long e;

    PhoneMemoryInfo()
    {
    }

    public PhoneMemoryInfo(long l, long l1)
    {
        a(l, l1);
    }

    public long a()
    {
        return a;
    }

    public void a(long l, long l1)
    {
        e = l;
        a = l1;
        d = 1;
        b = l;
        if (0L < a)
        {
            c = (int)(((float)(a - b) * 100F) / (float)a);
            return;
        } else
        {
            c = 85;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeLong(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeLong(e);
    }
}
