// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fg, fk

public class fh
    implements android.os.Parcelable.Creator
{

    public fh()
    {
    }

    static void a(fg fg1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, fg1.xN, i, false);
        b.c(parcel, 1000, fg1.xM);
        b.a(parcel, 2, fg1.xO, false);
        b.a(parcel, 3, fg1.xP);
        b.G(parcel, j);
    }

    public fg[] D(int i)
    {
        return new fg[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return l(parcel);
    }

    public fg l(Parcel parcel)
    {
        fk afk[];
        Object obj;
        int i;
        int j;
        boolean flag;
        obj = null;
        flag = false;
        j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        afk = null;
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
        obj = afk;
        afk = ((fk []) (obj1));
_L8:
        Object obj2 = obj;
        obj = afk;
        afk = ((fk []) (obj2));
        if (true) goto _L7; else goto _L6
_L6:
        fk afk1[] = (fk[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, fk.CREATOR);
        afk = ((fk []) (obj));
        obj = afk1;
          goto _L8
_L5:
        i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        Object obj3 = afk;
        afk = ((fk []) (obj));
        obj = obj3;
          goto _L8
_L3:
        String s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
        obj = afk;
        afk = s;
          goto _L8
        flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
        Object obj4 = afk;
        afk = ((fk []) (obj));
        obj = obj4;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new fg(i, afk, ((String) (obj)), flag);
        }
    }

    public Object[] newArray(int i)
    {
        return D(i);
    }
}
