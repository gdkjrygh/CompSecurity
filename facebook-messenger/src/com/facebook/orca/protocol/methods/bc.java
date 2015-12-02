// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.w.e;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.p;
import com.facebook.orca.threads.v;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            aa

public class bc
{

    private final aa a;
    private final a b;

    public bc(aa aa1, a a1)
    {
        a = aa1;
        b = a1;
    }

    private es a(JsonNode jsonnode, JsonNode jsonnode1, String s)
    {
        return a(jsonnode, jsonnode1, s, null);
    }

    private es a(JsonNode jsonnode, JsonNode jsonnode1, String s, Map map)
    {
        java.util.HashSet hashset = kl.a();
        et et1 = es.e();
        jsonnode = jsonnode.iterator();
        do
        {
            if (!jsonnode.hasNext())
            {
                break;
            }
            ThreadParticipant threadparticipant = b((JsonNode)jsonnode.next(), jsonnode1, s, map);
            if (threadparticipant.d().d() && !hashset.contains(threadparticipant.d()))
            {
                hashset.add(threadparticipant.d());
                et1.b(threadparticipant);
            }
        } while (true);
        return et1.b();
    }

    private ThreadParticipant b(JsonNode jsonnode, JsonNode jsonnode1, String s, Map map)
    {
        ParticipantInfo participantinfo = a.b(jsonnode);
        if (jsonnode1.has(participantinfo.a()))
        {
            jsonnode = NotificationSetting.b(e.c(jsonnode1.get(participantinfo.a())));
        } else
        {
            jsonnode = NotificationSetting.a;
        }
        jsonnode1 = new p();
        jsonnode1.a(s).a(participantinfo).a(jsonnode);
        if (map != null && participantinfo.e() != null)
        {
            jsonnode = (Long)map.get(participantinfo.e().c());
            if (jsonnode != null)
            {
                jsonnode1.a(jsonnode.longValue());
            }
        }
        return jsonnode1.f();
    }

    public ThreadSummary a(JsonNode jsonnode)
    {
        boolean flag1 = false;
        v v1 = new v();
        Object obj2 = e.b(jsonnode.get("thread_id"));
        v1.a(((String) (obj2)));
        v1.b(e.b(jsonnode.get("thread_fbid")));
        long l = e.c(jsonnode.get("timestamp"));
        long l2 = e.c(jsonnode.get("action_id"));
        v1.c(l2);
        v1.d(l);
        if (jsonnode.has("snippet"))
        {
            v1.d(e.b(jsonnode.get("snippet")));
        }
        Object obj;
        Object obj1;
        Object obj3;
        if (e.b(jsonnode.get("refetch_action_id")) != null)
        {
            v1.a(e.c(jsonnode.get("refetch_action_id")));
        } else
        {
            v1.a(l2);
        }
        if (e.b(jsonnode.get("last_visible_add_action_id")) != null)
        {
            v1.b(e.c(jsonnode.get("last_visible_add_action_id")));
        } else
        {
            v1.b(l2);
        }
        v1.b(jsonnode.get("unread").booleanValue());
        if (jsonnode.has("mute") && jsonnode.get("mute").isObject())
        {
            obj = jsonnode.get("mute");
        } else
        {
            obj = NullNode.instance;
        }
        if (e.a(jsonnode.get("pic_hash")))
        {
            v1.f(e.b(jsonnode.get("pic_hash")));
        }
        obj3 = jsonnode.get("read_receipts");
        obj1 = null;
        if (obj3 != null)
        {
            obj1 = ik.a(((JsonNode) (obj3)).size());
            Object obj4;
            long l1;
            for (obj3 = ((JsonNode) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); ((Map) (obj1)).put(((UserKey) (obj4)).c(), Long.valueOf(l1)))
            {
                JsonNode jsonnode1 = (JsonNode)((Iterator) (obj3)).next();
                obj4 = e.b(jsonnode1.get("uid"));
                obj4 = new UserKey(n.FACEBOOK, ((String) (obj4)));
                l1 = e.c(jsonnode1.get("time"));
            }

        }
        obj1 = a(jsonnode.get("participants"), ((JsonNode) (obj)), ((String) (obj2)), ((Map) (obj1)));
        obj2 = a(jsonnode.get("former_participants"), ((JsonNode) (obj)), ((String) (obj2)));
        obj = a.a(jsonnode.get("object_participants"));
        v1.a(((java.util.List) (obj1)));
        v1.b(((java.util.List) (obj2)));
        v1.c(((java.util.List) (obj)));
        v1.d(a.a(jsonnode.get("senders")));
        obj1 = e.b(jsonnode.get("single_recipient"));
        boolean flag;
        boolean flag2;
        if (obj1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v1.a(flag);
        if (obj1 != null)
        {
            v1.a(new UserKey(n.FACEBOOK, ((String) (obj1))));
        }
        if (e.a(jsonnode.get("pic")))
        {
            v1.a(Uri.parse(e.b(jsonnode.get("pic"))));
        }
        obj1 = e.b(jsonnode.get("name"));
        if (!com.facebook.common.w.n.a(((CharSequence) (obj1))))
        {
            v1.c(((String) (obj1)));
        }
        flag2 = jsonnode.get("is_subscribed").booleanValue();
        v1.d(flag2);
        if (e.a(jsonnode.get("snippet_sender")))
        {
            v1.a(a.b(jsonnode.get("snippet_sender")));
        }
        if (e.a(jsonnode.get("admin_snippet")))
        {
            v1.e(e.b(jsonnode.get("admin_snippet")));
        }
        flag = jsonnode.get("can_reply").booleanValue();
        if (!flag2)
        {
            flag = false;
        }
        if (((es) (obj)).size() > 0)
        {
            flag = flag1;
        }
        v1.c(flag);
        if (e.a(jsonnode.get("folder")))
        {
            jsonnode = e.b(jsonnode.get("folder"));
            ViewerContext viewercontext = (ViewerContext)b.b();
            v1.a(FolderName.a(FolderType.a(jsonnode), viewercontext));
        }
        return v1.z();
    }

    public void a(ObjectNode objectnode, JsonNode jsonnode)
    {
        JsonNode jsonnode1;
        JsonNode jsonnode2;
        int i;
        jsonnode1 = null;
        jsonnode2 = objectnode.get("object_participants");
        i = 0;
_L11:
        Object obj = jsonnode1;
        if (i >= jsonnode2.size()) goto _L2; else goto _L1
_L1:
        obj = jsonnode2.get(i);
        if (e.d(((JsonNode) (obj)).get("object_address_type")) != 2) goto _L4; else goto _L3
_L3:
        obj = e.b(((JsonNode) (obj)).get("id"));
_L2:
        if (obj != null) goto _L6; else goto _L5
_L5:
        return;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L6:
        jsonnode = jsonnode.iterator();
_L9:
        if (!jsonnode.hasNext()) goto _L5; else goto _L7
_L7:
        jsonnode1 = (JsonNode)jsonnode.next();
        if (!Objects.equal(e.b(jsonnode1.get("id")), obj)) goto _L9; else goto _L8
_L8:
        objectnode.put("name", jsonnode1.get("name"));
        objectnode.put("pic", jsonnode1.get("pic_big"));
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
