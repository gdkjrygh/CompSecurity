// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ip, in, jv

public class io
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ip();
    private final int CK;
    private double Gp;
    private boolean Gq;
    private ApplicationMetadata HD;
    private int Hr;
    private int Hs;

    public io()
    {
        this(3, (0.0D / 0.0D), false, -1, null, -1);
    }

    io(int i, double d, boolean flag, int j, ApplicationMetadata applicationmetadata, int k)
    {
        CK = i;
        Gp = d;
        Gq = flag;
        Hr = j;
        HD = applicationmetadata;
        Hs = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof io))
            {
                return false;
            }
            obj = (io)obj;
            if (Gp != ((io) (obj)).Gp || Gq != ((io) (obj)).Gq || Hr != ((io) (obj)).Hr || !in.a(HD, ((io) (obj)).HD) || Hs != ((io) (obj)).Hs)
            {
                return false;
            }
        }
        return true;
    }

    public double fZ()
    {
        return Gp;
    }

    public ApplicationMetadata getApplicationMetadata()
    {
        return HD;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public boolean gi()
    {
        return Gq;
    }

    public int gj()
    {
        return Hr;
    }

    public int gk()
    {
        return Hs;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Double.valueOf(Gp), Boolean.valueOf(Gq), Integer.valueOf(Hr), HD, Integer.valueOf(Hs)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ip.a(this, parcel, i);
    }

}
