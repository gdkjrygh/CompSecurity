// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.FileConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public class aj
    implements android.os.Parcelable.Creator
{

    public aj()
    {
    }

    static void a(OnEventResponse oneventresponse, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, oneventresponse.xM);
        b.c(parcel, 2, oneventresponse.Iq);
        b.a(parcel, 3, oneventresponse.Jy, i, false);
        b.a(parcel, 4, oneventresponse.Jz, i, false);
        b.G(parcel, j);
    }

    public OnEventResponse ak(Parcel parcel)
    {
        FileConflictEvent fileconflictevent;
        ChangeEvent changeevent;
        int i;
        int j;
        int l;
        fileconflictevent = null;
        j = 0;
        l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        changeevent = null;
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
        fileconflictevent = (FileConflictEvent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FileConflictEvent.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (parcel.dataPosition() != l)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
        } else
        {
            return new OnEventResponse(i, j, changeevent, fileconflictevent);
        }
    }

    public OnEventResponse[] bg(int i)
    {
        return new OnEventResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ak(parcel);
    }

    public Object[] newArray(int i)
    {
        return bg(i);
    }
}
