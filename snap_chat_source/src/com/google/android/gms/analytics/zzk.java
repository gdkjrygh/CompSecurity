// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzra;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics:
//            zzq, zzae

class zzk
    implements zzq
{

    private final zzra zzAM;
    private volatile String zzBC;
    private Future zzBD;

    protected zzk(zzra zzra1)
    {
        zzx.zzl(zzra1);
        zzAM = zzra1;
        zzBD = zzra1.zza(new Callable() {

            final zzk zzBE;

            public Object call()
            {
                return zzfA();
            }

            public String zzfA()
            {
                return zzBE.zzfx();
            }

            
            {
                zzBE = zzk.this;
                super();
            }
        });
    }

    protected static String zzC(Context context)
    {
        zzx.zzbe("ClientId should be loaded from worker thread");
        Object obj = context.openFileInput("gaClientId");
        Object obj1 = obj;
        byte abyte0[] = new byte[36];
        obj1 = obj;
        int i = ((FileInputStream) (obj)).read(abyte0, 0, 36);
        obj1 = obj;
        if (((FileInputStream) (obj)).available() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        zzae.zzZ("clientId file seems corrupted, deleting it.");
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
                zzae.zzZ((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
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
        zzae.zzZ("clientId file seems empty, deleting it.");
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
                zzae.zzZ((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
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
        zzae.zzab("Loaded client id from disk.");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zzae.zzZ((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
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
            zzae.zzZ((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
            return null;
        }
        return null;
        obj;
        obj = null;
_L9:
        obj1 = obj;
        zzae.zzZ("Error reading clientId file, deleting it.");
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
            zzae.zzZ((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
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
                zzae.zzZ((new StringBuilder("Failed to close clientId reading stream: ")).append(obj).toString());
            }
        }
        throw context;
        context;
        if (true) goto _L8; else goto _L7
_L7:
        IOException ioexception;
        ioexception;
          goto _L9
        context;
        context = ((Context) (obj));
          goto _L10
    }

    static String zza(zzk zzk1)
    {
        return zzk1.zzfy();
    }

    private static boolean zzf(Context context, String s)
    {
        Context context1;
        Context context2;
        Context context3;
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        zzx.zzbn(s);
        zzx.zzbe("ClientId should be saved from worker thread");
        obj1 = null;
        obj2 = null;
        obj = null;
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        zzae.zzab("Storing clientId.");
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        context = context.openFileOutput("gaClientId", 0);
        context2 = context;
        context3 = context;
        context1 = context;
        context.write(s.getBytes());
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zzae.zzZ((new StringBuilder("Failed to close clientId writing stream: ")).append(context).toString());
            }
        }
        flag = true;
_L2:
        return flag;
        context;
        context1 = context2;
        zzae.zzZ("Error creating clientId file.");
        if (context2 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context2.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzae.zzZ((new StringBuilder("Failed to close clientId writing stream: ")).append(context).toString());
            return false;
        }
        return false;
        context;
        context1 = context3;
        zzae.zzZ("Error writing to clientId file.");
        if (context3 == null) goto _L2; else goto _L3
_L3:
        try
        {
            context3.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzae.zzZ((new StringBuilder("Failed to close clientId writing stream: ")).append(context).toString());
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
                zzae.zzZ((new StringBuilder("Failed to close clientId writing stream: ")).append(s).toString());
            }
        }
        throw context;
    }

    private String zzfy()
    {
        String s;
        String s1;
        s1 = zzfz();
        s = s1;
        if (!zzf(zzAM.getContext(), s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        zzae.zzZ((new StringBuilder("Error saving clientId file: ")).append(exception).toString());
        return "0";
    }

    public String getValue(String s)
    {
        if ("&cid".equals(s))
        {
            return zzfv();
        } else
        {
            return null;
        }
    }

    protected String zzfv()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = zzBD;
        if (obj == null) goto _L2; else goto _L1
_L1:
        zzBC = (String)zzBD.get();
_L3:
        zzae.zzab("Loaded clientId");
        zzBD = null;
_L2:
        obj = zzBC;
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Object obj1;
        obj1;
        zzae.zzZ((new StringBuilder("Exception while waiting for clientId: ")).append(obj1).toString());
        zzBC = "0";
          goto _L3
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zzae.zzZ((new StringBuilder("Exception while waiting for clientId: ")).append(obj1).toString());
        zzBC = "0";
          goto _L3
    }

    String zzfw()
    {
        this;
        JVM INSTR monitorenter ;
        zzBC = null;
        zzBD = zzAM.zza(new Callable() {

            final zzk zzBE;

            public Object call()
            {
                return zzfA();
            }

            public String zzfA()
            {
                return zzk.zza(zzBE);
            }

            
            {
                zzBE = zzk.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return zzfv();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    String zzfx()
    {
        String s1 = zzC(zzAM.getContext());
        String s = s1;
        if (s1 == null)
        {
            s = zzfy();
        }
        return s;
    }

    protected String zzfz()
    {
        return UUID.randomUUID().toString().toLowerCase();
    }
}
