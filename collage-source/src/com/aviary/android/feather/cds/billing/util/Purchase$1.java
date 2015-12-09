// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            Purchase

static final class 
    implements android.os.Creator
{

    public Purchase a(Parcel parcel)
    {
        return new Purchase(parcel);
    }

    public Purchase[] a(int i)
    {
        return new Purchase[0];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
