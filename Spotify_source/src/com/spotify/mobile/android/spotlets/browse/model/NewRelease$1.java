// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.browse.model:
//            NewRelease

final class 
    implements android.os.eator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new NewRelease(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new NewRelease[i];
    }

    ()
    {
    }
}
