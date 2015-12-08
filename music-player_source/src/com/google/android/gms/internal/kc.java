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
//            jg, kd, lb, le, 
//            ld, lc

public abstract class kc extends jg
{

    static boolean d = false;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static String k;
    private static long l = 0L;
    private static ld m;

    protected kc(Context context, lb lb1, lc lc)
    {
        super(context, lb1, lc);
    }

    private static String a()
    {
        if (k == null)
        {
            throw new kd();
        } else
        {
            return k;
        }
    }

    private static String a(Context context, lb lb1)
    {
        if (g == null)
        {
            throw new kd();
        }
        try
        {
            context = (ByteBuffer)g.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new kd(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new kd(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        throw new kd();
        context = lb1.a(context.array());
        return context;
    }

    private static String a(byte abyte0[], String s)
    {
        try
        {
            abyte0 = new String(m.a(abyte0, s), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new kd(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new kd(abyte0);
        }
        return abyte0;
    }

    private static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
    {
        if (h == null || motionevent == null)
        {
            throw new kd();
        }
        try
        {
            motionevent = (ArrayList)h.invoke(null, new Object[] {
                motionevent, displaymetrics
            });
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new kd(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new kd(motionevent);
        }
        return motionevent;
    }

    protected static void a(String s, Context context, lb lb1)
    {
        com/google/android/gms/internal/kc;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (flag) goto _L2; else goto _L1
_L1:
        m = new ld(lb1);
        k = s;
        byte abyte0[];
        byte abyte1[];
        abyte0 = m.a("lbxVRZn959z8Mby5/xIR5GY5qeai5a6plNW9YXQVEvQ=");
        abyte1 = m.a(abyte0, "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");
        lb1 = context.getCacheDir();
        s = lb1;
        if (lb1 != null) goto _L4; else goto _L3
_L3:
        lb1 = context.getDir("dex", 0);
        s = lb1;
        if (lb1 != null) goto _L4; else goto _L5
_L5:
        throw new kd();
        s;
        try
        {
            throw new kd(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            com/google/android/gms/internal/kc;
        }
_L2:
        com/google/android/gms/internal/kc;
        JVM INSTR monitorexit ;
        return;
_L4:
        lb1 = File.createTempFile("ads", ".jar", s);
        Object obj = new FileOutputStream(lb1);
        ((FileOutputStream) (obj)).write(abyte1, 0, abyte1.length);
        ((FileOutputStream) (obj)).close();
        Object obj1 = new DexClassLoader(lb1.getAbsolutePath(), s.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "iJkf7Oi+A1kM/Uo7c1/aRZ8QWS9UVlE/WL/MFqAJx1e1JiM4/Gaeo4sQTSPvKVmT"));
        Class class1 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "DOrHUrlPAyNSeU+NvnrdUjcvyLXFYbygCQievG8bnnQ6HGThBdBkI9mrKGQjm39O"));
        obj = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "VSSWx/l6VwxyGcOtodSBdwbU3HNiBwMWuimDu0c2EPWrn/zcOJzth/9+/Qy0j39d"));
        Class class2 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "Ti3TvLpZz2b8sl8dGeICn4bYAUnGHyad7ShT92+gKCKZsyMRYG3KmvUcB5cToip2"));
        Class class3 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "V3Tb3wwZBH/MkprkkeKqg6pDa5tFOcttcgEaQ29QFMh2oue8xFqholngd6DkHA46"));
        obj1 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "j4P2NZaGK6yZNP+XTUyWiXWJgkAL02JK2VGVbrzucp2hianTo+ZgBPr3yFUnt+1x"));
        e = context.getMethod(a(abyte0, "7Kebxr/m40lXaqZ3f0vkkYGrrvm187cU3AS/kEduZcU="), new Class[0]);
        f = class1.getMethod(a(abyte0, "bmksOiX7ckGJ44MHrSqSV7mO7PRFCiyl+RZbwT1Bv0k="), new Class[0]);
        g = ((Class) (obj)).getMethod(a(abyte0, "PXKtpEOwUKSYQwobOd9LzM63iwGUroqnoqPL7HLAkwA="), new Class[] {
            android/content/Context
        });
        h = class2.getMethod(a(abyte0, "JzpLluqkhgPQ/w1TkrMPy9chUBDDjch5PM8hF9zAwuU="), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        i = class3.getMethod(a(abyte0, "a7sqqI6lRQtagq0yU9TL4NZ7huWSqCHa/L531Ub273o="), new Class[] {
            android/content/Context
        });
        j = ((Class) (obj1)).getMethod(a(abyte0, "ESnf6G2jUk6mqOv2P5Rlce2hoauGd+ogk4106OMMF9g="), new Class[] {
            android/content/Context
        });
        context = lb1.getName();
        lb1.delete();
        (new File(s, context.replace(".jar", ".dex"))).delete();
        l = b().longValue();
        d = true;
          goto _L2
        s;
        throw new kd(s);
        throw s;
        s;
        throw new kd(s);
        s;
        throw new kd(s);
        s;
        throw new kd(s);
        s;
        throw new kd(s);
    }

    private static Long b()
    {
        if (e == null)
        {
            throw new kd();
        }
        Long long1;
        try
        {
            long1 = (Long)e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new kd(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new kd(invocationtargetexception);
        }
        return long1;
    }

    private static String b(Context context, lb lb1)
    {
        if (j == null)
        {
            throw new kd();
        }
        try
        {
            context = (ByteBuffer)j.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new kd(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new kd(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        throw new kd();
        context = lb1.a(context.array());
        return context;
    }

    private static String c()
    {
        if (f == null)
        {
            throw new kd();
        }
        String s;
        try
        {
            s = (String)f.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new kd(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new kd(invocationtargetexception);
        }
        return s;
    }

    private static String d(Context context)
    {
        if (i == null)
        {
            throw new kd();
        }
        try
        {
            context = (String)i.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new kd(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new kd(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new kd();
        return context;
    }

    protected void b(Context context)
    {
        try
        {
            a(1, c());
        }
        catch (kd kd3) { }
        try
        {
            a(2, a());
        }
        catch (kd kd2) { }
        try
        {
            a(25, b().longValue());
        }
        catch (kd kd1) { }
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

    protected final void c(Context context)
    {
        try
        {
            a(2, a());
        }
        catch (kd kd5) { }
        try
        {
            a(1, c());
        }
        catch (kd kd4) { }
        try
        {
            long l1 = b().longValue();
            a(25, l1);
            if (l != 0L)
            {
                a(17, l1 - l);
                a(23, l);
            }
        }
        catch (kd kd3) { }
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
        catch (kd kd2) { }
        try
        {
            a(27, a(context, c));
        }
        catch (kd kd1) { }
        try
        {
            a(29, b(context, c));
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
