// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.lang.ref.WeakReference;

public final class fqe
{

    public final fqa a;
    public final WeakReference b;
    public final Flags c;

    public fqe(Context context, Flags flags)
    {
        dmz.a(fqc);
        a = fqc.a(context);
        b = new WeakReference(context);
        c = flags;
    }

    // Unreferenced inner class fqe$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.ActionButton.Type.values().length];
            try
            {
                a[com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.ActionButton.Type.IAP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.ActionButton.Type.TRIAL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.ActionButton.Type.CALLBACK.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.ActionButton.Type.URL.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
