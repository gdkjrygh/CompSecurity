// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ld

public class zztf
    implements SafeParcelable
{

    public static final ld CREATOR = new ld();
    public final int a;
    public final long b;
    public final String c;
    public final byte d[];
    public final Bundle e;

    zztf(int i, long l, String s, byte abyte0[], Bundle bundle)
    {
        a = i;
        b = l;
        c = s;
        d = abyte0;
        e = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("tag=").append(c).append(",");
        stringbuilder.append("eventTime=").append(b).append(",");
        if (e != null && !e.isEmpty())
        {
            stringbuilder.append("keyValues=");
            for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); stringbuilder.append(" "))
            {
                String s = (String)iterator.next();
                stringbuilder.append("(").append(s).append(",");
                stringbuilder.append(e.getString(s)).append(")");
            }

        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ld.a(this, parcel);
    }

}
