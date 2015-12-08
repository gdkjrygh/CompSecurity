// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            SafeParcelable

public final class c
{

    public static SafeParcelable a(Intent intent, String s, android.os.Parcelable.Creator creator)
    {
        intent = intent.getByteArrayExtra(s);
        if (intent == null)
        {
            return null;
        } else
        {
            return a(((byte []) (intent)), creator);
        }
    }

    public static SafeParcelable a(byte abyte0[], android.os.Parcelable.Creator creator)
    {
        jx.i(creator);
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = (SafeParcelable)creator.createFromParcel(parcel);
        parcel.recycle();
        return abyte0;
    }

    public static void a(SafeParcelable safeparcelable, Intent intent, String s)
    {
        intent.putExtra(s, a(safeparcelable));
    }

    public static byte[] a(SafeParcelable safeparcelable)
    {
        Parcel parcel = Parcel.obtain();
        safeparcelable.writeToParcel(parcel, 0);
        safeparcelable = parcel.marshall();
        parcel.recycle();
        return safeparcelable;
    }
}
