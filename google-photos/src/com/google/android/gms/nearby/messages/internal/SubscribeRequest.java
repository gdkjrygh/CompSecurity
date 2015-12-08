// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import lkj;
import lkk;
import lkm;
import lkn;
import lky;

public final class SubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lky();
    public final int a;
    public final lkj b;
    public final Strategy c;
    public final lkm d;
    public final MessageFilter e;
    public final PendingIntent f;
    public final int g;
    public final String h;
    public final String i;
    public final byte j[];
    public final boolean k;

    public SubscribeRequest(int l, IBinder ibinder, Strategy strategy, IBinder ibinder1, MessageFilter messagefilter, PendingIntent pendingintent, int i1, 
            String s, String s1, byte abyte0[], boolean flag)
    {
        a = l;
        b = lkk.a(ibinder);
        c = strategy;
        d = lkn.a(ibinder1);
        e = messagefilter;
        f = pendingintent;
        g = i1;
        h = s;
        i = s1;
        j = abyte0;
        k = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        lky.a(this, parcel, l);
    }

}
