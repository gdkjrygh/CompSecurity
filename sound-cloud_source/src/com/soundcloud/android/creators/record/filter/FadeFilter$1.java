// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.filter;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.android.creators.record.filter:
//            FadeFilter

final class 
    implements android.os.eator
{

    public final FadeFilter createFromParcel(Parcel parcel)
    {
        return new FadeFilter(parcel.readInt(), parcel.readLong(), parcel.readInt());
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final FadeFilter[] newArray(int i)
    {
        return new FadeFilter[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
