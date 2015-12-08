// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kn;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            l

public final class UserDataType
    implements SafeParcelable
{

    public static final UserDataType ALIASES;
    public static final l CREATOR = new l();
    public static final UserDataType TEST_TYPE;
    public static final Set VALUES;
    final int awS;
    final int mVersionCode;
    final String vc;

    UserDataType(int i, String s, int j)
    {
        kn.bk(s);
        mVersionCode = i;
        vc = s;
        awS = j;
    }

    private static UserDataType y(String s, int i)
    {
        return new UserDataType(0, s, i);
    }

    public final int describeContents()
    {
        l l1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserDataType))
            {
                return false;
            }
            obj = (UserDataType)obj;
            if (!vc.equals(((UserDataType) (obj)).vc) || awS != ((UserDataType) (obj)).awS)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return vc.hashCode();
    }

    public final String toString()
    {
        return vc;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        l l1 = CREATOR;
        l.a(this, parcel, i);
    }

    static 
    {
        TEST_TYPE = y("test_type", 1);
        ALIASES = y("labeled_place", 6);
        VALUES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new UserDataType[] {
            TEST_TYPE, ALIASES
        })));
    }
}
