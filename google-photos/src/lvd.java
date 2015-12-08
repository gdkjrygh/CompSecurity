// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lvd
{

    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static HashMap e;
    private static Object f;
    private static String g[] = new String[0];
    private static Context h = null;

    public lvd()
    {
    }

    public static int a(ContentResolver contentresolver, String s, int i)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        int j = i;
        if (contentresolver != null)
        {
            try
            {
                j = Integer.parseInt(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return i;
            }
        }
        return j;
    }

    public static long a(ContentResolver contentresolver, String s, long l)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        long l1 = l;
        if (contentresolver != null)
        {
            try
            {
                l1 = Long.parseLong(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return l;
            }
        }
        return l1;
    }

    static Object a(Object obj)
    {
        f = obj;
        return obj;
    }

    public static String a(ContentResolver contentresolver, String s, String s1)
    {
        lvd;
        JVM INSTR monitorenter ;
        Object obj;
        a(contentresolver);
        obj = f;
        if (!e.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        contentresolver = (String)e.get(s);
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        lvd;
        JVM INSTR monitorexit ;
        return s1;
        lvd;
        JVM INSTR monitorexit ;
        String s2;
        String as[] = g;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s2 = s1;
            if (s.startsWith(as[i]))
            {
                break MISSING_BLOCK_LABEL_231;
            }
        }

        break MISSING_BLOCK_LABEL_96;
        contentresolver;
        lvd;
        JVM INSTR monitorexit ;
        throw contentresolver;
        Cursor cursor;
        cursor = contentresolver.query(a, null, null, new String[] {
            s
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        e.put(s, null);
        s2 = s1;
        if (cursor != null)
        {
            cursor.close();
            return s1;
        }
        break MISSING_BLOCK_LABEL_231;
        contentresolver = cursor.getString(1);
        lvd;
        JVM INSTR monitorenter ;
        if (obj == f)
        {
            e.put(s, contentresolver);
        }
        lvd;
        JVM INSTR monitorexit ;
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        s2 = s1;
        if (cursor != null)
        {
            cursor.close();
            return s1;
        }
        break MISSING_BLOCK_LABEL_231;
        contentresolver;
        lvd;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        if (cursor != null)
        {
            cursor.close();
        }
        throw contentresolver;
        return s2;
    }

    static HashMap a()
    {
        return e;
    }

    private static void a(ContentResolver contentresolver)
    {
        if (e == null)
        {
            e = new HashMap();
            f = new Object();
            (new lve("Gservices", contentresolver)).start();
        }
    }

    public static transient void a(ContentResolver contentresolver, String as[])
    {
        Map map = b(contentresolver, as);
        lvd;
        JVM INSTR monitorenter ;
        a(contentresolver);
        g = as;
        for (contentresolver = map.entrySet().iterator(); contentresolver.hasNext(); e.put(as.getKey(), as.getValue()))
        {
            as = (java.util.Map.Entry)contentresolver.next();
        }

        break MISSING_BLOCK_LABEL_76;
        contentresolver;
        lvd;
        JVM INSTR monitorexit ;
        throw contentresolver;
        lvd;
        JVM INSTR monitorexit ;
    }

    public static boolean a(ContentResolver contentresolver, String s, boolean flag)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        if (contentresolver == null || contentresolver.equals(""))
        {
            return flag;
        }
        if (c.matcher(contentresolver).matches())
        {
            return true;
        }
        if (d.matcher(contentresolver).matches())
        {
            return false;
        } else
        {
            Log.w("Gservices", (new StringBuilder("attempt to read gservices key ")).append(s).append(" (value \"").append(contentresolver).append("\") as boolean").toString());
            return flag;
        }
    }

    private static transient Map b(ContentResolver contentresolver, String as[])
    {
        contentresolver = contentresolver.query(b, null, null, as, null);
        as = new TreeMap();
        if (contentresolver == null)
        {
            return as;
        }
        for (; contentresolver.moveToNext(); as.put(contentresolver.getString(0), contentresolver.getString(1))) { }
        break MISSING_BLOCK_LABEL_66;
        as;
        contentresolver.close();
        throw as;
        contentresolver.close();
        return as;
    }

    static String[] b()
    {
        return g;
    }

}
