// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventCreator

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
    final String Fl;
    final int Gf;
    final long Gg;
    final int Gh;
    final int Gi;
    final String Gj;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        Gf = i;
        Gg = l;
        Fl = (String)kn.k(s);
        Gh = j;
        Gi = k;
        Gj = s1;
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
                if (Gf != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).Gf || Gg != ((AccountChangeEvent) (obj)).Gg || !kl.equal(Fl, ((AccountChangeEvent) (obj)).Fl) || Gh != ((AccountChangeEvent) (obj)).Gh || Gi != ((AccountChangeEvent) (obj)).Gi || !kl.equal(Gj, ((AccountChangeEvent) (obj)).Gj))
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

    public final String getAccountName()
    {
        return Fl;
    }

    public final String getChangeData()
    {
        return Gj;
    }

    public final int getChangeType()
    {
        return Gh;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(Gf), Long.valueOf(Gg), Fl, Integer.valueOf(Gh), Integer.valueOf(Gi), Gj
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        Gh;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 94
    //                   2 100
    //                   3 112
    //                   4 106;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder("AccountChangeEvent {accountName = ")).append(Fl).append(", changeType = ").append(s).append(", changeData = ").append(Gj).append(", eventIndex = ").append(Gi).append("}").toString();
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
