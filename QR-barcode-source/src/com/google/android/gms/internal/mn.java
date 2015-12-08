// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            mo, mj

public final class mn
    implements SafeParcelable
{

    public static final mo CREATOR = new mo();
    static final long afA;
    final int BR;
    private final long aes;
    private final mj afB;
    private final int mPriority;

    public mn(int i, mj mj, long l, int j)
    {
        BR = i;
        afB = mj;
        aes = l;
        mPriority = j;
    }

    public int describeContents()
    {
        mo mo1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mn))
            {
                return false;
            }
            obj = (mn)obj;
            if (!n.equal(afB, ((mn) (obj)).afB) || aes != ((mn) (obj)).aes || mPriority != ((mn) (obj)).mPriority)
            {
                return false;
            }
        }
        return true;
    }

    public long getInterval()
    {
        return aes;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            afB, Long.valueOf(aes), Integer.valueOf(mPriority)
        });
    }

    public mj mh()
    {
        return afB;
    }

    public String toString()
    {
        return n.h(this).a("filter", afB).a("interval", Long.valueOf(aes)).a("priority", Integer.valueOf(mPriority)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mo mo1 = CREATOR;
        mo.a(this, parcel, i);
    }

    static 
    {
        afA = TimeUnit.HOURS.toMillis(1L);
    }
}
