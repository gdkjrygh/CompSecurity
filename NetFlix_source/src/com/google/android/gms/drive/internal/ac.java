// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public class ac
    implements android.os.Parcelable.Creator
{

    public ac()
    {
    }

    static void a(OnEventResponse oneventresponse, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, oneventresponse.xH);
        b.c(parcel, 2, oneventresponse.ES);
        b.a(parcel, 3, oneventresponse.FH, i, false);
        b.a(parcel, 4, oneventresponse.FI, i, false);
        b.F(parcel, j);
    }

    public OnEventResponse Q(Parcel parcel)
    {
        ConflictEvent conflictevent;
        ChangeEvent changeevent;
        int i;
        int j;
        int l;
        conflictevent = null;
        j = 0;
        l = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        changeevent = null;
        i = 0;
_L7:
        int k;
        if (parcel.dataPosition() >= l)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
        com.google.android.gms.common.internal.safeparcel.a.R(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 101
    //                   2 120
    //                   3 139
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
        k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        j = i;
        i = k;
          goto _L8
_L4:
        changeevent = (ChangeEvent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ChangeEvent.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
        conflictevent = (ConflictEvent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ConflictEvent.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (parcel.dataPosition() != l)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
        } else
        {
            return new OnEventResponse(i, j, changeevent, conflictevent);
        }
    }

    public OnEventResponse[] au(int i)
    {
        return new OnEventResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return Q(parcel);
    }

    public Object[] newArray(int i)
    {
        return au(i);
    }
}
