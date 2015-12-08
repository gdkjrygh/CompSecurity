// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventCreator

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
    final String Dd;
    final int Di;
    final long Dj;
    final int Dk;
    final int Dl;
    final String Dm;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        Di = i;
        Dj = l;
        Dd = (String)o.i(s);
        Dk = j;
        Dl = k;
        Dm = s1;
    }

    public AccountChangeEvent(long l, String s, int i, int j, String s1)
    {
        Di = 1;
        Dj = l;
        Dd = (String)o.i(s);
        Dk = i;
        Dl = j;
        Dm = s1;
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
                if (Di != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).Di || Dj != ((AccountChangeEvent) (obj)).Dj || !n.equal(Dd, ((AccountChangeEvent) (obj)).Dd) || Dk != ((AccountChangeEvent) (obj)).Dk || Dl != ((AccountChangeEvent) (obj)).Dl || !n.equal(Dm, ((AccountChangeEvent) (obj)).Dm))
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
        return Dd;
    }

    public String getChangeData()
    {
        return Dm;
    }

    public int getChangeType()
    {
        return Dk;
    }

    public int getEventIndex()
    {
        return Dl;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(Di), Long.valueOf(Dj), Dd, Integer.valueOf(Dk), Integer.valueOf(Dl), Dm
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        Dk;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 97
    //                   2 103
    //                   3 115
    //                   4 109;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder()).append("AccountChangeEvent {accountName = ").append(Dd).append(", changeType = ").append(s).append(", changeData = ").append(Dm).append(", eventIndex = ").append(Dl).append("}").toString();
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
