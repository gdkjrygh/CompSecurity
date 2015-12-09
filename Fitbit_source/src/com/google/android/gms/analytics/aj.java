// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics:
//            ao, p

class aj
    implements ao
{

    private static aj a;
    private static final Object b = new Object();
    private final Context c;
    private String d;
    private boolean e;
    private final Object f = new Object();

    protected aj(Context context)
    {
        e = false;
        c = context;
        f();
    }

    public static aj a()
    {
        aj aj1;
        synchronized (b)
        {
            aj1 = a;
        }
        return aj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static Object a(aj aj1)
    {
        return aj1.f;
    }

    static String a(aj aj1, String s)
    {
        aj1.d = s;
        return s;
    }

    public static void a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = new aj(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static boolean a(aj aj1, boolean flag)
    {
        aj1.e = flag;
        return flag;
    }

    private boolean c(String s)
    {
        try
        {
            p.c("Storing clientId.");
            FileOutputStream fileoutputstream = c.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.a("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.a("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    private String e()
    {
        if (e) goto _L2; else goto _L1
_L1:
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (e) goto _L2; else goto _L3
_L3:
        p.c("Waiting for clientId to load");
_L7:
        f.wait();
_L5:
        if (!e)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        p.c("Loaded clientId");
        return d;
        Object obj1;
        obj1;
        p.a((new StringBuilder()).append("Exception while waiting for clientId: ").append(obj1).toString());
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void f()
    {
        (new Thread("client_id_fetcher") {

            final aj a;

            public void run()
            {
                synchronized (aj.a(a))
                {
                    aj.a(a, a.d());
                    aj.a(a, true);
                    aj.a(a).notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = aj.this;
                super(s);
            }
        }).start();
    }

    public String a(String s)
    {
        if ("&cid".equals(s))
        {
            return e();
        } else
        {
            return null;
        }
    }

    String b()
    {
        String s;
        synchronized (f)
        {
            d = c();
            s = d;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b(String s)
    {
        return "&cid".equals(s);
    }

    protected String c()
    {
        String s;
        String s1;
        s1 = UUID.randomUUID().toString().toLowerCase();
        s = s1;
        if (!c(s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        return null;
    }

    String d()
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        Object obj;
        FileInputStream fileinputstream;
        int i;
        fileinputstream = c.openFileInput("gaClientId");
        obj = new byte[128];
        i = fileinputstream.read(((byte []) (obj)), 0, 128);
        if (fileinputstream.available() <= 0) goto _L2; else goto _L1
_L1:
        p.a("clientId file seems corrupted, deleting it.");
        fileinputstream.close();
        c.deleteFile("gaClientId");
        obj = obj1;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = c();
        }
        return ((String) (obj1));
_L2:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        p.a("clientId file seems empty, deleting it.");
        fileinputstream.close();
        c.deleteFile("gaClientId");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = new String(((byte []) (obj)), 0, i);
        try
        {
            fileinputstream.close();
            p.c("Loaded client id from disk.");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        break MISSING_BLOCK_LABEL_134;
        obj;
        obj = obj2;
        p.a("Error reading clientId file, deleting it.");
        c.deleteFile("gaClientId");
        continue; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

}
