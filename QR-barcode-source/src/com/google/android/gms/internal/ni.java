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
//            nk

public class ni
    implements SafeParcelable
{

    public static final nk CREATOR = new nk();
    public final long akH;
    public final byte akI[];
    public final Bundle akJ;
    public final String tag;
    public final int versionCode;

    ni(int i, long l, String s, byte abyte0[], Bundle bundle)
    {
        versionCode = i;
        akH = l;
        tag = s;
        akI = abyte0;
        akJ = bundle;
    }

    public transient ni(long l, String s, byte abyte0[], String as[])
    {
        versionCode = 1;
        akH = l;
        tag = s;
        akI = abyte0;
        akJ = f(as);
    }

    private static transient Bundle f(String as[])
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
        stringbuilder.append("tag=").append(tag).append(",");
        stringbuilder.append("eventTime=").append(akH).append(",");
        if (akJ != null && !akJ.isEmpty())
        {
            stringbuilder.append("keyValues=");
            for (Iterator iterator = akJ.keySet().iterator(); iterator.hasNext(); stringbuilder.append(" "))
            {
                String s = (String)iterator.next();
                stringbuilder.append("(").append(s).append(",");
                stringbuilder.append(akJ.getString(s)).append(")");
            }

        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nk.a(this, parcel, i);
    }

}
