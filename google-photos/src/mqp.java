// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class mqp
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mqq();
    public final mqm a;
    public final mqu b;
    public final int c;

    mqp(Parcel parcel)
    {
        a = (mqm)mqm.CREATOR.createFromParcel(parcel);
        b = mqu.valueOf(parcel.readString());
        c = parcel.readInt();
    }

    public mqp(mqm mqm1, mqu mqu1, int i)
    {
        a = mqm1;
        b = mqu1;
        c = i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        int i = c;
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 60 + String.valueOf(s1).length())).append("UploadGroupStatus {state: ").append(s).append(", remaining: ").append(i).append(", group: ").append(s1).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeString(b.toString());
        parcel.writeInt(c);
    }

}
