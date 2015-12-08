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

    private static final Object sf = new Object();
    private static h st;
    private final Context mContext;
    private String su;
    private boolean sv;
    private final Object sw = new Object();

    protected h(Context context)
    {
        sv = false;
        mContext = context;
        ce();
    }

    private boolean D(String s)
    {
        try
        {
            aa.y("Storing clientId.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aa.w("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aa.w("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    static Object a(h h1)
    {
        return h1.sw;
    }

    static String a(h h1, String s)
    {
        h1.su = s;
        return s;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.sv = flag;
        return flag;
    }

    public static h cb()
    {
        h h1;
        synchronized (sf)
        {
            h1 = st;
        }
        return h1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String cc()
    {
        if (sv) goto _L2; else goto _L1
_L1:
        Object obj = sw;
        obj;
        JVM INSTR monitorenter ;
        if (sv) goto _L2; else goto _L3
_L3:
        aa.y("Waiting for clientId to load");
_L7:
        sw.wait();
_L5:
        if (!sv)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        aa.y("Loaded clientId");
        return su;
        Object obj1;
        obj1;
        aa.w((new StringBuilder()).append("Exception while waiting for clientId: ").append(obj1).toString());
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void ce()
    {
        (new Thread("client_id_fetcher") {

            final h sx;

            public void run()
            {
                synchronized (h.a(sx))
                {
                    h.a(sx, sx.cf());
                    h.a(sx, true);
                    h.a(sx).notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                sx = h.this;
                super(s);
            }
        }).start();
    }

    public static void n(Context context)
    {
        synchronized (sf)
        {
            if (st == null)
            {
                st = new h(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean C(String s)
    {
        return "&cid".equals(s);
    }

    protected String cd()
    {
        String s;
        String s1;
        s1 = UUID.randomUUID().toString().toLowerCase();
        s = s1;
        if (!D(s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        return null;
    }

    String cf()
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
        aa.w("clientId file seems corrupted, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = cd();
        }
        return ((String) (obj1));
_L2:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        aa.w("clientId file seems empty, deleting it.");
        fileinputstream.close();
        mContext.deleteFile("gaClientId");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = new String(((byte []) (obj)), 0, i);
        try
        {
            fileinputstream.close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        break MISSING_BLOCK_LABEL_129;
        obj;
        obj = obj2;
        aa.w("Error reading clientId file, deleting it.");
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
            return cc();
        } else
        {
            return null;
        }
    }

}
