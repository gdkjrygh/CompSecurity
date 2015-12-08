// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kct;
import lmr;

public final class ParcelableGetOptions
    implements SafeParcelable
{

    public static final lmr CREATOR = new lmr();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final Bundle f;

    public ParcelableGetOptions(int i, boolean flag, boolean flag1, boolean flag2, String s, Bundle bundle)
    {
        a = i;
        b = flag;
        c = flag1;
        d = s;
        e = flag2;
        s = bundle;
        if (bundle == null)
        {
            s = new Bundle();
        }
        f = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return c.b(this).a("useOfflineDatabase", Boolean.valueOf(b)).a("useWebData", Boolean.valueOf(c)).a("endpoint", d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lmr.a(this, parcel);
    }

}
