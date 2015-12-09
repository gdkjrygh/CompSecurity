// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.jcp.JCP;
import com.jcp.productcategories.modal.Modal;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            h, ae

public final class g extends SQLiteOpenHelper
{

    private static final String a = com/jcp/util/g.getName();
    private static g b;
    private Context c;

    private g(Context context)
    {
        super(context, "DEPARTMENT", null, 1);
        c = context;
    }

    public static g a()
    {
        if (b == null)
        {
            b = new g(JCP.d());
        }
        return b;
    }

    public long a(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(h1.g(), h1.j());
        long l2 = -1L;
        if (flag) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        l = l2;
        l1 = l2;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        l = l2;
        l1 = l2;
        ContentValues contentvalues = new ContentValues();
        l = l2;
        l1 = l2;
        contentvalues.put("ID", h1.g());
        l = l2;
        l1 = l2;
        contentvalues.put("NAME", h1.h());
        l = l2;
        l1 = l2;
        contentvalues.put("URL", h1.i());
        l = l2;
        l1 = l2;
        contentvalues.put("CAT_ID", h1.j());
        l = l2;
        l1 = l2;
        contentvalues.put("TITLE_IMAGE", h1.f());
        l = l2;
        l1 = l2;
        contentvalues.put("TEMPLATE", h1.b());
        l = l2;
        l1 = l2;
        contentvalues.put("TABLET", h1.c());
        l = l2;
        l1 = l2;
        contentvalues.put("ONLINE", h1.d());
        l = l2;
        l1 = l2;
        contentvalues.put("MOBILE", h1.e());
        l = l2;
        l1 = l2;
        contentvalues.put("EXTERNAL", h1.a());
        l = l2;
        l1 = l2;
        l2 = sqlitedatabase.insertOrThrow("DEPARTMENTS", null, contentvalues);
        l = l2;
        l1 = l2;
        sqlitedatabase.close();
        l = l2;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
        SQLiteConstraintException sqliteconstraintexception;
        sqliteconstraintexception;
        ae.a(a, (new StringBuilder()).append("Department Name :").append(h1.h()).append(" DEPT ID :").append(h1.g()).append(" is already stored").toString());
        continue; /* Loop/switch isn't completed */
        h1;
        throw h1;
        h1;
        h1.printStackTrace();
        ae.a(a, (new StringBuilder()).append("Exception in addDepartment(): ").append(h1.getMessage()).toString());
        l = l1;
        continue; /* Loop/switch isn't completed */
_L2:
        ae.d(a, (new StringBuilder()).append("Department Name :").append(h1.h()).append(" catId :").append(h1.j()).append(" DEPT ID :").append(h1.g()).toString());
        l = l2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List a(String s)
    {
        Object obj = new ArrayList();
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getReadableDatabase();
        obj1 = sqlitedatabase.query("DEPARTMENTS", null, "CAT_ID=?", new String[] {
            s
        }, null, null, null);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj1)).getCount() == 0 || !((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L3
_L3:
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        int i = ((Cursor) (obj1)).getColumnIndex("ID");
        int j = ((Cursor) (obj1)).getColumnIndex("NAME");
        int k = ((Cursor) (obj1)).getColumnIndex("URL");
        int l = ((Cursor) (obj1)).getColumnIndex("CAT_ID");
        int i1 = ((Cursor) (obj1)).getColumnIndex("TITLE_IMAGE");
        int j1 = ((Cursor) (obj1)).getColumnIndex("MOBILE");
        int k1 = ((Cursor) (obj1)).getColumnIndex("EXTERNAL");
        s1 = ((Cursor) (obj1)).getString(i);
        s2 = ((Cursor) (obj1)).getString(j);
        s3 = ((Cursor) (obj1)).getString(k);
        s4 = ((Cursor) (obj1)).getString(l);
        s5 = ((Cursor) (obj1)).getString(i1);
        s6 = ((Cursor) (obj1)).getString(j1);
        s7 = ((Cursor) (obj1)).getString(k1);
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!s1.equalsIgnoreCase(s))
        {
            Modal modal = new Modal();
            modal.setId(s1);
            modal.setName(s2);
            modal.setUrl(s3);
            modal.setCategoryId(s4);
            modal.setTitleImage(s5);
            modal.setMobile(s6);
            modal.setExternal(Boolean.valueOf(s7));
            ((List) (obj)).add(modal);
        }
        if (((Cursor) (obj1)).moveToNext()) goto _L3; else goto _L2
_L2:
        sqlitedatabase.close();
        if (obj1 == null || ((Cursor) (obj1)).isClosed())
        {
            break MISSING_BLOCK_LABEL_437;
        }
        ((Cursor) (obj1)).close();
        obj1 = obj;
_L5:
        return ((List) (obj1));
        obj1;
        obj = null;
        s = null;
_L9:
        ae.a(a, (new StringBuilder()).append("Exception in getDepartmentSubCategoryData(): ").append(((Exception) (obj1)).getMessage()).toString());
        obj1 = s;
        if (obj == null) goto _L5; else goto _L4
_L4:
        obj1 = s;
        if (((Cursor) (obj)).isClosed()) goto _L5; else goto _L6
_L6:
        ((Cursor) (obj)).close();
        return s;
        s;
        obj1 = null;
_L8:
        if (obj1 != null && !((Cursor) (obj1)).isClosed())
        {
            ((Cursor) (obj1)).close();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        obj1 = obj;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        Object obj2 = null;
        s = ((String) (obj));
        obj = obj2;
          goto _L9
        s;
        Object obj3 = obj1;
        obj1 = s;
        s = ((String) (obj));
        obj = obj3;
          goto _L9
        return ((List) (obj));
    }

    public boolean a(String s, String s1)
    {
        Object obj = null;
        s1 = getReadableDatabase().query("DEPARTMENTS", new String[] {
            "ID", "CAT_ID"
        }, "ID=? AND CAT_ID=?", new String[] {
            s, s1
        }, null, null, null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        s = s1;
        int i = s1.getCount();
        if (i != 0)
        {
            if (s1 != null && !s1.isClosed())
            {
                s1.close();
            }
            return true;
        }
        if (s1 != null && !s1.isClosed())
        {
            s1.close();
        }
_L1:
        return false;
        obj;
        s1 = null;
_L4:
        s = s1;
        ae.a(a, (new StringBuilder()).append("Exception in isAvailable(): ").append(((Exception) (obj)).getMessage()).toString());
        if (s1 != null && !s1.isClosed())
        {
            s1.close();
        }
          goto _L1
        s;
        s1 = ((String) (obj));
_L3:
        if (s1 != null && !s1.isClosed())
        {
            s1.close();
        }
        throw s;
        obj;
        s1 = s;
        s = ((String) (obj));
        if (true) goto _L3; else goto _L2
_L2:
        obj;
          goto _L4
    }

    public Modal b(String s)
    {
        s = getReadableDatabase().query("DEPARTMENTS", new String[] {
            "ID", "NAME", "URL", "CAT_ID", "MOBILE", "EXTERNAL"
        }, "ID=?", new String[] {
            s
        }, null, null, null);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getCount() == 0 || !s.moveToFirst()) goto _L2; else goto _L3
_L3:
        Object obj = new Modal();
        int i = s.getColumnIndex("ID");
        int j = s.getColumnIndex("NAME");
        int k = s.getColumnIndex("URL");
        int l = s.getColumnIndex("CAT_ID");
        int i1 = s.getColumnIndex("MOBILE");
        int j1 = s.getColumnIndex("EXTERNAL");
        String s1 = s.getString(i);
        String s2 = s.getString(j);
        String s3 = s.getString(k);
        String s4 = s.getString(l);
        String s5 = s.getString(i1);
        String s6 = s.getString(j1);
        ((Modal) (obj)).setId(s1);
        ((Modal) (obj)).setName(s2);
        ((Modal) (obj)).setUrl(s3);
        ((Modal) (obj)).setCategoryId(s4);
        ((Modal) (obj)).setMobile(s5);
        ((Modal) (obj)).setExternal(Boolean.valueOf(s6));
_L11:
        Object obj1;
        obj1 = obj;
        if (s != null)
        {
            obj1 = obj;
            if (!s.isClosed())
            {
                s.close();
                obj1 = obj;
            }
        }
_L5:
        return ((Modal) (obj1));
        Exception exception;
        exception;
        obj = null;
        s = null;
_L9:
        ae.a(a, (new StringBuilder()).append("Exception in getParentCategoryData(): ").append(exception.getMessage()).toString());
        exception = s;
        if (obj == null) goto _L5; else goto _L4
_L4:
        exception = s;
        if (((Cursor) (obj)).isClosed()) goto _L5; else goto _L6
_L6:
        ((Cursor) (obj)).close();
        return s;
        obj;
        s = null;
_L8:
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        exception;
        s = ((String) (obj));
        obj = exception;
        if (true) goto _L8; else goto _L7
_L7:
        exception;
        obj = s;
        s = null;
          goto _L9
        Exception exception1;
        exception1;
        exception = ((Exception) (obj));
        obj = s;
        s = exception;
        exception = exception1;
          goto _L9
_L2:
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public boolean b()
    {
        Cursor cursor = getWritableDatabase().rawQuery("SELECT  * FROM DEPARTMENTS", null);
        boolean flag;
        if (cursor.getCount() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            cursor.close();
        }
        catch (Exception exception)
        {
            Log.e("Database Handler", (new StringBuilder()).append("Exception while opening writable database : ").append(exception).toString());
            exception.printStackTrace();
            return false;
        }
        return flag;
    }

    public String c(String s)
    {
        s = getReadableDatabase().query("DEPARTMENTS", new String[] {
            "URL"
        }, "ID=?", new String[] {
            s
        }, null, null, null);
        if (s == null) goto _L2; else goto _L1
_L1:
        String s1 = s;
        s.moveToFirst();
        s1 = s;
        String s2 = s.getString(s.getColumnIndex("URL"));
        s1 = s2;
_L7:
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        return s1;
        Exception exception;
        exception;
        s = null;
_L5:
        s1 = s;
        ae.a(a, (new StringBuilder()).append("Exception in getDepartmentUrl(): ").append(exception.getMessage()).toString());
        if (s != null && !s.isClosed())
        {
            s.close();
            return null;
        } else
        {
            return null;
        }
        s;
        s1 = null;
_L4:
        if (s1 != null && !s1.isClosed())
        {
            s1.close();
        }
        throw s;
        s;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        if (true) goto _L5; else goto _L2
_L2:
        s1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void c()
    {
        if (c != null)
        {
            c.deleteDatabase("DEPARTMENT");
        }
        b = null;
        close();
    }

    public void d()
    {
        try
        {
            SQLiteDatabase sqlitedatabase = getWritableDatabase();
            int i = sqlitedatabase.delete("DEPARTMENTS", "ID LIKE '%fly%'", null);
            sqlitedatabase.close();
            ae.a(a, (new StringBuilder()).append("All promotions records ").append(i).append(" deleted").toString());
            return;
        }
        catch (Exception exception)
        {
            ae.a(a, "Unable to delete Promotions from department db");
        }
    }

    public boolean d(String s)
    {
        Cursor cursor = getReadableDatabase().query("DEPARTMENTS", new String[] {
            "ID"
        }, "ID=?", new String[] {
            s
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        s = cursor;
        int i = cursor.getCount();
        if (i != 0)
        {
            if (cursor != null && !cursor.isClosed())
            {
                cursor.close();
            }
            return true;
        }
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
_L1:
        return false;
        Exception exception1;
        exception1;
        cursor = null;
_L4:
        s = cursor;
        ae.a(a, (new StringBuilder()).append("Exception in isDepartmentExist(): ").append(exception1.getMessage()).toString());
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
          goto _L1
        Exception exception;
        exception;
        s = null;
_L3:
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        exception1;
          goto _L4
    }

    public void e(String s)
    {
        try
        {
            String s1 = (new StringBuilder()).append("CAT_ID='").append(s).append("'").toString();
            SQLiteDatabase sqlitedatabase = getWritableDatabase();
            int i = sqlitedatabase.delete("DEPARTMENTS", s1, null);
            ae.a(a, (new StringBuilder()).append("Promotion").append(s).append(" records :").append(i).append(" deleted").toString());
            sqlitedatabase.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.a(a, "Unable to delete Promotions from department db");
        }
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS DEPARTMENTS(ID TEXT,NAME TEXT,URL TEXT,CAT_ID TEXT,TITLE_IMAGE TEXT,TEMPLATE TEXT,TABLET TEXT,ONLINE TEXT,MOBILE TEXT,EXTERNAL TEXT,UNIQUE(NAME,CAT_ID))");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS DEPARTMENTS");
        onCreate(sqlitedatabase);
    }

}
