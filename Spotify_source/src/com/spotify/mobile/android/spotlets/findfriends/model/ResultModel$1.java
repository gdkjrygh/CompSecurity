// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.findfriends.model:
//            ResultModel

final class I
    implements android.os.ator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new ResultModel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ResultModel[i];
    }

    I()
    {
    }
}
