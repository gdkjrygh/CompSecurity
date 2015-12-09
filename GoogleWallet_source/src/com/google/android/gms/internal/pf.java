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
//            pg, kl

public class pf
    implements SafeParcelable
{

    public static final pg CREATOR = new pg();
    static final List avO = Collections.emptyList();
    LocationRequest ail;
    boolean avP;
    boolean avQ;
    boolean avR;
    List avS;
    final String mTag;
    private final int mVersionCode;

    pf(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        mVersionCode = i;
        ail = locationrequest;
        avP = flag;
        avQ = flag1;
        avR = flag2;
        avS = list;
        mTag = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof pf)
        {
            if (kl.equal(ail, ((pf) (obj = (pf)obj)).ail) && avP == ((pf) (obj)).avP && avQ == ((pf) (obj)).avQ && avR == ((pf) (obj)).avR && kl.equal(avS, ((pf) (obj)).avS))
            {
                return true;
            }
        }
        return false;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return ail.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(ail.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(avP);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(avQ);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(avR);
        stringbuilder.append(" clients=");
        stringbuilder.append(avS);
        if (mTag != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(mTag);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pg.a(this, parcel, i);
    }

}
