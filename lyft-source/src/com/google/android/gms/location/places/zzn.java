// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            UserDataType

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void a(UserDataType userdatatype, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, userdatatype.f, false);
        zzb.a(parcel, 1000, userdatatype.e);
        zzb.a(parcel, 2, userdatatype.g);
        zzb.a(parcel, i);
    }

    public UserDataType a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = zza.m(parcel, l);
                    break;

                case 1000: 
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new UserDataType(i, s, j);
            }
        } while (true);
    }

    public UserDataType[] a(int i)
    {
        return new UserDataType[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
