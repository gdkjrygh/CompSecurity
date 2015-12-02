// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.e;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a
{

    private static final String d;
    private static a f;
    private final ArrayList a = new ArrayList();
    private File b;
    private final Handler c;
    private Looper e;
    private final Object g = new Object();

    private a(File file)
    {
        b = new File(file, d);
        file = new HandlerThread("DIAGNOSTIC");
        file.start();
        e = file.getLooper();
        c = new Handler(e) {

            final a a;

            public void handleMessage(Message message)
            {
                a.a(a, message);
            }

            
            {
                a = a.this;
                super(looper);
            }
        };
    }

    public static final a a(Context context)
    {
        com/qihoo/security/e/a;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new a(context.getFilesDir());
        }
        context = f;
        com/qihoo/security/e/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private final void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            c();
            break;
        }
    }

    static void a(a a1, Message message)
    {
        a1.a(message);
    }

    private final void a(String s, String s1, String s2, int i)
    {
        String s3 = null;
        s = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        s1 = new PrintWriter(s1);
        PrintWriter printwriter = new PrintWriter(s2);
_L3:
        s3 = s.readLine();
        if (s3 == null) goto _L2; else goto _L1
_L1:
        i -= s3.length();
        Exception exception1;
        if (i >= 0)
        {
            s2 = s1;
        } else
        {
            s2 = printwriter;
        }
        s2.println(s3);
          goto _L3
        exception1;
        s2 = s;
        s3 = s1;
        s1 = printwriter;
        s = exception1;
_L8:
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s2.close();
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        s3.close();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        s1.close();
        throw s;
_L5:
        return;
_L2:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        s.close();
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1.close();
        if (printwriter == null) goto _L5; else goto _L4
_L4:
        try
        {
            printwriter.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("DIAGNOSTIC", "", s);
        }
        if (true) goto _L5; else goto _L6
_L6:
        s;
        s1 = null;
        s2 = null;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        s1 = null;
        s2 = s;
        s = exception;
        continue; /* Loop/switch isn't completed */
        exception1;
        Object obj = null;
        s3 = s1;
        s2 = s;
        s = exception1;
        s1 = obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private final void b()
    {
        if (b.exists() && b.length() > 32768L)
        {
            b.delete();
        }
    }

    private final void c()
    {
        synchronized (a)
        {
            obj = (String[])a.toArray(new String[0]);
            a.clear();
        }
        Object obj3 = g;
        obj3;
        JVM INSTR monitorenter ;
        b();
        obj2 = new PrintWriter(new FileOutputStream(b, true));
        int j = obj.length;
        int i = 0;
_L2:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        Object obj1;
        try
        {
            ((PrintWriter) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        obj3;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        ((PrintWriter) (obj2)).println(obj[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj2 = null;
_L4:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        ((PrintWriter) (obj2)).close();
        throw obj1;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Looper a()
    {
        return e;
    }

    public final void a(String s)
    {
        synchronized (g)
        {
            if (b.exists())
            {
                String s1 = b.getAbsolutePath();
                s = (new StringBuilder(String.valueOf(s))).append("/diag.txt").toString();
                String s2 = (new StringBuilder(String.valueOf(s1))).append(".tail").toString();
                a(s1, s, s2, 1024);
                b.delete();
                s = new File(s2);
                if (s.exists() && s.length() > 0L)
                {
                    s.renameTo(b);
                }
            }
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a(int i, String s)
    {
        c.removeMessages(2);
        String s1 = String.format("[%d]%s", new Object[] {
            Integer.valueOf(i), s
        });
        synchronized (a)
        {
            a.add(s1);
        }
        return c.sendEmptyMessage(2);
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        String s;
        if (Build.FINGERPRINT == null)
        {
            s = Integer.toHexString("DIAGNOSTIC".hashCode());
        } else
        {
            s = Integer.toHexString(Build.FINGERPRINT.hashCode());
        }
        d = s;
    }
}
