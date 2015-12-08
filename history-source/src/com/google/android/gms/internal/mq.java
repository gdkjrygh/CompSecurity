// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mr, jv

public class mq
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mr();
    private final int CK;
    private final List TY;

    mq(int i, List list)
    {
        CK = i;
        TY = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(TY);
    }

    int getVersionCode()
    {
        return CK;
    }

    public String toString()
    {
        return jv.h(this).a("dataTypes", TY).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mr.a(this, parcel, i);
    }

}
