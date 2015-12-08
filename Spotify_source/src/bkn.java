// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class bkn extends bgc
{

    private bfv a;
    private ccn b;
    private ccq c;
    private cnm d;
    private cnm e;
    private NativeAdOptionsParcel f;
    private final Context g;
    private final cex h;
    private final String i;
    private final VersionInfoParcel j;

    public bkn(Context context, String s, cex cex, VersionInfoParcel versioninfoparcel)
    {
        g = context;
        i = s;
        h = cex;
        j = versioninfoparcel;
        e = new cnm();
        d = new cnm();
    }

    public final bfy a()
    {
        return new bkm(g, i, h, j, a, b, c, e, d, f);
    }

    public final void a(bfv bfv)
    {
        a = bfv;
    }

    public final void a(ccn ccn)
    {
        b = ccn;
    }

    public final void a(ccq ccq)
    {
        c = ccq;
    }

    public final void a(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        f = nativeadoptionsparcel;
    }

    public final void a(String s, ccw ccw, cct cct)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        } else
        {
            e.put(s, ccw);
            d.put(s, cct);
            return;
        }
    }
}
