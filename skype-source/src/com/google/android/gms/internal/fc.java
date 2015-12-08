// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            ff, gi, fg, ac, 
//            ez, ay, ax, it, 
//            hi, fe, fd, o, 
//            dh, be, gb

public final class fc
{
    public static interface a
    {

        public abstract void b(gb gb);
    }


    public fc()
    {
    }

    public static gi a(Context context, com.google.android.gms.ads.internal.a a1, gb.a a2, o o, hi hi1, dh dh, a a3, be be)
    {
        AdResponseParcel adresponseparcel = a2.b;
        if (adresponseparcel.h)
        {
            context = new ff(context, a2, hi1, dh, a3, be);
        } else
        if (adresponseparcel.t)
        {
            if (a1 instanceof n)
            {
                context = new fg(context, (n)a1, new ac(), a2, o, a3);
            } else
            {
                a2 = new StringBuilder("Invalid NativeAdManager type. Found: ");
                if (a1 != null)
                {
                    context = a1.getClass().getName();
                } else
                {
                    context = "null";
                }
                throw new IllegalArgumentException(a2.append(context).append("; Required: NativeAdManager.").toString());
            }
        } else
        if (adresponseparcel.p)
        {
            context = new ez(context, a2, hi1, a3);
        } else
        {
            a1 = ay.R;
            if (((Boolean)p.n().a(a1)).booleanValue() && it.f() && !it.h() && hi1.i().e)
            {
                context = new fe(context, a2, hi1, a3);
            } else
            {
                context = new fd(context, a2, hi1, a3);
            }
        }
        (new StringBuilder("AdRenderer: ")).append(context.getClass().getName());
        b.a(3);
        context.f();
        return context;
    }
}
