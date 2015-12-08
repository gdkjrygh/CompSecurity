// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            f, a

public final class e
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int CK;
    private a amM;

    public e()
    {
        CK = 1;
    }

    e(int i, a a)
    {
        CK = i;
        amM = a;
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return CK;
    }

    public a oj()
    {
        return amM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
