// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.lib.resl.ExtResources;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.locale:
//            LocaleManagerService, LocaleInfo, a, b

public class d
{

    private static d a;
    private a b;
    private final Context c;
    private Resources d;
    private Resources e;
    private final ExtResources f;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private String k;
    private List l;
    private final ServiceConnection m = new ServiceConnection() {

        final d a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            d.a(a, com.qihoo.security.locale.a.a.a(ibinder));
            d.b(a).a(d.a(a));
            if (d.c(a) == null || d.c(a).isEmpty())
            {
                break MISSING_BLOCK_LABEL_139;
            }
            for (componentname = d.c(a).iterator(); componentname.hasNext(); d.b(a).a(ibinder))
            {
                ibinder = (b)componentname.next();
            }

            try
            {
                d.c(a).clear();
                d.a(a, null);
                d.b(a).f();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
        }

            
            {
                a = d.this;
                super();
            }
    };
    private final b.a n = new b.a() {

        final d a;

        public void a()
            throws RemoteException
        {
        }

        public void a(String s)
            throws RemoteException
        {
        }

        public void a(boolean flag, boolean flag1, String s, String s1, String s2)
            throws RemoteException
        {
            d.a(a, flag);
            d.b(a, flag1);
            d.a(a, s);
            d.b(a, s1);
            d.c(a, s2);
            d.a(a, d.d(a).getResources());
            if (flag1)
            {
                s = d.e(a).getConfiguration();
                s.locale = Locale.getDefault();
                d.e(a).updateConfiguration(s, d.e(a).getDisplayMetrics());
                return;
            }
            if (flag)
            {
                s2 = d.e(a).getConfiguration();
                s2.locale = Locale.ENGLISH;
                d.e(a).updateConfiguration(s2, d.e(a).getDisplayMetrics());
                if (d.f(a) != null)
                {
                    d.g(a).unloadAll();
                    try
                    {
                        d.g(a).initResources(d.f(a));
                        d.g(a).loadAllRes();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return;
                    }
                }
                try
                {
                    d.b(a, d.d(a).createPackageContext(s1, 0).getResources());
                    s1 = d.h(a).getConfiguration();
                    s1.locale = d.d(s);
                    d.h(a).updateConfiguration(s1, d.h(a).getDisplayMetrics());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return;
                }
            } else
            {
                s1 = d.e(a).getConfiguration();
                s1.locale = d.d(s);
                d.e(a).updateConfiguration(s1, d.e(a).getDisplayMetrics());
                return;
            }
        }

        public void b()
            throws RemoteException
        {
        }

        public void c()
            throws RemoteException
        {
        }

        public void d()
            throws RemoteException
        {
        }

            
            {
                a = d.this;
                super();
            }
    };

    private d(Context context)
    {
        c = context;
        d = c.getResources();
        f = new ExtResources(c);
        Utils.bindService(context, com/qihoo/security/locale/LocaleManagerService, null, m, 1);
        i();
    }

    static Resources a(d d1, Resources resources)
    {
        d1.d = resources;
        return resources;
    }

    static a a(d d1, a a1)
    {
        d1.b = a1;
        return a1;
    }

    static b.a a(d d1)
    {
        return d1.n;
    }

    public static d a()
    {
        com/qihoo/security/locale/d;
        JVM INSTR monitorenter ;
        d d1;
        if (a == null)
        {
            a = new d(SecurityApplication.a());
        }
        d1 = a;
        com/qihoo/security/locale/d;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public static String a(Context context)
    {
        String s1 = SharedPref.b(context, "language", "");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            context = context.getResources().getConfiguration().locale;
            s = (new StringBuilder()).append(context.getLanguage()).append("_").append(context.getCountry()).toString();
        }
        return s;
    }

    static String a(d d1, String s)
    {
        d1.i = s;
        return s;
    }

    public static String a(Locale locale)
    {
        String s = locale.getLanguage();
        locale = locale.getCountry();
        if (TextUtils.isEmpty(locale))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append("_").append(locale).toString();
        }
    }

    static List a(d d1, List list)
    {
        d1.l = list;
        return list;
    }

    static void a(boolean flag, boolean flag1, String s, String s1, String s2)
    {
        Context context = SecurityApplication.a();
        SharedPref.a(context, "l_c_default", flag1);
        SharedPref.a(context, "l_c_extend", flag);
        SharedPref.a(context, "l_c_name", s);
        SharedPref.a(context, "l_c_pkg", s1);
        SharedPref.a(context, "l_c_path", s2);
    }

    static boolean a(d d1, boolean flag)
    {
        d1.h = flag;
        return flag;
    }

    public static boolean a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s2;
        String s3;
        String s4;
        boolean flag;
        if (s.length() < 3)
        {
            s3 = s;
        } else
        {
            try
            {
                s3 = s.substring(0, 2);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
        }
        if (s.length() <= 3)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (s.length() < 5) goto _L4; else goto _L3
_L3:
        s = s.substring(3, 5);
_L12:
        if (s1.length() >= 3) goto _L6; else goto _L5
_L5:
        s4 = s1;
_L13:
        s2 = null;
        if (s1.length() <= 3) goto _L8; else goto _L7
_L7:
        if (s1.length() < 5) goto _L10; else goto _L9
_L9:
        s2 = s1.substring(3, 5);
_L8:
        if (!s3.toLowerCase().equals(s4.toLowerCase()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_184;
        }
          goto _L11
_L4:
        s = s.substring(3);
          goto _L12
_L6:
        s4 = s1.substring(0, 2);
          goto _L13
_L10:
        s2 = s1.substring(3);
          goto _L8
_L11:
        flag = s.toLowerCase().equals(s2.toLowerCase());
        if (flag)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
        s = null;
          goto _L12
        return true;
        if (true) goto _L1; else goto _L14
_L14:
    }

    static String[] a(Context context, String s)
        throws android.content.pm.PackageManager.NameNotFoundException, IOException
    {
        context = Utils.openConfigFile(new InputStreamReader(context.createPackageContext(s, 0).getResources().getAssets().open("info.dat")));
        if (context.size() > 0)
        {
            return ((String)context.get(0)).split(";");
        } else
        {
            return null;
        }
    }

    static Resources b(d d1, Resources resources)
    {
        d1.e = resources;
        return resources;
    }

    static a b(d d1)
    {
        return d1.b;
    }

    public static String b(Context context)
    {
        Object obj;
        String s;
        obj = "en";
        s = SharedPref.b(context, "language", "");
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj));
        if (!a(Locale.getDefault()).equals("zh_CN")) goto _L4; else goto _L3
_L3:
        context = a().g();
        if (context == null || context.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        context = context.iterator();
_L6:
        boolean flag;
        do
        {
            if (!context.hasNext())
            {
                break MISSING_BLOCK_LABEL_146;
            }
            obj = (LocaleInfo)context.next();
        } while (!((LocaleInfo) (obj)).locale.equals("zh_CN"));
        if (!((LocaleInfo) (obj)).buildin)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
_L7:
        if (flag)
        {
            context = "zh-CN";
        } else
        {
            context = "en";
        }
_L4:
        return context;
        if (((LocaleInfo) (obj)).state == 2) goto _L6; else goto _L5
_L5:
        flag = true;
          goto _L7
_L2:
        context = ((Context) (obj));
        if (!s.equals("zh_CN")) goto _L4; else goto _L8
_L8:
        return "zh-CN";
        flag = false;
          goto _L7
    }

    static String b(d d1, String s)
    {
        d1.j = s;
        return s;
    }

    static boolean b(d d1, boolean flag)
    {
        d1.g = flag;
        return flag;
    }

    static String c(d d1, String s)
    {
        d1.k = s;
        return s;
    }

    static List c(d d1)
    {
        return d1.l;
    }

    static Context d(d d1)
    {
        return d1.c;
    }

    public static Locale d(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return Locale.getDefault();
        }
        int i1 = s.length();
        if (i1 == 5)
        {
            return new Locale(s.substring(0, 2), s.substring(3, 5));
        }
        if (i1 == 2)
        {
            return new Locale(s);
        } else
        {
            return Locale.getDefault();
        }
    }

    static Resources e(d d1)
    {
        return d1.d;
    }

    static String f(d d1)
    {
        return d1.k;
    }

    static ExtResources g(d d1)
    {
        return d1.f;
    }

    static Resources h(d d1)
    {
        return d1.e;
    }

    private void i()
    {
        Object obj = SecurityApplication.a();
        boolean flag = SharedPref.b(((Context) (obj)), "l_c_extend", false);
        boolean flag1 = SharedPref.b(((Context) (obj)), "l_c_default", true);
        String s = SharedPref.b(((Context) (obj)), "l_c_name", null);
        String s1 = SharedPref.b(((Context) (obj)), "l_c_pkg", null);
        obj = SharedPref.b(((Context) (obj)), "l_c_path", null);
        try
        {
            n.a(flag, flag1, s, s1, ((String) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public String a(int i1)
    {
        if (!h)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int j1;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        j1 = f.getIdent(d.getResourceEntryName(i1), 0);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        return f.getString(j1);
        j1 = e.getIdentifier(d.getResourceEntryName(i1), "string", j);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String s = e.getString(j1);
        return s;
        Exception exception;
        exception;
        String s1;
        try
        {
            h();
            s1 = d.getString(i1);
        }
        catch (Exception exception1)
        {
            return "";
        }
        return s1;
    }

    public String a(int i1, int j1)
    {
        if (!h)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        int k1;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        k1 = f.getIdent(d.getResourceEntryName(i1), 2);
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        return f.getQuantityString(k1, j1);
        k1 = e.getIdentifier(d.getResourceEntryName(i1), "plurals", j);
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        String s = e.getQuantityString(k1, j1);
        return s;
        Exception exception;
        exception;
        String s1;
        try
        {
            h();
            s1 = d.getQuantityString(i1, j1);
        }
        catch (Exception exception1)
        {
            return "";
        }
        return s1;
    }

    public transient String a(int i1, int j1, Object aobj[])
    {
        if (!h)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        int k1;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        k1 = f.getIdent(d.getResourceEntryName(i1), 2);
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        return f.getQuantityString(k1, j1, aobj);
        k1 = e.getIdentifier(d.getResourceEntryName(i1), "plurals", j);
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        String s = e.getQuantityString(k1, j1, aobj);
        return s;
        Exception exception;
        exception;
        try
        {
            h();
            aobj = d.getQuantityString(i1, j1, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return "";
        }
        return ((String) (aobj));
    }

    public transient String a(int i1, Object aobj[])
    {
        if (!h)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        int j1;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        j1 = f.getIdent(d.getResourceEntryName(i1), 0);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        return f.getString(j1, aobj);
        j1 = e.getIdentifier(d.getResourceEntryName(i1), "string", j);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        String s = e.getString(j1, aobj);
        return s;
        Exception exception;
        exception;
        h();
        return d.getString(i1, aobj);
    }

    public void a(b b1)
    {
        try
        {
            if (b != null)
            {
                b.a(b1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return;
        }
        if (l == null)
        {
            l = new ArrayList(2);
        }
        l.add(b1);
        return;
    }

    public void a(String s)
    {
        try
        {
            if (b != null)
            {
                b.a(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void b()
    {
        b(((b) (n)));
        Utils.unbindService("lm", c, m);
    }

    public void b(b b1)
    {
        try
        {
            if (b != null)
            {
                b.b(b1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return;
        }
    }

    public void b(String s)
    {
        try
        {
            if (b != null)
            {
                b.e(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public String[] b(int i1)
    {
        if (!h)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int j1;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        j1 = f.getIdent(d.getResourceEntryName(i1), 1);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        return f.getStringArray(j1);
        j1 = e.getIdentifier(d.getResourceEntryName(i1), "array", j);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        String as[] = e.getStringArray(j1);
        return as;
        Exception exception;
        exception;
        h();
        return d.getStringArray(i1);
    }

    public void c()
    {
        try
        {
            if (b != null)
            {
                b.b();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void c(String s)
    {
        try
        {
            if (b != null)
            {
                b.b(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void d()
    {
        try
        {
            n.a(h, g, i, j, k);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public File e()
    {
label0:
        {
            File file;
            try
            {
                if (b == null)
                {
                    break label0;
                }
                file = new File(b.g());
            }
            catch (Exception exception)
            {
                return null;
            }
            return file;
        }
        return null;
    }

    public String f()
    {
        String s;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        s = b.a();
        return s;
        RemoteException remoteexception;
        remoteexception;
        return SharedPref.b(c, "language", "");
    }

    public List g()
    {
        List list;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        list = b.c();
        return list;
        RemoteException remoteexception;
        remoteexception;
        return new ArrayList(0);
    }

    public void h()
    {
        Object obj = d.getConfiguration().locale;
        String s = ((Locale) (obj)).getLanguage();
        obj = ((Locale) (obj)).getCountry();
        obj = (new StringBuilder()).append(s).append("_").append(((String) (obj))).toString();
        if (!s.equals(i) && !((String) (obj)).equals(i))
        {
            Configuration configuration = d.getConfiguration();
            configuration.locale = d(i);
            d.updateConfiguration(configuration, d.getDisplayMetrics());
        }
    }
}
