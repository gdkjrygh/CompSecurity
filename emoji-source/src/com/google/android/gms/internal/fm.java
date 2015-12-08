// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fn

public class fm
    implements SafeParcelable
{

    public static final fn CREATOR = new fn();
    public final int id;
    final int xM;
    final Bundle xY;

    fm(int i, int j, Bundle bundle)
    {
        xM = i;
        id = j;
        xY = bundle;
    }

    public int describeContents()
    {
        fn fn1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fn fn1 = CREATOR;
        fn.a(this, parcel, i);
    }

}
