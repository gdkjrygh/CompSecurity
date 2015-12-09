// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            o

public final class ProxyCard
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    String ack;
    String acl;
    int acm;
    int acn;
    private final int xH;

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        xH = i;
        ack = s;
        acl = s1;
        acm = j;
        acn = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return acl;
    }

    public int getExpirationMonth()
    {
        return acm;
    }

    public int getExpirationYear()
    {
        return acn;
    }

    public String getPan()
    {
        return ack;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
