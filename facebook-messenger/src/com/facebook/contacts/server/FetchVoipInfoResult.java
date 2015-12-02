// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;

// Referenced classes of package com.facebook.contacts.server:
//            v

public class FetchVoipInfoResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new v();
    public static final FetchVoipInfoResult a = new FetchVoipInfoResult(false, null, -1L);
    private final boolean b;
    private final String c;

    private FetchVoipInfoResult(Parcel parcel)
    {
        super(parcel);
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
    }

    FetchVoipInfoResult(Parcel parcel, v v1)
    {
        this(parcel);
    }

    public FetchVoipInfoResult(boolean flag, String s, long l)
    {
        super(b.FROM_SERVER, l);
        b = flag;
        c = s;
    }

    public boolean a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(c);
    }

}
