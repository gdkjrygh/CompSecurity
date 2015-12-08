// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.SharedPreferences;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.savedstate.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.fitbit.util:
//            aa, bs

public class al
{

    public static final List a;
    private static final String b = "com.fitbit.util.LocalizationUtils.PREFERENCE";
    private static final String c = "com.fitbit.util.LocalizationUtils.PREFERENCE_FOOD_LOCALE";
    private static final String d = "com.fitbit.util.LocalizationUtils.PREFERENCE_DEFAULT_FITBIT_LOCALE";
    private static Locale e = Locale.getDefault();
    private static bs f;
    private static final ReentrantReadWriteLock g = new ReentrantReadWriteLock();

    public al()
    {
    }

    public static String a(int l, int i1)
    {
        Object obj;
        obj = FitBitApplication.a().e();
        if (obj == null || l <= 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj = ((a) (obj)).a(l, i1, j());
        return ((String) (obj));
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        return null;
    }

    public static transient String a(int l, int i1, Object aobj[])
    {
        a a1;
        a1 = FitBitApplication.a().e();
        if (a1 == null || l <= 0)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        aobj = a1.a(l, i1, j(), aobj);
        return ((String) (aobj));
        aobj;
        return null;
    }

    public static String a(int l, String s)
    {
        a a1;
        a1 = FitBitApplication.a().e();
        if (a1 == null || l <= 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        s = a1.a(l, s, j());
        return s;
        s;
        return null;
    }

    public static Locale a()
    {
        Locale locale = Locale.getDefault();
        if (a(locale.getLanguage()))
        {
            return locale;
        } else
        {
            return Locale.US;
        }
    }

    public static boolean a(String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((aa)iterator.next()).a().getLanguage().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(Locale locale)
    {
        return a().getDisplayLanguage().equals(locale.getDisplayLanguage());
    }

    public static String b()
    {
        String s1 = m.i();
        String s = s1;
        if (s1 == null)
        {
            s = a().toString();
        }
        return s;
    }

    public static String b(Locale locale)
    {
        return locale.toString();
    }

    public static void b(String s)
    {
        g.writeLock().lock();
        SharedPreferences sharedpreferences = FitBitApplication.a().getSharedPreferences("com.fitbit.util.LocalizationUtils.PREFERENCE", 0);
        if (s != null)
        {
            sharedpreferences.edit().putString("com.fitbit.util.LocalizationUtils.PREFERENCE_DEFAULT_FITBIT_LOCALE", s).commit();
        } else
        {
            sharedpreferences.edit().remove("com.fitbit.util.LocalizationUtils.PREFERENCE_DEFAULT_FITBIT_LOCALE").commit();
        }
        g.writeLock().unlock();
    }

    public static boolean c()
    {
        Locale locale = Locale.getDefault();
        boolean flag;
        if (!e.equals(locale))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e = locale;
        }
        return flag;
    }

    public static boolean c(String s)
    {
        boolean flag = false;
        com/fitbit/util/al;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences;
        String s1;
        sharedpreferences = FitBitApplication.a().getSharedPreferences("com.fitbit.util.LocalizationUtils.PREFERENCE", 0);
        s1 = sharedpreferences.getString("com.fitbit.util.LocalizationUtils.PREFERENCE_FOOD_LOCALE", null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        if (s1.equals(s))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        sharedpreferences.edit().putString("com.fitbit.util.LocalizationUtils.PREFERENCE_FOOD_LOCALE", s).commit();
        flag = true;
        com/fitbit/util/al;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public static bs d()
    {
        if (f == null || k())
        {
            f = new bs(Locale.getDefault());
        }
        return f;
    }

    public static String d(String s)
    {
        return (new Locale(s.substring(0, 2))).getDisplayLanguage(a());
    }

    public static String e()
    {
        g.readLock().lock();
        String s = FitBitApplication.a().getSharedPreferences("com.fitbit.util.LocalizationUtils.PREFERENCE", 0).getString("com.fitbit.util.LocalizationUtils.PREFERENCE_DEFAULT_FITBIT_LOCALE", a().toString());
        g.readLock().unlock();
        return s;
    }

    public static String f()
    {
        Object obj = an.a().b();
        if (obj != null)
        {
            obj = ((Profile) (obj)).d();
            if (obj != null)
            {
                return ((String) (obj));
            }
        }
        return FitBitApplication.a().getString(0x7f08003d);
    }

    public static String g()
    {
label0:
        {
            String s2 = e();
            int l = s2.indexOf('_');
            String s;
            String s1;
            if (l == -1)
            {
                s = s2;
            } else
            {
                s = s2.substring(0, l);
            }
            s1 = s;
            if (s != null)
            {
                s1 = s;
                if (s.equals("zh"))
                {
                    if (!s2.contains("zh_CN"))
                    {
                        break label0;
                    }
                    s1 = s2.replace("zh_CN", "zh-Hans");
                }
            }
            return s1;
        }
        return "zh-Hant";
    }

    public static boolean h()
    {
        return f().equals("en_US");
    }

    public static String i()
    {
        com/fitbit/util/al;
        JVM INSTR monitorenter ;
        String s = FitBitApplication.a().getSharedPreferences("com.fitbit.util.LocalizationUtils.PREFERENCE", 0).getString("com.fitbit.util.LocalizationUtils.PREFERENCE_FOOD_LOCALE", e());
        com/fitbit/util/al;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static Locale j()
    {
        return new Locale(FitBitApplication.a().getString(0x7f080518));
    }

    private static boolean k()
    {
        Locale locale = Locale.getDefault();
        if (e.equals(locale))
        {
            return false;
        } else
        {
            f = null;
            return true;
        }
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new aa(new Locale("en", "US")));
        arraylist.add(new aa(new Locale("es", "ES")));
        arraylist.add(new aa(new Locale("fr", "FR")));
        arraylist.add(new aa(new Locale("de", "DE")));
        arraylist.add(new aa(new Locale("ja", "JP"), false, 0x7f080614));
        arraylist.add(new aa(new Locale("ko", "KR"), false, 0x7f080615));
        arraylist.add(new aa(new Locale("zh", "CN")));
        arraylist.add(new aa(new Locale("zh", "TW")));
        arraylist.add(new aa(new Locale("it", "IT")));
        a = Collections.unmodifiableList(arraylist);
    }
}
