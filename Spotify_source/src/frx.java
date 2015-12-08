// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

public final class frx
{

    public WeakReference a;
    public boolean b;
    public Flags c;

    public frx(Context context, Flags flags)
    {
        dmz.a(fop);
        a = new WeakReference(context);
        c = flags;
        if (c != null)
        {
            boolean flag;
            if (c.a(fys.aM) == com.spotify.mobile.android.ui.activity.dialog.trialactivation.TrialActivationActivity.OptInTrialActivationFlow.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }
    }

    public final void a(Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, Uri uri, String s, Flags flags)
    {
        Context context = (Context)a.get();
        if (context == null)
        {
            return;
        } else
        {
            fop.a(context, uri, verified, subview, s, flags);
            return;
        }
    }

    public final void a(dnj dnj)
    {
        Context context = (Context)a.get();
        if (context == null)
        {
            return;
        } else
        {
            fop.a(context, dnj);
            return;
        }
    }

    // Unreferenced inner class frx$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.values().length];
            try
            {
                a[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PREMIUM.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PLUS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PLUS_CONSUMABLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
