// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.music.spotlets.discover.model:
//            DiscoverReasonModel

final class 
    implements android.os.er.model.DiscoverReasonModel._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new DiscoverReasonModel(parcel.readString(), parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new DiscoverReasonModel[i];
    }

    ()
    {
    }
}
