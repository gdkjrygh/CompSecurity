// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.service.LoadingPermissionDataService;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.qihoo.security.h:
//            k, b, e, i

public final class f
{
    public static interface a
    {

        public abstract boolean a(Set set);
    }

    private class b extends BroadcastReceiver
    {

        final f a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                if ((context = intent.getStringArrayExtra("android.intent.extra.changed_package_list")) != null && context.length > 0)
                {
                    f.a(a).startService((new Intent(f.a(a), com/qihoo/security/service/LoadingPermissionDataService)).setAction("com.qihoo360.mobilesafe.shield.pkgsavailable").putExtra("pkgslist", context));
                    return;
                }
            }
        }

        private b()
        {
            a = f.this;
            super();
        }

    }


    private static final String a = com/qihoo/security/h/f.getSimpleName();
    private static final String b = String.format("SELECT * FROM %s ORDER BY %s", new Object[] {
        "pkginfo", "taxis"
    });
    private static final String c = String.format("SELECT * FROM %s WHERE %s = ?", new Object[] {
        "pkginfo", "pkg"
    });
    private static f d;
    private final Context e;
    private PackageManager f;
    private final k g = com.qihoo.security.h.k.a();
    private boolean h;
    private final ConcurrentHashMap i = new ConcurrentHashMap();
    private final ConcurrentHashMap j = new ConcurrentHashMap();
    private final Set k = Collections.synchronizedSet(new HashSet());
    private b l;
    private ArrayList m;

    private f(Context context)
    {
        h = false;
        e = context.getApplicationContext();
        f = e.getPackageManager();
    }

    static Context a(f f1)
    {
        return f1.e;
    }

    public static f a()
    {
        com/qihoo/security/h/f;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new f(SecurityApplication.a());
        }
        com/qihoo/security/h/f;
        JVM INSTR monitorexit ;
        return d;
        Exception exception;
        exception;
        com/qihoo/security/h/f;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(boolean flag)
        throws Exception
    {
        Cursor cursor = com.qihoo.security.h.b.a().b(b, null);
        HashMap hashmap = new HashMap();
        if (cursor != null && cursor.moveToFirst())
        {
            do
            {
                hashmap.put(cursor.getString(cursor.getColumnIndexOrThrow("pkg")), Integer.valueOf(cursor.getPosition()));
            } while (cursor.moveToNext());
        }
        List list = f.getInstalledPackages(0);
        String s = e.getPackageName();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (PackageInfo)iterator.next();
            if (!k.contains(((PackageInfo) (obj)).packageName) && !s.equals(((PackageInfo) (obj)).packageName))
            {
                Integer integer = (Integer)hashmap.get(((PackageInfo) (obj)).packageName);
                if (integer != null)
                {
                    try
                    {
                        cursor.moveToPosition(integer.intValue());
                        obj = com.qihoo.security.h.e.a(cursor, f, flag);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        obj = null;
                    }
                } else
                {
                    obj = com.qihoo.security.h.e.a(((PackageInfo) (obj)));
                }
                if (obj != null && ((e) (obj)).b() > 0)
                {
                    a(((e) (obj)));
                }
            }
        } while (true);
        SharedPref.a(e, "key_sheild_db_init", true);
        Utils.closeCursor(cursor);
    }

    private void b(boolean flag)
        throws Exception
    {
        HashMap hashmap;
        Object obj;
        obj = f.getInstalledPackages(0);
        hashmap = new HashMap();
        PackageInfo packageinfo;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(packageinfo.packageName, packageinfo))
        {
            packageinfo = (PackageInfo)((Iterator) (obj)).next();
        }

        obj = com.qihoo.security.h.b.a().a(b, null);
        if (obj == null || !((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        e e1 = com.qihoo.security.h.e.a(((Cursor) (obj)), hashmap, flag);
        if (e1 != null) goto _L4; else goto _L3
_L3:
        if (((Cursor) (obj)).moveToNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        Utils.closeCursor(((Cursor) (obj)));
        return;
_L4:
        try
        {
            if (!k.contains(e1.a) && !e.getPackageName().equals(e1.a) && e1.b() > 0)
            {
                a(e1);
            }
        }
        catch (Exception exception) { }
        if (true) goto _L3; else goto _L5
_L5:
        if (true) goto _L1; else goto _L6
_L6:
    }

    private final void e()
    {
        if (l == null)
        {
            l = new b();
            e.registerReceiver(l, new IntentFilter("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE"));
        }
    }

    private void f()
    {
        Iterator iterator = f.getInstalledApplications(0).iterator();
_L2:
        String s;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        obj = (ApplicationInfo)iterator.next();
        s = ((ApplicationInfo) (obj)).packageName;
        if (s == null || !s.startsWith("com.qihoo.security_") && !s.equals("com.qihoo.security"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = f.getPackageInfo(((ApplicationInfo) (obj)).packageName, 64);
        Signature asignature[] = ((PackageInfo) (obj)).signatures;
        if (asignature != null && asignature.length >= 1)
        {
            String s1 = Utils.getMD5(asignature[0].toByteArray());
            if (i.a.equals(s1) || i.b.equals(s1))
            {
                k.add(s);
            }
        }
        continue; /* Loop/switch isn't completed */
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void g()
    {
        if (m != null)
        {
            Set set = k;
            Iterator iterator = m.iterator();
            while (iterator.hasNext()) 
            {
                if (!((a)iterator.next()).a(set))
                {
                    iterator.remove();
                }
            }
        }
    }

    protected void a(e e1)
    {
        int i1;
        i1 = e1.c();
        break MISSING_BLOCK_LABEL_5;
        if (i1 != 1000 && i1 != 1001 && (e)i.get(e1.a) == null)
        {
            int j1 = e1.c();
            if (j1 != -1000)
            {
                j.put(Integer.valueOf(j1), e1);
                if (i.put(e1.a, e1) != null)
                {
                    return;
                }
            }
        }
        return;
    }

    public void a(String s, int i1)
    {
_L2:
        return;
        if (TextUtils.isEmpty(s) || k.contains(s)) goto _L2; else goto _L1
_L1:
        if (s == null || !s.startsWith("com.qihoo.security_") && !s.equals("com.qihoo.security"))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        Signature asignature[];
        String s1;
        try
        {
            asignature = f.getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (asignature == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (asignature.length < 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = Utils.getMD5(asignature[0].toByteArray());
        if (i.a.equals(s1) || i.b.equals(s1))
        {
            k.add(s);
            g();
            return;
        }
        Object obj;
        Object obj1;
        Cursor cursor;
        obj1 = (e)i.get(s);
        if (obj1 != null)
        {
            ((e) (obj1)).a(f);
            ((e) (obj1)).d();
            return;
        }
        cursor = com.qihoo.security.h.b.a().a(c, new String[] {
            s
        });
        obj = obj1;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        boolean flag = cursor.moveToFirst();
        obj = obj1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = obj1;
        obj1 = com.qihoo.security.h.e.a(cursor, f, true);
        obj = obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = obj1;
        ((e) (obj1)).a(f);
        obj = obj1;
_L4:
        Utils.closeCursor(cursor);
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = com.qihoo.security.h.e.a(f.getPackageInfo(s, 0));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                obj1 = obj;
            }
        }
        if (obj1 != null)
        {
            ((e) (obj1)).d();
            if (((e) (obj1)).b() > 0)
            {
                a(((e) (obj1)));
                return;
            }
        }
        if (true) goto _L2; else goto _L3
_L3:
        obj;
        obj = obj1;
          goto _L4
        Exception exception;
        exception;
          goto _L4
    }

    public void a(String as[])
    {
        if (h && as != null)
        {
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                a(as[i1], 0);
                i1++;
            }
        }
    }

    protected void b(e e1)
    {
        int i1 = e1.c();
        e1 = e1.a;
        e e2 = (e)j.get(Integer.valueOf(i1));
        i.remove(e1);
        if (e2 != null && e2.a() == 0)
        {
            j.remove(Integer.valueOf(i1));
        }
    }

    public void b(String s, int i1)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (k.contains(s))
            {
                k.remove(s);
                g();
                return;
            }
            s = (e)i.get(s);
            if (s != null)
            {
                s.a(f);
                b(((e) (s)));
                return;
            }
        }
    }

    protected boolean b()
    {
        if (h)
        {
            return false;
        }
        h = true;
        e();
        if (SharedPref.b(e, "key_sheild_db_init", false))
        {
            try
            {
                b(false);
            }
            catch (Exception exception)
            {
                return false;
            }
            return false;
        }
        try
        {
            a(true);
        }
        catch (Exception exception1) { }
        return true;
    }

    protected void c()
    {
        for (Iterator iterator = i.values().iterator(); iterator.hasNext(); ((e)iterator.next()).d()) { }
    }

    protected void d()
    {
        Object obj;
        if (f == null)
        {
            f = e.getPackageManager();
        }
        obj = f.getInstalledPackages(64);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            PackageInfo packageinfo = (PackageInfo)((Iterator) (obj)).next();
            String s = packageinfo.packageName;
            if (s != null && (s.startsWith("com.qihoo.security_") || s.equals("com.qihoo.security")))
            {
                Signature asignature[] = packageinfo.signatures;
                if (asignature != null && asignature.length >= 1)
                {
                    String s1 = Utils.getMD5(asignature[0].toByteArray());
                    if (i.a.equals(s1) || i.b.equals(s1))
                    {
                        k.add(s);
                    }
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_158;
        Object obj1;
        obj1;
        f = e.getPackageManager();
        f();
        return;
        obj1;
        f();
        return;
    }

}
