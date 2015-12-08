// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jy, hn

public final class jx
    implements SafeParcelable
{

    public static final jy CREATOR = new jy();
    public static final jx YM;
    public static final jx YN;
    public static final Set YO;
    final int YP;
    final String qU;
    final int xJ;

    jx(int i, String s, int j)
    {
        hn.aE(s);
        xJ = i;
        qU = s;
        YP = j;
    }

    private static jx w(String s, int i)
    {
        return new jx(0, s, i);
    }

    public int describeContents()
    {
        jy jy1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jx))
            {
                return false;
            }
            obj = (jx)obj;
            if (!qU.equals(((jx) (obj)).qU) || YP != ((jx) (obj)).YP)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return qU.hashCode();
    }

    public String toString()
    {
        return qU;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jy jy1 = CREATOR;
        jy.a(this, parcel, i);
    }

    static 
    {
        YM = w("test_type", 1);
        YN = w("saved_offers", 4);
        YO = Collections.unmodifiableSet(new HashSet(Arrays.asList(new jx[] {
            YM, YN
        })));
    }
}
