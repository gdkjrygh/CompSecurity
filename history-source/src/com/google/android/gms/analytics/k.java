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
//            q, ae

class k
    implements q
{

    private static final Object xO = new Object();
    private static k yD;
    private final Context mContext;
    private String yE;
    private boolean yF;
    private final Object yG = new Object();

    protected k(Context context)
    {
        yF = false;
        mContext = context;
        ep();
    }

    static Object a(k k1)
    {
        return k1.yG;
    }

    static String a(k k1, String s)
    {
        k1.yE = s;
        return s;
    }

    static boolean a(k k1, boolean flag)
    {
        k1.yF = flag;
        return flag;
    }

    private boolean ae(String s)
    {
        try
        {
            com.google.android.gms.analytics.ae.V("Storing clientId.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.analytics.ae.T("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.analytics.ae.T("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    public static k el()
    {
        k k1;
        synchronized (xO)
        {
            k1 = yD;
        }
        return k1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String en()
    {
        if (yF) goto _L2; else goto _L1
_L1:
        Object obj = yG;
        obj;
        JVM INSTR monitorenter ;
        if (yF) goto _L2; else goto _L3
_L3:
        com.google.android.gms.analytics.ae.V("Waiting for clientId to load");
_L7:
        yG.wait();
_L5:
        if (!yF)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        com.google.android.gms.analytics.ae.V("Loaded clientId");
        return yE;
        Object obj1;
        obj1;
        com.google.android.gms.analytics.ae.T((new StringBuilder()).append("Exception while waiting for clientId: ").append(obj1).toString());
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void ep()
    {
        (new Thread("client_id_fetcher") {

            final k yH;

            public void run()
            {
                synchronized (k.a(yH))
                {
                    k.a(yH, yH.eq());
                    k.a(yH, true);
                    k.a(yH).notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                yH = k.this;
                super(s);
            }
        }).start();
    }

    public static void y(Context context)
    {
        synchronized (xO)
        {
            if (yD == null)
            {
                yD = new k(context);
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

    String em()
    {
        String s;
        synchronized (yG)
        {
            yE = eo();
            s = yE;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String eo()
    {
        String s;
        String s1;
        s1 = UUID.randomUUID().toString().toLowerCase();
        s = s1;
        if (!ae(s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        return null;
    }

    String eq()
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
        com.google.android.gms.analytics.ae.T("clientId file seems corrupted, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = eo();
        }
        return ((String) (obj1));
_L2:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        com.google.android.gms.analytics.ae.T("clientId file seems empty, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = new String(((byte []) (obj)), 0, i);
        try
        {
            fileinputstream.close();
            com.google.android.gms.analytics.ae.V("Loaded client id from disk.");
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
        com.google.android.gms.analytics.ae.T("Error reading clientId file, deleting it.");
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
            return en();
        } else
        {
            return null;
        }
    }

}
