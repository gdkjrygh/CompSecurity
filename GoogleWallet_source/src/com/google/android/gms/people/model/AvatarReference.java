// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.people.model:
//            b

public final class AvatarReference
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public static final int SOURCE_NO_AVATAR = 0;
    final String aFR;
    final int awn;
    private final int mVersionCode;

    AvatarReference(int i, int j, String s)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.K(flag);
        mVersionCode = i;
        awn = j;
        aFR = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getLocation()
    {
        return aFR;
    }

    public final int getSource()
    {
        return awn;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final String toString()
    {
        return kl.j(this).a("source", Integer.valueOf(awn)).a("location", aFR).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
