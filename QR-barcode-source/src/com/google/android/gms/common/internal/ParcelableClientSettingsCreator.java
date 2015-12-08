// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ParcelableClientSettingsCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public ParcelableClientSettingsCreator()
    {
    }

    static void a(ClientSettings.ParcelableClientSettings parcelableclientsettings, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.a(parcel, 1, parcelableclientsettings.getAccountName(), false);
        b.c(parcel, 1000, parcelableclientsettings.getVersionCode());
        b.b(parcel, 2, parcelableclientsettings.getScopes(), false);
        b.c(parcel, 3, parcelableclientsettings.getGravityForPopups());
        b.a(parcel, 4, parcelableclientsettings.getRealClientPackageName(), false);
        b.H(parcel, i);
    }

    public ClientSettings.ParcelableClientSettings createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        java.util.ArrayList arraylist = null;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ClientSettings.ParcelableClientSettings(j, s1, arraylist, i, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ClientSettings.ParcelableClientSettings[] newArray(int i)
    {
        return new ClientSettings.ParcelableClientSettings[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
