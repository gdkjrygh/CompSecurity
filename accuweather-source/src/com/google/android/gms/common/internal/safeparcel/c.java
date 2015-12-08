// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            SafeParcelable

public final class c
{

    public static byte[] a(SafeParcelable safeparcelable)
    {
        Parcel parcel = Parcel.obtain();
        safeparcelable.writeToParcel(parcel, 0);
        safeparcelable = parcel.marshall();
        parcel.recycle();
        return safeparcelable;
    }
}
