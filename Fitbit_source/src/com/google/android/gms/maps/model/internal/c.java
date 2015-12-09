// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            f

public final class c
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private int b;
    private Bundle c;

    c(int i, int j, Bundle bundle)
    {
        a = i;
        b = j;
        c = bundle;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public Bundle c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
