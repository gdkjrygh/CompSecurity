// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class h extends SQLiteOpenHelper
{

    private static final String b;
    public final int a;
    private long c;

    public h(Context context, String s)
    {
        this(context, s, -1);
    }

    public h(Context context, String s, int i)
    {
        super(context, s, null, 1);
        c = 0L;
        a = i;
    }

    public static transient String a(String s, String s1, String as[])
    {
        int i = 0;
        while (i < as.length) 
        {
            String s2 = String.valueOf(as[i]);
            String s3 = String.valueOf(s1);
            if (s3.length() != 0)
            {
                s2 = s2.concat(s3);
            } else
            {
                s2 = new String(s2);
            }
            as[i] = s2;
            i++;
        }
        return TextUtils.join(s, as);
    }

    private static String[] a(Entry entry, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return (new String[] {
                entry.getFromLanguageShortName(), entry.getToLanguageShortName(), entry.getInputText()
            });
        } else
        {
            return (new String[] {
                entry.getFromLanguageShortName(), entry.getToLanguageShortName(), entry.getInputText(), s
            });
        }
    }

    private static String b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return a(" AND ", " = ?", new String[] {
                "sl", "tl", "input"
            });
        } else
        {
            return a(" AND ", " = ?", new String[] {
                "sl", "tl", "input", "translation"
            });
        }
    }

    public static String e()
    {
        return String.format(Locale.ENGLISH, "id NOT NULL AND id != '' AND id != '%s'", new Object[] {
            "_phrase_too_long_"
        });
    }

    public final h a()
    {
        this;
        JVM INSTR monitorenter ;
        return this;
    }

    public final Entry a(Entry entry)
    {
        String s = entry.getTranslation();
        entry = a(getReadableDatabase().query("entries", null, b(s), a(entry, s), null, null, null));
        if (entry.size() > 0)
        {
            return (Entry)entry.get(0);
        } else
        {
            return null;
        }
    }

    public final List a(int i, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return a(getReadableDatabase().query("entries", null, null, null, null, null, "created DESC", (new StringBuilder(14)).append("0, ").append(i).toString()));
        } else
        {
            SQLiteDatabase sqlitedatabase = getReadableDatabase();
            String s1 = a(" OR ", " LIKE '%' || ? || '%'", new String[] {
                "input", "translation"
            });
            String s2 = (new StringBuilder(14)).append("0, ").append(i).toString();
            return a(sqlitedatabase.query("entries", null, s1, new String[] {
                s, s
            }, null, null, "created DESC", s2));
        }
    }

    public final List a(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        int i;
        cursor.moveToFirst();
        i = cursor.getCount();
_L2:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Entry entry = new Entry(cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        entry.setCreatedTime(cursor.getLong(6));
        entry.setId(cursor.getString(0));
        arraylist.add(entry);
        cursor.moveToNext();
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        cursor.close();
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        cursor;
        throw cursor;
    }

    public final List a(String s, String s1)
    {
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = "";
        }
        s = s.trim();
        if (s.isEmpty())
        {
            s = getReadableDatabase();
            s1 = (new StringBuilder(14)).append("0, 3").toString();
            return a(s.query(true, "entries", null, "sl LIKE '%' || ? || '%'", new String[] {
                s2
            }, "input", null, "created DESC", s1));
        }
        if (s.getBytes().length >= 50000)
        {
            return new ArrayList();
        } else
        {
            s1 = getReadableDatabase();
            String s3 = b;
            String s4 = (new StringBuilder(14)).append("0, 3").toString();
            return a(s1.query(true, "entries", null, s3, new String[] {
                s, s, s2
            }, "input", null, "created DESC", s4));
        }
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        getWritableDatabase().delete("entries", "id = ?", new String[] {
            s
        });
        c = System.currentTimeMillis();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final List b()
    {
        return a(getReadableDatabase().query("entries", null, null, null, null, null, "input COLLATE NOCASE ASC"));
    }

    public final void b(Entry entry)
    {
        this;
        JVM INSTR monitorenter ;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sl", entry.getFromLanguageShortName());
        contentvalues.put("tl", entry.getToLanguageShortName());
        contentvalues.put("input", entry.getInputText());
        contentvalues.put("output", entry.getOutputText());
        contentvalues.put("translation", entry.getTranslation());
        contentvalues.put("accessed", Long.valueOf(entry.getCreatedTime()));
        contentvalues.put("created", Long.valueOf(entry.getCreatedTime()));
        contentvalues.put("id", entry.getId());
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        sqlitedatabase.beginTransaction();
        String s = entry.getTranslation();
        if (sqlitedatabase.update("entries", contentvalues, b(s), a(entry, s)) == 0)
        {
            sqlitedatabase.insert("entries", null, contentvalues);
            if (a > 0 && DatabaseUtils.queryNumEntries(sqlitedatabase, "entries") > (long)a)
            {
                sqlitedatabase.execSQL("DELETE FROM entries where created = (SELECT MIN(created) FROM entries)");
            }
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        c = System.currentTimeMillis();
        this;
        JVM INSTR monitorexit ;
        return;
        entry;
        throw entry;
    }

    public final List c()
    {
        Object obj = getReadableDatabase();
        Object obj1 = e();
        obj = ((SQLiteDatabase) (obj)).query("entries", new String[] {
            "id"
        }, ((String) (obj1)), null, null, null, null);
        obj1 = new ArrayList();
        if (obj != null)
        {
            int j = ((Cursor) (obj)).getColumnIndex("id");
            ((Cursor) (obj)).moveToFirst();
            for (int i = ((Cursor) (obj)).getCount(); i > 0; i--)
            {
                String s = ((Cursor) (obj)).getString(j);
                if (!TextUtils.isEmpty(s))
                {
                    ((List) (obj1)).add(s);
                }
                ((Cursor) (obj)).moveToNext();
            }

            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
    }

    public final void c(Entry entry)
    {
        this;
        JVM INSTR monitorenter ;
        String s = entry.getTranslation();
        getWritableDatabase().delete("entries", b(s), a(entry, s));
        c = System.currentTimeMillis();
        this;
        JVM INSTR monitorexit ;
        return;
        entry;
        throw entry;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        getWritableDatabase().delete("entries", null, null);
        c = System.currentTimeMillis();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d(Entry entry)
    {
        return a(entry) != null;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        String s = String.valueOf("CREATE TABLE entries(");
        String s1 = a(",  ", " TEXT", new String[] {
            "id", "sl", "tl", "input", "output", "translation"
        });
        String s2 = a(",  ", " INTEGER", new String[] {
            "created", "accessed"
        });
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", ").append(s2).append(")").toString());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    static 
    {
        String s = String.valueOf("input <> ? AND ");
        String s1 = String.valueOf(a(" AND ", " LIKE '%' || ? || '%'", new String[] {
            "input", "sl"
        }));
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        b = s;
    }
}
