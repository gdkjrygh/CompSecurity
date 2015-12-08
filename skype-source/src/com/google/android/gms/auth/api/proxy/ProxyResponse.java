// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            c

public class ProxyResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    public final int b;
    public final PendingIntent c;
    public final int d;
    final Bundle e;
    public final byte f[];

    ProxyResponse(int i, int j, PendingIntent pendingintent, int k, Bundle bundle, byte abyte0[])
    {
        a = i;
        b = j;
        d = k;
        e = bundle;
        f = abyte0;
        c = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.proxy.c.a(this, parcel, i);
    }

}
