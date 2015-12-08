// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;

public abstract class cw
{

    protected String a;
    protected long b;

    public cw()
    {
    }

    public cw(Parcel parcel)
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
