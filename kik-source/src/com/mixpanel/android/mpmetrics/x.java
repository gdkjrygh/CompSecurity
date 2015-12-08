// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            v

final class x extends BroadcastReceiver
{

    final v a;

    x(v v1)
    {
        a = v1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = new JSONObject();
        Bundle bundle = intent.getBundleExtra("event_args");
        if (bundle != null)
        {
            for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                try
                {
                    context.put(s, bundle.get(s));
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder("failed to add key \"")).append(s).append("\" to properties for tracking bolts event").toString(), jsonexception);
                }
            }

        }
        a.a((new StringBuilder("$")).append(intent.getStringExtra("event_name")).toString(), context);
    }
}
