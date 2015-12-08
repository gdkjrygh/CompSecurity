// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventCreator

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
    final int zzKu;
    final long zzKv;
    final String zzKw;
    final int zzKx;
    final int zzKy;
    final String zzKz;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        zzKu = i;
        zzKv = l;
        zzKw = (String)zzv.zzr(s);
        zzKx = j;
        zzKy = k;
        zzKz = s1;
    }

    public AccountChangeEvent(long l, String s, int i, int j, String s1)
    {
        zzKu = 1;
        zzKv = l;
        zzKw = (String)zzv.zzr(s);
        zzKx = i;
        zzKy = j;
        zzKz = s1;
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
                if (zzKu != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).zzKu || zzKv != ((AccountChangeEvent) (obj)).zzKv || !zzu.equal(zzKw, ((AccountChangeEvent) (obj)).zzKw) || zzKx != ((AccountChangeEvent) (obj)).zzKx || zzKy != ((AccountChangeEvent) (obj)).zzKy || !zzu.equal(zzKz, ((AccountChangeEvent) (obj)).zzKz))
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

    public String getAccountName()
    {
        return zzKw;
    }

    public String getChangeData()
    {
        return zzKz;
    }

    public int getChangeType()
    {
        return zzKx;
    }

    public int getEventIndex()
    {
        return zzKy;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzKu), Long.valueOf(zzKv), zzKw, Integer.valueOf(zzKx), Integer.valueOf(zzKy), zzKz
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        zzKx;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 97
    //                   2 103
    //                   3 115
    //                   4 109;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder()).append("AccountChangeEvent {accountName = ").append(zzKw).append(", changeType = ").append(s).append(", changeData = ").append(zzKz).append(", eventIndex = ").append(zzKy).append("}").toString();
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
