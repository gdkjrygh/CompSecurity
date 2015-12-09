// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gdata;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gdata:
//            PhotoEntry

static final class 
    implements android.os.eator
{

    public PhotoEntry a(Parcel parcel)
    {
        return new PhotoEntry(parcel, null);
    }

    public PhotoEntry[] a(int i)
    {
        return new PhotoEntry[i];
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
