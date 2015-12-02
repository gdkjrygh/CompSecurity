// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.fbpushdata;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.facebook.analytics.cn;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.push.g;
import com.facebook.push.h;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.push.fbpushdata:
//            a

public class FbPushDataHandlerService extends IntentService
{

    private static final Class a = com/facebook/push/fbpushdata/FbPushDataHandlerService;
    private Set b;
    private ObjectMapper c;
    private cn d;

    public FbPushDataHandlerService()
    {
        super("FbPushDataHandlerService");
    }

    public static void a(Context context, String s, g g1)
    {
        Intent intent = new Intent(context.getApplicationContext(), com/facebook/push/fbpushdata/FbPushDataHandlerService);
        intent.putExtra("message_content", s);
        intent.putExtra("push_source", g1.name());
        context.startService(intent);
    }

    public void onCreate()
    {
        super.onCreate();
        t t1 = t.a(this);
        b = t1.c(com/facebook/push/fbpushdata/a);
        c = (ObjectMapper)t1.a(com/fasterxml/jackson/databind/ObjectMapper);
        d = (cn)t1.a(com/facebook/analytics/cn);
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = intent.getStringExtra("message_content");
        intent = g.valueOf(intent.getStringExtra("push_source"));
        com.facebook.debug.log.b.b(a, "Received FbPushData msg from %s", new Object[] {
            intent
        });
        try
        {
            obj = c.readTree(((String) (obj)));
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(((com.fasterxml.jackson.databind.JsonNode) (obj)), intent)) { }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            d.a("", "", h.C2DM.toString(), "invalid_json");
            com.facebook.debug.log.b.b(a, "Invalid JSON", intent);
        }
    }

}
