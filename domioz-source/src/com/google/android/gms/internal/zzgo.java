// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ei, zzax, zzba, zzhy

public final class zzgo
    implements SafeParcelable
{

    public static final ei CREATOR = new ei();
    public final int a;
    public final Bundle b;
    public final zzax c;
    public final zzba d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final zzhy k;
    public final Bundle l;
    public final int m;
    public final List n;
    public final Bundle o;
    public final boolean p;
    public final Messenger q;
    public final int r;
    public final int s;
    public final float t;
    public final String u;
    public final boolean v;
    public final int w;
    public final String x;
    public final long y;
    public final String z;

    zzgo(int i1, Bundle bundle, zzax zzax, zzba zzba, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s2, String s3, String s4, zzhy zzhy, Bundle bundle1, int j1, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k1, int l1, float f1, String s5, 
            boolean flag1, int i2, String s6, long l2, String s7)
    {
        a = i1;
        b = bundle;
        c = zzax;
        d = zzba;
        e = s1;
        f = applicationinfo;
        g = packageinfo;
        h = s2;
        i = s3;
        j = s4;
        k = zzhy;
        l = bundle1;
        m = j1;
        n = list;
        o = bundle2;
        p = flag;
        q = messenger;
        r = k1;
        s = l1;
        t = f1;
        u = s5;
        v = flag1;
        w = i2;
        x = s6;
        y = l2;
        z = s7;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        ei.a(this, parcel, i1);
    }

}
