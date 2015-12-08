// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb

public class ma
    implements SafeParcelable
{

    public static final mb CREATOR = new mb();
    static final List afh = Collections.emptyList();
    private final int BR;
    LocationRequest UI;
    boolean afi;
    boolean afj;
    boolean afk;
    List afl;
    final String mTag;

    ma(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        BR = i;
        UI = locationrequest;
        afi = flag;
        afj = flag1;
        afk = flag2;
        afl = list;
        mTag = s;
    }

    private ma(String s, LocationRequest locationrequest)
    {
        this(1, locationrequest, false, true, true, afh, s);
    }

    public static ma a(String s, LocationRequest locationrequest)
    {
        return new ma(s, locationrequest);
    }

    public static ma b(LocationRequest locationrequest)
    {
        return a(null, locationrequest);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ma)
        {
            if (n.equal(UI, ((ma) (obj = (ma)obj)).UI) && afi == ((ma) (obj)).afi && afj == ((ma) (obj)).afj && afk == ((ma) (obj)).afk && n.equal(afl, ((ma) (obj)).afl))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return UI.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(UI.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(afi);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(afj);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(afk);
        stringbuilder.append(" clients=");
        stringbuilder.append(afl);
        if (mTag != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(mTag);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mb.a(this, parcel, i);
    }

}
