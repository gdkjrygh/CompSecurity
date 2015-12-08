// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            LoadRealtimeRequest

public class aj
    implements android.os.Parcelable.Creator
{

    public aj()
    {
    }

    static void a(LoadRealtimeRequest loadrealtimerequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, loadrealtimerequest.CK);
        b.a(parcel, 2, loadrealtimerequest.Oj, i, false);
        b.a(parcel, 3, loadrealtimerequest.QF);
        b.H(parcel, j);
    }

    public LoadRealtimeRequest ap(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        DriveId driveid = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LoadRealtimeRequest(i, driveid, flag);
            }
        } while (true);
    }

    public LoadRealtimeRequest[] bE(int i)
    {
        return new LoadRealtimeRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ap(parcel);
    }

    public Object[] newArray(int i)
    {
        return bE(i);
    }
}
