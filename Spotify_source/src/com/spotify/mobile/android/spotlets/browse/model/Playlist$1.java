// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.browse.model:
//            Playlist

final class A
    implements android.os.Creator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new Playlist(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
    }

    public final volatile Object[] newArray(int i)
    {
        return new Playlist[i];
    }

    A()
    {
    }
}
