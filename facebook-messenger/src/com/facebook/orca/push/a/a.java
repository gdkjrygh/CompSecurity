// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.a;

import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.analytics.cn;
import com.facebook.auth.login.bm;
import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.config.a.d;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.c;
import com.facebook.l.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.o;
import com.facebook.orca.fbwebrtc.ag;
import com.facebook.orca.notify.bi;
import com.facebook.orca.notify.w;
import com.facebook.orca.push.h;
import com.facebook.orca.push.i;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.m;
import com.facebook.push.c2dm.y;
import com.facebook.push.g;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.push.a:
//            b

public class a
    implements com.facebook.push.fbpushdata.a
{

    private static Class a = com/facebook/orca/push/a/a;
    private final com.facebook.auth.b.b b;
    private final Resources c;
    private final com.facebook.orca.push.b d;
    private final com.facebook.orca.push.a.b e;
    private final k f;
    private final cn g;
    private final y h;
    private final h i;
    private final bm j;
    private final d k;
    private final ag l;
    private final ObjectMapper m;
    private final javax.inject.a n;

    public a(com.facebook.auth.b.b b1, Resources resources, com.facebook.orca.push.b b2, com.facebook.orca.push.a.b b3, k k1, cn cn1, y y1, 
            h h1, bm bm1, ObjectMapper objectmapper, d d1, ag ag1, javax.inject.a a1)
    {
        b = b1;
        c = resources;
        d = b2;
        e = b3;
        f = k1;
        g = cn1;
        h = y1;
        i = h1;
        j = bm1;
        m = objectmapper;
        k = d1;
        l = ag1;
        n = a1;
    }

    private void a(JsonNode jsonnode)
    {
        jsonnode = com.facebook.common.w.e.a(jsonnode.get("thread_timestamps"), null);
        if (jsonnode == null)
        {
            return;
        }
        Object obj;
        obj = m.readTree(jsonnode);
        jsonnode = ev.k();
        obj = ((JsonNode) (obj)).fields();
_L1:
        String s;
        long l1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        s = com.facebook.orca.threads.m.a((String)entry.getKey());
        l1 = com.facebook.common.w.e.a((JsonNode)entry.getValue(), -1L);
        if (s != null && l1 > 0L)
        {
            try
            {
                jsonnode.b(s, Long.valueOf(l1));
            }
            // Misplaced declaration of an exception variable
            catch (JsonNode jsonnode)
            {
                com.facebook.debug.log.b.d(a, "Failed to parse thread_counts");
                return;
            }
        }
          goto _L1
        jsonnode = new bi(jsonnode.b());
        d.a(jsonnode);
        return;
    }

    private void a(String s, g g1)
    {
        if (com.facebook.common.w.n.a(s))
        {
            b("invalid_payload");
            return;
        }
        if (k != d.MESSENGER)
        {
            if (i.a(h.j()).b())
            {
                com.facebook.debug.log.b.b(a, "User receives notifications in Messenger, eating notification");
                b("eaten_messenger");
                return;
            }
        } else
        if (a(h.j()))
        {
            com.facebook.debug.log.b.b(a, "Ignore logged out push since the user is logged in to FB4A");
            b("eaten_fb4a");
            return;
        }
        s = new w(c.getString(o.app_name), s, g1);
        d.a(s);
    }

    private void a(String s, JsonNode jsonnode, g g1)
    {
        jsonnode = e.a(s, jsonnode);
        if (jsonnode == null)
        {
            b("invalid_payload");
            return;
        }
        if (k != d.MESSENGER && i.a(h.j()).a())
        {
            com.facebook.debug.log.b.b(a, "User logged into Messenger, eating notification");
            b("eaten_messenger");
            return;
        } else
        {
            com.facebook.debug.log.b.b(a, "Received C2DM push");
            String s1 = jsonnode.e();
            f.a(jsonnode);
            d.a(s, s1, jsonnode, g1);
            return;
        }
    }

    private boolean a(String s)
    {
        com.facebook.auth.credentials.b b1 = j.a();
        if (b1 == null || b1.a() == null)
        {
            return false;
        } else
        {
            return b1.a().equals(s);
        }
    }

    private void b(JsonNode jsonnode)
    {
        if (jsonnode.has("params") && jsonnode.get("params").has("trace_info"))
        {
            Object obj = com.facebook.common.w.e.b(jsonnode.get("params").get("trace_info"));
            if (!com.facebook.common.w.n.a(((CharSequence) (obj))))
            {
                jsonnode = new Bundle();
                jsonnode.putString("traceInfo", ((String) (obj)));
                obj = (c)n.b();
                ((c) (obj)).b(true);
                ((c) (obj)).a(aq.F, jsonnode);
            }
        }
    }

    private void b(String s)
    {
        g.a("", "", com.facebook.push.h.C2DM.toString(), s);
    }

    public void a(JsonNode jsonnode, g g1)
    {
        String s;
        String s1;
        JsonNode jsonnode1;
        boolean flag;
        s = com.facebook.common.w.e.b(jsonnode.get("type"));
        if (!"msg".equals(s) && !"orca_message".equals(s) && !"orca_friend_msg".equals(s) && !"orca_thread_read".equals(s) && !"webrtc_voip_call".equals(s))
        {
            com.facebook.debug.log.b.b(a, "Ignoring FbPushData of type %s", new Object[] {
                s
            });
            return;
        }
        flag = com.facebook.common.w.e.g(jsonnode.get("is_logged_out_push"));
        s1 = com.facebook.common.w.e.b(jsonnode.get("message"));
        jsonnode1 = jsonnode.get("params");
        String s2 = h.j();
        if (com.facebook.common.w.n.a(s2))
        {
            com.facebook.debug.log.b.b(a, "No push receiver user set. Ignoring");
            b("no_user");
            return;
        }
        if (!Objects.equal(com.facebook.common.w.e.b(jsonnode.get("target_uid")), s2))
        {
            com.facebook.debug.log.b.b(a, "Push notification intended for different user");
            b("eaten_wrong_user");
            return;
        }
        boolean flag1 = b.b();
        if (!flag1 && !flag)
        {
            com.facebook.debug.log.b.b(a, "Ignore push no loggedInUser");
            b("logged_out_user");
            return;
        }
        if (flag1 && flag)
        {
            com.facebook.debug.log.b.b(a, "Ignore logged out push since a user is logged in");
            b("logged_in_user");
            return;
        }
        if (!"msg".equals(s) && !"orca_message".equals(s)) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            a(s1, g1);
        } else
        {
            a(s1, jsonnode1, g1);
        }
_L4:
        b(jsonnode);
        return;
_L2:
        if ("orca_friend_msg".equals(s))
        {
            g1 = com.facebook.orca.push.a.a(s1, c.getString(o.app_name), jsonnode1);
            if (g1 != null)
            {
                d.a(g1);
            } else
            {
                b("invalid_payload");
            }
        } else
        if ("webrtc_voip_call".equals(s))
        {
            l.a(jsonnode1);
        } else
        if ("orca_thread_read".equals(s))
        {
            a(jsonnode1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
