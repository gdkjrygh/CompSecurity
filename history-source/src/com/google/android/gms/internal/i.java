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


    private static Method kA;
    private static Method kB;
    private static Method kC;
    private static Method kD;
    private static Method kE;
    private static Method kF;
    private static Method kG;
    private static Method kH;
    private static Method kI;
    private static String kJ;
    private static String kK;
    private static String kL;
    private static o kM;
    static boolean kN = false;
    private static long startTime = 0L;

    protected i(Context context, m m1, n n)
    {
        super(context, m1, n);
    }

    static String a(Context context, m m1)
        throws a
    {
        if (kK != null)
        {
            return kK;
        }
        if (kD == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)kD.invoke(null, new Object[] {
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
        kK = m1.a(context.array(), true);
        context = kK;
        return context;
    }

    static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
        throws a
    {
        if (kE == null || motionevent == null)
        {
            throw new a();
        }
        try
        {
            motionevent = (ArrayList)kE.invoke(null, new Object[] {
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
        boolean flag = kN;
        if (!flag)
        {
            try
            {
                kM = new o(m1, null);
                kJ = s;
                g(context);
                startTime = w().longValue();
                kN = true;
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
        if (kL != null)
        {
            return kL;
        }
        if (kG == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)kG.invoke(null, new Object[] {
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
        kL = m1.a(context.array(), true);
        context = kL;
        return context;
    }

    private static String b(byte abyte0[], String s)
        throws a
    {
        try
        {
            abyte0 = new String(kM.c(abyte0, s), "UTF-8");
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

    static String d(Context context)
        throws a
    {
        if (kF == null)
        {
            throw new a();
        }
        try
        {
            context = (String)kF.invoke(null, new Object[] {
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

    static ArrayList e(Context context)
        throws a
    {
        if (kH == null)
        {
            throw new a();
        }
        try
        {
            context = (ArrayList)kH.invoke(null, new Object[] {
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

    static int[] f(Context context)
        throws a
    {
        if (kI == null)
        {
            throw new a();
        }
        try
        {
            context = (int[])(int[])kI.invoke(null, new Object[] {
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

    private static void g(Context context)
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
        Class class6;
        Object obj1;
        try
        {
            abyte0 = kM.b(q.getKey());
            abyte1 = kM.c(abyte0, q.E());
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
        context = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.H()));
        class1 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.T()));
        obj = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.N()));
        class2 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.L()));
        class3 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.V()));
        class4 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.J()));
        class5 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.R()));
        class6 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.P()));
        obj1 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, q.F()));
        kA = context.getMethod(b(abyte0, q.I()), new Class[0]);
        kB = class1.getMethod(b(abyte0, q.U()), new Class[0]);
        kC = ((Class) (obj)).getMethod(b(abyte0, q.O()), new Class[0]);
        kD = class2.getMethod(b(abyte0, q.M()), new Class[] {
            android/content/Context
        });
        kE = class3.getMethod(b(abyte0, q.W()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        kF = class4.getMethod(b(abyte0, q.K()), new Class[] {
            android/content/Context
        });
        kG = class5.getMethod(b(abyte0, q.S()), new Class[] {
            android/content/Context
        });
        kH = class6.getMethod(b(abyte0, q.Q()), new Class[] {
            android/content/Context
        });
        kI = ((Class) (obj1)).getMethod(b(abyte0, q.G()), new Class[] {
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
        if (kJ == null)
        {
            throw new a();
        } else
        {
            return kJ;
        }
    }

    static Long w()
        throws a
    {
        if (kA == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)kA.invoke(null, new Object[0]);
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
        if (kC == null)
        {
            throw new a();
        }
        String s;
        try
        {
            s = (String)kC.invoke(null, new Object[0]);
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
        if (kB == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)kB.invoke(null, new Object[0]);
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

    protected void b(Context context)
    {
        try
        {
            a(1, x());
        }
        catch (a a7) { }
        try
        {
            a(2, v());
        }
        catch (a a6) { }
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
        catch (a a5) { }
        try
        {
            ArrayList arraylist = e(context);
            a(31, ((Long)arraylist.get(0)).longValue());
            a(32, ((Long)arraylist.get(1)).longValue());
        }
        catch (a a4) { }
        try
        {
            a(33, y().longValue());
        }
        catch (a a3) { }
        try
        {
            a(27, a(context, ky));
        }
        catch (a a2) { }
        try
        {
            a(29, b(context, ky));
        }
        catch (a a1) { }
        try
        {
            context = f(context);
            a(5, context[0]);
            a(6, context[1]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

    protected void c(Context context)
    {
        try
        {
            a(2, v());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            a(1, x());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            a(25, w().longValue());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            context = a(kw, kx);
            a(14, ((Long)context.get(0)).longValue());
            a(15, ((Long)context.get(1)).longValue());
            if (context.size() >= 3)
            {
                a(16, ((Long)context.get(2)).longValue());
            }
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
