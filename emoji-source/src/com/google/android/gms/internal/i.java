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
//            h, m, o, q, 
//            n

public abstract class i extends h
{
    static class a extends Exception
    {

        public a()
        {
        }

        public a(Throwable throwable)
        {
            super(throwable);
        }
    }


    private static Method jS;
    private static Method jT;
    private static Method jU;
    private static Method jV;
    private static Method jW;
    private static Method jX;
    private static Method jY;
    private static Method jZ;
    private static String ka;
    private static o kb;
    static boolean kc = false;
    private static long startTime = 0L;

    protected i(Context context, m m1, n n)
    {
        super(context, m1, n);
    }

    static String a(Context context, m m1)
        throws a
    {
        if (jV == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)jV.invoke(null, new Object[] {
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
            break MISSING_BLOCK_LABEL_55;
        }
        throw new a();
        context = m1.a(context.array(), true);
        return context;
    }

    static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
        throws a
    {
        if (jW == null || motionevent == null)
        {
            throw new a();
        }
        try
        {
            motionevent = (ArrayList)jW.invoke(null, new Object[] {
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

    protected static void a(String s, Context context, m m1)
    {
        com/google/android/gms/internal/i;
        JVM INSTR monitorenter ;
        boolean flag = kc;
        if (!flag)
        {
            try
            {
                kb = new o(m1, null);
                ka = s;
                h(context);
                startTime = w().longValue();
                kc = true;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                com/google/android/gms/internal/i;
            }
        }
        com/google/android/gms/internal/i;
        JVM INSTR monitorexit ;
        return;
        throw s;
    }

    static String b(Context context, m m1)
        throws a
    {
        if (jY == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)jY.invoke(null, new Object[] {
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
            break MISSING_BLOCK_LABEL_55;
        }
        throw new a();
        context = m1.a(context.array(), true);
        return context;
    }

    private static String b(byte abyte0[], String s)
        throws a
    {
        try
        {
            abyte0 = new String(kb.c(abyte0, s), "UTF-8");
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

    static String f(Context context)
        throws a
    {
        if (jX == null)
        {
            throw new a();
        }
        try
        {
            context = (String)jX.invoke(null, new Object[] {
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

    static ArrayList g(Context context)
        throws a
    {
        if (jZ == null)
        {
            throw new a();
        }
        try
        {
            context = (ArrayList)jZ.invoke(null, new Object[] {
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

    private static void h(Context context)
        throws a
    {
        File file;
        File file1;
        byte abyte0[];
        String s;
        byte abyte1[];
        Class class1;
        Object obj;
        Class class2;
        Class class3;
        Class class4;
        Class class5;
        Object obj1;
        try
        {
            abyte0 = kb.b(q.getKey());
            abyte1 = kb.c(abyte0, q.B());
            file1 = context.getCacheDir();
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
        file = file1;
        if (file1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        file1 = context.getDir("dex", 0);
        file = file1;
        if (file1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new a();
        file1 = File.createTempFile("ads", ".jar", file);
        obj = new FileOutputStream(file1);
        ((FileOutputStream) (obj)).write(abyte1, 0, abyte1.length);
        ((FileOutputStream) (obj)).close();
        obj1 = new DexClassLoader(file1.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.C()));
        class1 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.O()));
        obj = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.I()));
        class2 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.G()));
        class3 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.Q()));
        class4 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.E()));
        class5 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.M()));
        obj1 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.K()));
        jS = context.getMethod(b(abyte0, q.D()), new Class[0]);
        jT = class1.getMethod(b(abyte0, q.P()), new Class[0]);
        jU = ((Class) (obj)).getMethod(b(abyte0, q.J()), new Class[0]);
        jV = class2.getMethod(b(abyte0, q.H()), new Class[] {
            android/content/Context
        });
        jW = class3.getMethod(b(abyte0, q.R()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        jX = class4.getMethod(b(abyte0, q.F()), new Class[] {
            android/content/Context
        });
        jY = class5.getMethod(b(abyte0, q.N()), new Class[] {
            android/content/Context
        });
        jZ = ((Class) (obj1)).getMethod(b(abyte0, q.L()), new Class[] {
            android/content/Context
        });
        context = file1.getName();
        file1.delete();
        (new File(file, context.replace(".jar", ".dex"))).delete();
        return;
        context;
        s = file1.getName();
        file1.delete();
        (new File(file, s.replace(".jar", ".dex"))).delete();
        throw context;
    }

    static String v()
        throws a
    {
        if (ka == null)
        {
            throw new a();
        } else
        {
            return ka;
        }
    }

    static Long w()
        throws a
    {
        if (jS == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)jS.invoke(null, new Object[0]);
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

    static String x()
        throws a
    {
        if (jU == null)
        {
            throw new a();
        }
        String s;
        try
        {
            s = (String)jU.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new a(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new a(invocationtargetexception);
        }
        return s;
    }

    static Long y()
        throws a
    {
        if (jT == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)jT.invoke(null, new Object[0]);
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

    protected void c(Context context)
    {
        try
        {
            a(1, x());
        }
        catch (a a3) { }
        try
        {
            a(2, v());
        }
        catch (a a2) { }
        try
        {
            a(25, w().longValue());
        }
        catch (a a1) { }
        try
        {
            context = g(context);
            a(31, ((Long)context.get(0)).longValue());
            a(32, ((Long)context.get(1)).longValue());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            a(33, y().longValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

    protected void e(Context context)
    {
        try
        {
            a(2, v());
        }
        catch (a a5) { }
        try
        {
            a(1, x());
        }
        catch (a a4) { }
        try
        {
            long l = w().longValue();
            a(25, l);
            if (startTime != 0L)
            {
                a(17, l - startTime);
                a(23, startTime);
            }
        }
        catch (a a3) { }
        try
        {
            ArrayList arraylist = a(jO, jP);
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
            a(27, a(context, jQ));
        }
        catch (a a1) { }
        try
        {
            a(29, b(context, jQ));
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
