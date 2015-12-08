// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ai, av

public final class ah
    implements SafeParcelable
{

    public static final ai CREATOR = new ai();
    public final Bundle extras;
    public final long lH;
    public final int lI;
    public final List lJ;
    public final boolean lK;
    public final int lL;
    public final boolean lM;
    public final String lN;
    public final av lO;
    public final Location lP;
    public final String lQ;
    public final int versionCode;

    public ah(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, av av, Location location, String s1)
    {
        versionCode = i;
        lH = l;
        extras = bundle;
        lI = j;
        lJ = list;
        lK = flag;
        lL = k;
        lM = flag1;
        lN = s;
        lO = av;
        lP = location;
        lQ = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai.a(this, parcel, i);
    }

}
