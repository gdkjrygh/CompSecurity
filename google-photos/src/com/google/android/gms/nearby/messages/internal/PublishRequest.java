// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import lkm;
import lkn;
import lkx;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageWrapper

public final class PublishRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lkx();
    public final int a;
    public final MessageWrapper b;
    public final Strategy c;
    public final lkm d;
    public final String e;
    public final String f;
    public final boolean g;

    public PublishRequest(int i, MessageWrapper messagewrapper, Strategy strategy, IBinder ibinder, String s, String s1, boolean flag)
    {
        a = i;
        b = messagewrapper;
        c = strategy;
        d = lkn.a(ibinder);
        e = s;
        f = s1;
        g = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lkx.a(this, parcel, i);
    }

}
