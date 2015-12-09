// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.net.Uri;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.pandora.android.data.h;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;
import p.bx.b;
import p.bx.d;
import p.df.a;

// Referenced classes of package com.pandora.android.eureka:
//            b, c

public class f
{

    private p.by.f a;
    private String b;
    private com.pandora.android.eureka.b c;
    private c d;
    private com.google.android.gms.cast.Cast.CastApi e;

    public f(p.by.f f1, c c1)
    {
        c = new com.pandora.android.eureka.b();
        d = null;
        e = Cast.CastApi;
        a = f1;
        d = c1;
        a.a();
    }

    private static void c(String s)
    {
        p.df.a.c("PandoraMediaProtocolMessageStream", (new StringBuilder()).append("PANDCAST STREAM: ").append(s).toString());
    }

    public void a()
    {
        a("SKIP");
    }

    public void a(double d1)
    {
        if (a != null)
        {
            a.a(d1);
        }
    }

    public void a(String s)
    {
        a(s, "LOAD");
    }

    public void a(String s, y y1, aa aa1, p.cw.b.b b1, long l1, Hashtable hashtable)
    {
        c("Loading Station");
        if (y1 == null)
        {
            y1 = aa1.r();
        } else
        {
            y1 = y1.c();
        }
        try
        {
            b1 = m().a();
            b1.put("deviceId", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.e("PandoraMediaProtocolMessageStream", "Could not update station ", s);
            return;
        }
        if (hashtable == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        b1.put("deviceProperties", new JSONObject(hashtable));
        b1.put("facebookId", p.bx.d.a().b().h());
        b1.put("facebookName", p.bx.d.a().b().f());
        b1.put("platform", "android");
        if (aa1 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        s = aa1.v();
        hashtable = new JSONObject();
        hashtable.put("albumArtUrl", s);
        hashtable.put("albumName", aa1.u());
        hashtable.put("allowFeedback", aa1.B());
        hashtable.put("audioUrl", aa1.T());
        hashtable.put("songRating", aa1.E());
        hashtable.put("songName", aa1.s());
        hashtable.put("songDetailUrl", aa1.Q());
        hashtable.put("trackGain", aa1.F());
        hashtable.put("trackToken", aa1.w());
        hashtable.put("stationId", aa1.q());
        hashtable.put("songRating", aa1.E());
        hashtable.put("trackLength", aa1.G() / 1000);
        hashtable.put("elapsedTime", l1);
        hashtable.put("artistName", aa1.t());
        hashtable.put("artistExplorerUrl", aa1.I());
        b1.put("track", hashtable);
        s = new MediaMetadata(3);
        if (aa1 == null)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        s.putString("com.google.android.gms.cast.metadata.TITLE", aa1.s());
        s.putString("com.google.android.gms.cast.metadata.ARTIST", aa1.t());
        s.putString("com.google.android.gms.cast.metadata.ALBUM_TITLE", aa1.u());
        s.addImage(new WebImage(Uri.parse(aa1.v())));
        a.a(y1, b1, s, true);
        p.df.a.c("PandoraMediaProtocolMessageStream", (new StringBuilder()).append("Loaded media: ").append(y1).append(" with contentInfo: ").append(b1.toString()).toString());
        return;
    }

    public void a(String s, String s1)
    {
        try
        {
            JSONObject jsonobject = m().a();
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
            p.df.a.c("PandoraMediaProtocolMessageStream", "Exception while sending message", s);
        }
    }

    public void a(JSONObject jsonobject)
    {
        c("sending message");
        if (a != null && a.b())
        {
            a.a(jsonobject);
        }
    }

    public void b()
    {
        a.i();
    }

    public void b(String s)
    {
        b = s;
    }

    public void c()
    {
        a.j();
    }

    public void d()
    {
        a("THUMB_UP");
    }

    public void e()
    {
        a("SLEEP_TRACK");
    }

    public void f()
    {
        a("THUMB_DOWN");
    }

    public void g()
    {
        a("DELETE_FEEDBACK");
    }

    public void h()
    {
        a("REFRESH_STATION");
    }

    public int i()
    {
        if (l() == null)
        {
            return 0;
        }
        int i1;
        try
        {
            i1 = m().a(l()).getJSONObject("status").getInt("state");
        }
        catch (JSONException jsonexception)
        {
            p.df.a.c("PandoraMediaProtocolMessageStream", "Problem decoding status", jsonexception);
            return 0;
        }
        return i1;
    }

    public long j()
    {
        if (l() == null)
        {
            return 0L;
        }
        int i1;
        try
        {
            i1 = m().a(l()).getJSONObject("status").getInt("position");
        }
        catch (JSONException jsonexception)
        {
            p.df.a.c("PandoraMediaProtocolMessageStream", "Problem decoding status", jsonexception);
            return 0L;
        }
        return (long)i1;
    }

    public long k()
    {
        if (l() == null)
        {
            return 0L;
        }
        int i1;
        try
        {
            i1 = m().a(l()).getJSONObject("status").getInt("duration");
        }
        catch (JSONException jsonexception)
        {
            p.df.a.c("PandoraMediaProtocolMessageStream", "Problem decoding status", jsonexception);
            return 0L;
        }
        return (long)(i1 * 1000);
    }

    public String l()
    {
        return b;
    }

    public com.pandora.android.eureka.b m()
    {
        return c;
    }
}
