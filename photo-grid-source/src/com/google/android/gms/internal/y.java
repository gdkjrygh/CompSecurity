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
//            x, z, af, ai, 
//            ah, ag

public abstract class y extends x
{

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
    private static ah v;

    protected y(Context context, af af1, ag ag)
    {
        super(context, af1, ag);
    }

    private static String a()
    {
        if (r == null)
        {
            throw new z();
        } else
        {
            return r;
        }
    }

    private static String a(Context context, af af1)
    {
        if (s != null)
        {
            return s;
        }
        if (h == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new z();
        context = af1.a(context.array());
        s = context;
        return context;
    }

    private static String a(byte abyte0[], String s1)
    {
        try
        {
            abyte0 = new String(v.a(abyte0, s1), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new z(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new z(abyte0);
        }
        return abyte0;
    }

    private static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
    {
        if (i == null || motionevent == null)
        {
            throw new z();
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
            throw new z(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new z(motionevent);
        }
        return motionevent;
    }

    protected static void a(String s1, Context context, af af1)
    {
        com/google/android/gms/internal/y;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (flag) goto _L2; else goto _L1
_L1:
        v = new ah(af1);
        r = s1;
        byte abyte0[];
        byte abyte1[];
        abyte0 = v.a("LRlQKUl3Ez9L7l2NXdeKgQmlATnswgmaOuq7itR7RMo=");
        abyte1 = v.a(abyte0, "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");
        af1 = context.getCacheDir();
        s1 = af1;
        if (af1 != null) goto _L4; else goto _L3
_L3:
        af1 = context.getDir("dex", 0);
        s1 = af1;
        if (af1 != null) goto _L4; else goto _L5
_L5:
        throw new z();
        s1;
        try
        {
            throw new z(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            com/google/android/gms/internal/y;
        }
_L2:
        com/google/android/gms/internal/y;
        JVM INSTR monitorexit ;
        return;
_L4:
        af1 = File.createTempFile("ads", ".jar", s1);
        FileOutputStream fileoutputstream = new FileOutputStream(af1);
        fileoutputstream.write(abyte1, 0, abyte1.length);
        fileoutputstream.close();
        Object obj = new DexClassLoader(af1.getAbsolutePath(), s1.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj)).loadClass(a(abyte0, "KhSmBQZRQEPe/BGvIr5WkcbOHOLgq2w+urlR3WfgMPc79YfTw8JOwUI0QOGgskLS"));
        Class class1 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "5zEoHTvv24vfI0dl62z+ub9qAgSWQUwSfYOkA3vt70xWpEDCU/Nb3l8dmdkdmy+K"));
        Class class2 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "EmOVmtLtyQCsP0I8v4wQY1U+Pr3p3FmNbfUrQxjRGGZNnYtBZDjQWsOtzel9CADw"));
        Class class3 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "wncnZK+9eqclwkS4bsEPr19jx6nYpAABpdisTIDOrQAPf1zDM3gknsMQjelb0QRA"));
        Class class4 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "3vqT07YvDKQnEowYommzIlMF1f3ZdFdlMqpDfAjRlsQYbzKXJQZnFxhT5aVTfPYb"));
        Class class5 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "75Hb3ekd90V7zGtVuokACvL7ICx64Fu6wpvMlMeArnowpOShKUPJUs4YW1ttHedv"));
        Class class6 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "BLWMsE8J1qrXqTLoFJHLMUe+OHguVuZRUEGhORBaoVRHZugKuEdCoBHidX7DHHOS"));
        Class class7 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "0LsznCWh3rAQNHBlYNXisqs+wwNhiZ6t/LVa3fn03+9dqIR9mDM8kSaE7baQikdY"));
        Class class8 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "u1dIqpN/cUIrceNZiJDobQl8yeDErVgGzMtAS8fSiU4PeBUkqeeM139zd3391N57"));
        Class class9 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "rLXIxdij9DklHxag5b6yKWek6n6mKT4SVdJhChVaAQIJl5aelAHuyGVYzmJ7n4lI"));
        Class class10 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "z0nCgRPYR37+kfTL3l7tV5MTaqyG22hgU0/QBNM0QO+B9gbUaEs9kFdScGSKxid5"));
        Class class11 = ((DexClassLoader) (obj)).loadClass(a(abyte0, "mQWinYqFSi9EBZImq7JnStlg672r2mPSE2SL1zSkXXLGN1eP4gCLgTD5Sqs/mXfF"));
        obj = ((DexClassLoader) (obj)).loadClass(a(abyte0, "5wwhTwthpPHkqMAU4x6thDAx/ZsoX80L+SNSUDSht50e0R9AQLU+wOeWO8uwbdJy"));
        e = context.getMethod(a(abyte0, "nf6iGRVJuF5ACSDEQZxMzd7wI75iC1PNcmruKJNtcgg="), new Class[0]);
        f = class1.getMethod(a(abyte0, "CD0F2tn2KRjgrU4eXlaqDqyiB1OVEfkdJhhOm/QLTQQ="), new Class[0]);
        g = class2.getMethod(a(abyte0, "/qGDFRtXXsBuvL0ChHfSGOEtO61gB8BFkMFQqSJIs08="), new Class[0]);
        h = class3.getMethod(a(abyte0, "UxYOB8NR+mf/tjkmNoZwE8o+PJfnWKjquT5/G/Sowlg="), new Class[] {
            android/content/Context
        });
        i = class4.getMethod(a(abyte0, "o3cTwon372S7STnAd4taSq4J6TRTH5vyPb5QYkPRBlY="), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        j = class5.getMethod(a(abyte0, "8jgGibEJ3p+AH+ayw20+GncmMh2by1vNbrQhIlibpP0="), new Class[] {
            android/content/Context
        });
        k = class6.getMethod(a(abyte0, "kFIRhB4rWGIH8lK5op5qJcTbfrpWxVNLY/bXskTga8o="), new Class[] {
            android/content/Context
        });
        l = class7.getMethod(a(abyte0, "2JYNvo6YymKLqvBJgOwReEIlwBcdZI+gWE7IGGa2r9U="), new Class[] {
            android/content/Context
        });
        m = class8.getMethod(a(abyte0, "ihmff+2mUvd8X+nG5VHtOIkl5vxKygc//6Y5/ICeg0k="), new Class[] {
            android/content/Context
        });
        n = class9.getMethod(a(abyte0, "Fg1C9Ps2OO2qP7zDMO1pBdQriGhFA4wpbeTWOAGKFYk="), new Class[] {
            android/content/Context
        });
        o = class10.getMethod(a(abyte0, "t3gYje4YFIDFj04wHFUmHZbacQnCuVIq1UyuA4aI95o="), new Class[] {
            android/content/Context
        });
        p = class11.getMethod(a(abyte0, "gilYFtjD/V6UFbLfWsxVmIWRpsRJVLsZP5C4m1/o4ww="), new Class[] {
            android/content/Context
        });
        q = ((Class) (obj)).getMethod(a(abyte0, "sl0UQpoVkHbxVKPtde9TSo3iVR6R1HaNFjJv2mWXCEM="), new Class[] {
            android/content/Context
        });
        context = af1.getName();
        af1.delete();
        (new File(s1, context.replace(".jar", ".dex"))).delete();
        u = b().longValue();
        d = true;
        if (true) goto _L2; else goto _L6
_L6:
        context;
        String s2 = af1.getName();
        af1.delete();
        (new File(s1, s2.replace(".jar", ".dex"))).delete();
        throw context;
        s1;
        throw new z(s1);
        throw s1;
        s1;
        throw new z(s1);
        s1;
        throw new z(s1);
        s1;
        throw new z(s1);
        s1;
        throw new z(s1);
    }

    private static Long b()
    {
        if (e == null)
        {
            throw new z();
        }
        Long long1;
        try
        {
            long1 = (Long)e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new z(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new z(invocationtargetexception);
        }
        return long1;
    }

    private static String b(Context context, af af1)
    {
        if (t != null)
        {
            return t;
        }
        if (k == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new z();
        context = af1.a(context.array());
        t = context;
        return context;
    }

    private static String c()
    {
        if (g == null)
        {
            throw new z();
        }
        String s1;
        try
        {
            s1 = (String)g.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new z(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new z(invocationtargetexception);
        }
        return s1;
    }

    private static Long d()
    {
        if (f == null)
        {
            throw new z();
        }
        Long long1;
        try
        {
            long1 = (Long)f.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new z(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new z(invocationtargetexception);
        }
        return long1;
    }

    static String d(Context context)
    {
        if (j == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new z();
        return context;
    }

    private static String e(Context context)
    {
        if (n == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        return context;
    }

    private static Long f(Context context)
    {
        if (o == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        return context;
    }

    private static ArrayList g(Context context)
    {
        if (l == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (context.size() == 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new z();
        return context;
    }

    private static int[] h(Context context)
    {
        if (m == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        return context;
    }

    private static int i(Context context)
    {
        if (p == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        return i1;
    }

    private static int j(Context context)
    {
        if (q == null)
        {
            throw new z();
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
            throw new z(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new z(context);
        }
        return i1;
    }

    protected void b(Context context)
    {
        try
        {
            a(1, c());
        }
        catch (z z11) { }
        try
        {
            a(2, a());
        }
        catch (z z10) { }
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
        catch (z z9) { }
        try
        {
            ArrayList arraylist = g(context);
            a(31, ((Long)arraylist.get(0)).longValue());
            a(32, ((Long)arraylist.get(1)).longValue());
        }
        catch (z z8) { }
        try
        {
            a(33, d().longValue());
        }
        catch (z z7) { }
        try
        {
            a(27, a(context, c));
        }
        catch (z z6) { }
        try
        {
            a(29, b(context, c));
        }
        catch (z z5) { }
        try
        {
            int ai1[] = h(context);
            a(5, ai1[0]);
            a(6, ai1[1]);
        }
        catch (z z4) { }
        try
        {
            a(12, i(context));
        }
        catch (z z3) { }
        try
        {
            a(3, j(context));
        }
        catch (z z2) { }
        try
        {
            a(34, e(context));
        }
        catch (z z1) { }
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
        catch (z z5) { }
        try
        {
            a(1, c());
        }
        catch (z z4) { }
        try
        {
            a(25, b().longValue());
        }
        catch (z z3) { }
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
        catch (z z2) { }
        try
        {
            a(34, e(context));
        }
        catch (z z1) { }
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
