// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.debug.log.b;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.ac;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.g:
//            aa

class m
{

    private final Class a = com/facebook/orca/g/m;
    private final aa b;
    private final ac c;

    m(aa aa1, ac ac1)
    {
        b = aa1;
        c = ac1;
    }

    void a(List list)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        list = list.iterator();
_L1:
        User user;
        ContentValues contentvalues;
        Name name;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_220;
        }
        user = (User)list.next();
        contentvalues = new ContentValues();
        contentvalues.put("user_key", user.c().c());
        name = user.d();
        if (name == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        contentvalues.put("first_name", name.getFirstName());
        contentvalues.put("last_name", name.getLastName());
        contentvalues.put("name", name.getDisplayName());
        contentvalues.put("pic_big", user.p());
        contentvalues.put("pic_square", user.q());
        if (user.s() != null)
        {
            contentvalues.put("pic_crop", c.a(user.s()).toString());
        }
        if (user.C() != null)
        {
            contentvalues.put("last_active", c.a(user.C()).toString());
        }
        sqlitedatabase.replaceOrThrow("thread_users", "", contentvalues);
          goto _L1
        list;
        com.facebook.debug.log.b.d(a, "SQLException", list);
        throw list;
        list;
        sqlitedatabase.endTransaction();
        throw list;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }
}
