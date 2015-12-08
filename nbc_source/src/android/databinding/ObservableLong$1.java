// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//            ObservableLong

static final class 
    implements android.os.r
{

    public ObservableLong createFromParcel(Parcel parcel)
    {
        return new ObservableLong(parcel.readLong());
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ObservableLong[] newArray(int i)
    {
        return new ObservableLong[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
