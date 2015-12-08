// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;

// Referenced classes of package com.tinder.model:
//            Person

static final class tor
    implements android.os.e.Creator
{

    public final Person createFromParcel(Parcel parcel)
    {
        return new Person(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final Person[] newArray(int i)
    {
        return new Person[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    tor()
    {
    }
}
