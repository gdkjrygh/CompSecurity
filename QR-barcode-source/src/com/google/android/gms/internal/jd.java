// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            je, jf

public class jd
    implements SafeParcelable
{

    public static final je CREATOR = new je();
    private final int BR;
    private final jf Ms;

    jd(int i, jf jf1)
    {
        BR = i;
        Ms = jf1;
    }

    private jd(jf jf1)
    {
        BR = 1;
        Ms = jf1;
    }

    public static jd a(ji.b b)
    {
        if (b instanceof jf)
        {
            return new jd((jf)b);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        je je1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return BR;
    }

    jf ha()
    {
        return Ms;
    }

    public ji.b hb()
    {
        if (Ms != null)
        {
            return Ms;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        je je1 = CREATOR;
        je.a(this, parcel, i);
    }

}
