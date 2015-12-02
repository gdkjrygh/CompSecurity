// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.installreport;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.service.d;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.installreport:
//            b, d

public class a
{

    private static final String a = com/qihoo/security/installreport/a.getSimpleName();
    private static final Uri b;
    private static String c = null;
    private static boolean d = false;
    private static boolean e = false;
    private static ArrayList f = null;
    private static int g = 180;

    public a()
    {
    }

    private static com.qihoo.security.installreport.d a(Cursor cursor)
    {
        int i = cursor.getInt(cursor.getColumnIndex("_id"));
        int j = cursor.getInt(cursor.getColumnIndex("mid"));
        int k = cursor.getInt(cursor.getColumnIndex("pid"));
        String s = cursor.getString(cursor.getColumnIndex("pn"));
        String s1 = cursor.getString(cursor.getColumnIndex("adid"));
        String s2 = cursor.getString(cursor.getColumnIndex("c1"));
        String s3 = cursor.getString(cursor.getColumnIndex("c2"));
        String s4 = cursor.getString(cursor.getColumnIndex("c3"));
        String s5 = cursor.getString(cursor.getColumnIndex("p1"));
        String s6 = cursor.getString(cursor.getColumnIndex("p2"));
        int l = cursor.getInt(cursor.getColumnIndex("rn"));
        return new com.qihoo.security.installreport.d(i, cursor.getInt(cursor.getColumnIndex("tp")), s, cursor.getLong(cursor.getColumnIndex("ts")), l, j, k, s1, s5, s6, s2, s3, s4);
    }

    public static void a()
    {
        long l = SharedPref.b(SecurityApplication.a(), "last_install_report_time", 0L);
        long l1 = System.currentTimeMillis();
        if (l1 - l >= 0x6ddd00L || l1 < l)
        {
            a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Install);
            a(com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp);
        }
    }

    public static void a(Context context)
    {
        try
        {
            context.getContentResolver().delete(b, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void a(Context context, com.qihoo.security.adv.AdvDataManager.AdvReportType advreporttype)
    {
        long l = 0L;
        int i = 0;
        long l1;
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.Install)
        {
            l = 0x5265c00L;
            i = 1;
        } else
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
        {
            l = 0x9a7ec800L;
            i = 3;
        }
        l1 = System.currentTimeMillis();
        advreporttype = (new StringBuilder()).append("ts<").append(l1 - l).append(" and ").append("tp").append("=").append(i).toString();
        try
        {
            context.getContentResolver().delete(b, advreporttype, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, List list)
    {
        ArrayList arraylist;
        try
        {
            context = context.getContentResolver();
            arraylist = new ArrayList();
            android.content.ContentProviderOperation.Builder builder;
            for (list = list.iterator(); list.hasNext(); arraylist.add(builder.build()))
            {
                Object obj = (com.qihoo.security.installreport.d)list.next();
                builder = ContentProviderOperation.newInsert(b);
                obj = ((com.qihoo.security.installreport.d) (obj)).a();
                ((ContentValues) (obj)).put("tp", Integer.valueOf(3));
                ((ContentValues) (obj)).put("ts", Long.valueOf(System.currentTimeMillis()));
                builder.withValues(((ContentValues) (obj)));
                builder.withYieldAllowed(true);
            }

        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context.applyBatch("com.qihoo.security.lite.installreport", arraylist);
        return;
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvReportType advreporttype)
    {
        if (!b(advreporttype)) goto _L2; else goto _L1
_L1:
        Context context;
        return;
_L2:
        if ((context = SecurityApplication.a()) == null) goto _L1; else goto _L3
_L3:
        List list;
        JSONArray jsonarray;
        Iterator iterator;
        boolean flag;
        b(advreporttype, true);
        a(context, advreporttype);
        list = b(context, advreporttype);
        if (list.size() == 0)
        {
            b(advreporttype, false);
            return;
        }
        jsonarray = new JSONArray();
        flag = com.qihoo.security.b.a.a(context);
        iterator = list.iterator();
_L5:
        JSONObject jsonobject;
        com.qihoo.security.installreport.d d1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_315;
            }
            d1 = (com.qihoo.security.installreport.d)iterator.next();
        } while (d1 == null);
        jsonobject = new JSONObject();
        jsonobject.put("type", advreporttype.getType());
        jsonobject.put("mid", d1.f);
        jsonobject.put("pid", d1.g);
        jsonobject.put("pkg", d1.c);
        jsonobject.put("p1", d1.i);
        jsonobject.put("p2", d1.j);
        jsonobject.put("c1", d1.k);
        jsonobject.put("c2", d1.l);
        jsonobject.put("c3", d1.m);
        jsonobject.put("adid", d1.h);
        if (advreporttype != com.qihoo.security.adv.AdvDataManager.AdvReportType.Install)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            jsonobject.put("co", i);
        }
        catch (JSONException jsonexception) { }
        jsonarray.put(jsonobject);
        if (true) goto _L5; else goto _L4
_L4:
        if (advreporttype != com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        jsonobject.put("co", (System.currentTimeMillis() - d1.d) / 0x5265c00L);
        break MISSING_BLOCK_LABEL_262;
        String s = SecurityApplication.c();
        if (!s.equals(context.getPackageName()))
        {
            com.qihoo.security.service.d.a(a, Integer.valueOf(jsonarray.hashCode()));
        }
        AdvDataManager.a().a(jsonarray, new com.qihoo.security.adv.AdvDataManager.c(context, jsonarray, advreporttype, list, flag, s) {

            final Context a;
            final JSONArray b;
            final com.qihoo.security.adv.AdvDataManager.AdvReportType c;
            final List d;
            final boolean e;
            final String f;

            public void a(Long long1, Long long2)
            {
            }

            public void a(Long long1, Long long2, int j)
            {
                if (f != null && !f.equals(a.getPackageName()))
                {
                    com.qihoo.security.service.d.b(a.b(), Integer.valueOf(b.hashCode()));
                }
                a.a(c, false);
            }

            public volatile void a(Object obj, Object obj1)
            {
                a((Long)obj, (Long)obj1);
            }

            public volatile void a(Object obj, Object obj1, int j)
            {
                a((Long)obj, (Long)obj1, j);
            }

            public volatile void a(Object obj, Object obj1, Object obj2)
            {
                a((String)obj, (Long)obj1, (Long)obj2);
            }

            public void a(String s1, Long long1, Long long2)
            {
                s1 = SecurityApplication.c();
                if (s1 != null && !s1.equals(a.getPackageName()))
                {
                    com.qihoo.security.service.d.b(a.b(), Integer.valueOf(b.hashCode()));
                }
                (new Thread(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        if (a.c == com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
                        {
                            a.b(a.a, a.d);
                        } else
                        if (!a.e)
                        {
                            a.a(a.a);
                        } else
                        {
                            a.b(a.a, a.d);
                        }
                        a.a(a.c, false);
                    }

            
            {
                a = _pcls1;
                super();
            }
                })).start();
            }

            
            {
                a = context;
                b = jsonarray;
                c = advreporttype;
                d = list;
                e = flag;
                f = s;
                super();
            }
        });
        return;
    }

    static void a(com.qihoo.security.adv.AdvDataManager.AdvReportType advreporttype, boolean flag)
    {
        b(advreporttype, flag);
    }

    public static void a(String s)
    {
        try
        {
            ContentResolver contentresolver = SecurityApplication.a().getContentResolver();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("tp", Integer.valueOf(4));
            if (contentresolver.update(b, contentvalues, "pn =? and tp = 3", new String[] {
    s
}) > 0)
            {
                a(com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public static void a(String s, int i, int j, int k, String s1, String s2, String s3, String s4, 
            String s5, String s6)
    {
        s = (new com.qihoo.security.installreport.d(-1, 1, s, System.currentTimeMillis(), i, j, k, s1, s2, s3, s4, s5, s6)).a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s1 = SecurityApplication.a().getContentResolver();
        s1.insert(b, s);
        return;
        s;
    }

    static String b()
    {
        return a;
    }

    private static List b(Context context, com.qihoo.security.adv.AdvDataManager.AdvReportType advreporttype)
    {
        Object obj = null;
        Exception exception = null;
        Error error;
        byte byte0;
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.Install)
        {
            byte0 = 2;
        } else
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        advreporttype = new ArrayList();
        context = context.getContentResolver().query(b.buildUpon().appendQueryParameter("limit", "20").build(), null, (new StringBuilder()).append("tp = ").append(byte0).toString(), null, "_id DESC");
        if (context == null) goto _L2; else goto _L1
_L1:
        for (; context.moveToNext(); advreporttype.add(a(context))) { }
          goto _L2
        exception;
_L8:
        Utils.closeCursor(context);
        return advreporttype;
_L2:
        Utils.closeCursor(context);
        return advreporttype;
        context;
        context = exception;
_L6:
        Utils.closeCursor(context);
        return advreporttype;
        advreporttype;
        context = obj;
_L4:
        Utils.closeCursor(context);
        throw advreporttype;
        advreporttype;
        if (true) goto _L4; else goto _L3
_L3:
        error;
        if (true) goto _L6; else goto _L5
_L5:
        context;
        context = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void b(Context context, List list)
    {
        c(context, list);
    }

    private static void b(com.qihoo.security.adv.AdvDataManager.AdvReportType advreporttype, boolean flag)
    {
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.Install)
        {
            d = flag;
        } else
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
        {
            e = flag;
            return;
        }
    }

    public static void b(String s)
    {
        Object obj1 = null;
        Object obj = null;
        Context context = SecurityApplication.a();
        ContentResolver contentresolver = context.getContentResolver();
        Cursor cursor = contentresolver.query(b, null, "pn =? and tp = 1", new String[] {
            s
        }, "_id DESC");
        boolean flag;
        if (cursor != null)
        {
            IllegalArgumentException illegalargumentexception;
            if (cursor.getCount() > 0)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            s = ((String) (obj));
            if (cursor.moveToFirst())
            {
                long l = cursor.getLong(cursor.getColumnIndex("ts"));
                s = ((String) (obj));
                if (System.currentTimeMillis() < l + 0x5265c00L)
                {
                    s = a(cursor);
                }
            }
            Utils.closeCursor(cursor);
        } else
        {
            flag = true;
            s = obj1;
        }
        while (flag || s == null) 
        {
            return;
        }
        obj = s.a();
        ((ContentValues) (obj)).put("tp", Integer.valueOf(2));
        if (obj != null)
        {
            try
            {
                contentresolver.insert(b, ((ContentValues) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        obj = new ArrayList();
        ((List) (obj)).add(s);
        a(context, ((List) (obj)));
        a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Install);
    }

    private static boolean b(com.qihoo.security.adv.AdvDataManager.AdvReportType advreporttype)
    {
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.Install)
        {
            return d;
        }
        if (advreporttype == com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
        {
            return e;
        } else
        {
            return false;
        }
    }

    private static void c(Context context, List list)
    {
        ArrayList arraylist;
        try
        {
            context = context.getContentResolver();
            arraylist = new ArrayList();
            android.content.ContentProviderOperation.Builder builder;
            for (list = list.iterator(); list.hasNext(); arraylist.add(builder.build()))
            {
                com.qihoo.security.installreport.d d1 = (com.qihoo.security.installreport.d)list.next();
                builder = ContentProviderOperation.newDelete(b);
                builder.withSelection((new StringBuilder()).append("_id = ").append(d1.a).toString(), null);
                builder.withYieldAllowed(true);
            }

        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context = context.applyBatch("com.qihoo.security.lite.installreport", arraylist);
label0:
        {
            if (context != null)
            {
                return;
            }
            break label0;
        }
    }

    static 
    {
        b = Uri.withAppendedPath(b.a, "log");
    }
}
