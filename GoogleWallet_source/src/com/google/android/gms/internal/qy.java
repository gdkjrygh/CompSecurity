// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            qz, kl

public final class qy
    implements SafeParcelable
{

    public static final qz CREATOR = new qz();
    final boolean aCk;
    final boolean aCl;
    final String aCm;
    final boolean aCn;
    final Bundle aCo;
    private final int mVersionCode;

    qy(int i, boolean flag, boolean flag1, boolean flag2, String s, Bundle bundle)
    {
        mVersionCode = i;
        aCk = flag;
        aCl = flag1;
        aCm = s;
        aCn = flag2;
        s = bundle;
        if (bundle == null)
        {
            s = new Bundle();
        }
        aCo = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final String toString()
    {
        return kl.j(this).a("useOfflineDatabase", Boolean.valueOf(aCk)).a("useWebData", Boolean.valueOf(aCl)).a("useCP2", Boolean.valueOf(aCn)).a("endpoint", aCm).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        qz.a(this, parcel, i);
    }

}
