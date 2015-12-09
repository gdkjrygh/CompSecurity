// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;

// Referenced classes of package com.pandora.radio.data:
//            ArtistSearchData

static final class 
    implements android.os.earchData._cls1
{

    public ArtistSearchData a(Parcel parcel)
    {
        return new ArtistSearchData(parcel);
    }

    public ArtistSearchData[] a(int i)
    {
        return new ArtistSearchData[i];
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
