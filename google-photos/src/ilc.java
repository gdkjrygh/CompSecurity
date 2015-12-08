// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Locale;

public final class ilc
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ild();
    public final boolean a;

    ilc(Parcel parcel)
    {
        a = b.c(parcel);
    }

    public ilc(boolean flag)
    {
        a = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format(Locale.US, "LibraryPresenceFeature {isPresent: %s}", new Object[] {
            Boolean.toString(a)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
    }

}
