// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            FbPhoto

static final class 
    implements android.os..Creator
{

    public FbPhoto createFromParcel(Parcel parcel)
    {
        return new FbPhoto(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public FbPhoto[] newArray(int i)
    {
        return new FbPhoto[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
