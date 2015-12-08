// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fh, fl

public class fi
    implements android.os.Parcelable.Creator
{

    public fi()
    {
    }

    static void a(fh fh1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, fh1.xK, i, false);
        b.c(parcel, 1000, fh1.xJ);
        b.a(parcel, 2, fh1.xL, false);
        b.a(parcel, 3, fh1.xM);
        b.G(parcel, j);
    }

    public fh[] D(int i)
    {
        return new fh[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return l(parcel);
    }

    public fh l(Parcel parcel)
    {
        fl afl[];
        Object obj;
        int i;
        int j;
        boolean flag;
        obj = null;
        flag = false;
        j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        afl = null;
        i = 0;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
        com.google.android.gms.common.internal.safeparcel.a.ar(k);
        JVM INSTR lookupswitch 4: default 80
    //                   1: 105
    //                   2: 146
    //                   3: 162
    //                   1000: 127;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_162;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        Object obj1 = obj;
        obj = afl;
        afl = ((fl []) (obj1));
_L8:
        Object obj2 = obj;
        obj = afl;
        afl = ((fl []) (obj2));
        if (true) goto _L7; else goto _L6
_L6:
        fl afl1[] = (fl[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, fl.CREATOR);
        afl = ((fl []) (obj));
        obj = afl1;
          goto _L8
_L5:
        i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        Object obj3 = afl;
        afl = ((fl []) (obj));
        obj = obj3;
          goto _L8
_L3:
        String s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
        obj = afl;
        afl = s;
          goto _L8
        flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
        Object obj4 = afl;
        afl = ((fl []) (obj));
        obj = obj4;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new fh(i, afl, ((String) (obj)), flag);
        }
    }

    public Object[] newArray(int i)
    {
        return D(i);
    }
}
