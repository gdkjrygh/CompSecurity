// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gsq
    implements android.os.Parcelable.Creator
{

    gsq()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new gsp(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new gsp[i];
    }
}
