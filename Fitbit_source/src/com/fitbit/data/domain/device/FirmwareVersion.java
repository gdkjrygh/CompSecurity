// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.os.Parcel;
import android.os.Parcelable;

public class FirmwareVersion
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FirmwareVersion a(Parcel parcel)
        {
            return new FirmwareVersion(parcel.createIntArray());
        }

        public FirmwareVersion[] a(int i)
        {
            return new FirmwareVersion[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static FirmwareVersion a = new FirmwareVersion(new int[] {
        0
    });
    private int b[];

    public transient FirmwareVersion(int ai[])
    {
        b = ai;
    }

    private int a(int i)
    {
        if (i < b.length)
        {
            return b[i];
        } else
        {
            return 0;
        }
    }

    public static FirmwareVersion a(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = s.split("\\.");
        int ai[] = new int[s.length];
        for (int i = 0; i < s.length; i++)
        {
            ai[i] = Integer.parseInt(s[i]);
        }

        return new FirmwareVersion(ai);
    }

    public int a(FirmwareVersion firmwareversion)
    {
        boolean flag = false;
        int k = Math.max(b.length, firmwareversion.b.length);
        int i = 0;
        do
        {
label0:
            {
                int j = ((flag) ? 1 : 0);
                if (i < k)
                {
                    if (a(i) == firmwareversion.a(i))
                    {
                        break label0;
                    }
                    j = a(i) - firmwareversion.a(i);
                }
                return j;
            }
            i++;
        } while (true);
    }

    public boolean a()
    {
        return a(a) > 0;
    }

    public boolean b()
    {
        return a(a) == 0;
    }

    public boolean b(FirmwareVersion firmwareversion)
    {
        return a(firmwareversion) >= 0;
    }

    public boolean c(FirmwareVersion firmwareversion)
    {
        return a(firmwareversion) > 0;
    }

    public int compareTo(Object obj)
    {
        return a((FirmwareVersion)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof FirmwareVersion)
        {
            flag = flag1;
            if (a((FirmwareVersion)obj) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a(0));
        for (int i = 1; i < b.length; i++)
        {
            stringbuilder.append(".");
            stringbuilder.append(a(i));
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeIntArray(b);
    }

}
