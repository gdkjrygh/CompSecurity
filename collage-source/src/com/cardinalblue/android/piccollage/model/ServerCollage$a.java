// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            ServerCollage

public static class 
    implements android.os.or
{

    public ServerCollage a(Parcel parcel)
    {
        return new ServerCollage(parcel);
    }

    public ServerCollage[] a(int i)
    {
        return new ServerCollage[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    public ()
    {
    }
}
