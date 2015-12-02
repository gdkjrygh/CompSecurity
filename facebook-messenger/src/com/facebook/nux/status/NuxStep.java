// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.nux.status:
//            k

public class NuxStep
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final String a;
    private final boolean b;

    private NuxStep(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        b = flag;
    }

    NuxStep(Parcel parcel, k k1)
    {
        this(parcel);
    }

    public NuxStep(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean getIsCurrent()
    {
        return b;
    }

    public String getName()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
