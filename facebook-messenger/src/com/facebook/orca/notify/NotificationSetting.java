// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.notify:
//            ar

public class NotificationSetting
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ar();
    public static NotificationSetting a = new NotificationSetting(true, 0L, false);
    public static NotificationSetting b = new NotificationSetting(false, 0L, false);
    private final boolean c;
    private final long d;
    private final boolean e;

    private NotificationSetting(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readLong();
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    NotificationSetting(Parcel parcel, ar ar1)
    {
        this(parcel);
    }

    private NotificationSetting(boolean flag, long l, boolean flag1)
    {
        c = flag;
        d = l;
        e = flag1;
    }

    public static NotificationSetting a(long l)
    {
        return new NotificationSetting(true, l, false);
    }

    public static NotificationSetting b(long l)
    {
        if (l == -1L)
        {
            return b;
        }
        if (l == 0L)
        {
            return a;
        }
        if (l < 0L)
        {
            return new NotificationSetting(true, -l, true);
        } else
        {
            return new NotificationSetting(true, l, false);
        }
    }

    public boolean a()
    {
        return c;
    }

    public long b()
    {
        return d;
    }

    public boolean c()
    {
        return e;
    }

    public long d()
    {
        if (c)
        {
            return d;
        } else
        {
            return -1L;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(d);
        if (e)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
