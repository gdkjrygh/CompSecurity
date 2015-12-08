// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            SafeParcelable

public final class SafeParcelableSerializer
{

    public static SafeParcelable deserializeFromBytes(byte abyte0[], android.os.Parcelable.Creator creator)
    {
        Preconditions.checkNotNull(creator);
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = (SafeParcelable)creator.createFromParcel(parcel);
        parcel.recycle();
        return abyte0;
    }

    public static byte[] serializeToBytes(SafeParcelable safeparcelable)
    {
        Parcel parcel = Parcel.obtain();
        safeparcelable.writeToParcel(parcel, 0);
        safeparcelable = parcel.marshall();
        parcel.recycle();
        return safeparcelable;
    }

    public static void serializeToIntentExtra(SafeParcelable safeparcelable, Intent intent, String s)
    {
        intent.putExtra(s, serializeToBytes(safeparcelable));
    }
}
