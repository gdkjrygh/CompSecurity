// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            zzy

public final class zzx
    implements SafeParcelable
{

    public static final zzy CREATOR = new zzy();
    public final int versionCode;
    public final boolean zzml;
    public final boolean zzmy;

    zzx(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        zzml = flag;
        zzmy = flag1;
    }

    public zzx(boolean flag, boolean flag1)
    {
        versionCode = 1;
        zzml = flag;
        zzmy = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzy.zza(this, parcel, i);
    }

}
