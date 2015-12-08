// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.Parcel;

// Referenced classes of package io.card.payment:
//            CreditCard

final class 
    implements android.os.eator
{

    public CreditCard createFromParcel(Parcel parcel)
    {
        return new CreditCard(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public CreditCard[] newArray(int i)
    {
        return new CreditCard[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
