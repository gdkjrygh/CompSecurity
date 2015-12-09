// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.api;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.p2p.api:
//            Contact

final class 
    implements android.os..Creator
{

    private static Contact createFromParcel(Parcel parcel)
    {
        return new Contact(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    private static Contact[] newArray(int i)
    {
        return new Contact[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
