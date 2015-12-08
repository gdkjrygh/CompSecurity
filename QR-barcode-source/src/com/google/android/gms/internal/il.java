// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            im, ik

public class il
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new im();
    private final int BR;
    private double FA;
    private boolean FB;
    private int GB;
    private int GC;
    private ApplicationMetadata GN;

    public il()
    {
        this(3, (0.0D / 0.0D), false, -1, null, -1);
    }

    il(int i, double d, boolean flag, int j, ApplicationMetadata applicationmetadata, int k)
    {
        BR = i;
        FA = d;
        FB = flag;
        GB = j;
        GN = applicationmetadata;
        GC = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof il))
            {
                return false;
            }
            obj = (il)obj;
            if (FA != ((il) (obj)).FA || FB != ((il) (obj)).FB || GB != ((il) (obj)).GB || !ik.a(GN, ((il) (obj)).GN) || GC != ((il) (obj)).GC)
            {
                return false;
            }
        }
        return true;
    }

    public double fE()
    {
        return FA;
    }

    public boolean fM()
    {
        return FB;
    }

    public int fN()
    {
        return GB;
    }

    public int fO()
    {
        return GC;
    }

    public ApplicationMetadata getApplicationMetadata()
    {
        return GN;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Double.valueOf(FA), Boolean.valueOf(FB), Integer.valueOf(GB), GN, Integer.valueOf(GC)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        im.a(this, parcel, i);
    }

}
