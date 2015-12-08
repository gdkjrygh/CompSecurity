// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.CompletionEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public class aq
    implements android.os.Parcelable.Creator
{

    public aq()
    {
    }

    static void a(OnEventResponse oneventresponse, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, oneventresponse.CK);
        b.c(parcel, 2, oneventresponse.Pm);
        b.a(parcel, 3, oneventresponse.QO, i, false);
        b.a(parcel, 5, oneventresponse.QP, i, false);
        b.H(parcel, j);
    }

    public OnEventResponse av(Parcel parcel)
    {
        CompletionEvent completionevent;
        ChangeEvent changeevent;
        int i;
        int j;
        int l;
        completionevent = null;
        j = 0;
        l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        changeevent = null;
        i = 0;
_L7:
        int k;
        if (parcel.dataPosition() >= l)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        com.google.android.gms.common.internal.safeparcel.a.aH(k);
        JVM INSTR tableswitch 1 5: default 72
    //                   1 105
    //                   2 124
    //                   3 143
    //                   4 72
    //                   5 171;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L5:
        break MISSING_BLOCK_LABEL_171;
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
        completionevent = (CompletionEvent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CompletionEvent.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (parcel.dataPosition() != l)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
        } else
        {
            return new OnEventResponse(i, j, changeevent, completionevent);
        }
    }

    public OnEventResponse[] bK(int i)
    {
        return new OnEventResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return av(parcel);
    }

    public Object[] newArray(int i)
    {
        return bK(i);
    }
}
