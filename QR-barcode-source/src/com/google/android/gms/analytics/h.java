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
//            l, z

class h
    implements l
{

    private static h xQ;
    private static final Object xz = new Object();
    private final Context mContext;
    private String xR;
    private boolean xS;
    private final Object xT = new Object();

    protected h(Context context)
    {
        xS = false;
        mContext = context;
        dU();
    }

    static Object a(h h1)
    {
        return h1.xT;
    }

    static String a(h h1, String s)
    {
        h1.xR = s;
        return s;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.xS = flag;
        return flag;
    }

    private boolean ad(String s)
    {
        try
        {
            z.V("Storing clientId.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            z.T("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            z.T("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    public static h dQ()
    {
        h h1;
        synchronized (xz)
        {
            h1 = xQ;
        }
        return h1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String dS()
    {
        if (xS) goto _L2; else goto _L1
_L1:
        Object obj = xT;
        obj;
        JVM INSTR monitorenter ;
        if (xS) goto _L2; else goto _L3
_L3:
        z.V("Waiting for clientId to load");
_L7:
        xT.wait();
_L5:
        if (!xS)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        z.V("Loaded clientId");
        return xR;
        Object obj1;
        obj1;
        z.T((new StringBuilder()).append("Exception while waiting for clientId: ").append(obj1).toString());
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void dU()
    {
        (new Thread("client_id_fetcher") {

            final h xU;

            public void run()
            {
                synchronized (h.a(xU))
                {
                    h.a(xU, xU.dV());
                    h.a(xU, true);
                    h.a(xU).notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                xU = h.this;
                super(s);
            }
        }).start();
    }

    public static void y(Context context)
    {
        synchronized (xz)
        {
            if (xQ == null)
            {
                xQ = new h(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean ac(String s)
    {
        return "&cid".equals(s);
    }

    String dR()
    {
        String s;
        synchronized (xT)
        {
            xR = dT();
            s = xR;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String dT()
    {
        String s;
        String s1;
        s1 = UUID.randomUUID().toString().toLowerCase();
        s = s1;
        if (!ad(s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        return null;
    }

    String dV()
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        Object obj;
        FileInputStream fileinputstream;
        int i;
        fileinputstream = mContext.openFileInput("gaClientId");
        obj = new byte[128];
        i = fileinputstream.read(((byte []) (obj)), 0, 128);
        if (fileinputstream.available() <= 0) goto _L2; else goto _L1
_L1:
        z.T("clientId file seems corrupted, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = dT();
        }
        return ((String) (obj1));
_L2:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        z.T("clientId file seems empty, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = new String(((byte []) (obj)), 0, i);
        try
        {
            fileinputstream.close();
            z.V("Loaded client id from disk.");
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
        z.T("Error reading clientId file, deleting it.");
        mContext.deleteFile("gaClientId");
        continue; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getValue(String s)
    {
        if ("&cid".equals(s))
        {
            return dS();
        } else
        {
            return null;
        }
    }

}
