// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.browse.model:
//            Genre

final class 
    implements android.os.le.Creator
{

    public final Object createFromParcel(Parcel parcel)
    {
        String s = parcel.readString();
        String s1 = parcel.readString();
        String s2 = parcel.readString();
        return new Genre(s, s1, parcel.readString(), s2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new Genre[i];
    }

    ()
    {
    }
}
