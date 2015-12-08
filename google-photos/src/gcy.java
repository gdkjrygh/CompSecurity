// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class gcy
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gcz();
    public final gda a;
    private Long b;
    private boolean c;

    public gcy(Parcel parcel)
    {
        a = gda.valueOf(parcel.readString());
        b = (Long)parcel.readValue(java/lang/Long.getClassLoader());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    public gcy(gda gda1, Long long1, boolean flag)
    {
        a = gda1;
        b = long1;
        c = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s = String.valueOf("SyncResult{, syncStatus=");
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        boolean flag = c;
        return (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", count=").append(s2).append(", receivedChangesFromServer=").append(flag).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.name());
        parcel.writeValue(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
