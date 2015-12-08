// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventCreator

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
    final int zzHe;
    final long zzHf;
    final String zzHg;
    final int zzHh;
    final int zzHi;
    final String zzHj;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        zzHe = i;
        zzHf = l;
        zzHg = (String)zzx.zzl(s);
        zzHh = j;
        zzHi = k;
        zzHj = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof AccountChangeEvent)
            {
                if (zzHe != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).zzHe || zzHf != ((AccountChangeEvent) (obj)).zzHf || !zzw.equal(zzHg, ((AccountChangeEvent) (obj)).zzHg) || zzHh != ((AccountChangeEvent) (obj)).zzHh || zzHi != ((AccountChangeEvent) (obj)).zzHi || !zzw.equal(zzHj, ((AccountChangeEvent) (obj)).zzHj))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzHe), Long.valueOf(zzHf), zzHg, Integer.valueOf(zzHh), Integer.valueOf(zzHi), zzHj
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        zzHh;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 94
    //                   2 100
    //                   3 112
    //                   4 106;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder("AccountChangeEvent {accountName = ")).append(zzHg).append(", changeType = ").append(s).append(", changeData = ").append(zzHj).append(", eventIndex = ").append(zzHi).append("}").toString();
_L2:
        s = "ADDED";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "REMOVED";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "RENAMED_TO";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "RENAMED_FROM";
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventCreator.zza(this, parcel, i);
    }

}
