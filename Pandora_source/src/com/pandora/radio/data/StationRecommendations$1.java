// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;

// Referenced classes of package com.pandora.radio.data:
//            StationRecommendations

static final class 
    implements android.os.endations._cls1
{

    public StationRecommendations a(Parcel parcel)
    {
        return new StationRecommendations(parcel);
    }

    public StationRecommendations[] a(int i)
    {
        return new StationRecommendations[i];
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
