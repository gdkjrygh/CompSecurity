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
//            q, ac

final class k
    implements q
{

    private static final Object xN = new Object();
    private static k yC;
    private final Context mContext;
    private String yD;
    private boolean yE;
    private final Object yF = new Object();

    private k(Context context)
    {
        yE = false;
        mContext = context;
        el();
    }

    static Object a(k k1)
    {
        return k1.yF;
    }

    static String a(k k1, String s)
    {
        k1.yD = s;
        return s;
    }

    static boolean a(k k1, boolean flag)
    {
        k1.yE = flag;
        return flag;
    }

    private boolean ad(String s)
    {
        try
        {
            ac.v("Storing clientId.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ac.e("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ac.e("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    public static k eh()
    {
        k k1;
        synchronized (xN)
        {
            k1 = yC;
        }
        return k1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String ej()
    {
        if (yE) goto _L2; else goto _L1
_L1:
        Object obj = yF;
        obj;
        JVM INSTR monitorenter ;
        if (yE) goto _L2; else goto _L3
_L3:
        ac.v("Waiting for clientId to load");
_L7:
        yF.wait();
_L5:
        if (!yE)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        ac.v("Loaded clientId");
        return yD;
        Object obj1;
        obj1;
        ac.e((new StringBuilder("Exception while waiting for clientId: ")).append(obj1).toString());
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private String ek()
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

    private void el()
    {
        (new Thread("client_id_fetcher") {

            final k yG;

            public final void run()
            {
                synchronized (k.a(yG))
                {
                    k.a(yG, yG.em());
                    k.a(yG, true);
                    k.a(yG).notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                yG = k.this;
                super(s);
            }
        }).start();
    }

    public static void y(Context context)
    {
        synchronized (xN)
        {
            if (yC == null)
            {
                yC = new k(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    final String ei()
    {
        String s;
        synchronized (yF)
        {
            yD = ek();
            s = yD;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final String em()
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
        ac.e("clientId file seems corrupted, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ek();
        }
        return ((String) (obj1));
_L2:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        ac.e("clientId file seems empty, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = new String(((byte []) (obj)), 0, i);
        try
        {
            fileinputstream.close();
            ac.v("Loaded client id from disk.");
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
        ac.e("Error reading clientId file, deleting it.");
        mContext.deleteFile("gaClientId");
        continue; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String getValue(String s)
    {
        if ("&cid".equals(s))
        {
            return ej();
        } else
        {
            return null;
        }
    }

}
