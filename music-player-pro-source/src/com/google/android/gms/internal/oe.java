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
//            of, jx

public final class oe
    implements SafeParcelable
{

    public static final of CREATOR = new of();
    public static final oe akb;
    public static final oe akc;
    public static final Set akd;
    final int CK;
    final int ake;
    final String vc;

    oe(int i, String s, int j)
    {
        jx.bb(s);
        CK = i;
        vc = s;
        ake = j;
    }

    private static oe A(String s, int i)
    {
        return new oe(0, s, i);
    }

    public int describeContents()
    {
        of of1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof oe))
            {
                return false;
            }
            obj = (oe)obj;
            if (!vc.equals(((oe) (obj)).vc) || ake != ((oe) (obj)).ake)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return vc.hashCode();
    }

    public String toString()
    {
        return vc;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        of of1 = CREATOR;
        of.a(this, parcel, i);
    }

    static 
    {
        akb = A("test_type", 1);
        akc = A("labeled_place", 6);
        akd = Collections.unmodifiableSet(new HashSet(Arrays.asList(new oe[] {
            akb, akc
        })));
    }
}
