// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            l, q, s, r

public abstract class m extends l
{
    static final class a extends Exception
    {

        public a()
        {
        }

        public a(Throwable throwable)
        {
            super(throwable);
        }
    }


    static boolean d = false;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static Method k;
    private static Method l;
    private static Method m;
    private static Method n;
    private static Method o;
    private static Method p;
    private static Method q;
    private static String r;
    private static String s;
    private static String t;
    private static long u = 0L;
    private static s v;

    protected m(Context context, q q1, r r1)
    {
        super(context, q1, r1);
    }

    private static String a()
        throws a
    {
        if (r == null)
        {
            throw new a();
        } else
        {
            return r;
        }
    }

    private static String a(Context context, q q1)
        throws a
    {
        if (s != null)
        {
            return s;
        }
        if (h == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)h.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new a();
        context = q1.a(context.array());
        s = context;
        return context;
    }

    private static String a(byte abyte0[], String s1)
        throws a
    {
        try
        {
            abyte0 = new String(v.a(abyte0, s1), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        return abyte0;
    }

    private static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
        throws a
    {
        if (i == null || motionevent == null)
        {
            throw new a();
        }
        try
        {
            motionevent = (ArrayList)i.invoke(null, new Object[] {
                motionevent, displaymetrics
            });
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new a(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new a(motionevent);
        }
        return motionevent;
    }

    protected static void a(String s1, Context context, q q1)
    {
        com/google/android/gms/internal/m;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (flag) goto _L2; else goto _L1
_L1:
        v = new s(q1);
        r = s1;
        byte abyte0[];
        byte abyte1[];
        abyte0 = v.a("hgCk8A4GQuleIlan21Er1535C3f4u3krghh5apIgsmw=");
        abyte1 = v.a(abyte0, "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");
        q1 = context.getCacheDir();
        s1 = q1;
        if (q1 != null) goto _L4; else goto _L3
_L3:
        q1 = context.getDir("dex", 0);
        s1 = q1;
        if (q1 != null) goto _L4; else goto _L5
_L5:
        throw new a();
        s1;
        try
        {
            throw new a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            com/google/android/gms/internal/m;
        }
_L2:
        com/google/android/gms/internal/m;
        JVM INSTR monitorexit ;
        return;
_L4:
        q1 = File.createTempFile("ads", ".jar", s1);
        FileOutputStream fileoutputstream = new FileOutputStream(q1);
        fileoutputstream.write(abyte1, 0, abyte1.length);
        fileoutputstream.close();
        Object obj = new DexClassLoader(q1.getAbsolutePath(), s1.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj)).loadClass(a(abyte0, "4Yvi2n8BAkvE7VNBUElC3KZ0iuxbd5Z1l2yzQlO6iwr52KJ2qUcHr9aFTvQu+1Bz"));
        Class class1 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "yn7AmixaddWlWCdLh/whaHrwVnkVGPR8Ga2B567b2UNUDlxCLC3BZeXdeum6EX/I"));
        Class class2 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "TKBnk6LsB/ztAHRKvOeqGVGHZcMq6c3VMIHqT+CIUCi3sat+eOhprUGEP43nGUti"));
        Class class3 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "SWJLGN5L6BF17klOXqOOpLP1xZAAM7Ng4jaTvXX9WY6PxRvldWXn1ENx7nHyTu84"));
        Class class4 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "n2rmeKncQljdfBWnzypfsBgBVyre25Oaf6mn3QuNt5cQq7Xuaz3ZLuwmSTWxVzSQ"));
        Class class5 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "yzuVFR/Xl9b9OxURn3k/f7VGhrKTdW/eSPiFUAXUCDsshflfrUJBh16tTITfAaxZ"));
        Class class6 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "F2cmMww6lSTtMiqkoX/Czfb090kW53GPnMxNR6fKBurckyDBc8rt+tixGr7EJ0aF"));
        Class class7 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "6WjNkzIcCej8zG38Dh8uDdR8qxTeSY+F1EiowOLK0wqRSLiB7V6ZBEIW+z9XZ42z"));
        Class class8 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "EaedvdYjGg60ZzpcKZqlpv9uw+zeAITd9onB2Q+u/DrbDRBeDmCL+IWET7OkGK9k"));
        Class class9 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "zXEwIzFN2SQaspV7iUirgyM8TI24BPO4ou3gjDg/chwmfbGE7kNKw8hZdBYzOnei"));
        Class class10 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "SCirxCsFnDuwhNtITKQnfRWkNU6Q48eYcFxC37zR/rFFt2Tk535ut0aEwjgfj82K"));
        Class class11 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "UlNrSUzyNQumjidHbyZmRamtp5eoPFvIeOwCo75MZksEyM6MMFg9gB6StAom9i00"));
        obj = ((DexClassLoader) (obj)).loadClass(a(abyte0, "2o5kNgx/XiqTfSXabhPtCr1u+/ih5CtCIv6c8wtMrcbDv+WtrYIAXEBY927rPewX"));
        e = context.getMethod(a(abyte0, "P9Jrh/MxY+mhIP2GCt+FgNMwXo7cFnfTZwH6N5TxOR0="), new Class[0]);
        f = class1.getMethod(a(abyte0, "M3kRYlbLM9AydEhjx8lHSiSaDFH5NR8G6REmAWXbKM4="), new Class[0]);
        g = class2.getMethod(a(abyte0, "94DxF6vj8/eq/VzWOLIJCEyTTLSnqs4ryxwkoRaNDao="), new Class[0]);
        h = class3.getMethod(a(abyte0, "/y9r7m40IDgj1VR+v8OJF1CjFAKDzMxJ4SEII/JGJf0="), new Class[] {
            android/content/Context
        });
        i = class4.getMethod(a(abyte0, "5bVOp06Hzzf1wRchGC7JFKwDQFmKZBAMg9MmSmriiHc="), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        j = class5.getMethod(a(abyte0, "/jtnz5dEOHk83/bTljO3NZ3RktB9RqekBE5tOYEGNQs="), new Class[] {
            android/content/Context
        });
        k = class6.getMethod(a(abyte0, "cjnl/tiDXvXrtfGWc6LdSVteaLdg9l49I4W5cfDIAhk="), new Class[] {
            android/content/Context
        });
        l = class7.getMethod(a(abyte0, "dWxlbXXBia4+kOf2ZonlBC9dp9hsDGLu+zzk8Y1C7Nc="), new Class[] {
            android/content/Context
        });
        m = class8.getMethod(a(abyte0, "3VC4GsgbeokcqH9dWJc7GlTz7GbPB4R6Jvt33jUYc+U="), new Class[] {
            android/content/Context
        });
        n = class9.getMethod(a(abyte0, "0po0eytBzXme4duX0wiNX/MVxDGsOqAJA730GSsf2qU="), new Class[] {
            android/content/Context
        });
        o = class10.getMethod(a(abyte0, "NesWObNQJNwKtKC/NJD4K2vucrUuBYYlSiEnsLynoAw="), new Class[] {
            android/content/Context
        });
        p = class11.getMethod(a(abyte0, "5rpjrNDZLB7091vQKnpPAsEnQ56LZqAytHXDmTZuN8s="), new Class[] {
            android/content/Context
        });
        q = ((Class) (obj)).getMethod(a(abyte0, "UfnmQ+YR85XZtQcjqL0gfNNqtZZWbeI/ADuaO9S0mxc="), new Class[] {
            android/content/Context
        });
        context = q1.getName();
        q1.delete();
        (new File(s1, context.replace(".jar", ".dex"))).delete();
        u = b().longValue();
        d = true;
        if (true) goto _L2; else goto _L6
_L6:
        context;
        String s2 = q1.getName();
        q1.delete();
        (new File(s1, s2.replace(".jar", ".dex"))).delete();
        throw context;
        s1;
        throw new a(s1);
        throw s1;
        s1;
        throw new a(s1);
        s1;
        throw new a(s1);
        s1;
        throw new a(s1);
        s1;
        throw new a(s1);
    }

    private static Long b()
        throws a
    {
        if (e == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new a(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new a(invocationtargetexception);
        }
        return long1;
    }

    private static String b(Context context, q q1)
        throws a
    {
        if (t != null)
        {
            return t;
        }
        if (k == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)k.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new a();
        context = q1.a(context.array());
        t = context;
        return context;
    }

    private static String c()
        throws a
    {
        if (g == null)
        {
            throw new a();
        }
        String s1;
        try
        {
            s1 = (String)g.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new a(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new a(invocationtargetexception);
        }
        return s1;
    }

    private static Long d()
        throws a
    {
        if (f == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)f.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new a(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new a(invocationtargetexception);
        }
        return long1;
    }

    static String d(Context context)
        throws a
    {
        if (j == null)
        {
            throw new a();
        }
        try
        {
            context = (String)j.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new a();
        return context;
    }

    private static String e(Context context)
        throws a
    {
        if (n == null)
        {
            throw new a();
        }
        try
        {
            context = (String)n.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        return context;
    }

    private static Long f(Context context)
        throws a
    {
        if (o == null)
        {
            throw new a();
        }
        try
        {
            context = (Long)o.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        return context;
    }

    private static ArrayList g(Context context)
        throws a
    {
        if (l == null)
        {
            throw new a();
        }
        try
        {
            context = (ArrayList)l.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (context.size() == 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new a();
        return context;
    }

    private static int[] h(Context context)
        throws a
    {
        if (m == null)
        {
            throw new a();
        }
        try
        {
            context = (int[])m.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        return context;
    }

    private static int i(Context context)
        throws a
    {
        if (p == null)
        {
            throw new a();
        }
        int i1;
        try
        {
            i1 = ((Integer)p.invoke(null, new Object[] {
                context
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        return i1;
    }

    private static int j(Context context)
        throws a
    {
        if (q == null)
        {
            throw new a();
        }
        int i1;
        try
        {
            i1 = ((Integer)q.invoke(null, new Object[] {
                context
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context);
        }
        return i1;
    }

    protected void b(Context context)
    {
        try
        {
            a(1, c());
        }
        catch (a a11) { }
        try
        {
            a(2, a());
        }
        catch (a a10) { }
        try
        {
            long l1 = b().longValue();
            a(25, l1);
            if (u != 0L)
            {
                a(17, l1 - u);
                a(23, u);
            }
        }
        catch (a a9) { }
        try
        {
            ArrayList arraylist = g(context);
            a(31, ((Long)arraylist.get(0)).longValue());
            a(32, ((Long)arraylist.get(1)).longValue());
        }
        catch (a a8) { }
        try
        {
            a(33, d().longValue());
        }
        catch (a a7) { }
        try
        {
            a(27, a(context, c));
        }
        catch (a a6) { }
        try
        {
            a(29, b(context, c));
        }
        catch (a a5) { }
        try
        {
            int ai[] = h(context);
            a(5, ai[0]);
            a(6, ai[1]);
        }
        catch (a a4) { }
        try
        {
            a(12, i(context));
        }
        catch (a a3) { }
        try
        {
            a(3, j(context));
        }
        catch (a a2) { }
        try
        {
            a(34, e(context));
        }
        catch (a a1) { }
        try
        {
            a(35, f(context).longValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

    protected final void c(Context context)
    {
        try
        {
            a(2, a());
        }
        catch (a a5) { }
        try
        {
            a(1, c());
        }
        catch (a a4) { }
        try
        {
            a(25, b().longValue());
        }
        catch (a a3) { }
        try
        {
            ArrayList arraylist = a(a, b);
            a(14, ((Long)arraylist.get(0)).longValue());
            a(15, ((Long)arraylist.get(1)).longValue());
            if (arraylist.size() >= 3)
            {
                a(16, ((Long)arraylist.get(2)).longValue());
            }
        }
        catch (a a2) { }
        try
        {
            a(34, e(context));
        }
        catch (a a1) { }
        try
        {
            a(35, f(context).longValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

}
