// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;

// Referenced classes of package com.crashlytics.android.beta:
//            BuildProperties, CheckForUpdatesRequest, Beta, CheckForUpdatesResponseTransform

class CheckForUpdatesController
{

    private final Context a;
    private final Beta b;
    private final IdManager c;
    private final BetaSettingsData d;
    private final BuildProperties e;
    private final PreferenceStore f;
    private final CurrentTimeProvider g;
    private final HttpRequestFactory h;

    public CheckForUpdatesController(Context context, Beta beta, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties, PreferenceStore preferencestore, CurrentTimeProvider currenttimeprovider, 
            HttpRequestFactory httprequestfactory)
    {
        a = context;
        b = beta;
        c = idmanager;
        d = betasettingsdata;
        e = buildproperties;
        f = preferencestore;
        g = currenttimeprovider;
        h = httprequestfactory;
    }

    public void a()
    {
        long l;
        l = g.a();
        long l1 = d.b * 1000;
        Fabric.g().a("Beta", (new StringBuilder()).append("Check for updates delay: ").append(l1).toString());
        long l2 = f.a().getLong("last_update_check", 0L);
        Fabric.g().a("Beta", (new StringBuilder()).append("Check for updates last check time: ").append(l2).toString());
        l1 += l2;
        Fabric.g().a("Beta", (new StringBuilder()).append("Check for updates current time: ").append(l).append(", next check time: ").append(l1).toString());
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        Fabric.g().a("Beta", "Performing update check");
        String s = (new ApiKey()).a(a);
        String s1 = c.a(s, e.d);
        (new CheckForUpdatesRequest(b, b.f(), d.a, h, new CheckForUpdatesResponseTransform())).a(s, s1, e);
        f.b().putLong("last_update_check", l).commit();
        return;
        Exception exception;
        exception;
        f.b().putLong("last_update_check", l).commit();
        throw exception;
        Fabric.g().a("Beta", "Check for updates next check time was not passed");
        return;
    }
}
