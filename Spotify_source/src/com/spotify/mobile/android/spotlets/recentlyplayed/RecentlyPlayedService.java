// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.recentlyplayed;

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

// Referenced classes of package com.spotify.mobile.android.spotlets.recentlyplayed:
//            DeleteModel

public class RecentlyPlayedService extends IntentService
{

    private static final ObjectMapper a;

    public RecentlyPlayedService()
    {
        super("RecentlyPlayedService");
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/spotlets/recentlyplayed/RecentlyPlayedService);
        intent.putExtra("uris", new String[] {
            s
        });
        intent.setAction("com.spotify.mobile.android.spotlets.collection.service.RecentlyPlayedService.action.HIDE");
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = intent.getAction();
        if (!"com.spotify.mobile.android.spotlets.collection.service.RecentlyPlayedService.action.HIDE".equals(obj))
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported action ")).append(((String) (obj))).append(" in RecentlyPlayedService.").toString());
        }
        obj = Cosmos.getResolver(this);
        ((Resolver) (obj)).connect();
        intent = new DeleteModel(intent.getStringArrayExtra("uris"));
        try
        {
            Semaphore semaphore = new Semaphore(0);
            Handler handler = new Handler(getMainLooper());
            ((Resolver) (obj)).resolve(new Request("DELETE", "sp://core-recently-played/unstable/items", new HashMap(), a.writeValueAsString(intent).getBytes()), new JsonCallbackReceiver(handler, com/spotify/mobile/android/spotlets/collection/model/ModificationModel, semaphore) {

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
            Assertion.a("Failed to serialize delete model request.");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Assertion.a("Wait was interrupted.");
        }
        ((Resolver) (obj)).destroy();
    }

    static 
    {
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}
