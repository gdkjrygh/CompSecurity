// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.internal:
//            zzoy

public class zzox
    implements SafeParcelable
{

    public static final zzoy CREATOR = new zzoy();
    public final String packageName;
    public final int uid;
    private final int zzFG;

    zzox(int i, int j, String s)
    {
        zzFG = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzox)
        {
            if (((zzox) (obj = (zzox)obj)).uid == uid && zzw.equal(((zzox) (obj)).packageName, packageName))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return zzFG;
    }

    public int hashCode()
    {
        return uid;
    }

    public String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(uid), packageName
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzoy.zza(this, parcel, i);
    }

}
