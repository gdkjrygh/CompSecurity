// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.util.Log;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mobileapptracker:
//            MATEventQueue

public class e
    implements Runnable
{

    final MATEventQueue a;
    private String b;
    private String c;
    private JSONObject d;
    private boolean e;

    public void run()
    {
        JSONObject jsonobject;
        MATEventQueue.a(a).acquire();
        jsonobject = new JSONObject();
        jsonobject.put("link", b);
        jsonobject.put("data", c);
        jsonobject.put("post_body", d);
        jsonobject.put("first_session", e);
        int i = a.a() + 1;
        a.a(i);
        String s = Integer.toString(i);
        a.a(jsonobject, s);
        MATEventQueue.a(a).release();
        return;
        Object obj;
        obj;
        Log.w("MobileAppTracker", "Failed creating event for queueing");
        ((JSONException) (obj)).printStackTrace();
        MATEventQueue.a(a).release();
        return;
        obj;
        Log.w("MobileAppTracker", "Interrupted adding event to queue");
        ((InterruptedException) (obj)).printStackTrace();
        MATEventQueue.a(a).release();
        return;
        obj;
        MATEventQueue.a(a).release();
        throw obj;
    }

    protected (MATEventQueue mateventqueue, String s, String s1, JSONObject jsonobject, boolean flag)
    {
        a = mateventqueue;
        super();
        b = null;
        c = null;
        d = null;
        e = false;
        b = s;
        c = s1;
        d = jsonobject;
        e = flag;
    }
}
