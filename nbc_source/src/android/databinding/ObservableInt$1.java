// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//            ObservableInt

static final class 
    implements android.os.or
{

    public ObservableInt createFromParcel(Parcel parcel)
    {
        return new ObservableInt(parcel.readInt());
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ObservableInt[] newArray(int i)
    {
        return new ObservableInt[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
