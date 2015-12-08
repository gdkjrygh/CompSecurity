// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.kik;

import android.net.Uri;
import com.kik.cards.web.av;
import com.kik.cards.web.bf;
import com.kik.cards.web.picker.PickerPlugin;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.f;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kik.a.e.r;
import kik.android.util.DeviceUtils;
import org.c.b;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.kik:
//            b, KikMessageParcelable, f, h, 
//            d, e

public class KikPlugin extends d
{

    private static final b a = c.a("CardsWebKik");
    private final av b;
    private h d;
    private volatile boolean e;
    private KikMessageParcelable f;
    private com.kik.cards.web.browser.BrowserPlugin.a g;
    private PickerPlugin h;
    private final com.kik.android.c.f i;
    private final boolean j = DeviceUtils.c();
    private final r k;
    private final String l;

    public KikPlugin(av av1, com.kik.cards.web.kik.b b1, com.kik.cards.web.browser.BrowserPlugin.a a1, PickerPlugin pickerplugin, com.kik.android.c.f f1, String s, r r1)
    {
        super("Kik");
        d = null;
        e = false;
        d = b1.a(r1);
        g = a1;
        h = pickerplugin;
        i = f1;
        l = s;
        b = av1;
        k = r1;
    }

    static h a(KikPlugin kikplugin)
    {
        return kikplugin.d;
    }

    private j a(JSONObject jsonobject, a a1, String s)
    {
        j j1 = new j();
        if (a1 != null)
        {
            j1 = new j(202);
        }
        if (g.e())
        {
            return new j(405);
        }
        if (e)
        {
            a.a("Trying to send while another send is pending, ignoring");
            return new j(429);
        }
        e = true;
        String s3 = jsonobject.optString("title", "");
        String s5 = jsonobject.optString("text", "");
        String s6 = jsonobject.optString("image", "");
        String s1 = jsonobject.optString("pngImage", "");
        String s7 = jsonobject.optString("targetUser", null);
        String s8 = jsonobject.optString("layout");
        String s9 = jsonobject.optString("attribution");
        Object obj1 = null;
        boolean flag1 = jsonobject.optBoolean("returnToSender", false);
        boolean flag = jsonobject.optBoolean("forwardable", true);
        String s10 = jsonobject.optString("fallbackUrl", null);
        String s11 = jsonobject.optString("videoUrl");
        boolean flag2 = jsonobject.optBoolean("videoShouldAutoplay");
        boolean flag3 = jsonobject.optBoolean("videoShouldBeMuted");
        boolean flag4 = jsonobject.optBoolean("videoShouldLoop");
        boolean flag5 = jsonobject.optBoolean("disallowSave");
        Object obj = s1;
        if (s1 != null)
        {
            obj = s1;
            if (!bf.a(Uri.parse(s).getHost(), new String[] {
    "crusher.herokuapp.com", "stickers.kik.com", "cards-sticker-dev.herokuapp.com"
}))
            {
                obj = null;
            }
        }
        if (s3.length() == 0 && s6.length() == 0)
        {
            e = false;
            return new j(400);
        }
        if (obj != null && ((String) (obj)).length() != 0)
        {
            flag = false;
        }
        if (s3.length() == 0 && s5.length() != 0)
        {
            e = false;
            return new j(400);
        }
        if (h.c() != null && h.c().equals("conversations"))
        {
            e = false;
            g.a(jsonobject);
            return j1;
        }
        s1 = obj1;
        if (flag1)
        {
            s1 = obj1;
            if (f != null)
            {
                s1 = f.f;
            }
        }
        if (s1 != null && s7 != null)
        {
            return new j(400);
        }
        obj = new KikMessageParcelable(s3, s5, s6, null, s1, s7, s8, null, s, null, String.valueOf(flag), s10, ((String) (obj)), s9, s11, String.valueOf(flag2), String.valueOf(flag3), String.valueOf(flag4), String.valueOf(flag5));
        jsonobject = jsonobject.optJSONObject("extras");
        long l1;
        if (jsonobject != null)
        {
            Iterator iterator = jsonobject.keys();
            long l2 = 0L;
            do
            {
                l1 = l2;
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                String s4 = jsonobject.getString(s2);
                l2 = l2 + (long)s2.length() + (long)s4.length();
                l1 = l2;
                if (l2 > 10240L)
                {
                    break;
                }
                ((KikMessageParcelable) (obj)).t.put(s2, s4);
            } while (true);
        } else
        {
            l1 = 0L;
        }
        if (l1 > 10240L)
        {
            e = false;
            return new j(400);
        }
        if (d == null)
        {
            e = false;
            a.b("No sender set. Dropping!");
            return j1;
        } else
        {
            b.a().a(new com.kik.cards.web.kik.f(this, ((KikMessageParcelable) (obj)), s, a1));
            return j1;
        }
    }

    private static JSONObject b(KikMessageParcelable kikmessageparcelable)
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1;
        jsonobject.put("title", kikmessageparcelable.a);
        jsonobject.put("text", kikmessageparcelable.b);
        jsonobject.put("image", kikmessageparcelable.c);
        jsonobject.put("pngImage", kikmessageparcelable.d);
        jsonobject1 = new JSONObject();
        java.util.Map.Entry entry;
        for (kikmessageparcelable = kikmessageparcelable.t.entrySet().iterator(); kikmessageparcelable.hasNext(); jsonobject1.put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)kikmessageparcelable.next();
        }

          goto _L1
        kikmessageparcelable;
_L3:
        kikmessageparcelable.printStackTrace();
        return jsonobject;
_L1:
        jsonobject.put("extras", jsonobject1);
        return jsonobject;
        kikmessageparcelable;
        jsonobject = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    static boolean b(KikPlugin kikplugin)
    {
        kikplugin.e = false;
        return false;
    }

    public final void a(KikMessageParcelable kikmessageparcelable)
    {
        if (kikmessageparcelable == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        f = kikmessageparcelable;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        a(new f("message", b(kikmessageparcelable)));
        return;
        kikmessageparcelable;
        a.b((new StringBuilder("Error firing new message event: ")).append(kikmessageparcelable).toString());
        return;
    }

    public j getLastMessage(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject = ((JSONObject) (JSONObject.NULL));
        if (f != null)
        {
            jsonobject = b(f);
        }
        jsonobject1.put("message", jsonobject);
        return new j(jsonobject1);
    }

    public j openConversation(JSONObject jsonobject)
    {
        if (g.e())
        {
            return new j(405);
        }
        boolean flag = jsonobject.optBoolean("returnToSender", false);
        Object obj = null;
        jsonobject = obj;
        if (flag)
        {
            jsonobject = obj;
            if (f != null)
            {
                jsonobject = f.f;
            }
        }
        d.a(jsonobject);
        return new j();
    }

    public j openConversationWithUser(a a1, JSONObject jsonobject)
    {
        if (g.e())
        {
            return new j(405);
        } else
        {
            String s = jsonobject.optString("username", null);
            jsonobject = jsonobject.optString("campaignId", null);
            k.d(s).a(new com.kik.cards.web.kik.d(this, jsonobject, a1));
            return new j(202);
        }
    }

    public j sendKik(JSONObject jsonobject, String s)
    {
        jsonobject.remove("targetUser");
        return a(jsonobject, null, s);
    }

    public j sendKikToUser(JSONObject jsonobject, String s)
    {
        return a(jsonobject, null, s);
    }

    public j sendKikWithCallback(a a1, JSONObject jsonobject, String s)
    {
        jsonobject.remove("targetUser");
        return a(jsonobject, a1, s);
    }

    public j sendSmiley(JSONObject jsonobject, String s)
    {
        jsonobject.remove("targetUser");
        return sendSmileyToUser(jsonobject, s);
    }

    public j sendSmileyToUser(JSONObject jsonobject, String s)
    {
        if (g.e())
        {
            return new j(405);
        }
        if (e)
        {
            a.a("Trying to send while another send is pending, ignoring");
            return new j(429);
        }
        if (s == null)
        {
            s = null;
        } else
        {
            s = Uri.parse(s);
        }
        if (!j && (s == null || !bf.a(s.getHost(), new String[] {
    "my.kik.com"
})))
        {
            return new j(401);
        }
        e = true;
        s = com.kik.android.c.f.c(jsonobject);
        if (h.c() != null && h.c().equals("conversations") && l != null)
        {
            e = false;
            d.b(s, l);
            return new j(202);
        } else
        {
            jsonobject = jsonobject.optString("targetUser", null);
            d.a(s, jsonobject).a(new e(this));
            return new j(202);
        }
    }

}
