// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;

// Referenced classes of package com.facebook.push.c2dm:
//            ac

public class RegisterPushTokenResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ac();
    private boolean a;
    private boolean b;

    private RegisterPushTokenResult(Parcel parcel)
    {
        boolean flag1 = true;
        super(parcel);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    RegisterPushTokenResult(Parcel parcel, ac ac1)
    {
        this(parcel);
    }

    public RegisterPushTokenResult(boolean flag, boolean flag1, long l)
    {
        super(b.FROM_SERVER, l);
        a = flag;
        b = flag1;
    }

    public boolean a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        super.writeToParcel(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (b)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
