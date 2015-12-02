// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.Parcel;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            MediaRenderer

final class 
    implements android.os.or
{

    private static MediaRenderer a(Parcel parcel)
    {
        return new MediaRenderer(parcel);
    }

    private static MediaRenderer[] a(int i)
    {
        return new MediaRenderer[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
