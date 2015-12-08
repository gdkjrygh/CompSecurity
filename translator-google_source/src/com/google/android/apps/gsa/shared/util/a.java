// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            BitFlags

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    private static BitFlags a(Parcel parcel)
    {
        long l;
        l = parcel.readLong();
        parcel = parcel.readString();
        if (parcel == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        parcel = new BitFlags(Class.forName(parcel), l);
        return parcel;
        parcel;
        return new BitFlags(l);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new BitFlags[i];
    }
}
