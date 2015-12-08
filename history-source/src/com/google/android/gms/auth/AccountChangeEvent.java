// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventCreator

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
    final String DZ;
    final int Ef;
    final long Eg;
    final int Eh;
    final int Ei;
    final String Ej;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        Ef = i;
        Eg = l;
        DZ = (String)jx.i(s);
        Eh = j;
        Ei = k;
        Ej = s1;
    }

    public AccountChangeEvent(long l, String s, int i, int j, String s1)
    {
        Ef = 1;
        Eg = l;
        DZ = (String)jx.i(s);
        Eh = i;
        Ei = j;
        Ej = s1;
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
                if (Ef != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).Ef || Eg != ((AccountChangeEvent) (obj)).Eg || !jv.equal(DZ, ((AccountChangeEvent) (obj)).DZ) || Eh != ((AccountChangeEvent) (obj)).Eh || Ei != ((AccountChangeEvent) (obj)).Ei || !jv.equal(Ej, ((AccountChangeEvent) (obj)).Ej))
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
        return DZ;
    }

    public String getChangeData()
    {
        return Ej;
    }

    public int getChangeType()
    {
        return Eh;
    }

    public int getEventIndex()
    {
        return Ei;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(Ef), Long.valueOf(Eg), DZ, Integer.valueOf(Eh), Integer.valueOf(Ei), Ej
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        Eh;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 97
    //                   2 103
    //                   3 115
    //                   4 109;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder()).append("AccountChangeEvent {accountName = ").append(DZ).append(", changeType = ").append(s).append(", changeData = ").append(Ej).append(", eventIndex = ").append(Ei).append("}").toString();
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
        AccountChangeEventCreator.a(this, parcel, i);
    }

}
