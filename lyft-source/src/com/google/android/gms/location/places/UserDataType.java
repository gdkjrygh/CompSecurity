// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zzn

public final class UserDataType
    implements SafeParcelable
{

    public static final zzn CREATOR = new zzn();
    public static final UserDataType a;
    public static final UserDataType b;
    public static final UserDataType c;
    public static final Set d;
    final int e;
    final String f;
    final int g;

    UserDataType(int i, String s, int j)
    {
        zzu.a(s);
        e = i;
        f = s;
        g = j;
    }

    private static UserDataType a(String s, int i)
    {
        return new UserDataType(0, s, i);
    }

    public int describeContents()
    {
        zzn zzn1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserDataType))
            {
                return false;
            }
            obj = (UserDataType)obj;
            if (!f.equals(((UserDataType) (obj)).f) || g != ((UserDataType) (obj)).g)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return f.hashCode();
    }

    public String toString()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn zzn1 = CREATOR;
        zzn.a(this, parcel, i);
    }

    static 
    {
        a = a("test_type", 1);
        b = a("labeled_place", 6);
        c = a("here_content", 7);
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new UserDataType[] {
            a, b, c
        })));
    }
}
