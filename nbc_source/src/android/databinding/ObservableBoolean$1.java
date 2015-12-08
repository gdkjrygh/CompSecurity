// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//            ObservableBoolean

static final class 
    implements android.os.oolean._cls1
{

    public ObservableBoolean createFromParcel(Parcel parcel)
    {
        boolean flag = true;
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        return new ObservableBoolean(flag);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ObservableBoolean[] newArray(int i)
    {
        return new ObservableBoolean[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
