// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public abstract class btg
{

    public String a;
    public long b;

    public btg()
    {
    }

    public btg(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readLong();
    }

    public final String b()
    {
        return a;
    }

    public final boolean c()
    {
        return b > System.currentTimeMillis();
    }
}
