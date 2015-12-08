// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import log;

public class UserQuota
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new log();
    public final int a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;

    public UserQuota()
    {
        a = 1;
    }

    public UserQuota(int i, long l, long l1, boolean flag, boolean flag1)
    {
        a = i;
        b = l;
        c = l1;
        d = flag;
        e = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        log.a(this, parcel);
    }

}
