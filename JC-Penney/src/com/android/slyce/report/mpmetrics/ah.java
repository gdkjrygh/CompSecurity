// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            af

final class ah extends BroadcastReceiver
{

    final af a;

    ah(af af1)
    {
        a = af1;
        super();
    }

    public void onReceive(Context context, Intent intent)
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
                    Log.e("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("failed to add key \"").append(s).append("\" to properties for tracking bolts event").toString(), jsonexception);
                }
            }

        }
        a.a((new StringBuilder()).append("$").append(intent.getStringExtra("event_name")).toString(), context);
    }
}
