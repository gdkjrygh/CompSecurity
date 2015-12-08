// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tinder.enums.SqlDataType;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.utils.DateUtils;
import java.util.Map;
import java.util.TreeSet;

// Referenced classes of package com.tinder.b:
//            b, c, l

public final class h extends b
{

    private c a[];

    public h()
    {
        a = (new c[] {
            new c("user_id", SqlDataType.TEXT, false), new c("match_id", SqlDataType.TEXT, false), new c("client_created", SqlDataType.BOOLEAN, false), new c("created", SqlDataType.DATETIME, true), new c("has_error", SqlDataType.BOOLEAN, false), new c("text", SqlDataType.TEXT, false), new c("viewed", SqlDataType.BOOLEAN, false)
        });
    }

    public static ContentValues a(Message message)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("user_id", message.getFromUserId());
        contentvalues.put("match_id", message.getMatchId());
        contentvalues.put("created", message.getCreationDate());
        contentvalues.put("text", message.getText());
        return contentvalues;
    }

    public static TreeSet a(String s)
    {
        TreeSet treeset = null;
        Object obj = l.a().b("messages", (new StringBuilder("match_id = '")).append(s).append('\'').toString());
        treeset = new TreeSet();
        String s1;
        String s2;
        for (; ((Cursor) (obj)).moveToNext(); treeset.add(new Message(s, s2, s1, ((Cursor) (obj)).getString(5), false, DateUtils.a(s2))))
        {
            s1 = ((Cursor) (obj)).getString(0);
            s2 = ((Cursor) (obj)).getString(3);
        }

          goto _L1
        s;
_L3:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        throw s;
_L1:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        return treeset;
        s;
        obj = treeset;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static void a(Map map)
    {
        Cursor cursor = l.a().b("messages");
_L1:
        Object obj;
        Object obj1;
        do
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_113;
            }
            obj = cursor.getString(1);
            obj1 = cursor.getString(0);
            String s = cursor.getString(3);
            obj1 = new Message(((String) (obj)), s, ((String) (obj1)), cursor.getString(5), false, DateUtils.a(s));
            obj = (Match)map.get(obj);
        } while (obj == null);
        ((Match) (obj)).addMessage(((Message) (obj1)));
          goto _L1
        map;
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
        throw map;
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
        return;
    }

    public static void b(Message message)
    {
        message = a(message);
        l.a().a("messages", message);
    }

    protected final c[] a()
    {
        return a;
    }

    protected final String b()
    {
        return "messages";
    }
}
