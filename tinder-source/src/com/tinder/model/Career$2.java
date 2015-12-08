// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;

// Referenced classes of package com.tinder.model:
//            Career

static final class tor
    implements android.os.e.Creator
{

    public final Career createFromParcel(Parcel parcel)
    {
        return new Career(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final Career[] newArray(int i)
    {
        return new Career[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    tor()
    {
    }
}
