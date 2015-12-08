// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import com.kik.f.a.a.c;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.h.g;

// Referenced classes of package com.kik.l:
//            y

class e extends y
{

    public e(Cursor cursor)
    {
        super(cursor);
    }

    public static ContentValues a(k k1)
    {
        boolean flag = true;
        boolean flag2 = k1 instanceof n;
        ContentValues contentvalues = new ContentValues();
        String s;
        int i;
        boolean flag1;
        if (flag2)
        {
            flag1 = k1.l();
        } else
        {
            flag1 = k1.n();
        }
        contentvalues.put("display_name", k1.c());
        contentvalues.put("user_name", k1.e());
        contentvalues.put("jid", k1.b());
        contentvalues.put("in_roster", Boolean.valueOf(flag1));
        contentvalues.put("is_stub", Boolean.valueOf(k1.g()));
        contentvalues.put("photo_url", k1.r());
        contentvalues.put("photo_timestamp", k1.s());
        if (flag2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_group", Integer.valueOf(i));
        if (k1.o())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_blocked", Integer.valueOf(i));
        if (k1.h())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_ignored", Integer.valueOf(i));
        if (flag2 && ((n)k1).H())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("pending_convo_clear", Integer.valueOf(i));
        if (k1.p())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("pending_in_roster", Integer.valueOf(i));
        if (k1.q())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("pending_is_blocked", Integer.valueOf(i));
        if (k1.u())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("appear_in_convos_list", Integer.valueOf(i));
        contentvalues.put("roster_operation_attempts", Integer.valueOf(k1.f()));
        contentvalues.put("verified", Boolean.valueOf(k1.i()));
        contentvalues.put("public_key", k1.j());
        contentvalues.put("is_public_key_resolved", Boolean.valueOf(k1.k()));
        if (flag2 && ((n)k1).A())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_user_admin", Integer.valueOf(i));
        if (flag2)
        {
            s = ((n)k1).J();
        } else
        {
            s = null;
        }
        contentvalues.put("group_hashtag", s);
        if (flag2 && ((n)k1).B())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        contentvalues.put("is_user_removed", Integer.valueOf(i));
        contentvalues.put("content_links", g.a(k1.d()));
        return contentvalues;
    }

    final k a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        j j1;
        byte abyte0[];
        String s1;
        String s2;
        int i;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
label0:
        {
            obj = null;
            if (!isAfterLast())
            {
                obj = c("display_name");
                obj1 = c("user_name");
                obj2 = c("jid");
                boolean flag = a("is_user_admin");
                flag1 = a("is_stub");
                flag2 = a("in_roster");
                boolean flag3 = a("is_group");
                flag4 = a("is_blocked");
                boolean flag5 = a("pending_convo_clear");
                flag6 = a("is_ignored");
                flag7 = a("pending_in_roster");
                flag8 = a("pending_is_blocked");
                flag9 = a("appear_in_convos_list");
                i = d("roster_operation_attempts");
                j1 = j.a(((String) (obj2)));
                flag10 = a("verified");
                abyte0 = b("public_key");
                flag11 = a("is_public_key_resolved");
                boolean flag12 = a("is_user_removed");
                String s = c("group_hashtag");
                s1 = c("photo_timestamp");
                s2 = c("photo_url");
                obj2 = (c)g.a(b("content_links"), com/kik/f/a/a/c);
                if (!flag3)
                {
                    break label0;
                }
                obj1 = new n(j1, ((String) (obj)), new kik.a.d.n.a(), false, flag2, flag, s1, s2, s);
                ((n)obj1).i(flag12);
                obj = obj1;
                if (flag5)
                {
                    ((n)obj1).k(true);
                    obj = obj1;
                }
            }
            return ((k) (obj));
        }
        obj = new k(j1, ((String) (obj)), ((String) (obj1)), flag2, flag1, s1, s2, flag4, flag6, flag7, flag8, flag9, i, flag10, abyte0, flag11);
        ((k) (obj)).a(((c) (obj2)));
        return ((k) (obj));
    }
}
