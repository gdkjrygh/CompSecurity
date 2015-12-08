// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Parcel;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsAddress

final class 
    implements android.os.ator
{

    public final LabsAddress createFromParcel(Parcel parcel)
    {
        return new LabsAddress(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final LabsAddress[] newArray(int i)
    {
        return new LabsAddress[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
