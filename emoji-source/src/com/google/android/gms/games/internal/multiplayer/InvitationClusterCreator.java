// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.InvitationEntity;

// Referenced classes of package com.google.android.gms.games.internal.multiplayer:
//            ZInvitationCluster

public class InvitationClusterCreator
    implements android.os.Parcelable.Creator
{

    public InvitationClusterCreator()
    {
    }

    static void a(ZInvitationCluster zinvitationcluster, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.b(parcel, 1, zinvitationcluster.ij(), false);
        b.c(parcel, 1000, zinvitationcluster.getVersionCode());
        b.G(parcel, i);
    }

    public ZInvitationCluster bi(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, InvitationEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ZInvitationCluster(i, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bi(parcel);
    }

    public ZInvitationCluster[] cs(int i)
    {
        return new ZInvitationCluster[i];
    }

    public Object[] newArray(int i)
    {
        return cs(i);
    }
}
