// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import loa;

// Referenced classes of package com.google.android.gms.photos.autobackup.model:
//            UserQuota

public class AutoBackupSettings
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new loa();
    public final int a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public UserQuota k;

    public AutoBackupSettings()
    {
        a = 1;
    }

    public AutoBackupSettings(int l, String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, 
            boolean flag5, boolean flag6, boolean flag7, UserQuota userquota)
    {
        a = l;
        b = s;
        c = flag;
        d = flag1;
        e = flag2;
        f = flag3;
        g = flag4;
        h = flag5;
        i = flag6;
        j = flag7;
        k = userquota;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        loa.a(this, parcel, l);
    }

}
