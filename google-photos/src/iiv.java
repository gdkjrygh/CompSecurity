// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

public final class iiv
{

    private static final String c[] = {
        "display_name", "profile_photo_url", "gaia_id"
    };
    private static final String d[] = {
        a("actor_id"), b("display_name"), b("profile_photo_url"), b("gaia_id")
    };
    private static final String e;
    private final Context a;
    private final dja b;

    public iiv(Context context, dja dja1)
    {
        a = context;
        b = dja1;
    }

    private static String a(String s)
    {
        String s1 = String.valueOf("envelope_members.");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    private static String b(String s)
    {
        String s1 = String.valueOf("actors.");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public final diy a(int i, String s)
    {
        Object obj;
        p.a(s, "Empty actorId.");
        obj = new mvu(mvj.b(a, i));
        obj.a = "actors";
        obj.b = c;
        obj.c = "media_key = ?";
        obj.d = (new String[] {
            s
        });
        obj = ((mvu) (obj)).a();
        boolean flag = ((Cursor) (obj)).moveToFirst();
        if (!flag)
        {
            ((Cursor) (obj)).close();
            return null;
        }
        String s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("display_name"));
        String s2 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("profile_photo_url"));
        String s3 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("gaia_id"));
        s = b.a(s, s1, s3, s2);
        ((Cursor) (obj)).close();
        return s;
        s;
        ((Cursor) (obj)).close();
        throw s;
    }

    public final List b(int i, String s)
    {
        Object obj;
        p.a(s, "Empty envelope media key.");
        Object obj1 = mvj.b(a, i);
        obj = new ArrayList();
        obj1 = new mvu(((android.database.sqlite.SQLiteDatabase) (obj1)));
        obj1.a = e;
        obj1.b = d;
        obj1.c = String.valueOf(a("envelope_media_key")).concat(" = ?");
        obj1.d = (new String[] {
            s
        });
        s = ((mvu) (obj1)).a();
        i = s.getColumnIndexOrThrow("actor_id");
        int j = s.getColumnIndexOrThrow("display_name");
        int k = s.getColumnIndexOrThrow("profile_photo_url");
        int l = s.getColumnIndexOrThrow("gaia_id");
        String s1;
        String s2;
        String s3;
        String s4;
        for (; s.moveToNext(); ((List) (obj)).add(b.a(s1, s2, s4, s3)))
        {
            s1 = s.getString(i);
            s2 = s.getString(j);
            s3 = s.getString(k);
            s4 = s.getString(l);
        }

        break MISSING_BLOCK_LABEL_212;
        obj;
        s.close();
        throw obj;
        s.close();
        return ((List) (obj));
    }

    static 
    {
        String s = String.valueOf("envelope_members LEFT JOIN actors ON (");
        String s1 = String.valueOf(a("actor_id"));
        String s2 = String.valueOf(b("media_key"));
        e = (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" = ").append(s2).append(")").toString();
    }
}
