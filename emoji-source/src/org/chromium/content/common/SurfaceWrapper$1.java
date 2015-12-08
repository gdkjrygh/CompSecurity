// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Parcel;
import android.view.Surface;

// Referenced classes of package org.chromium.content.common:
//            SurfaceWrapper

static final class 
    implements android.os.r
{

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public SurfaceWrapper createFromParcel(Parcel parcel)
    {
        return new SurfaceWrapper((Surface)Surface.CREATOR.createFromParcel(parcel));
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    public SurfaceWrapper[] newArray(int i)
    {
        return new SurfaceWrapper[i];
    }

    ()
    {
    }
}
