// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.location.Location;
import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.o:
//            t

public final class r
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    static final List a = Collections.emptyList();
    final int b;
    final List c;

    r(int i, List list)
    {
        b = i;
        c = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof r))
        {
            return false;
        }
        obj = (r)obj;
        if (((r) (obj)).c.size() != c.size())
        {
            return false;
        }
        obj = ((r) (obj)).c.iterator();
        Iterator iterator = c.iterator();
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

    public final int hashCode()
    {
        Iterator iterator = c.iterator();
        int i;
        long l;
        for (i = 17; iterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31)
        {
            l = ((Location)iterator.next()).getTime();
        }

        return i;
    }

    public final String toString()
    {
        String s = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 27)).append("LocationResult[locations: ").append(s).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel);
    }

}
