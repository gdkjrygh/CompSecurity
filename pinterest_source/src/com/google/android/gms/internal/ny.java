// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            nz, jv, nu

public final class ny
    implements SafeParcelable
{

    public static final nz CREATOR = new nz();
    public static final long ahz;
    final int CK;
    private final long agr;
    private final nu ahA;
    private final int mPriority;

    public ny(int i, nu nu, long l, int j)
    {
        CK = i;
        ahA = nu;
        agr = l;
        mPriority = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ny))
            {
                return false;
            }
            obj = (ny)obj;
            if (!jv.equal(ahA, ((ny) (obj)).ahA) || agr != ((ny) (obj)).agr || mPriority != ((ny) (obj)).mPriority)
            {
                return false;
            }
        }
        return true;
    }

    public final long getInterval()
    {
        return agr;
    }

    public final int getPriority()
    {
        return mPriority;
    }

    public final int hashCode()
    {
        return jv.hashCode(new Object[] {
            ahA, Long.valueOf(agr), Integer.valueOf(mPriority)
        });
    }

    public final nu nt()
    {
        return ahA;
    }

    public final String toString()
    {
        return jv.h(this).a("filter", ahA).a("interval", Long.valueOf(agr)).a("priority", Integer.valueOf(mPriority)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        nz.a(this, parcel, i);
    }

    static 
    {
        ahz = TimeUnit.HOURS.toMillis(1L);
    }
}
