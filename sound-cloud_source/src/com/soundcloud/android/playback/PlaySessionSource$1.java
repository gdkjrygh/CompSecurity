// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionSource

final class _cls9
    implements android.os..PlaySessionSource._cls1
{

    public final PlaySessionSource createFromParcel(Parcel parcel)
    {
        return new PlaySessionSource(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final PlaySessionSource[] newArray(int i)
    {
        return new PlaySessionSource[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    _cls9()
    {
    }
}
