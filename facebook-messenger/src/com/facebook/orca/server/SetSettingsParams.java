// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.orca.notify.NotificationSetting;

// Referenced classes of package com.facebook.orca.server:
//            ax, ay

public class SetSettingsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ax();
    private boolean a;
    private NotificationSetting b;

    private SetSettingsParams(Parcel parcel)
    {
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b = (NotificationSetting)parcel.readParcelable(com/facebook/orca/notify/NotificationSetting.getClassLoader());
    }

    SetSettingsParams(Parcel parcel, ax ax1)
    {
        this(parcel);
    }

    SetSettingsParams(ay ay1)
    {
        a = ay1.a();
        b = ay1.b();
    }

    public boolean a()
    {
        return a;
    }

    public NotificationSetting b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j;
        if (a)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeParcelable(b, i);
    }

}
