// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Parcel;

// Referenced classes of package com.yume.android.bsp:
//            YuMeUUIDService

final class t extends Binder
{

    private YuMeUUIDService a;

    t(YuMeUUIDService yumeuuidservice)
    {
        a = yumeuuidservice;
        super();
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("uuid_prefs", 0);
        parcel1.writeInt(parcel.readInt());
        parcel1.writeString(sharedpreferences.getString("uuid", null));
        return true;
    }
}
