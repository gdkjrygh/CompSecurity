// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.util.Log;
import com.android.slyce.report.a.a.a;
import com.android.slyce.report.a.b.f;
import com.android.slyce.report.a.e.h;
import com.android.slyce.report.mpmetrics.ab;
import java.net.Socket;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.c:
//            m, o

class p extends a
{

    final m c;

    public p(m m1, URI uri, int i, Socket socket)
    {
        c = m1;
        super(uri, new f(), null, i);
        a(socket);
    }

    public void a(h h)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.EditorConnection", "Websocket connected");
        }
    }

    public void a(Exception exception)
    {
        if (exception != null && exception.getMessage() != null)
        {
            Log.e("MixpanelAPI.EditorConnection", (new StringBuilder()).append("Websocket Error: ").append(exception.getMessage()).toString());
            return;
        } else
        {
            Log.e("MixpanelAPI.EditorConnection", "Unknown websocket error occurred");
            return;
        }
    }

    public void a(String s)
    {
        Object obj;
        String s1;
        if (ab.a)
        {
            Log.v("MixpanelAPI.EditorConnection", (new StringBuilder()).append("Received message from editor:\n").append(s).toString());
        }
        try
        {
            obj = new JSONObject(s);
            s1 = ((JSONObject) (obj)).getString("type");
            if (s1.equals("device_info_request"))
            {
                com.android.slyce.report.c.m.a(c).a();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.EditorConnection", (new StringBuilder()).append("Bad JSON received:").append(s).toString(), ((Throwable) (obj)));
            return;
        }
        if (s1.equals("snapshot_request"))
        {
            com.android.slyce.report.c.m.a(c).a(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("change_request"))
        {
            com.android.slyce.report.c.m.a(c).b(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("event_binding_request"))
        {
            com.android.slyce.report.c.m.a(c).c(((JSONObject) (obj)));
        }
        return;
    }

    public void b(int i, String s, boolean flag)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.EditorConnection", (new StringBuilder()).append("WebSocket closed. Code: ").append(i).append(", reason: ").append(s).append("\nURI: ").append(m.b(c)).toString());
        }
        com.android.slyce.report.c.m.a(c).b();
    }
}
