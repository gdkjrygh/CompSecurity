// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            w, x, fi

public final class zzba
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final zzba h[];

    public zzba()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    zzba(int i, String s, int j, int k, boolean flag, int l, int i1, 
            zzba azzba[])
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = flag;
        f = l;
        g = i1;
        h = azzba;
    }

    public zzba(Context context, a a1)
    {
        this(context, new a[] {
            a1
        });
    }

    private zzba(Context context, a aa[])
    {
        boolean flag1 = true;
        super();
        aa = aa[0];
        a = 2;
        e = false;
        f = aa.b();
        c = aa.a();
        int i;
        boolean flag;
        int j;
        if (f == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c != -2)
        {
            flag1 = false;
        }
        context = context.getResources().getDisplayMetrics();
        if (flag)
        {
            g = ((DisplayMetrics) (context)).widthPixels;
            j = (int)((float)g / ((DisplayMetrics) (context)).density);
        } else
        {
            j = f;
            com.google.android.gms.internal.x.a();
            g = com.google.android.gms.internal.fi.a(context, f);
        }
        if (flag1)
        {
            i = (int)((float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density);
            if (i <= 400)
            {
                i = 32;
            } else
            if (i <= 720)
            {
                i = 50;
            } else
            {
                i = 90;
            }
        } else
        {
            i = c;
        }
        com.google.android.gms.internal.x.a();
        d = com.google.android.gms.internal.fi.a(context, i);
        if (flag || flag1)
        {
            b = (new StringBuilder()).append(j).append("x").append(i).append("_as").toString();
        } else
        {
            b = aa.toString();
        }
        h = null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.w.a(this, parcel, i);
    }

}
