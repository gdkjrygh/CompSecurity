// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.gson.e;
import com.tinder.enums.Gender;
import com.tinder.enums.SqlDataType;
import com.tinder.model.Career;
import com.tinder.model.User;
import com.tinder.parse.a;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.tinder.b:
//            b, m, c, l

public final class n extends b
{

    public final m a = new m();
    private c b[];

    public n()
    {
        b = (new c[] {
            new c("id", SqlDataType.TEXT, true), new c("bio", SqlDataType.TEXT, false), new c("birth_date", SqlDataType.DATETIME, false), new c("common_friend_count", SqlDataType.INTEGER, false), new c("common_like_count", SqlDataType.INTEGER, false), new c("distance_miles", SqlDataType.INTEGER, false), new c("downloaded", SqlDataType.BOOLEAN, false), new c("failed_choice", SqlDataType.BOOLEAN, false), new c("gender", SqlDataType.INTEGER, false), new c("liked", SqlDataType.BOOLEAN, false), 
            new c("ping_time", SqlDataType.DATETIME, false), new c("first_name", SqlDataType.TEXT, false), new c("last_activity_date", SqlDataType.TEXT, false), new c("traveling", SqlDataType.BOOLEAN, false), new c("is_verified", SqlDataType.BOOLEAN, false), new c("is_superlike", SqlDataType.BOOLEAN, false), new c("badges", SqlDataType.TEXT, false), new c("username", SqlDataType.TEXT, false), new c("teaser", SqlDataType.TEXT, false)
        });
    }

    public static User a(String s)
    {
        Object obj;
        obj = com.tinder.b.l.a().a;
        String s1 = (new StringBuilder("id='")).append(s).append('\'').toString();
        obj = ((SQLiteDatabase) (obj)).query("users", new String[] {
            "*"
        }, s1, null, null, null, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        String s2;
        Date date;
        Gender gender;
        Date date1;
        String s3;
        String s4;
        int i;
        if (((Cursor) (obj)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        ((Cursor) (obj)).moveToFirst();
        s = ((Cursor) (obj)).getString(0);
        s2 = ((Cursor) (obj)).getString(1);
        date = new Date(((Cursor) (obj)).getLong(2));
        i = ((Cursor) (obj)).getInt(5);
        gender = Gender.values()[((Cursor) (obj)).getInt(8)];
        date1 = new Date(((Cursor) (obj)).getLong(10));
        s3 = ((Cursor) (obj)).getString(11);
        s4 = ((Cursor) (obj)).getString(12);
        String s5;
        String s6;
        String s7;
        ArrayList arraylist;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (((Cursor) (obj)).getInt(13) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Cursor) (obj)).getInt(14) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (((Cursor) (obj)).getInt(15) > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        s5 = ((Cursor) (obj)).getString(16);
        s6 = ((Cursor) (obj)).getString(17);
        s7 = ((Cursor) (obj)).getString(18);
        arraylist = new ArrayList();
        arraylist.add(com.tinder.parse.a.a(s5));
        s = new User(s2, date, s, s3, date1, i, null, gender, null, m.b(s), s4, flag1, flag2, false, arraylist, s6, (Career)(new e()).a(s7, com/tinder/model/Career));
        s.setRecAndPassporting(flag);
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        return s;
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        return null;
        s;
        obj = null;
_L2:
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final c[] a()
    {
        return b;
    }

    protected final String b()
    {
        return "users";
    }
}
