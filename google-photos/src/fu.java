// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaDescription;
import android.os.Parcel;

final class fu
    implements android.os.Parcelable.Creator
{

    fu()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return new ft(parcel);
        } else
        {
            return ft.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    }

    public final Object[] newArray(int i)
    {
        return new ft[i];
    }
}
