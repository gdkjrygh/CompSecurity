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
//            i, n, p, r, 
//            o

public abstract class j extends i
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


    private static Method jR;
    private static Method jS;
    private static Method jT;
    private static Method jU;
    private static Method jV;
    private static Method jW;
    private static String jX;
    private static p jY;
    static boolean jZ = false;
    private static long startTime = 0L;

    protected j(Context context, n n1, o o)
    {
        super(context, n1, o);
    }

    static String a(Context context, n n1)
        throws a
    {
        if (jT == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)jT.invoke(null, new Object[] {
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
        context = n1.a(context.array(), true);
        return context;
    }

    static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
        throws a
    {
        if (jU == null || motionevent == null)
        {
            throw new a();
        }
        try
        {
            motionevent = (ArrayList)jU.invoke(null, new Object[] {
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

    protected static void a(String s, Context context, n n1)
    {
        com/google/android/gms/internal/j;
        JVM INSTR monitorenter ;
        boolean flag = jZ;
        if (!flag)
        {
            try
            {
                jY = new p(n1, null);
                jX = s;
                e(context);
                startTime = w().longValue();
                jZ = true;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                com/google/android/gms/internal/j;
            }
        }
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        return;
        throw s;
    }

    static String b(Context context, n n1)
        throws a
    {
        if (jW == null)
        {
            throw new a();
        }
        try
        {
            context = (ByteBuffer)jW.invoke(null, new Object[] {
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
        context = n1.a(context.array(), true);
        return context;
    }

    private static String b(byte abyte0[], String s)
        throws a
    {
        try
        {
            abyte0 = new String(jY.c(abyte0, s), "UTF-8");
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
        if (jV == null)
        {
            throw new a();
        }
        try
        {
            context = (String)jV.invoke(null, new Object[] {
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

    private static void e(Context context)
        throws a
    {
        File file;
        File file1;
        byte abyte0[];
        byte abyte1[];
        Class class1;
        Object obj;
        Class class2;
        Class class3;
        Object obj1;
        try
        {
            abyte0 = jY.b(r.getKey());
            abyte1 = jY.c(abyte0, r.A());
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
        context = ((DexClassLoader) (obj1)).loadClass(b(abyte0, r.B()));
        class1 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, r.H()));
        obj = ((DexClassLoader) (obj1)).loadClass(b(abyte0, r.F()));
        class2 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, r.L()));
        class3 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, r.D()));
        obj1 = ((DexClassLoader) (obj1)).loadClass(b(abyte0, r.J()));
        jR = context.getMethod(b(abyte0, r.C()), new Class[0]);
        jS = class1.getMethod(b(abyte0, r.I()), new Class[0]);
        jT = ((Class) (obj)).getMethod(b(abyte0, r.G()), new Class[] {
            android/content/Context
        });
        jU = class2.getMethod(b(abyte0, r.M()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        jV = class3.getMethod(b(abyte0, r.E()), new Class[] {
            android/content/Context
        });
        jW = ((Class) (obj1)).getMethod(b(abyte0, r.K()), new Class[] {
            android/content/Context
        });
        context = file1.getName();
        file1.delete();
        (new File(file, context.replace(".jar", ".dex"))).delete();
        return;
    }

    static String v()
        throws a
    {
        if (jX == null)
        {
            throw new a();
        } else
        {
            return jX;
        }
    }

    static Long w()
        throws a
    {
        if (jR == null)
        {
            throw new a();
        }
        Long long1;
        try
        {
            long1 = (Long)jR.invoke(null, new Object[0]);
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
        if (jS == null)
        {
            throw new a();
        }
        String s;
        try
        {
            s = (String)jS.invoke(null, new Object[0]);
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

    protected void b(Context context)
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
            a(24, d(context));
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
            ArrayList arraylist = a(jN, jO);
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
            a(27, a(context, jP));
        }
        catch (a a1) { }
        try
        {
            a(29, b(context, jP));
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
