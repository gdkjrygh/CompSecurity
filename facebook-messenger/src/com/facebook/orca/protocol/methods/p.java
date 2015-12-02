// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.auth.protocol.j;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.w.e;
import com.facebook.common.w.m;
import com.facebook.http.e.a;
import com.facebook.http.e.b;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.w;
import com.facebook.user.User;
import com.facebook.user.ac;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            q, x, bc, r

public class p
{

    private final bc a;
    private final j b;
    private final ac c;
    private final x d;
    private final javax.inject.a e;

    public p(bc bc1, j j1, ac ac1, x x1, javax.inject.a a1)
    {
        a = bc1;
        b = j1;
        c = ac1;
        d = x1;
        e = a1;
    }

    q a(b b1, int i)
    {
        if (i == 0)
        {
            return new q(es.d(), 0);
        }
        JsonNode jsonnode = b1.a("messages");
        if (jsonnode == null)
        {
            throw new Exception("Invalid api response - missing messages");
        }
        b1 = b1.a("actions");
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing actions");
        } else
        {
            return new q(d.a(jsonnode, b1, i), jsonnode.size() + b1.size());
        }
    }

    r a(b b1, boolean flag, int i)
    {
        JsonNode jsonnode = b1.a("threads");
        if (jsonnode == null)
        {
            throw new Exception("Invalid api response - missing threads");
        }
        JsonNode jsonnode1 = b1.a("users");
        JsonNode jsonnode2 = b1.a("participant_profiles");
        b1 = b1.a("object_participant_profiles");
        if (jsonnode1 == null)
        {
            throw new Exception("Invalid api response - missing users");
        }
        if (jsonnode2 == null)
        {
            throw new Exception("Invalid api response - missing participant_profiles");
        }
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing object_participant_profiles");
        }
        Object obj1 = hq.b(jsonnode.size());
        Object obj2 = es.e();
        Object obj = es.e();
        long l = -1L;
        int k = 0;
        while (k < jsonnode.size() && k < i) 
        {
            Object obj3 = jsonnode.get(k);
            a.a((ObjectNode)obj3, b1);
            l = Math.max(com.facebook.common.w.e.c(((JsonNode) (obj3)).get("action_id")), l);
            if (flag)
            {
                if ("deleted".equals(com.facebook.common.w.e.b(((JsonNode) (obj3)).get("sync_change_type"))))
                {
                    boolean flag1 = ((JsonNode) (obj3)).get("archived").booleanValue();
                    obj3 = com.facebook.common.w.e.b(((JsonNode) (obj3)).get("thread_id"));
                    if (flag1)
                    {
                        ((et) (obj)).b(obj3);
                    } else
                    {
                        ((et) (obj2)).b(obj3);
                    }
                } else
                {
                    ((ArrayList) (obj1)).add(a.a(((JsonNode) (obj3))));
                }
            } else
            {
                ((ArrayList) (obj1)).add(a.a(((JsonNode) (obj3))));
            }
            k++;
        }
        Collections.sort(((java.util.List) (obj1)), new w());
        obj1 = es.a(((java.util.Collection) (obj1)));
        obj2 = ((et) (obj2)).b();
        obj = ((et) (obj)).b();
        b1 = b.a(new JsonNode[] {
            jsonnode2, b1
        });
        b1 = b.a(jsonnode1, b1);
        return new r(((es) (obj1)), ((es) (obj2)), ((es) (obj)), c.a(n.FACEBOOK, b1), jsonnode.size(), l);
    }

    User a(b b1)
    {
        JsonNode jsonnode = b1.a("canonical_thread_user");
        b1 = b1.a("canonical_thread_profile");
        if (jsonnode == null)
        {
            throw new Exception("Invalid api response - missing users");
        }
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing participant_profiles");
        }
        b1 = b.a(jsonnode, b1);
        b1 = c.a(n.FACEBOOK, b1);
        if (b1.size() > 1)
        {
            throw new Exception("Invalid api response -- multiple users");
        }
        if (b1.size() == 0)
        {
            throw new Exception("Failed to find user");
        } else
        {
            return (User)b1.get(0);
        }
    }

    void a(a a1)
    {
        a1.a("user_settings", "SELECT setting, value FROM user_settings WHERE project='messaging'");
    }

    void a(a a1, FolderName foldername)
    {
        a1.a("folder_counts", m.a("SELECT folder, unread_count, unseen_count, last_seen_time, total_threads, last_action_id FROM unified_message_count WHERE folder='%1$s'", new Object[] {
            foldername
        }));
    }

    void a(a a1, String s)
    {
        a1.a("canonical_thread_id", m.a("SELECT thread_id FROM unified_thread WHERE single_recipient = %1$s LIMIT 1", new Object[] {
            s
        }));
    }

    void a(a a1, String s, int i, boolean flag)
    {
        a(a1, s, i, flag, false);
    }

    void a(a a1, String s, int i, boolean flag, boolean flag1)
    {
        String s1;
        String s2;
        StringBuilder stringbuilder;
        boolean flag2;
        if (flag)
        {
            s1 = "unified_thread_sync";
        } else
        {
            s1 = "unified_thread";
        }
        if (flag1 && !flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        stringbuilder = (new StringBuilder()).append("SELECT thread_id, thread_fbid, senders, participants, former_participants, object_participants, single_recipient, snippet, unread, action_id, last_visible_add_action_id, timestamp, name, pic_hash, mute, can_reply, snippet_sender, is_subscribed, admin_snippet, archived, folder");
        if (flag2)
        {
            s2 = ", read_receipts";
        } else
        {
            s2 = "";
        }
        stringbuilder = stringbuilder.append(s2);
        if (flag)
        {
            s2 = ", sync_change_type ";
        } else
        {
            s2 = "";
        }
        a1.a("threads", m.a(stringbuilder.append(s2).append(" FROM %1$s WHERE %2$s ORDER BY timestamp DESC LIMIT %3$d").toString(), new Object[] {
            s1, s, Integer.valueOf(i)
        }));
        a1.a("participant_profiles", "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id in (SELECT participants.user_id FROM #threads)");
        a1.a("object_participant_profiles", "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id in (SELECT object_participants.id FROM #threads)");
        a1.a("users", "SELECT uid, first_name, last_name, last_active FROM user WHERE uid IN (SELECT participants.user_id FROM #threads)");
    }

    void a(a a1, String s, String s1, int i)
    {
        b(a1, s, s1, i);
        c(a1, s, s1, i);
    }

    q b(b b1, int i)
    {
        b1 = b1.a("messages");
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing messages");
        } else
        {
            return new q(d.a(b1, NullNode.getInstance(), i), b1.size());
        }
    }

    es b(b b1)
    {
        JsonNode jsonnode = b1.a("canonical_thread_user");
        b1 = b1.a("canonical_thread_profile");
        if (jsonnode == null)
        {
            throw new Exception("Invalid api response - missing users");
        }
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing participant_profiles");
        }
        b1 = b.a(jsonnode, b1);
        b1 = c.a(n.FACEBOOK, b1);
        if (b1.size() == 0)
        {
            throw new Exception("Failed to find user");
        } else
        {
            return b1;
        }
    }

    void b(a a1, String s)
    {
        a1.a("canonical_thread_profile", m.a("SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id = %1$s", new Object[] {
            s
        }));
        a1.a("canonical_thread_user", m.a("SELECT uid, first_name, last_name FROM user WHERE uid = %1$s", new Object[] {
            s
        }));
    }

    void b(a a1, String s, String s1, int i)
    {
        a1.a("messages", m.a("SELECT thread_id, message_id, action_id, body, sender, unread, recipients, timestamp, attachment_map, share_map, coordinates, log_message, offline_threading_id, tags FROM unified_message WHERE %1$s ORDER BY %2$s LIMIT %3$d", new Object[] {
            s, s1, Integer.valueOf(i)
        }));
    }

    String c(b b1)
    {
        b1 = b1.a("canonical_thread_id");
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing canonical thread id");
        }
        if (b1.size() != 1)
        {
            throw new Exception("Invalid api response - missing canonical thread id");
        } else
        {
            return com.facebook.common.w.e.b(b1.get(0).get("thread_id"));
        }
    }

    void c(a a1, String s)
    {
        a1.a("canonical_thread_profile", m.a("SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id in (%1$s)", new Object[] {
            s
        }));
        a1.a("canonical_thread_user", m.a("SELECT uid, first_name, last_name FROM user WHERE uid in (%1$s)", new Object[] {
            s
        }));
    }

    void c(a a1, String s, String s1, int i)
    {
        a1.a("actions", m.a("SELECT thread_id, action_id, type, actor, users, timestamp, body FROM unified_thread_action WHERE %1$s ORDER BY %2$s LIMIT %3$d", new Object[] {
            s, s1, Integer.valueOf(i)
        }));
    }

    FolderName d(b b1)
    {
        b1 = b1.a("folder_counts");
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing folder");
        }
        if (b1.size() != 1)
        {
            throw new Exception("Invalid api response - missing folder");
        } else
        {
            return FolderName.a(FolderType.a(com.facebook.common.w.e.b(b1.get(0).get("folder"))), (ViewerContext)e.b());
        }
    }

    FolderCounts e(b b1)
    {
        b1 = b1.a("folder_counts");
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing folder counts");
        }
        if (b1.size() != 1)
        {
            throw new Exception("Invalid api response - missing folder counts");
        } else
        {
            b1 = b1.get(0);
            return new FolderCounts(com.facebook.common.w.e.d(b1.get("unread_count")), com.facebook.common.w.e.d(b1.get("unseen_count")), com.facebook.common.w.e.c(b1.get("last_seen_time")), com.facebook.common.w.e.c(b1.get("last_action_id")));
        }
    }

    NotificationSetting f(b b1)
    {
        b1 = b1.a("user_settings");
        if (b1 == null)
        {
            throw new Exception("Invalid api response - missing user settings");
        }
        for (int i = 0; i < b1.size(); i++)
        {
            JsonNode jsonnode = b1.get(i);
            if ("mute_until".equals(com.facebook.common.w.e.b(jsonnode.get("setting"))))
            {
                return NotificationSetting.b(com.facebook.common.w.e.c(jsonnode.get("value")));
            }
        }

        return null;
    }
}
