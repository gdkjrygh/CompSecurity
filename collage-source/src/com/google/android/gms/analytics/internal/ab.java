// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.zzof;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, t

public class ab extends r
{

    private volatile String a;
    private Future b;

    protected ab(t t)
    {
        super(t);
    }

    static String a(ab ab1)
    {
        return ab1.f();
    }

    private boolean a(Context context, String s)
    {
        Context context1;
        Context context2;
        Context context3;
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        z.a(s);
        z.c("ClientId should be saved from worker thread");
        obj1 = null;
        obj2 = null;
        obj = null;
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        a("Storing clientId", s);
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        context = context.openFileOutput("gaClientId", 0);
        context2 = context;
        context3 = context;
        context1 = context;
        context.write(s.getBytes());
        boolean flag1 = true;
        flag = flag1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                e("Failed to close clientId writing stream", context);
                return true;
            }
            flag = flag1;
        }
_L2:
        return flag;
        context;
        context1 = context2;
        e("Error creating clientId file", context);
        if (context2 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context2.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e("Failed to close clientId writing stream", context);
            return false;
        }
        return false;
        context;
        context1 = context3;
        e("Error writing to clientId file", context);
        if (context3 == null) goto _L2; else goto _L3
_L3:
        try
        {
            context3.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e("Failed to close clientId writing stream", context);
            return false;
        }
        return false;
        context;
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                e("Failed to close clientId writing stream", s);
            }
        }
        throw context;
    }

    private String f()
    {
        String s;
        String s1;
        s1 = e();
        s = s1;
        if (!a(r().c(), s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        e("Error saving clientId file", exception);
        return "0";
    }

    protected String a(Context context)
    {
        z.c("ClientId should be loaded from worker thread");
        Object obj = context.openFileInput("gaClientId");
        Object obj1 = obj;
        byte abyte0[] = new byte[36];
        obj1 = obj;
        int i = ((FileInputStream) (obj)).read(abyte0, 0, abyte0.length);
        obj1 = obj;
        if (((FileInputStream) (obj)).available() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        e("clientId file seems corrupted, deleting it.");
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                e("Failed to close client id reading stream", context);
                return null;
            }
        }
_L4:
        return null;
_L2:
        if (i >= 14)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        e("clientId file is empty, deleting it.");
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                e("Failed to close client id reading stream", context);
                return null;
            }
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        String s = new String(abyte0, 0, i);
        obj1 = obj;
        a("Read client id from disk", s);
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                e("Failed to close client id reading stream", context);
            }
        }
        return s;
        context;
        context = null;
_L10:
        if (context == null) goto _L4; else goto _L5
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e("Failed to close client id reading stream", context);
            return null;
        }
        return null;
        IOException ioexception;
        ioexception;
        obj = null;
_L9:
        obj1 = obj;
        e("Error reading client id file, deleting it", ioexception);
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj == null) goto _L4; else goto _L6
_L6:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e("Failed to close client id reading stream", context);
            return null;
        }
        return null;
        context;
        obj1 = null;
_L8:
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                e("Failed to close client id reading stream", obj);
            }
        }
        throw context;
        context;
        if (true) goto _L8; else goto _L7
_L7:
        ioexception;
          goto _L9
        context;
        context = ((Context) (obj));
          goto _L10
    }

    protected void a()
    {
    }

    public String b()
    {
        D();
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (a == null)
        {
            b = r().a(new Callable() {

                final ab a;

                public String a()
                    throws Exception
                {
                    return a.d();
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = ab.this;
                super();
            }
            });
        }
        obj = b;
        if (obj == null) goto _L2; else goto _L1
_L1:
        a = (String)b.get();
_L3:
        if (a == null)
        {
            a = "0";
        }
        a("Loaded clientId", a);
        b = null;
_L2:
        obj = a;
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Object obj1;
        obj1;
        d("ClientId loading or generation was interrupted", obj1);
        a = "0";
          goto _L3
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        e("Failed to load or generate client id", obj1);
        a = "0";
          goto _L3
    }

    String c()
    {
        this;
        JVM INSTR monitorenter ;
        a = null;
        b = r().a(new Callable() {

            final ab a;

            public String a()
                throws Exception
            {
                return ab.a(a);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = ab.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return b();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    String d()
    {
        String s1 = a(r().c());
        String s = s1;
        if (s1 == null)
        {
            s = f();
        }
        return s;
    }

    protected String e()
    {
        return UUID.randomUUID().toString().toLowerCase();
    }
}
