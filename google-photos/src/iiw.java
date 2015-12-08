// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Locale;

public final class iiw
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new iix();
    final int a;

    public iiw(int i)
    {
        a = i;
    }

    iiw(Parcel parcel)
    {
        a = parcel.readInt();
    }

    public final ekf a(Class class1)
    {
        throw new UnsupportedOperationException("Can not get features from AllSharedAlbumsCollection");
    }

    public final String a()
    {
        return "com.google.android.apps.photos.sharedmedia.SharedCore";
    }

    public final ekf b(Class class1)
    {
        throw new UnsupportedOperationException("Can not get features from AllSharedAlbumsCollection");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof iiw)
        {
            obj = (iiw)obj;
            flag = flag1;
            if (a == ((iiw) (obj)).a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.c(a);
    }

    public final String toString()
    {
        return String.format(Locale.US, "AllSharedAlbumsCollection {accountId: %d}", new Object[] {
            Integer.valueOf(a)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
    }

}
