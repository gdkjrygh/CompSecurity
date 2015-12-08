// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            hl, hg, fo

public final class hk
    implements SafeParcelable
{

    public static final hl CREATOR = new hl();
    static final long OF;
    private final hg OG;
    private final long Oc;
    private final int mPriority;
    final int xH;

    public hk(int i, hg hg1, long l, int j)
    {
        xH = i;
        OG = hg1;
        Oc = l;
        mPriority = j;
    }

    public int describeContents()
    {
        hl hl1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hk))
            {
                return false;
            }
            obj = (hk)obj;
            if (!OG.equals(((hk) (obj)).OG) || Oc != ((hk) (obj)).Oc || mPriority != ((hk) (obj)).mPriority)
            {
                return false;
            }
        }
        return true;
    }

    public long getInterval()
    {
        return Oc;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public hg hZ()
    {
        return OG;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            OG, Long.valueOf(Oc), Integer.valueOf(mPriority)
        });
    }

    public String toString()
    {
        return fo.e(this).a("filter", OG).a("interval", Long.valueOf(Oc)).a("priority", Integer.valueOf(mPriority)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hl hl1 = CREATOR;
        hl.a(this, parcel, i);
    }

    static 
    {
        OF = TimeUnit.HOURS.toMillis(1L);
    }
}
