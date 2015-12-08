// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class nnu
    implements android.os.Parcelable.Creator
{

    nnu()
    {
    }

    private static nnt a(Parcel parcel)
    {
        try
        {
            parcel = nnt.a(parcel.createByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new IllegalArgumentException("Serialized protobuf is invalid", parcel);
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new nnt[i];
    }
}
