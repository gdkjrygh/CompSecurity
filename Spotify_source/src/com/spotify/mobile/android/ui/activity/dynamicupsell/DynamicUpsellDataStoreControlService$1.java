// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dwx;
import fps;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dynamicupsell:
//            DynamicUpsellDataStoreControlService

final class a
    implements dwx
{

    private DynamicUpsellDataStoreControlService a;

    public final void a(Flags flags)
    {
        DynamicUpsellDataStoreControlService.a(a, flags);
        if (DynamicUpsellDataStoreControlService.a(a))
        {
            DynamicUpsellDataStoreControlService.b(a);
            return;
        } else
        {
            DynamicUpsellDataStoreControlService.c(a).a(com.spotify.mobile.android.ui.activity.upsell.vice._cls1.a, false);
            return;
        }
    }

    a(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice)
    {
        a = dynamicupselldatastorecontrolservice;
        super();
    }
}
