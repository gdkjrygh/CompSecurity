// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.pandora.radio.data.ag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p.cw.c;

// Referenced classes of package com.pandora.radio.provider:
//            d

public class f
{
    private class a
        implements d.b
    {

        final f a;

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(new d.c("SETTINGS", f.d()));
            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
        }

        public void a(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            f.a(sqlitedatabase, a);
        }

        private a()
        {
            a = f.this;
            super();
        }

    }


    private static final HashMap a;
    private final d b;

    public f(d d1)
    {
        b = d1;
    }

    static void a(SQLiteDatabase sqlitedatabase, f f1)
    {
        b(sqlitedatabase, f1);
    }

    private static void b(SQLiteDatabase sqlitedatabase, f f1)
    {
        f1.a("STATION_LIST_CHECKSUM", "", sqlitedatabase);
        f1.a("GENRE_STATION_LIST_CHECKSUM", "", sqlitedatabase);
        c.z.k().c(null);
    }

    static d.a[] d()
    {
        return e();
    }

    private static d.a[] e()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("SETTING_KEY"), com.pandora.radio.provider.d.a.b("SETTING_VALUE")
        });
    }

    public Boolean a(String s)
    {
        s = b(s);
        boolean flag;
        if (s == null)
        {
            flag = false;
        } else
        {
            flag = s.equals("true");
        }
        return Boolean.valueOf(flag);
    }

    public void a()
    {
        b.a().execSQL("DELETE FROM SETTINGS where SETTING_KEY != ?", new String[] {
            "DEVICE_ID"
        });
    }

    public void a(String s, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return;
        }
        if (boolean1.booleanValue())
        {
            boolean1 = "true";
        } else
        {
            boolean1 = "false";
        }
        a(s, ((String) (boolean1)));
    }

    public void a(String s, String s1)
    {
        a(s, s1, null);
    }

    protected void a(String s, String s1, SQLiteDatabase sqlitedatabase)
    {
        if (sqlitedatabase == null)
        {
            sqlitedatabase = b.a();
        }
        Cursor cursor = com.pandora.radio.provider.d.a(sqlitedatabase, "SETTINGS", a, new String[] {
            "SETTING_KEY", "SETTING_VALUE"
        }, "SETTING_KEY = ?", new String[] {
            s
        }, null, null, null);
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        sqlitedatabase.execSQL("UPDATE SETTINGS SET SETTING_KEY = ?, SETTING_VALUE = ? WHERE SETTING_KEY = ?", new String[] {
            s, s1, s
        });
_L4:
        if (cursor != null)
        {
            cursor.close();
        }
        return;
_L2:
        sqlitedatabase.execSQL("INSERT INTO SETTINGS (SETTING_KEY, SETTING_VALUE) VALUES (?, ?)", new String[] {
            s, s1
        });
        if (true) goto _L4; else goto _L3
_L3:
        s;
_L6:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
        s;
        cursor = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public d.b b()
    {
        return new a();
    }

    public String b(String s)
    {
        String s1 = null;
        s = com.pandora.radio.provider.d.a(b.a(), "SETTINGS", a, new String[] {
            "SETTING_VALUE"
        }, "SETTING_KEY = ?", new String[] {
            s
        }, null, null, null);
        if (s.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        s.moveToFirst();
        s1 = s.getString(0);
        if (s != null)
        {
            s.close();
        }
        return s1;
        if (s != null)
        {
            s.close();
        }
        return null;
        s;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        Exception exception;
        exception;
        s1 = s;
        s = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void c()
    {
        (new Thread("ChecksumInvalidator") {

            final f a;

            public void run()
            {
                f.a(null, a);
            }

            
            {
                a = f.this;
                super(s);
            }
        }).start();
    }

    public void c(String s)
    {
        b.a().execSQL("DELETE FROM SETTINGS WHERE SETTING_KEY = ?", new String[] {
            s
        });
    }

    static 
    {
        a = new HashMap();
        a.put("_id", "_id");
        a.put("SETTING_KEY", "SETTING_KEY");
        a.put("SETTING_VALUE", "SETTING_VALUE");
    }
}
