// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.common.w.k;
import com.facebook.debug.d.e;
import com.facebook.user.Name;
import com.facebook.user.UserKey;
import com.facebook.user.ac;
import com.facebook.user.o;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.ik;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.facebook.orca.g:
//            aa

class j
{

    private static final String d[] = {
        "user_key", "first_name", "last_name", "name", "pic_big", "pic_square", "pic_crop", "last_active"
    };
    private final aa a;
    private final ac b;
    private final ObjectMapper c;

    j(aa aa1, ac ac1, ObjectMapper objectmapper)
    {
        a = aa1;
        b = ac1;
        c = objectmapper;
    }

    es a(Collection collection)
    {
        e e1 = e.a("DbFetchThreadUsersHandler.doThreadUsersQuery");
        java.util.HashMap hashmap = ik.a();
        Object obj;
        Cursor cursor;
        UserKey userkey;
        Name name;
        if (collection != null)
        {
            collection = UserKey.a(collection);
            collection = (new StringBuilder()).append("user_key IN ").append(k.b(collection)).toString();
        } else
        {
            collection = null;
        }
        cursor = a.e().query("thread_users", d, collection, null, null, null, null);
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        userkey = UserKey.a(cursor.getString(0));
        name = new Name(cursor.getString(1), cursor.getString(2), cursor.getString(3));
        if (cursor.getString(6) == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        collection = c.readTree(cursor.getString(6));
        collection = b.a(collection);
_L7:
        if (cursor.getString(7) == null) goto _L4; else goto _L3
_L3:
        obj = c.readTree(cursor.getString(7));
        obj = b.f(((com.fasterxml.jackson.databind.JsonNode) (obj)));
_L6:
        hashmap.put(userkey, (new o()).a(userkey.a(), userkey.b()).a(name).c(cursor.getString(4)).b(cursor.getString(5)).a(collection).a(((com.facebook.user.LastActive) (obj))).x());
        break MISSING_BLOCK_LABEL_65;
        collection;
        cursor.close();
        e1.a();
        throw collection;
_L2:
        collection = es.a(hashmap.values());
        cursor.close();
        e1.a();
        return collection;
_L4:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        collection = null;
          goto _L7
    }

}
