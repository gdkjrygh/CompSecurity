// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.ContentValues;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

// Referenced classes of package com.qihoo.security.h:
//            k, j, b

public class e
{

    private static final String e = com/qihoo/security/h/e.getSimpleName();
    private static final String f = String.format("SELECT * FROM %s WHERE %s = ?", new Object[] {
        "pkginfo", "pkg"
    });
    public final String a;
    protected int b;
    protected int c;
    protected final boolean d = true;
    private final int g = 0;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n[];

    protected e(String s)
    {
        c = -1000;
        l = false;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "unkown";
        }
        a = s1;
    }

    public static e a(PackageInfo packageinfo)
    {
        if (packageinfo == null)
        {
            return null;
        }
        e e1 = new e(packageinfo.packageName);
        if ((packageinfo.applicationInfo.flags & 1) != 0)
        {
            e1.i = e1.i | 1;
            e1.i = e1.i | 2;
        }
        e1.c = packageinfo.applicationInfo.uid;
        for (packageinfo = com.qihoo.security.h.k.a().b().iterator(); packageinfo.hasNext(); ((j)packageinfo.next()).a(e1, 2, null)) { }
        e1.l = true;
        return e1;
    }

    public static e a(Cursor cursor, PackageManager packagemanager, boolean flag)
        throws IllegalArgumentException, android.content.pm.PackageManager.NameNotFoundException
    {
        String s = cursor.getString(cursor.getColumnIndexOrThrow("pkg"));
        packagemanager = packagemanager.getPackageInfo(s, 0);
        if (packagemanager == null)
        {
            return null;
        }
        int i1 = cursor.getInt(cursor.getColumnIndexOrThrow("shield"));
        int k1 = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        int l1 = cursor.getInt(cursor.getColumnIndexOrThrow("smark"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("tmark"));
        long l2 = cursor.getLong(cursor.getColumnIndexOrThrow("etc"));
        String s1 = cursor.getString(cursor.getColumnIndexOrThrow("tis"));
        cursor = new e(s);
        cursor.b = i1;
        cursor.k = l2 & 0x3ffffL;
        cursor.i = k1;
        cursor.h = l1;
        cursor.j = i2;
        cursor.c = ((PackageInfo) (packagemanager)).applicationInfo.uid;
        cursor.n = a(s1);
        packagemanager = com.qihoo.security.h.k.a().b().iterator();
        while (packagemanager.hasNext()) 
        {
            j j1 = (j)packagemanager.next();
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            j1.a(cursor, byte0, null);
        }
        return cursor;
    }

    public static e a(Cursor cursor, HashMap hashmap, boolean flag)
        throws IllegalArgumentException, android.content.pm.PackageManager.NameNotFoundException
    {
        String s = cursor.getString(cursor.getColumnIndexOrThrow("pkg"));
        hashmap = (PackageInfo)hashmap.get(s);
        if (hashmap == null)
        {
            throw new android.content.pm.PackageManager.NameNotFoundException();
        }
        int i1 = cursor.getInt(cursor.getColumnIndexOrThrow("shield"));
        int k1 = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        int l1 = cursor.getInt(cursor.getColumnIndexOrThrow("smark"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("tmark"));
        long l2 = cursor.getLong(cursor.getColumnIndexOrThrow("etc"));
        String s1 = cursor.getString(cursor.getColumnIndexOrThrow("tis"));
        cursor = new e(s);
        cursor.b = i1;
        cursor.k = l2 & 0x3ffffL;
        cursor.i = k1;
        cursor.h = l1;
        cursor.j = i2;
        cursor.n = a(s1);
        cursor.c = ((PackageInfo) (hashmap)).applicationInfo.uid;
        hashmap = com.qihoo.security.h.k.a().b().iterator();
        while (hashmap.hasNext()) 
        {
            j j1 = (j)hashmap.next();
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            j1.a(cursor, byte0, null);
        }
        return cursor;
    }

    private static int[] a(String s)
    {
        int ai[] = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        s = ai;
_L4:
        return s;
_L2:
        String as[] = s.split(";");
        s = ai;
        if (as == null)
        {
            continue;
        }
        s = ai;
        if (as.length % 2 != 0)
        {
            continue;
        }
        int j1 = as.length;
        ai = new int[j1];
        int i1 = 0;
        do
        {
            s = ai;
            if (i1 >= j1)
            {
                continue;
            }
            ai[i1] = Integer.valueOf(as[i1]).intValue();
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private long e()
    {
        return (long)((new Random()).nextInt(31) << 50) | k;
    }

    private String f()
    {
        int ai[] = n;
        if (ai == null || ai.length < 1 || ai.length % 2 != 0)
        {
            return null;
        }
        int j1 = ai.length / 2;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append(ai[i1 * 2]);
            stringbuilder.append(";");
            stringbuilder.append(ai[i1 * 2 + 1]);
            if (i1 != j1 - 1)
            {
                stringbuilder.append(";");
            }
        }

        return stringbuilder.toString();
    }

    public int a()
    {
        return m & 1;
    }

    protected void a(PackageManager packagemanager)
    {
        try
        {
            packagemanager = packagemanager.getPackageInfo(a, 0);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            packagemanager = null;
        }
        if (packagemanager == null)
        {
            for (packagemanager = com.qihoo.security.h.k.a().b().iterator(); packagemanager.hasNext(); ((j)packagemanager.next()).a(this, 3, null)) { }
            com.qihoo.security.h.b.a().a("pkginfo", "pkg = ?", new String[] {
                a
            });
        } else
        {
            int i1;
            if ((((PackageInfo) (packagemanager)).applicationInfo.flags & 1) != 0)
            {
                i = i | 1;
            } else
            {
                i = i & -2;
            }
            i1 = ((PackageInfo) (packagemanager)).applicationInfo.uid;
            if (c != i1)
            {
                c = i1;
            }
            packagemanager = com.qihoo.security.h.k.a().b().iterator();
            while (packagemanager.hasNext()) 
            {
                ((j)packagemanager.next()).a(this, 2, null);
            }
        }
    }

    public boolean a(int i1)
    {
        com.qihoo.security.h.k.b(i1);
        return (1 << i1 & b) != 0;
    }

    protected boolean a(int i1, boolean flag)
    {
        if (a(i1) == flag)
        {
            return false;
        }
        i1 = 1 << i1;
        if (flag)
        {
            b = i1 | b & ~i1;
        } else
        {
            b = ~i1 & b;
        }
        l = true;
        return true;
    }

    public int b()
    {
        int j1 = 0;
        k k1 = com.qihoo.security.h.k.a();
        int i1 = 0;
        while (i1 <= 10) 
        {
            int l1;
            if (!k1.a(i1))
            {
                l1 = j1;
            } else
            {
                l1 = j1;
                if ((1 << i1 & b) != 0)
                {
                    l1 = j1 + 1;
                }
            }
            i1++;
            j1 = l1;
        }
        return j1;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = l;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        b b1;
        String s;
        long l1;
        b1 = com.qihoo.security.h.b.a();
        l1 = e();
        s = f();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("shield", Integer.valueOf(b));
        contentvalues.put("type", Integer.valueOf(i));
        contentvalues.put("taxis", Integer.valueOf(0));
        contentvalues.put("smark", Integer.valueOf(h));
        contentvalues.put("tmark", Integer.valueOf(j));
        contentvalues.put("etc", Long.valueOf(l1));
        contentvalues.put("tis", s);
        if (b1.a("pkginfo", contentvalues, "pkg=?", new String[] {
    a
}) <= 0)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        l = false;
        flag = true;
        continue; /* Loop/switch isn't completed */
        ContentValues contentvalues1 = new ContentValues();
        contentvalues1.put("pkg", a);
        contentvalues1.put("shield", Integer.valueOf(b));
        contentvalues1.put("type", Integer.valueOf(i));
        contentvalues1.put("taxis", Integer.valueOf(0));
        contentvalues1.put("smark", Integer.valueOf(h));
        contentvalues1.put("tmark", Integer.valueOf(j));
        contentvalues1.put("etc", Long.valueOf(l1));
        contentvalues1.put("tis", s);
        if (b1.a("pkginfo", contentvalues1) == -1L)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = false;
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
