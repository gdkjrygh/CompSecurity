// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.UserHandle;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            m, UserHandleCompat

final class l
    implements android.os.Parcelable.Creator
{

    l()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        if (m.a >= 17)
        {
            return new UserHandleCompat((UserHandle)parcel.readParcelable(android/os/UserHandle.getClassLoader()));
        } else
        {
            return new UserHandleCompat(null);
        }
    }

    public final Object[] newArray(int i)
    {
        return new UserHandleCompat[i];
    }
}
