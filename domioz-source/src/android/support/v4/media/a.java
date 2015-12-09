// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.media.MediaDescription;
import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompat

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return new MediaDescriptionCompat(parcel, (byte)0);
        } else
        {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    }

    public final volatile Object[] newArray(int i)
    {
        return new MediaDescriptionCompat[i];
    }
}
