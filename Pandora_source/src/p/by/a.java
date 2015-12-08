// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import android.os.Bundle;
import com.google.android.gms.cast.MediaMetadata;
import com.pandora.android.provider.b;
import java.net.URI;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.ec.h;

// Referenced classes of package p.by:
//            f, e, h, g

public class p.by.a
    implements f
{
    public class a extends p.dy.a
    {

        final p.by.a a;

        private void j()
        {
            c("CASTCHAT/1.0\nContent-Length: 0\nNamespace: castchat.org:control\nType: Hello\nUser-Agent: Castchat Tester/1.0\n\n");
        }

        public void a(int k, String s, boolean flag)
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
            int k = s.getBytes().length;
            String s1 = (new StringBuilder()).append("CASTCHAT/1.0\nContent-Length: ").append(k).append("\n").append("Namespace: urn:x-cast:com.google.cast.media\n\n").toString();
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
            int k = s.indexOf("\n\n", 0) + 2;
            s = s.substring(k, s.indexOf("\n\n", k));
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

        public a(URI uri)
        {
            a = p.by.a.this;
            super(uri, new p.dz.c(), null, 5000);
        }
    }


    protected a a;
    protected e b;
    protected boolean c;
    boolean d;
    private f.a e;
    private f.b f;
    private p.by.h g;
    private String h;
    private boolean i;
    private boolean j;

    public p.by.a(p.by.h h1, URI uri)
    {
        a = null;
        h = "Beep";
        i = false;
        j = false;
        b = null;
        c = false;
        d = false;
        g = h1;
        a = new a(uri);
        b = new e(b.a.b().k());
    }

    static boolean a(p.by.a a1)
    {
        return a1.i;
    }

    static p.by.h b(p.by.a a1)
    {
        return a1.g;
    }

    static f.a c(p.by.a a1)
    {
        return a1.e;
    }

    static boolean d(p.by.a a1)
    {
        return a1.j;
    }

    public void a()
    {
        if (a != null && !d)
        {
            d = true;
            a.e();
        }
    }

    public void a(double d1)
    {
        a((new StringBuilder()).append("").append(d1).toString(), "VOLUME");
    }

    public void a(String s, String s1)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("type", s1);
            if (!s.isEmpty())
            {
                jsonobject.put("src", s);
            }
            a(jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.c("CastChatSecondScreenConnection", "Exception while sending message", s);
        }
    }

    public void a(String s, String s1, Bundle bundle)
    {
        h = s;
        b.a(s, s1);
        b.b(s1);
    }

    public void a(String s, JSONObject jsonobject, MediaMetadata mediametadata, boolean flag)
    {
        try
        {
            mediametadata = new JSONObject();
            JSONObject jsonobject1 = new JSONObject();
            mediametadata.put("type", "LOAD");
            mediametadata.put("src", s);
            mediametadata.put("content_info", jsonobject);
            jsonobject1.put("customData", jsonobject);
            jsonobject1.put("contentId", s);
            mediametadata.put("media", jsonobject1);
            a(((JSONObject) (mediametadata)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void a(JSONObject jsonobject)
    {
        a.a(jsonobject.toString());
    }

    public void a(f.a a1)
    {
        e = a1;
    }

    public void a(f.b b1)
    {
        f = b1;
    }

    public void a(boolean flag)
    {
        if (b != null)
        {
            b.b();
        }
        if (flag)
        {
            b.a(0L);
            b.a(false);
        }
    }

    public boolean b()
    {
        return a.g().c();
    }

    public boolean c()
    {
        return a.g().b();
    }

    public void d()
    {
        c = true;
        a("", "DISCONNECT");
        a.f();
    }

    public void e()
    {
        a.f();
    }

    public e f()
    {
        return b;
    }

    public String g()
    {
        return h;
    }

    public boolean h()
    {
        return a.g().d();
    }

    public void i()
    {
        a("", "PLAY");
    }

    public void j()
    {
        a("", "STOP");
    }
}
