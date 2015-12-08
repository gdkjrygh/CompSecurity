// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            AnalyticsMessages

public class MixpanelAPI
{

    private static MixpanelAPI a;
    private static final Object b = new Object();
    private final Context c;
    private final AnalyticsMessages d = b();
    private String e;

    MixpanelAPI(Context context, String s)
    {
        c = context;
        a(s);
    }

    public static MixpanelAPI a(Context context, String s)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = new MixpanelAPI(context.getApplicationContext(), s);
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a()
    {
        d.a();
    }

    public void a(String s)
    {
        e = s;
        d.a(e);
    }

    public void a(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        Iterator iterator;
        String s1;
        try
        {
            jsonobject1 = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI", (new StringBuilder()).append("Exception tracking event ").append(s).toString(), jsonobject);
            return;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        for (iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s1, jsonobject.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        d.a(jsonobject1);
        return;
    }

    AnalyticsMessages b()
    {
        return AnalyticsMessages.a(c);
    }

}
