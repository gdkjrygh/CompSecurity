// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            lh

public class lg
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lh();
    private final int BR;
    private final List SB;

    lg(int i, List list)
    {
        BR = i;
        SB = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(SB);
    }

    int getVersionCode()
    {
        return BR;
    }

    public String toString()
    {
        return n.h(this).a("dataTypes", SB).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lh.a(this, parcel, i);
    }

}
