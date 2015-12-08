// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class ntf
{

    private static final String a = ntn.a(ntf);

    public ntf()
    {
    }

    private static String a(nqk nqk1)
    {
        switch (ntg.a[nqk1.ordinal()])
        {
        default:
            String s = a;
            nqk1 = String.valueOf(nqk1);
            ntn.d(s, (new StringBuilder(String.valueOf(nqk1).length() + 24)).append("Unknown fetch category: ").append(nqk1).toString());
            return null;

        case 1: // '\001'
            return "important_fetch_paging_token";

        case 2: // '\002'
            return "low_fetch_paging_token";
        }
    }

    private static void a(ContentValues contentvalues, SQLiteDatabase sqlitedatabase)
    {
        if (sqlitedatabase.update("user_data", contentvalues, null, null) <= 0)
        {
            sqlitedatabase.insert("user_data", null, contentvalues);
        }
    }

    public static void a(Context context, int i, long l)
    {
        context = nsz.a(context).a(i);
        if (context == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("viewed_sync_version", Long.valueOf(l));
            context.getWritableDatabase().update("user_data", contentvalues, "viewed_sync_version < ? ", new String[] {
                Long.toString(l)
            });
            return;
        }
    }

    public static void a(Context context, int i, nqk nqk1)
    {
        ntf;
        JVM INSTR monitorenter ;
        nsy nsy1 = nsz.a(context).a(i);
        if (nsy1 != null) goto _L2; else goto _L1
_L1:
        ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
_L4:
        ntf;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (nqk1 == nqk.a)
        {
            context = "priority IN (3,4)";
        } else
        {
            context = "priority = 2";
        }
        nsy1.getWritableDatabase().delete("notifications", context, null);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void a(Context context, int i, nqk nqk1, nqx nqx1, qqk qqk1)
    {
        ntf;
        JVM INSTR monitorenter ;
        nsj.a(context, i, qqk1.b, nqx1);
        oyc aoyc[] = nsj.a(qqk1.b);
        ntn.a(a, String.format("Have [%d] notifications after filtering ack notifications.", new Object[] {
            Integer.valueOf(aoyc.length)
        }));
        a(context, i, aoyc, a(nqx1));
        a(context, i, nqk1, qqk1.d);
        b(context, i, nqk1, qqk1.c);
        if (qqk1.a != null && qqk1.a.longValue() != 0L)
        {
            b(context, i, qqk1.a.longValue());
        }
        ntf;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(Context context, int i, nqk nqk1, nqx nqx1, qqq qqq1)
    {
        ntf;
        JVM INSTR monitorenter ;
        nsj.a(context, i, qqq1.b, nqx1);
        oyc aoyc[] = nsj.a(qqq1.b);
        ntn.a(a, String.format("Have [%d] notifications after filtering ack notifications.", new Object[] {
            Integer.valueOf(aoyc.length)
        }));
        a(context, i, aoyc, a(nqx1));
        b(context, i, nqk1, qqq1.c);
        if (qqq1.a != null && qqq1.a.longValue() != 0L)
        {
            b(context, i, qqq1.a.longValue());
        }
        ntf;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void a(Context context, int i, nqk nqk1, byte abyte0[])
    {
        String s = a(nqk1);
        if (s == null)
        {
            context = a;
            nqk1 = String.valueOf(nqk1);
            ntn.d(context, (new StringBuilder(String.valueOf(nqk1).length() + 48)).append("Cannot store paging token for unknown category: ").append(nqk1).toString());
            return;
        }
        nqk1 = new ContentValues();
        nqk1.put(s, abyte0);
        context = nsz.a(context).a(i);
        if (context == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
            return;
        } else
        {
            a(((ContentValues) (nqk1)), context.getWritableDatabase());
            return;
        }
    }

    public static void a(Context context, int i, String as[], boolean flag)
    {
        nsy nsy1 = nsz.a(context).a(i);
        if (nsy1 == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("push_enabled", Boolean.valueOf(false));
            String s = b.c("key", as.length);
            nsy1.getWritableDatabase().update("notifications", contentvalues, s, as);
            d(context, i);
            return;
        }
    }

    public static void a(Context context, int i, oyc aoyc[], boolean flag)
    {
        Object obj = nsz.a(context).a(i);
        if (obj != null) goto _L2; else goto _L1
_L1:
        ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
_L4:
        return;
_L2:
        if (i == -1) goto _L4; else goto _L3
_L3:
        SQLiteDatabase sqlitedatabase;
        int j;
        int k;
        sqlitedatabase = ((nsy) (obj)).getWritableDatabase();
        k = aoyc.length;
        j = 0;
_L16:
        oyc oyc1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        oyc1 = aoyc[j];
        if (!a(context, i, oyc1)) goto _L6; else goto _L5
_L5:
        String s;
        if (!flag)
        {
            oyc1.h = Boolean.valueOf(true);
        }
        s = null;
        obj = s;
        sqlitedatabase.beginTransaction();
        obj = s;
        nsx nsx1 = b.a(context, i, new String[] {
            oyc1.a
        });
        obj = nsx1;
        int l = nsx1.getCount();
        if (l <= 1) goto _L8; else goto _L7
_L7:
        obj = nsx1;
        String s1 = a;
        obj = nsx1;
        s = String.valueOf(oyc1.a);
        obj = nsx1;
        if (s.length() == 0) goto _L10; else goto _L9
_L9:
        obj = nsx1;
        s = "More than one row for a single key: ".concat(s);
_L11:
        obj = nsx1;
        ntn.d(s1, s);
        obj = nsx1;
        sqlitedatabase.setTransactionSuccessful();
        if (nsx1 != null)
        {
            nsx1.close();
        }
        sqlitedatabase.endTransaction();
_L6:
        j++;
        continue; /* Loop/switch isn't completed */
_L10:
        obj = nsx1;
        s = new String("More than one row for a single key: ");
          goto _L11
        context;
        if (obj != null)
        {
            ((nsx) (obj)).close();
        }
        sqlitedatabase.endTransaction();
        throw context;
_L8:
        if (l != 1) goto _L13; else goto _L12
_L12:
        obj = nsx1;
        nsx1.moveToFirst();
        obj = nsx1;
        long l1 = nsx1.b();
        obj = nsx1;
        if (oyc1.f == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        obj = nsx1;
        if (oyc1.f.longValue() <= l1)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj = nsx1;
        a(oyc1, nsx1.c(), sqlitedatabase);
_L14:
        obj = nsx1;
        sqlitedatabase.setTransactionSuccessful();
        if (nsx1 != null)
        {
            nsx1.close();
        }
        sqlitedatabase.endTransaction();
          goto _L6
_L13:
        obj = nsx1;
        a(oyc1, 0L, sqlitedatabase);
          goto _L14
        d(context, i);
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static void a(oyc oyc1, long l, SQLiteDatabase sqlitedatabase)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("key", oyc1.a);
        contentvalues.put("priority", Integer.valueOf(oyc1.e));
        contentvalues.put("read_state", Integer.valueOf(oyc1.d));
        contentvalues.put("sort_version", oyc1.g);
        long l1;
        boolean flag;
        if (oyc1.f == null)
        {
            l1 = 0L;
        } else
        {
            l1 = oyc1.f.longValue();
        }
        contentvalues.put("last_modified_version", Long.valueOf(l1));
        contentvalues.put("system_tray_version", Long.valueOf(l));
        if (oyc1.h == null || !oyc1.h.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentvalues.put("push_enabled", Boolean.valueOf(flag));
        contentvalues.put("sync_behavior", Integer.valueOf(oyc1.k));
        if (oyc1.j != null)
        {
            contentvalues.put("analytics_data", qlw.a(oyc1.j));
        }
        if (oyc1.c != null)
        {
            oyc1 = oyc1.c;
            if (((ozc) (oyc1)).d != null)
            {
                contentvalues.put("payload", qlw.a(((ozc) (oyc1)).d));
            }
            if (((ozc) (oyc1)).a != null)
            {
                contentvalues.put("collapsed_info", qlw.a(((ozc) (oyc1)).a));
            }
            if (((ozc) (oyc1)).b != null)
            {
                contentvalues.put("expanded_info", qlw.a(((ozc) (oyc1)).b));
            }
            if (((ozc) (oyc1)).c != null)
            {
                oyc1 = ((ozc) (oyc1)).c.a;
                if (oyc1 != null)
                {
                    contentvalues.put("android_render_info", qlw.a(oyc1));
                }
            }
        }
        sqlitedatabase.insertWithOnConflict("notifications", null, contentvalues, 5);
    }

    public static boolean a(Context context, int i)
    {
        boolean flag = false;
        ntf;
        JVM INSTR monitorenter ;
        Object obj = nsz.a(context).a(i);
        if (obj != null) goto _L2; else goto _L1
_L1:
        ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
_L4:
        ntf;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        obj = ((nsy) (obj)).getWritableDatabase();
        ((SQLiteDatabase) (obj)).execSQL(String.format("DELETE FROM %s", new Object[] {
            "notifications"
        }));
        ((SQLiteDatabase) (obj)).execSQL(String.format("DELETE FROM %s", new Object[] {
            "user_data"
        }));
        d(context, i);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    private static boolean a(Context context, int i, oyc oyc1)
    {
        for (context = olm.c(context, nrc).iterator(); context.hasNext();)
        {
            if (((nrc)context.next()).a(i, oyc1) == nrd.a)
            {
                return false;
            }
        }

        return oyc1.a != null && oyc1.a.length() != 0;
    }

    public static boolean a(Context context, int i, String as[], int j)
    {
        nsy nsy1 = nsz.a(context).a(i);
        if (nsy1 == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
        } else
        {
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("read_state", Integer.valueOf(j));
            String s = String.valueOf(b.c("key", as.length));
            String s1 = String.valueOf("read_state");
            s = (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(s1).length())).append(s).append(" and ").append(s1).append(" != ").append(j).toString();
            if (nsy1.getWritableDatabase().update("notifications", contentvalues, s, as) > 0)
            {
                d(context, i);
                return true;
            }
        }
        return false;
    }

    private static boolean a(nqx nqx1)
    {
        return nqx1 == nqx.a || nqx1 == nqx.b;
    }

    public static ozb[] a(Context context, int i, String s)
    {
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap();
        context = b.a(context, i, new String[] {
            s
        });
        if (!context.moveToFirst()) goto _L2; else goto _L1
_L1:
        int k;
        s = context.e().b;
        k = s.length;
        i = 0;
_L6:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ozb aozb[];
        int l;
        aozb = ((oyp) (s[i])).a.b;
        l = aozb.length;
        int j = 0;
_L5:
        if (j >= l) goto _L4; else goto _L3
_L3:
        ozb ozb1 = aozb[j];
        if (!TextUtils.isEmpty(ozb1.b) && !linkedhashmap.containsKey(ozb1.b))
        {
            linkedhashmap.put(ozb1.b, ozb1);
        }
        j++;
          goto _L5
_L4:
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        context.close();
        return (ozb[])linkedhashmap.values().toArray(new ozb[linkedhashmap.size()]);
        s;
        context.close();
        throw s;
    }

    public static qqt[] a(Context context, int i, String as[])
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        context = b.a(context, i, as);
        while (context.moveToNext()) 
        {
            as = new qqt();
            as.a = context.a();
            as.b = Long.valueOf(context.b());
            arraylist.add(as);
        }
        break MISSING_BLOCK_LABEL_67;
        as;
        context.close();
        throw as;
        context.close();
        return (qqt[])arraylist.toArray(new qqt[arraylist.size()]);
    }

    private static String b(nqk nqk1)
    {
        switch (ntg.a[nqk1.ordinal()])
        {
        default:
            String s = a;
            nqk1 = String.valueOf(nqk1);
            ntn.d(s, (new StringBuilder(String.valueOf(nqk1).length() + 24)).append("Unknown fetch category: ").append(nqk1).toString());
            return null;

        case 1: // '\001'
            return "important_sync_token";

        case 2: // '\002'
            return "low_sync_token";
        }
    }

    public static void b(Context context, int i)
    {
        nsy nsy1 = nsz.a(context).a(i);
        if (nsy1 == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("read_state", Integer.valueOf(4));
            nsy1.getWritableDatabase().update("notifications", contentvalues, "priority IN (3,4) and read_state = 1", null);
            d(context, i);
            return;
        }
    }

    private static void b(Context context, int i, long l)
    {
        context = nsz.a(context).a(i);
        if (context == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("sync_version", Long.valueOf(l));
            a(contentvalues, context.getWritableDatabase());
            return;
        }
    }

    public static void b(Context context, int i, nqk nqk1, nqx nqx1, qqk qqk1)
    {
        ntf;
        JVM INSTR monitorenter ;
        nsj.a(context, i, qqk1.b, nqx1);
        nqx1 = nsj.a(qqk1.b);
        ntn.a(a, String.format("Have [%d] notifications after filtering ack notifications.", new Object[] {
            Integer.valueOf(nqx1.length)
        }));
        a(context, i, nqx1, false);
        a(context, i, nqk1, qqk1.d);
        ntf;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void b(Context context, int i, nqk nqk1, byte abyte0[])
    {
        String s = b(nqk1);
        if (s == null)
        {
            context = a;
            nqk1 = String.valueOf(nqk1);
            ntn.d(context, (new StringBuilder(String.valueOf(nqk1).length() + 48)).append("Cannot store paging token for unknown category: ").append(nqk1).toString());
            return;
        }
        nqk1 = new ContentValues();
        nqk1.put(s, abyte0);
        context = nsz.a(context).a(i);
        if (context == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
            return;
        } else
        {
            a(nqk1, context.getWritableDatabase());
            return;
        }
    }

    private static byte[] b(Context context, int i, String s)
    {
        ntf;
        JVM INSTR monitorenter ;
        context = nsz.a(context).a(i);
        if (context != null) goto _L2; else goto _L1
_L1:
        ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
        context = null;
_L3:
        ntf;
        JVM INSTR monitorexit ;
        return context;
_L2:
        Cursor cursor = context.getReadableDatabase().query("user_data", new String[] {
            s
        }, null, null, null, null, null, null);
        i = cursor.getCount();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        cursor.close();
        context = null;
          goto _L3
        cursor.moveToFirst();
        context = cursor.getBlob(cursor.getColumnIndexOrThrow(s));
        cursor.close();
          goto _L3
        context;
        throw context;
        context;
        cursor.close();
        throw context;
    }

    public static byte[] b(Context context, int i, nqk nqk1)
    {
        ntf;
        JVM INSTR monitorenter ;
        String s = a(nqk1);
        if (s != null) goto _L2; else goto _L1
_L1:
        context = a;
        nqk1 = String.valueOf(nqk1);
        ntn.d(context, (new StringBuilder(String.valueOf(nqk1).length() + 51)).append("Cannot retrieve paging token for unknown category: ").append(nqk1).toString());
        context = null;
_L4:
        ntf;
        JVM INSTR monitorexit ;
        return context;
_L2:
        context = b(context, i, s);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static nqs[] b(Context context, int i, String as[])
    {
        context = b.a(context, i, as);
        as = new nqs[context.getCount()];
        while (context.moveToNext()) 
        {
            i = context.getPosition();
            nqt nqt1 = new nqt();
            nqt1.a = context.a();
            nqt1.b = context.k();
            nqt1.c = context.i();
            nqt1.d = context.j();
            as[i] = nqt1.a();
        }
        break MISSING_BLOCK_LABEL_84;
        as;
        context.close();
        throw as;
        context.close();
        return as;
    }

    public static Cursor c(Context context, int i)
    {
        context = nsz.a(context).a(i);
        if (context == null)
        {
            ntn.d(a, (new StringBuilder(52)).append("Cannot find database helper for account: ").append(i).toString());
        } else
        {
            context = context.getReadableDatabase().query("user_data", null, null, null, null, null, null);
            if (context.getCount() != 0)
            {
                return context;
            }
        }
        return null;
    }

    public static byte[] c(Context context, int i, nqk nqk1)
    {
        ntf;
        JVM INSTR monitorenter ;
        String s = b(nqk1);
        if (s != null) goto _L2; else goto _L1
_L1:
        context = a;
        nqk1 = String.valueOf(nqk1);
        ntn.d(context, (new StringBuilder(String.valueOf(nqk1).length() + 49)).append("Cannot retrieve sync token for unknown category: ").append(nqk1).toString());
        context = null;
_L4:
        ntf;
        JVM INSTR monitorexit ;
        return context;
_L2:
        context = b(context, i, s);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    private static void d(Context context, int i)
    {
        context.getContentResolver().notifyChange(nsw.a, null);
        if (i != -1)
        {
            ((nql)olm.a(context, nql)).a(i, false);
        }
    }

}
