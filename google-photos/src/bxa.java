// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;

final class bxa
    implements android.os.Parcelable.Creator
{

    bxa()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new bwz(uri, flag);
    }

    public final Object[] newArray(int i)
    {
        return new bwz[i];
    }
}
