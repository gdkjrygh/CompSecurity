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
//            zzi

public class zzh
    implements SafeParcelable
{

    public static final zzi CREATOR = new zzi();
    static final List zzamk = Collections.emptyList();
    private final int zzFG;
    List zzaml;

    zzh(int i, List list)
    {
        zzFG = i;
        zzaml = list;
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
        if (((zzh) (obj)).zzaml.size() != zzaml.size())
        {
            return false;
        }
        obj = ((zzh) (obj)).zzaml.iterator();
        Iterator iterator = zzaml.iterator();
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

    int getVersionCode()
    {
        return zzFG;
    }

    public int hashCode()
    {
        Iterator iterator = zzaml.iterator();
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
        stringbuilder.append("LocationResult[success: ").append(zzpr());
        stringbuilder.append(", locations: ").append(zzaml);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public boolean zzpr()
    {
        return !zzaml.isEmpty();
    }

}
