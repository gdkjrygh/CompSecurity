// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ka

public class jz
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ka();
    final int VH;
    int VI;
    String VJ;
    IBinder VK;
    Scope VL[];
    Bundle VM;
    final int version;

    jz(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle)
    {
        version = i;
        VH = j;
        VI = k;
        VJ = s;
        VK = ibinder;
        VL = ascope;
        VM = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ka.a(this, parcel, i);
    }

}
