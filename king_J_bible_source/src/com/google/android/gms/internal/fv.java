// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fw, fx

public class fv
    implements SafeParcelable
{

    public static final fw CREATOR = new fw();
    private final fx DS;
    private final int xH;

    fv(int i, fx fx1)
    {
        xH = i;
        DS = fx1;
    }

    private fv(fx fx1)
    {
        xH = 1;
        DS = fx1;
    }

    public static fv a(ga.b b)
    {
        if (b instanceof fx)
        {
            return new fv((fx)b);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        fw fw1 = CREATOR;
        return 0;
    }

    fx eT()
    {
        return DS;
    }

    public ga.b eU()
    {
        if (DS != null)
        {
            return DS;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fw fw1 = CREATOR;
        fw.a(this, parcel, i);
    }

}
