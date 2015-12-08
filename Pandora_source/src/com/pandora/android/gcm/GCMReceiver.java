// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.gcm;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.pandora.android.inbox.InboxNotification;
import com.pandora.android.inbox.InboxNotificationProcessor;
import com.pandora.android.provider.b;
import com.pandora.android.push.PushNotification;
import com.pandora.android.push.PushNotificationProcessor;
import com.pandora.android.push.a;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p.cw.c;

public class GCMReceiver extends WakefulBroadcastReceiver
{

    public GCMReceiver()
    {
    }

    private long[] a(JSONArray jsonarray)
        throws JSONException
    {
        long al[] = new long[jsonarray.length()];
        for (int i = 0; i < jsonarray.length(); i++)
        {
            al[i] = jsonarray.getLong(i);
        }

        return al;
    }

    GoogleCloudMessaging a(Context context)
    {
        return GoogleCloudMessaging.getInstance(context);
    }

    void a()
    {
        setResultCode(-1);
    }

    void a(Context context, PushNotification pushnotification)
    {
        a(context, PushNotificationProcessor.a(context, pushnotification));
    }

    transient void a(Context context, long al[])
    {
        InboxNotificationProcessor.a(context, al);
    }

    transient void a(Context context, InboxNotification ainboxnotification[])
    {
        InboxNotificationProcessor.a(context, ainboxnotification);
    }

    void b(Context context, Intent intent)
    {
        com.pandora.android.push.PushNotification.a a1;
        IllegalArgumentException illegalargumentexception;
        boolean flag;
        try
        {
            a1 = new com.pandora.android.push.PushNotification.a(intent.getStringExtra("id"));
            a1.a(intent.getStringExtra("notification_key")).b(intent.getStringExtra("title")).c(intent.getStringExtra("textLegacy")).e(intent.getStringExtra("textCollapsed")).d(intent.getStringExtra("textExpanded")).f(intent.getStringExtra("subText"));
            if (intent.hasExtra("icon"))
            {
                a1.g(intent.getStringExtra("icon"));
            }
            if (intent.hasExtra("action"))
            {
                a1.h(intent.getStringExtra("action"));
            }
            flag = intent.hasExtra("category");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.pandora.android.push.a.a().a(intent.getStringExtra("id"), p.cx.x.a.d, p.cx.x.b.a);
            throw context;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        a1.a(com.pandora.android.push.PushNotification.b.valueOf(intent.getStringExtra("category")));
_L1:
        a(context, a1.a());
        return;
        illegalargumentexception;
        a1.a(com.pandora.android.push.PushNotification.b.d);
          goto _L1
    }

    transient void b(Context context, long al[])
    {
        InboxNotificationProcessor.c(context, al);
    }

    void c(Context context, Intent intent)
    {
        if (!intent.hasExtra("messageList"))
        {
            p.df.a.b("GCMReceiver", "Unable to find inbox extras");
            com.pandora.android.push.a.a().a(intent.getStringExtra("id"), p.cx.x.a.m, p.cx.x.b.a);
            return;
        }
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = new JSONArray(intent.getStringExtra("messageList"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.b("GCMReceiver", "Unable to parse inbox extras", context);
            com.pandora.android.push.a.a().a(intent.getStringExtra("id"), p.cx.x.a.m, p.cx.x.b.a);
            return;
        }
        intent = new ArrayList();
        i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                intent.add(InboxNotification.a(jsonarray.getJSONObject(i), true));
            }
            catch (JSONException jsonexception)
            {
                p.df.a.e("GCMReceiver", "Unable to parse inbox message", jsonexception);
            }
            i++;
        }
        a(context, (InboxNotification[])intent.toArray(new InboxNotification[intent.size()]));
    }

    void d(Context context, Intent intent)
    {
        if (intent.hasExtra("seen_ids"))
        {
            try
            {
                a(context, a(new JSONArray(intent.getStringExtra("seen_ids"))));
            }
            catch (JSONException jsonexception)
            {
                p.df.a.e("GCMReceiver", "Unable to parse inbox status update", jsonexception);
            }
        }
        if (!intent.hasExtra("deleted_ids"))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        b(context, a(new JSONArray(intent.getStringExtra("deleted_ids"))));
        return;
        context;
        p.df.a.e("GCMReceiver", "Unable to parse inbox status update", context);
        return;
    }

    void e(Context context, Intent intent)
    {
        PushNotificationProcessor.a(context, intent.getStringExtra("id"));
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"gcm".equals(a(context).getMessageType(intent))) goto _L2; else goto _L1
_L1:
        String s1;
        Object obj;
        String s2;
        s1 = intent.getStringExtra("lid");
        obj = b.a.b().k().s();
        if (!s.a(s1) && !s1.equals(obj))
        {
            p.df.a.e("GCMReceiver", "Push notification not intended for the current listener.");
            a();
            return;
        }
        s1 = intent.getStringExtra("type");
        obj = com.pandora.android.push.a.a();
        s2 = intent.getStringExtra("id");
        if (!"push_notification".equals(s1)) goto _L4; else goto _L3
_L3:
        ((a) (obj)).a(s2, p.cx.x.a.j, p.cx.x.b.a);
        b(context, intent);
        if (intent.hasExtra("messageList"))
        {
            c(context, intent);
        }
_L2:
        a();
        return;
_L4:
        if ("push_dismissed".equals(s1))
        {
            e(context, intent);
        } else
        if ("inbox".equals(s1))
        {
            ((a) (obj)).a(s2, p.cx.x.a.j, p.cx.x.b.b);
            c(context, intent);
        } else
        if ("status_update".equals(s1))
        {
            d(context, intent);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
