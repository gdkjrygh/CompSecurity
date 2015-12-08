// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.cmcm.adsdk.b.a.c;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.c.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class a
{

    public static a a;
    private Context b;
    private boolean c;

    private a(Context context)
    {
        c = false;
        b = context;
    }

    public static a a(Context context)
    {
        if (a == null)
        {
            a = new a(context);
        }
        return a;
    }

    private static boolean a(SQLiteDatabase sqlitedatabase, c c1)
    {
        boolean flag = true;
        if (c1 == null || sqlitedatabase == null)
        {
            flag = false;
        } else
        {
            int i;
            try
            {
                i = sqlitedatabase.update("posinfo", c1.a(), "placeid=? and name=?", new String[] {
                    (new StringBuilder()).append(c1.b).toString(), c1.d
                });
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(sqlitedatabase.getMessage()).toString());
                return false;
            }
            if (i <= 0)
            {
                return false;
            }
        }
        return flag;
    }

    private static boolean b(SQLiteDatabase sqlitedatabase, c c1)
    {
        if (c1 != null && sqlitedatabase != null)
        {
            long l;
            try
            {
                com.cmcm.adsdk.b.c.b.a("PosInfoStorage", (new StringBuilder("data:")).append(c1).toString());
                l = sqlitedatabase.insert("posinfo", null, c1.a());
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(sqlitedatabase.getMessage()).toString());
                return false;
            }
            if (l > 0L)
            {
                return true;
            }
        }
        return false;
    }

    private SQLiteDatabase c()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = com.cmcm.adsdk.a.b.a(b).a().getWritableDatabase();
        }
        catch (Exception exception)
        {
            return null;
        }
        return sqlitedatabase;
    }

    public final List a()
    {
        Object obj1;
        Object obj2;
        obj2 = c();
        obj1 = new ArrayList();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        obj2 = obj1;
_L4:
        return ((List) (obj2));
_L2:
        Object obj = new ArrayList();
        obj1 = ((SQLiteDatabase) (obj2)).query("posinfo", null, null, null, null, null, null);
        while (((Cursor) (obj1)).moveToNext()) 
        {
            new c();
            ((List) (obj)).add(com.cmcm.adsdk.b.a.c.a(((Cursor) (obj1))));
        }
          goto _L3
        obj2;
_L7:
        Exception exception;
        com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(exception.getMessage()).toString());
        exception = ((Exception) (obj));
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return ((List) (obj));
        }
          goto _L4
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return ((List) (obj));
        } else
        {
            return ((List) (obj));
        }
        obj;
        obj1 = null;
_L6:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        Object obj3 = null;
        obj = obj1;
        obj1 = obj3;
          goto _L7
        exception;
        obj1 = null;
          goto _L7
    }

    public final List a(int i)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "getPosBeanByPosid...");
        arraylist = new ArrayList();
        obj = c();
        if (obj == null)
        {
            return arraylist;
        }
        obj = ((SQLiteDatabase) (obj)).query("posinfo", null, "placeid=?", new String[] {
            String.valueOf(i)
        }, null, null, null);
        obj1 = obj;
        com.cmcm.adsdk.b.c.b.a("PosInfoStorage", (new StringBuilder("cursor size:")).append(((Cursor) (obj)).getCount()).toString());
        obj1 = obj;
        new c();
_L15:
        obj1 = obj;
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        c c1 = com.cmcm.adsdk.b.a.c.a(((Cursor) (obj)));
        obj1 = obj;
        if (!"fb".equals(c1.d)) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        Exception exception;
        if (d.a() < 9)
        {
            i = 0;
        } else
        {
            i = 1;
        }
          goto _L5
_L4:
        obj1 = obj;
        if (!c1.d.equals("cb")) goto _L7; else goto _L6
_L6:
        obj1 = obj;
        if (d.a() < 9)
        {
            i = 0;
        } else
        {
            i = 1;
        }
          goto _L8
_L7:
        obj1 = obj;
        if (c1.e.intValue() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        arraylist.add(c1);
        break; /* Loop/switch isn't completed */
        exception;
_L13:
        obj1 = obj;
        com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(exception.getMessage()).toString());
        obj1 = obj;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            obj1 = obj;
        }
_L10:
        ((Cursor) (obj1)).close();
        com.cmcm.adsdk.b.c.b.a("PosInfoStorage", (new StringBuilder("list:")).append(arraylist).toString());
        Collections.sort(arraylist);
        return arraylist;
_L2:
        obj1 = obj;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            obj1 = obj;
        }
        if (true) goto _L10; else goto _L9
_L9:
        obj;
_L12:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        if (true) goto _L12; else goto _L11
_L11:
        exception;
        obj = null;
        if (true) goto _L13; else goto _L5
_L5:
        if (i == 0) goto _L14; else goto _L4
_L14:
        break; /* Loop/switch isn't completed */
_L8:
        if (i == 0) goto _L15; else goto _L7
    }

    public final boolean a(List list)
    {
        SQLiteDatabase sqlitedatabase;
        for (sqlitedatabase = c(); sqlitedatabase == null || !com.cmcm.adsdk.b.e.a.a(list);)
        {
            return false;
        }

        if (c)
        {
            sqlitedatabase.beginTransaction();
        }
        list = list.iterator();
_L2:
        c c1;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_122;
            }
            c1 = (c)list.next();
        } while (c1 == null || sqlitedatabase == null);
        if (a(sqlitedatabase, c1)) goto _L2; else goto _L1
_L1:
        b(sqlitedatabase, c1);
          goto _L2
        list;
        com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(list.getMessage()).toString());
        boolean flag;
        if (c)
        {
            sqlitedatabase.endTransaction();
            flag = false;
        } else
        {
            flag = false;
        }
        return flag;
        if (c)
        {
            sqlitedatabase.setTransactionSuccessful();
        }
        boolean flag1 = true;
        flag = flag1;
        if (c)
        {
            sqlitedatabase.endTransaction();
            flag = flag1;
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_119;
        }
        list;
        if (c)
        {
            sqlitedatabase.endTransaction();
        }
        throw list;
    }

    public final boolean b()
    {
        Object obj;
        obj = c();
        if (obj == null)
        {
            return false;
        }
        Cursor cursor = ((SQLiteDatabase) (obj)).query("posinfo", null, null, null, null, null, null);
        obj = cursor;
        boolean flag = cursor.moveToNext();
        if (flag)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return true;
        }
        if (cursor != null)
        {
            cursor.close();
        }
_L1:
        return false;
        Exception exception1;
        exception1;
        cursor = null;
_L4:
        obj = cursor;
        com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(exception1.getMessage()).toString());
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L1
        Exception exception;
        exception;
        obj = null;
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        exception1;
          goto _L4
    }

    public final boolean b(List list)
    {
        SQLiteDatabase sqlitedatabase = c();
        if (sqlitedatabase == null)
        {
            return false;
        }
        if (!com.cmcm.adsdk.b.e.a.a(list))
        {
            return false;
        }
        try
        {
            Integer integer;
            for (list = list.iterator(); list.hasNext(); sqlitedatabase.delete("posinfo", "placeid!=?", new String[] {
    (new StringBuilder()).append(integer.intValue()).toString()
}))
            {
                integer = (Integer)list.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            com.cmcm.adsdk.b.c.b.c("PosInfoStorage", (new StringBuilder("operate db is error...")).append(list.getMessage()).toString());
            return false;
        }
        return true;
    }
}
