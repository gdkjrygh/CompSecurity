// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import java.net.URI;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.dy.a;
import p.dz.c;
import p.ec.h;

// Referenced classes of package p.by:
//            a, g, h, e

public class .Map extends a
{

    final p.by.a a;

    private void j()
    {
        c("CASTCHAT/1.0\nContent-Length: 0\nNamespace: castchat.org:control\nType: Hello\nUser-Agent: Castchat Tester/1.0\n\n");
    }

    public void a(int i, String s, boolean flag)
    {
        p.by.a.b(a).b(new g(p.by.a.d(a)));
    }

    public void a(Exception exception)
    {
        p.df.a.c("CastChatSecondScreenConnection", "Error with CastChat websocket, closing.", exception);
        f();
        if (!a.c)
        {
            p.by.a.b(a).b(new g(p.by.a.d(a)));
        }
    }

    protected void a(String s)
    {
        int i = s.getBytes().length;
        String s1 = (new StringBuilder()).append("CASTCHAT/1.0\nContent-Length: ").append(i).append("\n").append("Namespace: urn:x-cast:com.google.cast.media\n\n").toString();
        try
        {
            c((new StringBuilder()).append(s1).append(s).append("\n\n").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.c("CastChatSecondScreenConnection", "Failed to send message via websocket", s);
        }
    }

    public void a(h h1)
    {
        a.b.a((new Date()).getTime());
        a.b.a(false);
        j();
        p.by.a.b(a).a(new g(p.by.a.a(a)));
    }

    public void b(String s)
    {
        int i = s.indexOf("\n\n", 0) + 2;
        s = s.substring(i, s.indexOf("\n\n", i));
        try
        {
            s = (new JSONObject(s)).getJSONArray("status").getJSONObject(0);
            if (s.has("media"))
            {
                s = s.getJSONObject("media").getJSONObject("customData");
                p.by.a.c(a).a(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.c("CastChatSecondScreenConnection", "Failed to parse JSON.", s);
        }
    }

    public .Map(p.by.a a1, URI uri)
    {
        a = a1;
        super(uri, new c(), null, 5000);
    }
}
