// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.internal:
//            ry, dl, df, zzja

public final class rx
{

    private final ry a;
    private final Context b;
    private final ViewGroup c;
    private zzk d;

    public rx(Context context, ViewGroup viewgroup, ry ry1)
    {
        this(context, viewgroup, ry1, (byte)0);
    }

    private rx(Context context, ViewGroup viewgroup, ry ry1, byte byte0)
    {
        b = context;
        c = viewgroup;
        a = ry1;
        d = null;
    }

    public final zzk a()
    {
        bl.b("getAdVideoUnderlay must be called from the UI thread.");
        return d;
    }

    public final void a(int i, int j, int k, int l)
    {
        bl.b("The underlay may only be modified from the UI thread.");
        if (d != null)
        {
            d.zzd(i, j, k, l);
        }
    }

    public final void a(int i, int j, int k, int l, int i1)
    {
        if (d != null)
        {
            return;
        } else
        {
            df.a(a.w().a(), a.v(), new String[] {
                "vpr"
            });
            dk dk = df.a(a.w().a());
            d = new zzk(b, a, i1, a.w().a(), dk);
            c.addView(d, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            d.zzd(i, j, k, l);
            a.k().zzF(false);
            return;
        }
    }

    public final void b()
    {
        bl.b("onDestroy must be called from the UI thread.");
        if (d != null)
        {
            d.destroy();
        }
    }
}
