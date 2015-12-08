// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tinder.enums.Gender;
import com.tinder.enums.SqlDataType;
import com.tinder.model.Badge;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.parse.a;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

// Referenced classes of package com.tinder.b:
//            b, c, l, h, 
//            m

public final class g extends b
{

    protected c a[];

    public g()
    {
        a = (new c[] {
            new c("id", SqlDataType.TEXT, true), new c("user_id", SqlDataType.TEXT, false), new c("created", SqlDataType.DATETIME, false), new c("last_activity", SqlDataType.DATETIME, false), new c("server_message_count", SqlDataType.INTEGER, false), new c("touched", SqlDataType.BOOLEAN, false), new c("viewed", SqlDataType.BOOLEAN, false), new c("user_name", SqlDataType.TEXT, false), new c("draft_msg", SqlDataType.TEXT, false), new c("reported_for", SqlDataType.INTEGER, false), 
            new c("gender", SqlDataType.INTEGER, false), new c("following", SqlDataType.BOOLEAN, false), new c("is_verified", SqlDataType.BOOLEAN, false), new c("is_superlike", SqlDataType.BOOLEAN, false), new c("superliker", SqlDataType.TEXT, false), new c("badges", SqlDataType.TEXT, false), new c("username", SqlDataType.TEXT, false), new c("birthdate", SqlDataType.DATETIME, false)
        });
    }

    public static ContentValues a(Match match)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", match.getId());
        if (match.getPerson() != null)
        {
            Object obj = match.getPerson();
            if (((Person) (obj)).userId != null)
            {
                contentvalues.put("user_id", ((Person) (obj)).userId);
            }
            if (((Person) (obj)).name != null)
            {
                contentvalues.put("user_name", ((Person) (obj)).name);
            }
            obj = match.getPerson().gender;
            if (obj != null)
            {
                contentvalues.put("gender", Integer.valueOf(((Gender) (obj)).ordinal()));
            }
            contentvalues.put("is_verified", Boolean.valueOf(match.isVerified()));
            if (match.hasBadge())
            {
                contentvalues.put("badges", match.getFirstBadge().toString());
            }
        }
        contentvalues.put("created", match.getCreatedDate());
        contentvalues.put("last_activity", match.getLastActivityDate());
        contentvalues.put("touched", Boolean.valueOf(match.isTouched()));
        contentvalues.put("viewed", Boolean.valueOf(match.wasViewed()));
        contentvalues.put("draft_msg", match.getDraftMsg());
        contentvalues.put("reported_for", Integer.valueOf(match.getReportedMasks()));
        contentvalues.put("is_superlike", Boolean.valueOf(match.isSuperlike()));
        contentvalues.put("superliker", match.getSuperLiker());
        return contentvalues;
    }

    public static void a(String s, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("touched", Boolean.valueOf(flag));
        com.tinder.b.l.a().a("matches", contentvalues, (new StringBuilder("id='")).append(s).append('\'').toString());
    }

    public static boolean b(Match match)
    {
        if (match == null)
        {
            return false;
        }
        (new StringBuilder("inserting match=")).append(match);
        try
        {
            ContentValues contentvalues = a(match);
            com.tinder.b.l.a().a("matches", contentvalues);
            if (match.hasMessages())
            {
                new h();
                for (Iterator iterator = match.getMessages().iterator(); iterator.hasNext(); h.b((Message)iterator.next())) { }
            }
        }
        // Misplaced declaration of an exception variable
        catch (Match match)
        {
            v.a("Failed to insert match due to exception", match);
            return false;
        }
        match = match.getPerson();
        if (match == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        new m();
        String s = ((Person) (match)).userId;
        com.tinder.b.m.a(s);
        com.tinder.b.m.a((ArrayList)((Person) (match)).profilePhotos, s);
        return true;
    }

    public static void c(Match match)
    {
        ContentValues contentvalues = a(match);
        com.tinder.b.l.a().a("matches", contentvalues, (new StringBuilder("0='")).append(match.getId()).append('\'').toString());
    }

    public static List e()
    {
        Cursor cursor;
        Object obj;
        HashMap hashmap;
        ArrayList arraylist;
        Gender agender[];
        cursor = com.tinder.b.l.a().b("matches");
        obj = new HashMap(cursor.getCount());
        hashmap = new HashMap(cursor.getCount());
        arraylist = new ArrayList(cursor.getCount());
        agender = Gender.values();
        new h();
_L1:
        String s;
        String s1;
        String s2;
        Object obj1;
        String s3;
        String s4;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_411;
        }
        s = cursor.getString(0);
        s1 = cursor.getString(1);
        obj1 = cursor.getString(7);
        s3 = cursor.getString(2);
        s4 = cursor.getString(3);
        s2 = cursor.getString(8);
        String s5;
        String s6;
        String s7;
        ArrayList arraylist1;
        int i;
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (cursor.getInt(5) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(6) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = cursor.getInt(9);
        j = cursor.getInt(10);
        if (cursor.getInt(12) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (cursor.getInt(13) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s5 = cursor.getString(14);
        s6 = cursor.getString(15);
        s7 = cursor.getString(16);
        arraylist1 = new ArrayList(1);
        arraylist1.add(com.tinder.parse.a.a(s6));
        obj1 = new Match(new Person(s1, ((String) (obj1)), agender[j], flag2, arraylist1, s7, null, null), s, com.tinder.b.h.a(s), s4, s3, flag3, s5);
        ((Match) (obj1)).setTouched(flag);
        ((Match) (obj1)).setViewed(flag1);
        ((Match) (obj1)).setDraftMsg(s2);
        ((Match) (obj1)).setReportedMasks(i);
        ((Map) (obj)).put(s, obj1);
        hashmap.put(s1, obj1);
        arraylist.add(obj1);
          goto _L1
        obj;
        if (!cursor.isClosed())
        {
            cursor.close();
        }
        throw obj;
        if (!cursor.isClosed())
        {
            cursor.close();
        }
        new h();
        com.tinder.b.h.a(((Map) (obj)));
        new m();
        com.tinder.b.m.a(hashmap);
        return arraylist;
    }

    protected final c[] a()
    {
        return a;
    }

    protected final String b()
    {
        return "matches";
    }
}
