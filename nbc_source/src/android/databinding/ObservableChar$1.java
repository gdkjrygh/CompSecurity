// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//            ObservableChar

static final class 
    implements android.os.r
{

    public ObservableChar createFromParcel(Parcel parcel)
    {
        return new ObservableChar((char)parcel.readInt());
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ObservableChar[] newArray(int i)
    {
        return new ObservableChar[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
