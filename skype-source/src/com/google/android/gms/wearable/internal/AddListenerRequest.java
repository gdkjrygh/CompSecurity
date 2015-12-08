// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ab, ap, w

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    final int a;
    public final w b;
    public final IntentFilter c[];
    public final String d;
    public final String e;

    AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        a = i;
        if (ibinder != null)
        {
            b = w.a.a(ibinder);
        } else
        {
            b = null;
        }
        c = aintentfilter;
        d = s;
        e = s1;
    }

    public AddListenerRequest(ap ap1)
    {
        a = 1;
        b = ap1;
        c = ap1.b();
        d = ap1.c();
        e = ap1.d();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ab.a(this, parcel, i);
    }

}
