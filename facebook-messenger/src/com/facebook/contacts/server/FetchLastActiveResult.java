// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.user.UserKey;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.server:
//            r

public class FetchLastActiveResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    public static FetchLastActiveResult a;
    private final es b;

    private FetchLastActiveResult(Parcel parcel)
    {
        super(parcel);
        b = es.a(parcel.readArrayList(com/facebook/user/UserKey.getClassLoader()));
    }

    FetchLastActiveResult(Parcel parcel, r r1)
    {
        this(parcel);
    }

    public FetchLastActiveResult(b b1, es es1, long l)
    {
        super(b1, l);
        b = es1;
    }

    public es a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeList(b);
    }

    static 
    {
        a = new FetchLastActiveResult(b.NO_DATA, es.d(), -1L);
    }
}
