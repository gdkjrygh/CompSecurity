// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.comm.ApptentiveClient;
import com.apptentive.android.sdk.comm.ApptentiveHttpResponse;
import com.apptentive.android.sdk.module.engagement.interaction.model.Interaction;
import com.apptentive.android.sdk.module.engagement.interaction.model.Interactions;
import com.apptentive.android.sdk.module.metric.MetricModule;
import com.apptentive.android.sdk.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class InteractionManager
{

    public InteractionManager()
    {
    }

    public static void asyncFetchAndStoreInteractions(Context context)
    {
        if (hasCacheExpired(context))
        {
            Log.d("Interaction cache has expired. Fetching new interactions.", new Object[0]);
            Thread thread = new Thread(context) {

                final Context val$context;

                public void run()
                {
                    InteractionManager.fetchAndStoreInteractions(context);
                }

            
            {
                context = context1;
                super();
            }
            };
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(context) {

                final Context val$context;

                public void uncaughtException(Thread thread1, Throwable throwable)
                {
                    Log.w("UncaughtException in InteractionManager.", throwable, new Object[0]);
                    MetricModule.sendError(context.getApplicationContext(), throwable, null, null);
                }

            
            {
                context = context1;
                super();
            }
            });
            thread.setName("Apptentive-FetchInteractions");
            thread.start();
            return;
        } else
        {
            Log.d("Interaction cache has not expired. Using existing interactions.", new Object[0]);
            return;
        }
    }

    public static void fetchAndStoreInteractions(Context context)
    {
        Object obj = ApptentiveClient.getInteractions();
        if (obj != null && ((ApptentiveHttpResponse) (obj)).isSuccessful())
        {
            String s = ((ApptentiveHttpResponse) (obj)).getContent();
            Integer integer = Util.parseCacheControlHeader((String)((ApptentiveHttpResponse) (obj)).getHeaders().get("Cache-Control"));
            obj = integer;
            if (integer == null)
            {
                obj = Integer.valueOf(28800);
            }
            updateCacheExpiration(context, ((Integer) (obj)).intValue());
            storeInteractions(context, s);
        }
    }

    public static Interaction getApplicableInteraction(Context context, String s)
    {
label0:
        {
            Object obj = loadInteractions(context);
            if (obj == null)
            {
                break label0;
            }
            s = ((Interactions) (obj)).getInteractionList(s).iterator();
            do
            {
                if (!s.hasNext())
                {
                    break label0;
                }
                obj = (Interaction)s.next();
            } while (!((Interaction) (obj)).canRun(context));
            return ((Interaction) (obj));
        }
        return null;
    }

    private static boolean hasCacheExpired(Context context)
    {
        boolean flag = false;
        if (context.getSharedPreferences("APPTENTIVE", 0).getLong("interactionsCacheExpiration", 0L) < System.currentTimeMillis())
        {
            flag = true;
        }
        return flag;
    }

    public static Interactions loadInteractions(Context context)
    {
        context = loadInteractionsString(context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        context = new Interactions(context);
        return context;
        context;
        Log.w("Exception creating Interactions object.", context, new Object[0]);
        return null;
    }

    private static String loadInteractionsString(Context context)
    {
        return context.getSharedPreferences("APPTENTIVE", 0).getString("interactions", null);
    }

    public static void storeInteractions(Context context, String s)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("interactions", s).commit();
    }

    private static void updateCacheExpiration(Context context, long l)
    {
        long l1 = System.currentTimeMillis();
        context.getSharedPreferences("APPTENTIVE", 0).edit().putLong("interactionsCacheExpiration", l1 + 1000L * l).commit();
    }
}
