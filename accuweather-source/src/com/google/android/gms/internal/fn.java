// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fo

public class fn
    implements SafeParcelable
{

    public static final fo CREATOR = new fo();
    public final int id;
    final int xJ;
    final Bundle xV;

    fn(int i, int j, Bundle bundle)
    {
        xJ = i;
        id = j;
        xV = bundle;
    }

    public int describeContents()
    {
        fo fo1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fo fo1 = CREATOR;
        fo.a(this, parcel, i);
    }

}
