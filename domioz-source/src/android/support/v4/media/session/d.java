// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//            ParcelableVolumeInfo

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ParcelableVolumeInfo(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableVolumeInfo[i];
    }
}
