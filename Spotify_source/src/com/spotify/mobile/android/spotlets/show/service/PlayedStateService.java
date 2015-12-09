// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.collection.model.ModificationModel;
import com.spotify.mobile.android.util.Assertion;
import dmz;
import gng;
import gni;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.service:
//            UpdateModel

public class PlayedStateService extends IntentService
{

    private final ObjectMapper a;

    public PlayedStateService()
    {
        super("PlayedStateService");
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/spotlets/show/service/PlayedStateService);
        intent.putExtra("uris", new String[] {
            s
        });
        intent.putExtra("played", true);
        intent.setAction("PlayedStateService.action.PLAYED");
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        obj = intent.getAction();
        if (!"PlayedStateService.action.PLAYED".equals(obj))
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported action ")).append(((String) (obj))).append(" in PlayedStateService.").toString());
        }
        obj = Cosmos.getResolver(this);
        ((Resolver) (obj)).connect();
        Semaphore semaphore;
        Handler handler;
        UpdateModel updatemodel;
        boolean flag;
        semaphore = new Semaphore(0);
        handler = new Handler(getMainLooper());
        flag = intent.getBooleanExtra("played", false);
        updatemodel = new UpdateModel(intent.getStringArrayExtra("uris"));
        if (flag)
        {
            intent = "DELETE";
        } else
        {
            intent = "POST";
        }
        try
        {
            ((Resolver) (obj)).resolve(new Request(intent, "sp://core-collection/unstable/unplayed", new HashMap(), a.writeValueAsString(updatemodel).getBytes()), new JsonCallbackReceiver(handler, com/spotify/mobile/android/spotlets/collection/model/ModificationModel, semaphore) {

                private Semaphore a;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    a.release();
                }

                protected final void onResolved(Response response, Object obj1)
                {
                    a.release();
                }

            
            {
                a = semaphore;
                super(handler, class1);
            }
            });
            semaphore.acquire();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Assertion.a("Failed to serialize update model request.");
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
