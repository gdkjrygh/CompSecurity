// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.auth:
//            e

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        a = i;
        b = l;
        c = (String)bl.a(s);
        d = j;
        e = k;
        f = s1;
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
                if (a != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).a || b != ((AccountChangeEvent) (obj)).b || !bj.a(c, ((AccountChangeEvent) (obj)).c) || d != ((AccountChangeEvent) (obj)).d || e != ((AccountChangeEvent) (obj)).e || !bj.a(f, ((AccountChangeEvent) (obj)).f))
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
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), Long.valueOf(b), c, Integer.valueOf(d), Integer.valueOf(e), f
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        d;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 94
    //                   2 100
    //                   3 112
    //                   4 106;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder("AccountChangeEvent {accountName = ")).append(c).append(", changeType = ").append(s).append(", changeData = ").append(f).append(", eventIndex = ").append(e).append("}").toString();
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
        com.google.android.gms.auth.e.a(this, parcel);
    }

}
