// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            SafeParcelable

public final class zzc
{

    public static SafeParcelable a(byte abyte0[], android.os.Parcelable.Creator creator)
    {
        zzu.a(creator);
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = (SafeParcelable)creator.createFromParcel(parcel);
        parcel.recycle();
        return abyte0;
    }
}
