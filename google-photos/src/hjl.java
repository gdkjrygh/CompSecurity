// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Locale;

public final class hjl
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hjm();
    public final boolean a;

    hjl(Parcel parcel)
    {
        a = b.c(parcel);
    }

    public hjl(Boolean boolean1)
    {
        a = ((Boolean)p.a(boolean1)).booleanValue();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format(Locale.US, "CollaborativeFeature {collaborative: %s}", new Object[] {
            Boolean.valueOf(a)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
    }

}
