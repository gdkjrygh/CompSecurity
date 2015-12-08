// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.auth;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.auth:
//            AuthState, AuthToken

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        AuthState authstate = new AuthState();
        authstate.a = parcel.readString();
        authstate.b = parcel.readString();
        authstate.c = parcel.readString();
        authstate.e = parcel.readLong();
        Object obj = new ArrayList();
        parcel.readTypedList(((List) (obj)), AuthToken.CREATOR);
        for (parcel = ((List) (obj)).iterator(); parcel.hasNext(); authstate.d.put(((AuthToken) (obj)).a, obj))
        {
            obj = (AuthToken)parcel.next();
        }

        return authstate;
    }

    public final Object[] newArray(int i)
    {
        return new AuthState[i];
    }
}
