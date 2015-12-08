// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable:
//            PutDataRequest

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(PutDataRequest putdatarequest, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, putdatarequest.xM);
        b.a(parcel, 2, putdatarequest.getUri(), i, false);
        b.a(parcel, 4, putdatarequest.nm(), false);
        b.a(parcel, 5, putdatarequest.getData(), false);
        b.G(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cu(parcel);
    }

    public PutDataRequest cu(Parcel parcel)
    {
        byte abyte0[];
        Object obj;
        Object obj1;
        int i;
        int j;
        abyte0 = null;
        j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
        com.google.android.gms.common.internal.safeparcel.a.ar(k);
        JVM INSTR tableswitch 1 5: default 72
    //                   1 101
    //                   2 122
    //                   3 72
    //                   4 146
    //                   5 163;
           goto _L1 _L2 _L3 _L1 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_163;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        Uri uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
        obj = obj1;
        obj1 = uri;
          goto _L8
_L4:
        android.os.Bundle bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
        obj1 = obj;
        obj = bundle;
          goto _L8
        abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new PutDataRequest(i, ((Uri) (obj)), ((android.os.Bundle) (obj1)), abyte0);
        }
    }

    public PutDataRequest[] ec(int i)
    {
        return new PutDataRequest[i];
    }

    public Object[] newArray(int i)
    {
        return ec(i);
    }
}
