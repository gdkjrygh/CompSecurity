// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.video;

import android.app.Activity;
import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.f;
import com.kik.cards.web.plugin.j;
import com.kik.cards.web.userdata.a;
import com.kik.cards.web.userdata.e;
import com.kik.g.p;
import kik.android.b.s;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;
import kik.android.util.cq;
import org.c.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.video:
//            b, e

public class VideoPlayerPlugin extends d
{

    private final boolean a;
    private com.kik.cards.web.video.b b;
    private com.kik.cards.web.browser.BrowserPlugin.a d;
    private s e;
    private kik.a.e.d f;
    private e g;

    public VideoPlayerPlugin(Activity activity, com.kik.cards.web.browser.BrowserPlugin.a a1, com.kik.cards.web.video.b b1, s s, a a2, kik.a.e.d d1)
    {
        super("VideoPlayer");
        a = DeviceUtils.d(activity);
        b = b1;
        d = a1;
        b.a(this);
        e = s;
        f = d1;
        g = a2.a();
    }

    static kik.a.e.d a(VideoPlayerPlugin videoplayerplugin)
    {
        return videoplayerplugin.f;
    }

    static com.kik.cards.web.browser.BrowserPlugin.a b(VideoPlayerPlugin videoplayerplugin)
    {
        return videoplayerplugin.d;
    }

    static b c(VideoPlayerPlugin videoplayerplugin)
    {
        return videoplayerplugin.c;
    }

    private boolean k()
    {
        while (cq.c(b.e()) || d.e() && !d.f()) 
        {
            return true;
        }
        return false;
    }

    public final void a(JSONObject jsonobject)
    {
        a(new f("error", jsonobject));
    }

    public final void c()
    {
        a(new f("playing"));
    }

    public j closeVideo(JSONObject jsonobject)
    {
        if (k())
        {
            return new j(405);
        } else
        {
            b.i();
            return new j(200);
        }
    }

    public final void d()
    {
        a(new f("paused"));
    }

    public final void f_()
    {
        b.j();
        super.f_();
    }

    public j getCompletion(com.kik.cards.web.plugin.a a1, JSONObject jsonobject, String s)
    {
        if (k())
        {
            return new j(405);
        }
        if (e == null || !bf.a(s) && !d.h())
        {
            return new j(426);
        }
        JSONObject jsonobject1 = b.w();
        String s1 = jsonobject1.get("completion").toString();
        boolean flag = jsonobject.optBoolean("skipPrompt");
        if (g.a(flag, s))
        {
            return new j(420);
        } else
        {
            g.a(true, flag, s).a(new com.kik.cards.web.video.e(this, a1, s, jsonobject1, s1));
            return new j(202);
        }
    }

    public j getPosition(JSONObject jsonobject)
    {
        if (k())
        {
            return new j(405);
        }
        float f1 = b.n() / 1000;
        float f2 = b.o() / 1000;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("position", f1);
            jsonobject.put("total", f2);
        }
        catch (JSONException jsonexception) { }
        return new j(200, jsonobject);
    }

    public j getVideoUrl(JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        if (d.e() && !d.f())
        {
            return new j(405);
        }
        try
        {
            jsonobject = b.e();
            jsonobject1 = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            bx.a(jsonobject);
            return new j(500);
        }
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        jsonobject1.put("url", JSONObject.NULL);
_L1:
        jsonobject = new j(200, jsonobject1);
        return jsonobject;
        jsonobject1.put("url", jsonobject);
          goto _L1
    }

    public j isClosed(JSONObject jsonobject)
    {
        try
        {
            if (d.e() && !d.f())
            {
                return new j(405);
            }
            jsonobject = new JSONObject();
            jsonobject.put("closed", b.m());
            jsonobject = new j(200, jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            bx.a(jsonobject);
            return new j(500);
        }
        return jsonobject;
    }

    public j isPaused(JSONObject jsonobject)
    {
        try
        {
            if (k())
            {
                return new j(405);
            }
            jsonobject = new JSONObject();
            jsonobject.put("paused", b.q());
            jsonobject = new j(200, jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            bx.a(jsonobject);
            return new j(500);
        }
        return jsonobject;
    }

    public j isPlaying(JSONObject jsonobject)
    {
        if (d.e() && !d.f())
        {
            return new j(405);
        }
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("playing", b.h());
            jsonobject = new j(200, jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            bx.a(jsonobject);
            return new j(500);
        }
        return jsonobject;
    }

    public final void j()
    {
        a(new f("closed"));
    }

    public j pauseVideo(JSONObject jsonobject)
    {
        if (k())
        {
            return new j(405);
        } else
        {
            b.p();
            return new j(200);
        }
    }

    public j playVideo(JSONObject jsonobject)
    {
        if (k())
        {
            return new j(405);
        } else
        {
            b.f();
            return new j(200);
        }
    }

    public j setPosition(JSONObject jsonobject)
    {
        if (k())
        {
            return new j(405);
        }
        if (jsonobject.isNull("position"))
        {
            return new j(400);
        }
        int i;
        try
        {
            i = jsonobject.getInt("position");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new j(400);
        }
        if (i <= 0)
        {
            i = 0;
        }
        b.a(i * 1000);
        jsonobject = new j(200);
        return jsonobject;
    }

    public j setVideoUrl(JSONObject jsonobject)
    {
        if (d.e() && !d.f())
        {
            return new j(405);
        }
        if (jsonobject.isNull("url"))
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.optString("url", "");
        }
        b.a(jsonobject);
        return new j(200);
    }
}
