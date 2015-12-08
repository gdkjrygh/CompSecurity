// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.offline.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.Assertion;
import java.util.concurrent.Semaphore;

public class OfflineService extends IntentService
{

    public OfflineService()
    {
        super("OfflineService");
    }

    public static void a(Context context, String s, boolean flag)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/spotlets/offline/service/OfflineService);
        intent.putExtra("uri", s);
        intent.putExtra("state", flag);
        intent.setAction("com.spotify.mobile.android.spotlets.offline.service.OfflineService.action.UPDATE");
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        obj = intent.getAction();
        if (!"com.spotify.mobile.android.spotlets.offline.service.OfflineService.action.UPDATE".equals(obj))
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported action ")).append(((String) (obj))).append(" in OfflineService.").toString());
        }
        obj = Cosmos.getResolver(this);
        ((Resolver) (obj)).connect();
        Semaphore semaphore;
        Handler handler;
        String s;
        semaphore = new Semaphore(0);
        handler = new Handler(getMainLooper());
        s = intent.getStringExtra("uri");
        if (intent.getBooleanExtra("state", false))
        {
            intent = "POST";
        } else
        {
            intent = "DELETE";
        }
        try
        {
            ((Resolver) (obj)).resolve(new Request(intent, String.format("sp://offline/v1/resources?uri=%s", new Object[] {
                s
            })), new com.spotify.cosmos.android.Resolver.CallbackReceiver(handler, semaphore) {

                private Semaphore a;

                protected final void onError(Throwable throwable)
                {
                    a.release();
                }

                protected final void onResolved(Response response)
                {
                    a.release();
                }

            
            {
                a = semaphore;
                super(handler);
            }
            });
            semaphore.acquire();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Assertion.a("Wait was interrupted.");
        }
        ((Resolver) (obj)).destroy();
        return;
    }
}
