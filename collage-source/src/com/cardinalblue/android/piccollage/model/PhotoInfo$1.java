// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            PhotoInfo

static final class 
    implements android.os.reator
{

    public PhotoInfo a(Parcel parcel)
    {
        return new PhotoInfo(parcel, null);
    }

    public PhotoInfo[] a(int i)
    {
        return new PhotoInfo[i];
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
