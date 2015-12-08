// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public final class chp
{

    public chp()
    {
    }

    public static chr a(Context context, bkc bkc, ciu ciu1, bzm bzm, ckw ckw1, cex cex, chq chq, cbk cbk)
    {
        AdResponseParcel adresponseparcel = ciu1.b;
        if (adresponseparcel.h)
        {
            context = new chu(context, ciu1, cex, chq, cbk);
        } else
        if (adresponseparcel.t)
        {
            if (bkc instanceof bks)
            {
                context = new chv(context, (bks)bkc, new cac(), ciu1, bzm, chq);
            } else
            {
                ciu1 = new StringBuilder("Invalid NativeAdManager type. Found: ");
                if (bkc != null)
                {
                    context = bkc.getClass().getName();
                } else
                {
                    context = "null";
                }
                throw new IllegalArgumentException(ciu1.append(context).append("; Required: NativeAdManager.").toString());
            }
        } else
        if (adresponseparcel.p)
        {
            context = new cho(context, ciu1, ckw1, chq);
        } else
        {
            bkc = cbb.E;
            if (((Boolean)bkv.n().a(bkc)).booleanValue() && cnv.a(19) && !cnv.a(21) && ckw1.j().e)
            {
                context = new cht(context, ciu1, ckw1, chq);
            } else
            {
                context = new chs(context, ciu1, ckw1, chq);
            }
        }
        bka.a((new StringBuilder("AdRenderer: ")).append(context.getClass().getName()).toString());
        context.f_();
        return context;
    }
}
