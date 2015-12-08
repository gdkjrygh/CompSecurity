// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, j, f

public class MatchAllFilter extends AbstractFilter
{

    public static final j CREATOR = new j();
    final int CK;

    public MatchAllFilter()
    {
        this(1);
    }

    MatchAllFilter(int i)
    {
        CK = i;
    }

    public Object a(f f1)
    {
        return f1.jd();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
