// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;

// Referenced classes of package com.tinder.model:
//            Match

static final class ator
    implements android.os.le.Creator
{

    public final Match createFromParcel(Parcel parcel)
    {
        return new Match(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final Match[] newArray(int i)
    {
        return new Match[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ator()
    {
    }
}
