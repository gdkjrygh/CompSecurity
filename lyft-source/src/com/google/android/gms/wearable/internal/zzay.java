// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            NodeParcelable

public class zzay
    implements android.os.Parcelable.Creator
{

    public zzay()
    {
    }

    static void a(NodeParcelable nodeparcelable, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, nodeparcelable.a);
        zzb.a(parcel, 2, nodeparcelable.a(), false);
        zzb.a(parcel, 3, nodeparcelable.b(), false);
        zzb.a(parcel, 4, nodeparcelable.c());
        zzb.a(parcel, 5, nodeparcelable.d());
        zzb.a(parcel, i);
    }

    public NodeParcelable a(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = zza.b(parcel);
        int i = 0;
        String s1 = null;
        int j = 0;
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
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.f(parcel, l);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new NodeParcelable(j, s1, s, i, flag);
            }
        } while (true);
    }

    public NodeParcelable[] a(int i)
    {
        return new NodeParcelable[i];
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
