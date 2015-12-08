// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.lang.ref.WeakReference;

public final class fqf
{

    public final fqh a;
    public final com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration b;
    public final int c;
    public final fqe d;

    public fqf(fqe fqe1, fqh fqh, com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration, int i)
    {
        d = fqe1;
        a = fqh;
        b = adslotconfiguration;
        c = i;
    }

    public final void a()
    {
        fqe fqe1 = d;
        Object obj = b;
        Object obj1 = (Context)fqe1.b.get();
        if (obj1 != null)
        {
            obj1 = de.a(((Context) (obj1)));
            com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup = com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup.a(Reason.a(((com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration) (obj)).mReason));
            if (reasongroup != null)
            {
                DynamicUpsellDataStoreControlService.a(((de) (obj1)), reasongroup);
            }
        }
        obj1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g);
        obj = Reason.a(((com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration) (obj)).mReason).mSubView;
        dmz.a(fop);
        fop.a((Context)fqe1.b.get(), ViewUri.aU, ((com.spotify.mobile.android.util.viewuri.ViewUri.SubView) (obj)), ((ClientEvent) (obj1)));
    }
}
