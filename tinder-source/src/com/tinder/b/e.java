// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.tinder.enums.RateType;
import com.tinder.enums.SqlDataType;
import com.tinder.utils.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.tinder.b:
//            b, c, l, f

public final class e extends b
{

    private c a[];

    public e()
    {
        a = (new c[] {
            new c("rec_id", SqlDataType.TEXT, true), new c("is_like", SqlDataType.BOOLEAN, false), new c("is_superlike", SqlDataType.BOOLEAN, false)
        });
    }

    public static void a(String s)
    {
        l.a().a("ratings_failed", "rec_id", s);
    }

    public static boolean a(String s, RateType ratetype)
    {
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("rec_id", s);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[RateType.values().length];
                try
                {
                    a[RateType.LIKE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[RateType.SUPERLIKE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[RateType.PASS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[ratetype.ordinal()];
        JVM INSTR tableswitch 1 3: default 159
    //                   1 60
    //                   2 113
    //                   3 136;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_136;
_L5:
        l.a().a("ratings_failed", contentvalues);
        return true;
_L2:
        try
        {
            contentvalues.put("is_like", Integer.valueOf(1));
            contentvalues.put("is_superlike", Integer.valueOf(0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            v.b((new StringBuilder()).append(s.getMessage()).append(s.toString()).toString());
            return false;
        }
          goto _L5
_L3:
        contentvalues.put("is_like", Integer.valueOf(0));
        contentvalues.put("is_superlike", Integer.valueOf(1));
          goto _L5
        contentvalues.put("is_like", Integer.valueOf(0));
        contentvalues.put("is_superlike", Integer.valueOf(0));
          goto _L5
    }

    public static Map e()
    {
        Object obj;
        obj = Collections.EMPTY_MAP;
        obj = l.a().b("ratings_failed");
        Object obj1 = new HashMap(((Cursor) (obj)).getCount());
_L1:
        String s;
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s = ((Cursor) (obj)).getString(0);
        boolean flag;
        boolean flag1;
        if (((Cursor) (obj)).getInt(1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Cursor) (obj)).getInt(2) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((Map) (obj1)).put(s, new Pair(Boolean.valueOf(flag), Boolean.valueOf(flag1)));
          goto _L1
        obj1;
        obj1 = new HashMap(0);
        f.a(((Cursor) (obj)));
        return ((Map) (obj1));
        f.a(((Cursor) (obj)));
        return ((Map) (obj1));
        Exception exception;
        exception;
        f.a(((Cursor) (obj)));
        throw exception;
    }

    protected final c[] a()
    {
        return a;
    }

    protected final String b()
    {
        return "ratings_failed";
    }
}
