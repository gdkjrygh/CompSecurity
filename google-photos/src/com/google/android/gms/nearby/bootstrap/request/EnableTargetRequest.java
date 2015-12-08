// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lbq;
import lbr;
import lbt;
import lbu;
import lbw;
import lbx;
import ljz;

public class EnableTargetRequest
    implements SafeParcelable
{

    public static final ljz CREATOR = new ljz();
    public final int a;
    public final String b;
    public final String c;
    public final lbq d;
    public final lbt e;
    public final lbw f;
    public final byte g;

    public EnableTargetRequest(int i, String s, String s1, byte byte0, IBinder ibinder, IBinder ibinder1, IBinder ibinder2)
    {
        a = i;
        b = b.o(s);
        c = (String)b.d(s1);
        g = byte0;
        b.d(ibinder);
        d = lbr.a(ibinder);
        b.d(ibinder1);
        e = lbu.a(ibinder1);
        b.d(ibinder2);
        f = lbx.a(ibinder2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ljz.a(this, parcel);
    }

}
