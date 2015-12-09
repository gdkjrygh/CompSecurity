// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.ondemand.OnDemandUpsellVariationFlag;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public class frl
    implements dmx
{

    public frl()
    {
    }

    public static frs a(Context context, Verified verified, Flags flags, boolean flag)
    {
        new frk();
        fri fri = frk.a(context, flags, Reason.g);
        flags = new frv(flags, context);
        context = new fry(context);
        flags.a(new frm(flags, new fro(), fri, context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, flag, "popup"));
        return flags;
    }

    public static frs a(Context context, Verified verified, Flags flags, boolean flag, frq frq)
    {
        new frk();
        flags = frk.a(context, flags, Reason.g);
        frq = new frw(frq);
        context = new fry(context);
        frq.a(new frm(frq, new fro(), flags, context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, flag, "tooltip"));
        return frq;
    }

    public static frs b(Context context, Verified verified, Flags flags, boolean flag)
    {
        new frk();
        flags = frk.a(context, flags, Reason.g);
        fru fru1 = new fru();
        context = new fry(context);
        fru1.a(new frm(fru1, new fro(), flags, context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, flag, "inline"));
        return fru1;
    }

    // Unreferenced inner class frl$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[OnDemandUpsellVariationFlag.values().length];
            try
            {
                a[OnDemandUpsellVariationFlag.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[OnDemandUpsellVariationFlag.d.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[OnDemandUpsellVariationFlag.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[OnDemandUpsellVariationFlag.b.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
