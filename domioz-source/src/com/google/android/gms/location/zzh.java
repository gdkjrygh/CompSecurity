// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            ac

public class zzh
    implements SafeParcelable
{

    public static final ac CREATOR = new ac();
    static final List a = Collections.emptyList();
    List b;
    private final int c;

    zzh(int i, List list)
    {
        c = i;
        b = list;
    }

    final int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof zzh))
        {
            return false;
        }
        obj = (zzh)obj;
        if (((zzh) (obj)).b.size() != b.size())
        {
            return false;
        }
        obj = ((zzh) (obj)).b.iterator();
        Iterator iterator = b.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            Location location = (Location)iterator.next();
            Location location1 = (Location)((Iterator) (obj)).next();
            if (location.getTime() != location1.getTime())
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Iterator iterator = b.iterator();
        int i;
        long l;
        for (i = 17; iterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31)
        {
            l = ((Location)iterator.next()).getTime();
        }

        return i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = stringbuilder.append("LocationResult[success: ");
        boolean flag;
        if (!b.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder1.append(flag);
        stringbuilder.append(", locations: ").append(b);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac.a(this, parcel);
    }

}
