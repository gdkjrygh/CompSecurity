// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fj

public class fi
    implements SafeParcelable
{

    public static final fj CREATOR = new fj();
    final int xM;
    final String xQ;
    final String xR;
    final String xS;

    fi(int i, String s, String s1, String s2)
    {
        xM = i;
        xQ = s;
        xR = s1;
        xS = s2;
    }

    public fi(String s, String s1, String s2)
    {
        this(1, s, s1, s2);
    }

    public int describeContents()
    {
        fj fj1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            xQ, xR, xS
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fj fj1 = CREATOR;
        fj.a(this, parcel, i);
    }

}
