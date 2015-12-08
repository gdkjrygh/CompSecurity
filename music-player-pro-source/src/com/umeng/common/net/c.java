// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.common.Log;
import com.umeng.common.b.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class c
{
    class a extends SQLiteOpenHelper
    {

        private static final int b = 2;
        private static final String c = "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);";
        final c a;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            Log.c(c.a(), "CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);");
            sqlitedatabase.execSQL("CREATE TABLE umeng_download_task_list (cp TEXT, url TEXT, progress INTEGER, extra TEXT, last_modified TEXT, UNIQUE (cp,url) ON CONFLICT ABORT);");
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int l, int i1)
        {
        }

        a(Context context)
        {
            a = c.this;
            super(context, "UMENG_DATA", null, 2);
        }
    }

    private static class b
    {

        public static final c a = new c(null);


        private b()
        {
        }
    }


    private static final String a = com/umeng/common/net/c.getName();
    private static final String b = "umeng_download_task_list";
    private static final String c = "UMENG_DATA";
    private static final String d = "cp";
    private static final String e = "url";
    private static final String f = "progress";
    private static final String g = "last_modified";
    private static final String h = "extra";
    private static Context i;
    private static final String j = "yyyy-MM-dd HH:mm:ss";
    private a k;

    private c()
    {
        k = new a(i);
    }

    c(c c1)
    {
        this();
    }

    public static c a(Context context)
    {
        if (i == null && context == null)
        {
            throw new NullPointerException();
        }
        if (i == null)
        {
            i = context;
        }
        return b.a;
    }

    static String a()
    {
        return a;
    }

    public List a(String s)
    {
        s = k.getReadableDatabase().query("umeng_download_task_list", new String[] {
            "url"
        }, "cp=?", new String[] {
            s
        }, null, null, null, "1");
        ArrayList arraylist = new ArrayList();
        s.moveToFirst();
        do
        {
            if (s.isAfterLast())
            {
                s.close();
                return arraylist;
            }
            arraylist.add(s.getString(0));
            s.moveToNext();
        } while (true);
    }

    public void a(int l)
    {
        try
        {
            Date date = new Date((new Date()).getTime() - (long)(l * 1000));
            String s = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date);
            s = (new StringBuilder(" DELETE FROM umeng_download_task_list WHERE strftime('yyyy-MM-dd HH:mm:ss', last_modified)<=strftime('yyyy-MM-dd HH:mm:ss', '")).append(s).append("')").toString();
            k.getWritableDatabase().execSQL(s);
            Log.c(a, (new StringBuilder("clearOverdueTasks(")).append(l).append(")").append(" remove all tasks before ").append((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date)).toString());
            return;
        }
        catch (Exception exception)
        {
            Log.b(a, exception.getMessage());
        }
    }

    public void a(String s, String s1, int l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("progress", Integer.valueOf(l));
        contentvalues.put("last_modified", com.umeng.common.b.g.a());
        k.getWritableDatabase().update("umeng_download_task_list", contentvalues, "cp=? and url=?", new String[] {
            s, s1
        });
        Log.c(a, (new StringBuilder("updateProgress(")).append(s).append(", ").append(s1).append(", ").append(l).append(")").toString());
    }

    public void a(String s, String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("extra", s2);
        contentvalues.put("last_modified", com.umeng.common.b.g.a());
        k.getWritableDatabase().update("umeng_download_task_list", contentvalues, "cp=? and url=?", new String[] {
            s, s1
        });
        Log.c(a, (new StringBuilder("updateExtra(")).append(s).append(", ").append(s1).append(", ").append(s2).append(")").toString());
    }

    public boolean a(String s, String s1)
    {
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("cp", s);
        contentvalues.put("url", s1);
        contentvalues.put("progress", Integer.valueOf(0));
        contentvalues.put("last_modified", com.umeng.common.b.g.a());
        Cursor cursor = k.getReadableDatabase().query("umeng_download_task_list", new String[] {
            "progress"
        }, "cp=? and url=?", new String[] {
            s, s1
        }, null, null, null, "1");
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Log.c(a, (new StringBuilder("insert(")).append(s).append(", ").append(s1).append("): ").append(" already exists in the db. Insert is cancelled.").toString());
        boolean flag = false;
_L4:
        cursor.close();
        return flag;
_L2:
        long l = k.getWritableDatabase().insert("umeng_download_task_list", null, contentvalues);
        Exception exception;
        if (l == -1L)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        try
        {
            Log.c(a, (new StringBuilder("insert(")).append(s).append(", ").append(s1).append("): ").append("rowid=").append(l).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        flag = false;
_L6:
        Log.c(a, (new StringBuilder("insert(")).append(s).append(", ").append(s1).append("): ").append(exception.getMessage()).toString(), exception);
        return flag;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int b(String s, String s1)
    {
        s = k.getReadableDatabase().query("umeng_download_task_list", new String[] {
            "progress"
        }, "cp=? and url=?", new String[] {
            s, s1
        }, null, null, null, "1");
        int l;
        if (s.getCount() > 0)
        {
            s.moveToFirst();
            l = s.getInt(0);
        } else
        {
            l = -1;
        }
        s.close();
        return l;
    }

    public String c(String s, String s1)
    {
        Object obj = null;
        s1 = k.getReadableDatabase().query("umeng_download_task_list", new String[] {
            "extra"
        }, "cp=? and url=?", new String[] {
            s, s1
        }, null, null, null, "1");
        s = obj;
        if (s1.getCount() > 0)
        {
            s1.moveToFirst();
            s = s1.getString(0);
        }
        s1.close();
        return s;
    }

    public Date d(String s, String s1)
    {
        Object obj1 = null;
        Cursor cursor = k.getReadableDatabase().query("umeng_download_task_list", new String[] {
            "last_modified"
        }, "cp=? and url=?", new String[] {
            s, s1
        }, null, null, null, null);
        Object obj = obj1;
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            obj = cursor.getString(0);
            Log.c(a, (new StringBuilder("getLastModified(")).append(s).append(", ").append(s1).append("): ").append(((String) (obj))).toString());
            try
            {
                obj = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.c(a, s.getMessage());
                obj = obj1;
            }
        }
        cursor.close();
        return ((Date) (obj));
    }

    public void e(String s, String s1)
    {
        k.getWritableDatabase().delete("umeng_download_task_list", "cp=? and url=?", new String[] {
            s, s1
        });
        Log.c(a, (new StringBuilder("delete(")).append(s).append(", ").append(s1).append(")").toString());
    }

    public void finalize()
    {
        k.close();
    }

}
