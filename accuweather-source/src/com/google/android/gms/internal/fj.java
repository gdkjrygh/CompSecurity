// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fk

public class fj
    implements SafeParcelable
{

    public static final fk CREATOR = new fk();
    final int xJ;
    final String xN;
    final String xO;
    final String xP;

    fj(int i, String s, String s1, String s2)
    {
        xJ = i;
        xN = s;
        xO = s1;
        xP = s2;
    }

    public fj(String s, String s1, String s2)
    {
        this(1, s, s1, s2);
    }

    public int describeContents()
    {
        fk fk1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            xN, xO, xP
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fk fk1 = CREATOR;
        fk.a(this, parcel, i);
    }

}
