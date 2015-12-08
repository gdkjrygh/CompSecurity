// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ex, ea

public class e
{

    public ex a;
    public int b;
    public ea c;
    public long d;
    public long e;
    public int f;
    final ex g;

    public JSONObject a()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("event_id", c.c());
        jsonobject.put("event_start_time", d);
        jsonobject.put("event_end_time", d + e);
        if (c.q() != null)
        {
            jsonobject.put("event parameters", c.q());
        }
        if (f > 0)
        {
            jsonobject.put("view", f);
        }
        return jsonobject;
    }

    public (ex ex1, ex ex2)
    {
        g = ex1;
        super();
        a = ex2;
        b = 0;
        c = null;
        d = 0L;
        e = 0L;
    }
}
