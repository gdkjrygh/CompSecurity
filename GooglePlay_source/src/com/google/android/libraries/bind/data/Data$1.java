// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.os.Parcel;

// Referenced classes of package com.google.android.libraries.bind.data:
//            Data

static final class 
    implements android.os.ble.Creator
{

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return new Data(parcel.readSparseArray(null));
    }

    public final volatile Object[] newArray(int i)
    {
        return new Data[i];
    }

    ()
    {
    }
}
