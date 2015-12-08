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
//            jx, hm

public final class jw
    implements SafeParcelable
{

    public static final jx CREATOR = new jx();
    public static final jw YP;
    public static final jw YQ;
    public static final Set YR;
    final int YS;
    final String qX;
    final int xM;

    jw(int i, String s, int j)
    {
        hm.aE(s);
        xM = i;
        qX = s;
        YS = j;
    }

    private static jw w(String s, int i)
    {
        return new jw(0, s, i);
    }

    public int describeContents()
    {
        jx jx1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jw))
            {
                return false;
            }
            obj = (jw)obj;
            if (!qX.equals(((jw) (obj)).qX) || YS != ((jw) (obj)).YS)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return qX.hashCode();
    }

    public String toString()
    {
        return qX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jx jx1 = CREATOR;
        jx.a(this, parcel, i);
    }

    static 
    {
        YP = w("test_type", 1);
        YQ = w("saved_offers", 4);
        YR = Collections.unmodifiableSet(new HashSet(Arrays.asList(new jw[] {
            YP, YQ
        })));
    }
}
