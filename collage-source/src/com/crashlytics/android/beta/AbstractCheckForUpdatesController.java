// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.b.e;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.j;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.d.f;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.beta:
//            UpdatesController, BuildProperties, CheckForUpdatesRequest, Beta, 
//            CheckForUpdatesResponseTransform

abstract class AbstractCheckForUpdatesController
    implements UpdatesController
{

    static final long LAST_UPDATE_CHECK_DEFAULT = 0L;
    static final String LAST_UPDATE_CHECK_KEY = "last_update_check";
    private static final long MILLIS_PER_SECOND = 1000L;
    private Beta beta;
    private f betaSettings;
    private BuildProperties buildProps;
    private Context context;
    private j currentTimeProvider;
    private final AtomicBoolean externallyReady;
    private e httpRequestFactory;
    private n idManager;
    private final AtomicBoolean initialized;
    private long lastCheckTimeMillis;
    private b preferenceStore;

    public AbstractCheckForUpdatesController()
    {
        this(false);
    }

    public AbstractCheckForUpdatesController(boolean flag)
    {
        initialized = new AtomicBoolean();
        lastCheckTimeMillis = 0L;
        externallyReady = new AtomicBoolean(flag);
    }

    private void performUpdateCheck()
    {
        c.h().a("Beta", "Performing update check");
        String s = (new g()).a(context);
        String s1 = idManager.a(s, buildProps.packageName);
        (new CheckForUpdatesRequest(beta, beta.getOverridenSpiEndpoint(), betaSettings.a, httpRequestFactory, new CheckForUpdatesResponseTransform())).invoke(s, s1, buildProps);
    }

    protected void checkForUpdates()
    {
        long l1;
        synchronized (preferenceStore)
        {
            if (preferenceStore.a().contains("last_update_check"))
            {
                preferenceStore.a(preferenceStore.b().remove("last_update_check"));
            }
        }
        l1 = currentTimeProvider.a();
        long l2 = (long)betaSettings.b * 1000L;
        c.h().a("Beta", (new StringBuilder()).append("Check for updates delay: ").append(l2).toString());
        c.h().a("Beta", (new StringBuilder()).append("Check for updates last check time: ").append(getLastCheckTimeMillis()).toString());
        l2 += getLastCheckTimeMillis();
        c.h().a("Beta", (new StringBuilder()).append("Check for updates current time: ").append(l1).append(", next check time: ").append(l2).toString());
        if (l1 < l2)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        performUpdateCheck();
        setLastCheckTimeMillis(l1);
        return;
        exception1;
        b1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        setLastCheckTimeMillis(l1);
        throw exception;
        c.h().a("Beta", "Check for updates next check time was not passed");
        return;
    }

    long getLastCheckTimeMillis()
    {
        return lastCheckTimeMillis;
    }

    public void initialize(Context context1, Beta beta1, n n1, f f1, BuildProperties buildproperties, b b1, j j1, 
            e e)
    {
        context = context1;
        beta = beta1;
        idManager = n1;
        betaSettings = f1;
        buildProps = buildproperties;
        preferenceStore = b1;
        currentTimeProvider = j1;
        httpRequestFactory = e;
        if (signalInitialized())
        {
            checkForUpdates();
        }
    }

    void setLastCheckTimeMillis(long l1)
    {
        lastCheckTimeMillis = l1;
    }

    protected boolean signalExternallyReady()
    {
        externallyReady.set(true);
        return initialized.get();
    }

    boolean signalInitialized()
    {
        initialized.set(true);
        return externallyReady.get();
    }
}
