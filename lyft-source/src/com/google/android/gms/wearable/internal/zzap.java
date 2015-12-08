// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetLocalNodeResponse, NodeParcelable

public class zzap
    implements android.os.Parcelable.Creator
{

    public zzap()
    {
    }

    static void a(GetLocalNodeResponse getlocalnoderesponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, getlocalnoderesponse.a);
        zzb.a(parcel, 2, getlocalnoderesponse.b);
        zzb.a(parcel, 3, getlocalnoderesponse.c, i, false);
        zzb.a(parcel, j);
    }

    public GetLocalNodeResponse a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        NodeParcelable nodeparcelable = null;
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
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    nodeparcelable = (NodeParcelable)zza.a(parcel, l, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetLocalNodeResponse(i, j, nodeparcelable);
            }
        } while (true);
    }

    public GetLocalNodeResponse[] a(int i)
    {
        return new GetLocalNodeResponse[i];
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
