// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.r;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.ads.internal:
//            i

public final class j extends com.google.android.gms.ads.internal.client.s.a
{

    private q a;
    private bt b;
    private bu c;
    private ij d;
    private ij e;
    private NativeAdOptionsParcel f;
    private final Context g;
    private final dh h;
    private final String i;
    private final VersionInfoParcel j;

    public j(Context context, String s, dh dh, VersionInfoParcel versioninfoparcel)
    {
        g = context;
        i = s;
        h = dh;
        j = versioninfoparcel;
        e = new ij();
        d = new ij();
    }

    public final r a()
    {
        return new i(g, i, h, j, a, b, c, e, d, f);
    }

    public final void a(q q)
    {
        a = q;
    }

    public final void a(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        f = nativeadoptionsparcel;
    }

    public final void a(bt bt)
    {
        b = bt;
    }

    public final void a(bu bu)
    {
        c = bu;
    }

    public final void a(String s, bw bw, bv bv)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        } else
        {
            e.put(s, bw);
            d.put(s, bv);
            return;
        }
    }
}
