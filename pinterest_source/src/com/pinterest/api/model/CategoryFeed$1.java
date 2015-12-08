// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;

// Referenced classes of package com.pinterest.api.model:
//            CategoryFeed

final class 
    implements android.os.tor
{

    public final CategoryFeed createFromParcel(Parcel parcel)
    {
        return new CategoryFeed(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final CategoryFeed[] newArray(int i)
    {
        return new CategoryFeed[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
