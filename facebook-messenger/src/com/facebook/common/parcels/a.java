// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.parcels;

import android.os.Parcel;

public class a
{

    public a()
    {
    }

    public static void a(Parcel parcel, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public static boolean a(Parcel parcel)
    {
        return parcel.readInt() == 1;
    }
}
