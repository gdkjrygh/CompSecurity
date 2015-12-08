// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class eqq
    implements android.os.Parcelable.Creator
{

    eqq()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new eqp(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new eqp[i];
    }
}
