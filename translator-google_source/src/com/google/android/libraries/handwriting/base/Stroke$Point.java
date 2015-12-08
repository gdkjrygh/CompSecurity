// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            j

public final class d
    implements Parcelable
{

    public static final android.os.eator CREATOR = new j();
    public final float a;
    public final float b;
    public final long c;
    public final float d;

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format("(%s, %s)", new Object[] {
            Float.valueOf(a), Float.valueOf(b)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a);
        parcel.writeFloat(b);
        parcel.writeLong(c);
        parcel.writeFloat(d);
    }


    public (float f, float f1, long l, float f2)
    {
        a = f;
        b = f1;
        c = l;
        d = f2;
    }

    public d(Parcel parcel)
    {
        a = parcel.readFloat();
        b = parcel.readFloat();
        c = parcel.readLong();
        d = parcel.readFloat();
    }
}
