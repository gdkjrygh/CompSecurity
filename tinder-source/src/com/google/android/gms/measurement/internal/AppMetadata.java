// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            i

public class AppMetadata
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    AppMetadata(int j, String s, String s1, String s2, String s3, long l, 
            long l1)
    {
        a = j;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = l;
        g = l1;
    }

    AppMetadata(String s, String s1, String s2, String s3, long l, long l1)
    {
        u.a(s);
        a = 1;
        b = s;
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = null;
        }
        c = s;
        d = s2;
        e = s3;
        f = l;
        g = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

}
