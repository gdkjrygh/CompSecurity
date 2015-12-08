// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class eey
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new eez();
    public final efb a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public eey(Parcel parcel)
    {
        a = efb.values()[parcel.readInt()];
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readString();
    }

    eey(efb efb1, int i, int j, String s, String s1)
    {
        a = efb1;
        b = i;
        c = j;
        d = s;
        e = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof eey)
        {
            obj = (eey)obj;
            flag = flag1;
            if (a == ((eey) (obj)).a)
            {
                flag = flag1;
                if (b == ((eey) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((eey) (obj)).c)
                    {
                        flag = flag1;
                        if (TextUtils.equals(d, ((eey) (obj)).d))
                        {
                            flag = flag1;
                            if (TextUtils.equals(e, ((eey) (obj)).e))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a.hashCode() + (b + (c + c.a(d, c.a(e, 17)) * 31) * 31) * 31;
    }

    public String toString()
    {
        String s = String.valueOf("AutoBackupStatus{state: ");
        String s1 = String.valueOf(a);
        int i = b;
        int j = c;
        String s2 = d;
        String s3 = e;
        return (new StringBuilder(String.valueOf(s).length() + 82 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", progress: ").append(i).append(", photosLeft: ").append(j).append(", currentItem: ").append(s2).append(", enabledAccount: ").append(s3).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.ordinal());
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeString(e);
    }

}
