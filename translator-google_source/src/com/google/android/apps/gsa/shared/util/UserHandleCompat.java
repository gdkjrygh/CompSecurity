// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.common.base.k;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            l, m

public class UserHandleCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    private UserHandle a;

    public UserHandleCompat(UserHandle userhandle)
    {
        a = userhandle;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof UserHandleCompat))
        {
            return false;
        }
        if (m.a >= 17)
        {
            obj = (UserHandleCompat)obj;
            return k.a(a, ((UserHandleCompat) (obj)).a);
        } else
        {
            return true;
        }
    }

    public int hashCode()
    {
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            i = Arrays.hashCode(new Object[] {
                a
            });
        }
        return i;
    }

    public String toString()
    {
        if (m.a >= 17 && a != null)
        {
            return a.toString();
        } else
        {
            return "";
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (m.a >= 17)
        {
            parcel.writeParcelable(a, 0);
        }
    }

}
