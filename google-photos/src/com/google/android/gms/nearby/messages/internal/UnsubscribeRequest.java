// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lkj;
import lkk;
import lkm;
import lkn;
import lla;

public final class UnsubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lla();
    public final int a;
    public final lkj b;
    public final lkm c;
    public final PendingIntent d;
    public final int e;
    public final String f;
    public final String g;

    public UnsubscribeRequest(int i, IBinder ibinder, IBinder ibinder1, PendingIntent pendingintent, int j, String s, String s1)
    {
        a = i;
        b = lkk.a(ibinder);
        c = lkn.a(ibinder1);
        d = pendingintent;
        e = j;
        f = s;
        g = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lla.a(this, parcel, i);
    }

}
