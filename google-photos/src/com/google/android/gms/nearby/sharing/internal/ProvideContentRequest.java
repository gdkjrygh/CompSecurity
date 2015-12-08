// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import lli;
import llj;
import lll;
import llm;
import lls;

public final class ProvideContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lls();
    public final int a;
    public IBinder b;
    public lli c;
    public List d;
    public long e;
    public lll f;

    ProvideContentRequest()
    {
        a = 1;
    }

    public ProvideContentRequest(int i, IBinder ibinder, IBinder ibinder1, List list, long l, IBinder ibinder2)
    {
        a = i;
        b = ibinder;
        c = llj.a(ibinder1);
        d = list;
        e = l;
        f = llm.a(ibinder2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lls.a(this, parcel);
    }

}
