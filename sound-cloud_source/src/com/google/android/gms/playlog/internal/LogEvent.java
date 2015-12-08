// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            c

public class LogEvent
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public final int a;
    public final long b;
    public final long c;
    public final String d;
    public final byte e[];
    public final Bundle f;

    LogEvent(int i, long l, long l1, String s, byte abyte0[], 
            Bundle bundle)
    {
        a = i;
        b = l;
        c = l1;
        d = s;
        e = abyte0;
        f = bundle;
    }

    public transient LogEvent(long l, String s, String as[])
    {
        a = 1;
        b = l;
        c = 0L;
        d = s;
        e = null;
        f = a(as);
    }

    private static transient Bundle a(String as[])
    {
        Bundle bundle = null;
        if (as != null) goto _L2; else goto _L1
_L1:
        return bundle;
_L2:
        if (as.length % 2 != 0)
        {
            throw new IllegalArgumentException("extras must have an even number of elements");
        }
        int j = as.length / 2;
        if (j == 0)
        {
            continue;
        }
        Bundle bundle1 = new Bundle(j);
        int i = 0;
        do
        {
            bundle = bundle1;
            if (i >= j)
            {
                continue;
            }
            bundle1.putString(as[i * 2], as[i * 2 + 1]);
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("tag=").append(d).append(",");
        stringbuilder.append("eventTime=").append(b).append(",");
        stringbuilder.append("eventUptime=").append(c).append(",");
        if (f != null && !f.isEmpty())
        {
            stringbuilder.append("keyValues=");
            for (Iterator iterator = f.keySet().iterator(); iterator.hasNext(); stringbuilder.append(" "))
            {
                String s = (String)iterator.next();
                stringbuilder.append("(").append(s).append(",");
                stringbuilder.append(f.getString(s)).append(")");
            }

        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.playlog.internal.c.a(this, parcel);
    }

}
