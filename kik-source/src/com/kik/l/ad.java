// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import kik.a.d.a.a;
import kik.a.d.a.d;
import kik.a.d.a.g;
import kik.a.d.a.h;
import kik.a.d.a.l;
import kik.a.d.a.m;
import kik.a.d.s;
import kik.a.f.e.k;

// Referenced classes of package com.kik.l:
//            y

final class ad extends y
{

    public ad(Cursor cursor)
    {
        super(cursor);
    }

    public static ContentValues a(s s1)
    {
        boolean flag = true;
        Object obj = (h)g.a(s1, kik/a/d/a/h);
        ContentValues contentvalues;
        Object obj1;
        Object obj2;
        Object obj3;
        int i;
        int j;
        int i1;
        long l1;
        if (obj != null)
        {
            obj = ((h) (obj)).a();
        } else
        {
            obj = null;
        }
        obj1 = s1.h();
        if (s1.d())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i1 = s1.c();
        obj2 = s1.b();
        if (s1.a() == null)
        {
            j = 0;
        } else
        {
            j = s1.a().length();
        }
        l1 = s1.e();
        obj3 = s1.i();
        contentvalues = new ContentValues();
        contentvalues.put("body", ((String) (obj)));
        contentvalues.put("partner_jid", ((String) (obj1)));
        contentvalues.put("was_me", Integer.valueOf(i));
        contentvalues.put("read_state", Integer.valueOf(i1));
        contentvalues.put("uid", ((String) (obj2)));
        contentvalues.put("length", Integer.valueOf(j));
        contentvalues.put("timestamp", Long.valueOf(l1));
        contentvalues.put("bin_id", ((String) (obj3)));
        if (s1.j())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        contentvalues.put("req_read_reciept", Integer.valueOf(i));
        contentvalues.put("message_retry_count", Integer.valueOf(s1.f()));
        contentvalues.put("encryption_failure", Boolean.valueOf(s1.k()));
        contentvalues.put("encryption_key", s1.o());
        obj = (m)g.a(s1, kik/a/d/a/m);
        obj1 = (l)g.a(s1, kik/a/d/a/l);
        obj2 = (a)g.a(s1, kik/a/d/a/a);
        obj3 = (d)g.a(s1, kik/a/d/a/d);
        s1 = (k)g.a(s1, kik/a/f/e/k);
        if (s1 != null)
        {
            contentvalues.put("render_instructions", s1.a());
        }
        if (obj != null)
        {
            contentvalues.put("sys_msg", ((m) (obj)).a());
        }
        if (obj1 != null)
        {
            contentvalues.put("stat_msg", ((l) (obj1)).a());
            contentvalues.put("stat_user_jid", ((l) (obj1)).b());
            contentvalues.put("stat_special_visibility", Boolean.valueOf(((l) (obj1)).c()));
        }
        if (obj2 != null)
        {
            contentvalues.put("content_id", ((a) (obj2)).o());
            contentvalues.put("app_id", ((a) (obj2)).u());
        }
        if (obj3 != null)
        {
            contentvalues.put("friend_attr_id", Integer.valueOf(((d) (obj3)).i()));
        }
        return contentvalues;
    }
}
