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
//            jk, jq

public class jj
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jk();
    final int MD;
    int ME;
    String MF;
    IBinder MG;
    Scope MH[];
    Bundle MI;
    final int version;

    public jj(int i)
    {
        version = 1;
        ME = 0x648278;
        MD = i;
    }

    jj(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle)
    {
        version = i;
        MD = j;
        ME = k;
        MF = s;
        MG = ibinder;
        MH = ascope;
        MI = bundle;
    }

    public jj a(jq jq1)
    {
        if (jq1 != null)
        {
            MG = jq1.asBinder();
        }
        return this;
    }

    public jj a(Scope ascope[])
    {
        MH = ascope;
        return this;
    }

    public jj aX(String s)
    {
        MF = s;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public jj e(Bundle bundle)
    {
        MI = bundle;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jk.a(this, parcel, i);
    }

}
