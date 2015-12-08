// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class ap
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aq();
    final Bundle a;

    ap(Bundle bundle)
    {
        a = bundle;
    }

    ap(Parcel parcel, ClassLoader classloader)
    {
        a = parcel.readBundle();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(a);
    }

}
