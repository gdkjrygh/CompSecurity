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
//            a

public class LogEvent
    implements SafeParcelable
{

    public static final a CREATOR = new a();
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
        com.google.android.gms.playlog.internal.a.a(this, parcel);
    }

}
