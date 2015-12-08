// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            nm, jv

public class nl
    implements SafeParcelable
{

    public static final nm CREATOR = new nm();
    static final List ahg = Collections.emptyList();
    private final int CK;
    LocationRequest We;
    boolean ahh;
    boolean ahi;
    boolean ahj;
    List ahk;
    final String mTag;

    nl(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        CK = i;
        We = locationrequest;
        ahh = flag;
        ahi = flag1;
        ahj = flag2;
        ahk = list;
        mTag = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof nl)
        {
            if (jv.equal(We, ((nl) (obj = (nl)obj)).We) && ahh == ((nl) (obj)).ahh && ahi == ((nl) (obj)).ahi && ahj == ((nl) (obj)).ahj && jv.equal(ahk, ((nl) (obj)).ahk))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return We.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(We.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(ahh);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(ahi);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(ahj);
        stringbuilder.append(" clients=");
        stringbuilder.append(ahk);
        if (mTag != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(mTag);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nm.a(this, parcel, i);
    }

}
