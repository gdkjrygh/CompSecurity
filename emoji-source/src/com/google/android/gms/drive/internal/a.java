// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AddEventListenerRequest

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(AddEventListenerRequest addeventlistenerrequest, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, addeventlistenerrequest.xM);
        b.a(parcel, 2, addeventlistenerrequest.Hz, i, false);
        b.c(parcel, 3, addeventlistenerrequest.Iq);
        b.a(parcel, 4, addeventlistenerrequest.Ir, i, false);
        b.G(parcel, j);
    }

    public AddEventListenerRequest R(Parcel parcel)
    {
        PendingIntent pendingintent;
        DriveId driveid;
        int i;
        int j;
        int l;
        pendingintent = null;
        j = 0;
        l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        driveid = null;
        i = 0;
_L7:
        int k;
        if (parcel.dataPosition() >= l)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
        com.google.android.gms.common.internal.safeparcel.a.ar(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 101
    //                   2 120
    //                   3 148
    //                   4 167;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_167;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        k = j;
        j = i;
        i = k;
_L8:
        k = j;
        j = i;
        i = k;
        if (true) goto _L7; else goto _L6
_L6:
        k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        i = j;
        j = k;
          goto _L8
_L3:
        driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
_L4:
        k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        j = i;
        i = k;
          goto _L8
        pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PendingIntent.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (parcel.dataPosition() != l)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
        } else
        {
            return new AddEventListenerRequest(i, driveid, j, pendingintent);
        }
    }

    public AddEventListenerRequest[] aM(int i)
    {
        return new AddEventListenerRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return R(parcel);
    }

    public Object[] newArray(int i)
    {
        return aM(i);
    }
}
