// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.android.volley.RequestQueue;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.play.dfe.api.PlayDfeApiContext;
import com.google.android.play.dfe.api.PlayDfeApiImpl;
import com.google.android.play.experiments.PlayExperiments;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class GamesExperiments
{

    private static final Object INSTANCE_LOCK = new Object();
    private static GamesExperiments sInstance;
    private final Map mExperiments = new ArrayMap();

    private GamesExperiments()
    {
        GservicesValue.init(GmsApplicationContext.getInstance(), PlayG.GSERVICES_KEY_PREFIXES);
    }

    public static GamesExperiments getInstance()
    {
        AndroidUtils.assertMainGmsProcess();
        synchronized (INSTANCE_LOCK)
        {
            if (sInstance == null)
            {
                sInstance = new GamesExperiments();
            }
        }
        return sInstance;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Set getExperimentIds(ClientContext clientcontext)
    {
        clientcontext = getLocalExperiments(clientcontext.mResolvedAccount);
        if (clientcontext == null)
        {
            return null;
        } else
        {
            return clientcontext.getExperiments();
        }
    }

    public final PlayExperiments getExperiments(Context context, final ClientContext latch)
    {
        this;
        JVM INSTR monitorenter ;
        Account account;
        account = latch.mResolvedAccount;
        latch = getLocalExperiments(account);
        if (latch != null) goto _L2; else goto _L1
_L1:
        boolean flag = ((Boolean)G.enableExperiments.get()).booleanValue();
        if (flag) goto _L3; else goto _L2
_L2:
        context = latch;
_L5:
        this;
        JVM INSTR monitorexit ;
        return context;
_L3:
        GamesLog.d("GamesExperiments", "Creating new experiment instance");
        latch = GmsApplicationContext.getInstance().getRequestQueue();
        context = new PlayExperiments(new PlayDfeApiImpl(latch, PlayDfeApiContext.create(context, "com.google.android.play.games", latch.getCache(), account)));
        latch = new CountDownLatch(1);
        com.google.android.play.experiments.PlayExperiments.ExperimentsLoadedListener experimentsloadedlistener = new com.google.android.play.experiments.PlayExperiments.ExperimentsLoadedListener() {

            final GamesExperiments this$0;
            final CountDownLatch val$latch;

            public final void onLoad()
            {
                latch.countDown();
            }

            
            {
                this$0 = GamesExperiments.this;
                latch = countdownlatch;
                super();
            }
        };
        GamesLog.d("GamesExperiments", "Initializing experiments");
        context.init(experimentsloadedlistener);
        latch.await();
_L6:
        GamesLog.d("GamesExperiments", "Experiments initialized");
        mExperiments.put(account, context);
        if (true) goto _L5; else goto _L4
_L4:
        context;
        throw context;
        latch;
        GamesLog.e("GamesExperiments", "Interrupted while trying to init", latch);
          goto _L6
    }

    public final PlayExperiments getLocalExperiments(Account account)
    {
        if (!((Boolean)G.enableExperiments.get()).booleanValue())
        {
            GamesLog.d("GamesExperiments", "Experiments disabled - bailing");
            return null;
        } else
        {
            return (PlayExperiments)mExperiments.get(account);
        }
    }

}
