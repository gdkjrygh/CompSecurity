// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cpx;
import java.util.Collections;
import java.util.List;

public class CheckServerAuthResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cpx();
    public final int a;
    public final boolean b;
    public final List c;

    public CheckServerAuthResult()
    {
        this(1, false, Collections.emptyList());
    }

    public CheckServerAuthResult(int i, boolean flag, List list)
    {
        a = i;
        b = flag;
        c = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cpx.a(this, parcel);
    }

}
