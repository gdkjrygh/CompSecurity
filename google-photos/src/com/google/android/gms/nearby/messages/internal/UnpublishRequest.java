// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lkm;
import lkn;
import lkz;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageWrapper

public final class UnpublishRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lkz();
    public final int a;
    public final MessageWrapper b;
    public final lkm c;
    public final String d;
    public final String e;

    public UnpublishRequest(int i, MessageWrapper messagewrapper, IBinder ibinder, String s, String s1)
    {
        a = i;
        b = messagewrapper;
        c = lkn.a(ibinder);
        d = s;
        e = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lkz.a(this, parcel, i);
    }

}
