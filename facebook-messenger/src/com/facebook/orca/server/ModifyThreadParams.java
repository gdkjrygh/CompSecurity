// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.ui.media.attachments.MediaResource;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.server:
//            am, an

public class ModifyThreadParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    private final String a;
    private final boolean b;
    private final String c;
    private final MediaResource d;
    private final boolean e;
    private final boolean f;
    private final NotificationSetting g;

    private ModifyThreadParams(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        d = (MediaResource)parcel.readParcelable(com/facebook/ui/media/attachments/MediaResource.getClassLoader());
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f = flag;
        g = (NotificationSetting)parcel.readParcelable(com/facebook/orca/notify/NotificationSetting.getClassLoader());
    }

    ModifyThreadParams(Parcel parcel, am am1)
    {
        this(parcel);
    }

    ModifyThreadParams(an an1)
    {
        Preconditions.checkNotNull(an1.a(), "threadid must be specified");
        a = an1.a();
        b = an1.b();
        c = an1.c();
        e = an1.d();
        d = an1.e();
        f = an1.f();
        g = an1.g();
    }

    public String a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public MediaResource e()
    {
        return d;
    }

    public boolean f()
    {
        return f;
    }

    public NotificationSetting g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(a);
        int j;
        if (b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeString(c);
        if (e)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeParcelable(d, i);
        if (f)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeParcelable(g, i);
    }

}
