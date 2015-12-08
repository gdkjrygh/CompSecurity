// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemParcelable

public class zzab
    implements android.os.Parcelable.Creator
{

    public zzab()
    {
    }

    static void a(DataItemParcelable dataitemparcelable, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, dataitemparcelable.a);
        zzb.a(parcel, 2, dataitemparcelable.b(), i, false);
        zzb.a(parcel, 4, dataitemparcelable.f(), false);
        zzb.a(parcel, 5, dataitemparcelable.c(), false);
        zzb.a(parcel, j);
    }

    public DataItemParcelable a(Parcel parcel)
    {
        byte abyte0[];
        Object obj;
        Object obj1;
        int i;
        int j;
        abyte0 = null;
        j = zza.b(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        k = zza.a(parcel);
        zza.a(k);
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
        zza.b(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        i = zza.f(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        Uri uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
        obj = obj1;
        obj1 = uri;
          goto _L8
_L4:
        android.os.Bundle bundle = zza.o(parcel, k);
        obj1 = obj;
        obj = bundle;
          goto _L8
        abyte0 = zza.p(parcel, k);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new DataItemParcelable(i, ((Uri) (obj)), ((android.os.Bundle) (obj1)), abyte0);
        }
    }

    public DataItemParcelable[] a(int i)
    {
        return new DataItemParcelable[i];
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
