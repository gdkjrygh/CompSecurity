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
//            m, aa

class h
    implements m
{

    private static h tE;
    private static final Object tn = new Object();
    private final Context mContext;
    private String tF;
    private boolean tG;
    private final Object tH = new Object();

    protected h(Context context)
    {
        tG = false;
        mContext = context;
        cu();
    }

    private boolean K(String s)
    {
        try
        {
            aa.C("Storing clientId.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aa.A("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aa.A("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    static Object a(h h1)
    {
        return h1.tH;
    }

    static String a(h h1, String s)
    {
        h1.tF = s;
        return s;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.tG = flag;
        return flag;
    }

    public static h cq()
    {
        h h1;
        synchronized (tn)
        {
            h1 = tE;
        }
        return h1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String cs()
    {
        if (tG) goto _L2; else goto _L1
_L1:
        Object obj = tH;
        obj;
        JVM INSTR monitorenter ;
        if (tG) goto _L2; else goto _L3
_L3:
        aa.C("Waiting for clientId to load");
_L7:
        tH.wait();
_L5:
        if (!tG)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        aa.C("Loaded clientId");
        return tF;
        Object obj1;
        obj1;
        aa.A((new StringBuilder()).append("Exception while waiting for clientId: ").append(obj1).toString());
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void cu()
    {
        (new Thread("client_id_fetcher") {

            final h tI;

            public void run()
            {
                synchronized (h.a(tI))
                {
                    h.a(tI, tI.cv());
                    h.a(tI, true);
                    h.a(tI).notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                tI = h.this;
                super(s);
            }
        }).start();
    }

    public static void r(Context context)
    {
        synchronized (tn)
        {
            if (tE == null)
            {
                tE = new h(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean J(String s)
    {
        return "&cid".equals(s);
    }

    String cr()
    {
        String s;
        synchronized (tH)
        {
            tF = ct();
            s = tF;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String ct()
    {
        String s;
        String s1;
        s1 = UUID.randomUUID().toString().toLowerCase();
        s = s1;
        if (!K(s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        return null;
    }

    String cv()
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
        aa.A("clientId file seems corrupted, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ct();
        }
        return ((String) (obj1));
_L2:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        aa.A("clientId file seems empty, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = new String(((byte []) (obj)), 0, i);
        try
        {
            fileinputstream.close();
            aa.C("Loaded client id from disk.");
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
        aa.A("Error reading clientId file, deleting it.");
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
            return cs();
        } else
        {
            return null;
        }
    }

}
