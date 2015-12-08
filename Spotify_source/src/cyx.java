// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.mixpanel.android.viewcrawler.EditorConnection;
import java.net.Socket;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

public final class cyx extends cwb
{

    private EditorConnection e;

    public cyx(EditorConnection editorconnection, URI uri, Socket socket)
    {
        e = editorconnection;
        super(uri, new cwd());
        if (super.b != null)
        {
            throw new IllegalStateException("socket has already been set");
        } else
        {
            super.b = socket;
            return;
        }
    }

    public final void b(int i, String s)
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.EditorCnctn", (new StringBuilder("WebSocket closed. Code: ")).append(i).append(", reason: ").append(s).append("\nURI: ").append(EditorConnection.b(e)).toString());
        }
        EditorConnection.a(e).b();
    }

    public final void b(Exception exception)
    {
        if (exception != null && exception.getMessage() != null)
        {
            Log.e("MixpanelAPI.EditorCnctn", (new StringBuilder("Websocket Error: ")).append(exception.getMessage()).toString());
            return;
        } else
        {
            Log.e("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
            return;
        }
    }

    public final void b(String s)
    {
        Object obj;
        String s1;
        if (cxi.a)
        {
            Log.v("MixpanelAPI.EditorCnctn", (new StringBuilder("Received message from editor:\n")).append(s).toString());
        }
        try
        {
            obj = new JSONObject(s);
            s1 = ((JSONObject) (obj)).getString("type");
            if (s1.equals("device_info_request"))
            {
                EditorConnection.a(e).a();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.EditorCnctn", (new StringBuilder("Bad JSON received:")).append(s).toString(), ((Throwable) (obj)));
            return;
        }
        if (s1.equals("snapshot_request"))
        {
            EditorConnection.a(e).a(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("change_request"))
        {
            EditorConnection.a(e).b(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("event_binding_request"))
        {
            EditorConnection.a(e).d(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("clear_request"))
        {
            EditorConnection.a(e).c(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("tweak_request"))
        {
            EditorConnection.a(e).e(((JSONObject) (obj)));
        }
        return;
    }

    public final void e()
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.EditorCnctn", "Websocket connected");
        }
    }
}
