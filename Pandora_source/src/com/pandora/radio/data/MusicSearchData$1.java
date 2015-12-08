// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;

// Referenced classes of package com.pandora.radio.data:
//            MusicSearchData

static final class 
    implements android.os.
{

    public MusicSearchData a(Parcel parcel)
    {
        return new MusicSearchData(parcel);
    }

    public MusicSearchData[] a(int i)
    {
        return new MusicSearchData[i];
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
