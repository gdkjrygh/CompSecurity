// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.common.time.a;
import com.facebook.common.w.k;
import com.facebook.common.w.n;
import com.facebook.d.d.e;
import com.facebook.d.d.f;
import com.facebook.debug.log.b;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.v;
import com.facebook.user.UserKey;
import com.google.common.a.ik;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.orca.g:
//            r, g, aa

public class z
{

    private static final Class a = com/facebook/orca/g/z;
    private static final String h[] = {
        "t.thread_id", "t.thread_fbid", "t.action_id", "t.refetch_action_id", "t.last_visible_action_id", "t.name", "t.participants", "t.former_participants", "t.object_participants", "t.senders", 
        "t.single_recipient_thread", "t.single_recipient_user_key", "t.snippet", "t.snippet_sender", "t.admin_snippet", "t.timestamp_ms", "t.unread", "t.pic_hash", "t.can_reply_to", "t.pic", 
        "t.is_subscribed", "t.folder", "t.draft"
    };
    private final aa b;
    private final r c;
    private final g d;
    private final a e;
    private Cursor f;
    private Map g;

    public z(aa aa1, r r1, g g1, a a1)
    {
        b = aa1;
        c = r1;
        d = g1;
        e = a1;
    }

    private void c()
    {
        g = ik.a();
        g.put("thread_id", Integer.valueOf(f.getColumnIndexOrThrow("thread_id")));
        g.put("thread_fbid", Integer.valueOf(f.getColumnIndexOrThrow("thread_fbid")));
        g.put("action_id", Integer.valueOf(f.getColumnIndexOrThrow("action_id")));
        g.put("refetch_action_id", Integer.valueOf(f.getColumnIndexOrThrow("refetch_action_id")));
        g.put("last_visible_action_id", Integer.valueOf(f.getColumnIndexOrThrow("last_visible_action_id")));
        g.put("name", Integer.valueOf(f.getColumnIndexOrThrow("name")));
        g.put("participants", Integer.valueOf(f.getColumnIndexOrThrow("participants")));
        g.put("former_participants", Integer.valueOf(f.getColumnIndexOrThrow("former_participants")));
        g.put("object_participants", Integer.valueOf(f.getColumnIndexOrThrow("object_participants")));
        g.put("senders", Integer.valueOf(f.getColumnIndexOrThrow("senders")));
        g.put("single_recipient_thread", Integer.valueOf(f.getColumnIndexOrThrow("single_recipient_thread")));
        g.put("snippet", Integer.valueOf(f.getColumnIndexOrThrow("snippet")));
        g.put("snippet_sender", Integer.valueOf(f.getColumnIndexOrThrow("snippet_sender")));
        g.put("admin_snippet", Integer.valueOf(f.getColumnIndexOrThrow("admin_snippet")));
        g.put("timestamp_ms", Integer.valueOf(f.getColumnIndexOrThrow("timestamp_ms")));
        g.put("unread", Integer.valueOf(f.getColumnIndexOrThrow("unread")));
        g.put("pic_hash", Integer.valueOf(f.getColumnIndexOrThrow("pic_hash")));
        g.put("can_reply_to", Integer.valueOf(f.getColumnIndexOrThrow("can_reply_to")));
        g.put("pic", Integer.valueOf(f.getColumnIndexOrThrow("pic")));
        g.put("single_recipient_user_key", Integer.valueOf(f.getColumnIndexOrThrow("single_recipient_user_key")));
        g.put("is_subscribed", Integer.valueOf(f.getColumnIndexOrThrow("is_subscribed")));
        g.put("folder", Integer.valueOf(f.getColumnIndexOrThrow("folder")));
        g.put("draft", Integer.valueOf(f.getColumnIndexOrThrow("draft")));
    }

    public v a()
    {
        boolean flag1 = true;
        if (f == null)
        {
            com.facebook.debug.log.b.b(a, "next: not initialized, skipping");
            return null;
        }
        if (!f.moveToNext())
        {
            com.facebook.debug.log.b.a(a, "next: cursor empty");
            return null;
        }
        v v1 = new v();
        v1.a(f.getString(((Integer)g.get("thread_id")).intValue()));
        v1.b(f.getString(((Integer)g.get("thread_fbid")).intValue()));
        v1.c(f.getLong(((Integer)g.get("action_id")).intValue()));
        v1.a(f.getLong(((Integer)g.get("refetch_action_id")).intValue()));
        v1.b(f.getLong(((Integer)g.get("last_visible_action_id")).intValue()));
        if (!f.isNull(((Integer)g.get("name")).intValue()))
        {
            v1.c(f.getString(((Integer)g.get("name")).intValue()));
        }
        v1.a(c.c(f.getString(((Integer)g.get("participants")).intValue())));
        v1.b(c.c(f.getString(((Integer)g.get("former_participants")).intValue())));
        v1.c(c.b(f.getString(((Integer)g.get("object_participants")).intValue())));
        v1.d(c.b(f.getString(((Integer)g.get("senders")).intValue())));
        v1.a(c.a(f.getString(((Integer)g.get("snippet_sender")).intValue())));
        boolean flag;
        if (f.getInt(((Integer)g.get("single_recipient_thread")).intValue()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v1.a(flag);
        v1.d(f.getString(((Integer)g.get("snippet")).intValue()));
        v1.e(f.getString(((Integer)g.get("admin_snippet")).intValue()));
        v1.d(f.getLong(((Integer)g.get("timestamp_ms")).intValue()));
        if (f.getInt(((Integer)g.get("unread")).intValue()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v1.b(flag);
        v1.f(n.b(f.getString(((Integer)g.get("pic_hash")).intValue())));
        if (f.getInt(((Integer)g.get("can_reply_to")).intValue()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v1.c(flag);
        if (!f.isNull(((Integer)g.get("pic")).intValue()))
        {
            v1.a(Uri.parse(f.getString(((Integer)g.get("pic")).intValue())));
        }
        v1.a(UserKey.a(f.getString(((Integer)g.get("single_recipient_user_key")).intValue())));
        if (f.getInt(((Integer)g.get("is_subscribed")).intValue()) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        v1.d(flag);
        v1.a(FolderName.a(f.getString(((Integer)g.get("folder")).intValue())));
        v1.a(d.a(f.getString(((Integer)g.get("draft")).intValue())));
        return v1;
    }

    public void a(int i, long l)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("group_conversations AS g INNER JOIN threads AS t ON g.thread_id = t.thread_id");
        Object obj = com.facebook.d.d.e.a();
        ((f) (obj)).a(com.facebook.d.d.e.a("t.name IS NOT NULL"));
        if (l > 0L)
        {
            ((f) (obj)).a(com.facebook.d.d.e.c("t.timestamp_ms", Long.toString(e.a() - l)));
        }
        android.database.sqlite.SQLiteDatabase sqlitedatabase = b.e();
        String as[] = h;
        String s = ((f) (obj)).a();
        String as1[] = ((f) (obj)).b();
        if (i > 0)
        {
            obj = Integer.toString(i);
        } else
        {
            obj = null;
        }
        f = sqlitequerybuilder.query(sqlitedatabase, as, s, as1, null, null, "g.rank DESC", ((String) (obj)));
        c();
    }

    public void a(FolderName foldername, long l, Set set, String s)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("folders AS f INNER JOIN threads AS t ON f.thread_id = t.thread_id");
        f f1 = com.facebook.d.d.e.a();
        f1.a(com.facebook.d.d.e.a("f.folder", foldername.b()));
        if (l > 0L)
        {
            f1.a(com.facebook.d.d.e.b("f.timestamp_ms", Long.toString(l)));
        }
        if (set != null)
        {
            f1.a(com.facebook.d.d.e.a((new StringBuilder()).append("t.thread_id NOT IN ").append(k.b(set)).toString()));
        }
        f = sqlitequerybuilder.query(b.e(), h, f1.a(), f1.b(), null, null, "f.timestamp_ms DESC", s);
        c();
    }

    public void a(String s)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("folders AS f INNER JOIN threads AS t ON f.thread_id = t.thread_id");
        f f1 = com.facebook.d.d.e.a();
        f1.a(com.facebook.d.d.e.a("f.folder", FolderName.b.b()));
        s = DatabaseUtils.sqlEscapeString((new StringBuilder()).append('%').append(s).append('%').toString());
        f1.a(com.facebook.d.d.e.a((new StringBuilder()).append("t.name LIKE ").append(s).toString()));
        com.facebook.debug.log.b.b(a, "selection: %s", new Object[] {
            f1.a()
        });
        f = sqlitequerybuilder.query(b.e(), h, f1.a(), f1.b(), null, null, "f.timestamp_ms DESC", null);
        c();
    }

    public void b()
    {
        com.facebook.debug.log.b.b(a, "closing");
        if (f != null)
        {
            f.close();
            f = null;
        }
    }

}
