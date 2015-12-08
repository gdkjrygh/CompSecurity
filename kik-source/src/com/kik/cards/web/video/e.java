// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.video;

import com.kik.cards.util.UserDataParcelable;
import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import java.util.HashMap;
import kik.a.e.d;
import kik.android.util.bx;
import org.c.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.video:
//            VideoPlayerPlugin

final class e extends r
{

    final a a;
    final String b;
    final JSONObject c;
    final String d;
    final VideoPlayerPlugin e;

    e(VideoPlayerPlugin videoplayerplugin, a a1, String s, JSONObject jsonobject, String s1)
    {
        e = videoplayerplugin;
        a = a1;
        b = s;
        c = jsonobject;
        d = s1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj = (UserDataParcelable)obj;
        obj1 = com.kik.cards.web.video.VideoPlayerPlugin.a(e).c();
        java.net.URL url = com.kik.cards.web.video.VideoPlayerPlugin.a(e).b();
        if (obj1 == null || url == null)
        {
            a.a(new j(500));
            return;
        }
        obj1 = new HashMap();
        ((HashMap) (obj1)).put("kikUsr", ((UserDataParcelable) (obj)).a);
        ((HashMap) (obj1)).put("kikCrdDm", bf.j(b));
        if (!bf.a(b) && com.kik.cards.web.video.VideoPlayerPlugin.b(e).h())
        {
            ((HashMap) (obj1)).put("kikDbg", Boolean.valueOf(true));
        }
        ((HashMap) (obj1)).put("kikExt", "videoPlayer");
        obj = "";
        if (!c.isNull("completion"))
        {
            try
            {
                obj = com.kik.cards.web.video.VideoPlayerPlugin.a(e).a(((java.util.Map) (obj1)), d);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                VideoPlayerPlugin.c(e).b("Failed to sign", ((Throwable) (obj)));
                com.a.a.a.a("GenerateSignedRequestException", ((Exception) (obj)).getLocalizedMessage());
                a.a(new j(500));
                return;
            }
        }
        obj1 = new JSONObject();
        if (!c.isNull("completion")) goto _L2; else goto _L1
_L1:
        ((JSONObject) (obj1)).put("completion", JSONObject.NULL);
        ((JSONObject) (obj1)).put("signedRequest", JSONObject.NULL);
_L4:
        a.a(new j(((JSONObject) (obj1))));
        return;
_L2:
        try
        {
            ((JSONObject) (obj1)).put("completion", c.get("completion"));
            ((JSONObject) (obj1)).put("signedRequest", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bx.a(((Throwable) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Throwable throwable)
    {
        a.a(new j(500));
    }
}
