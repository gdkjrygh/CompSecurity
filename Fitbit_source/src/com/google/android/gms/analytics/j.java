// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.b.a.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.analytics:
//            ao, aj, p, aa

class j
    implements ao
{

    private static Object a = new Object();
    private static j b;
    private com.google.android.gms.b.a.a.a c;
    private long d;
    private Context e;
    private String f;
    private boolean g;
    private Object h;

    j(Context context)
    {
        g = false;
        h = new Object();
        e = context.getApplicationContext();
    }

    public static ao a(Context context)
    {
        if (b == null)
        {
            synchronized (a)
            {
                if (b == null)
                {
                    b = new j(context);
                }
            }
        }
        return b;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private boolean a(com.google.android.gms.b.a.a.a a1, com.google.android.gms.b.a.a.a a2)
    {
        Object obj;
        String s;
        aj aj1;
        obj = null;
        if (a2 == null)
        {
            a2 = null;
        } else
        {
            a2 = a2.a();
        }
        if (TextUtils.isEmpty(a2))
        {
            return true;
        }
        com.google.android.gms.analytics.aj.a(e);
        aj1 = com.google.android.gms.analytics.aj.a();
        s = aj1.a("&cid");
        Object obj1 = h;
        obj1;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        f = b(e);
        g = true;
_L4:
        a1 = b((new StringBuilder()).append(a2).append(s).toString());
        if (!TextUtils.isEmpty(a1))
        {
            break MISSING_BLOCK_LABEL_207;
        }
        return false;
        a1;
        obj1;
        JVM INSTR monitorexit ;
        throw a1;
_L2:
        if (!TextUtils.isEmpty(f)) goto _L4; else goto _L3
_L3:
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        a1 = obj;
_L5:
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        boolean flag = c((new StringBuilder()).append(a2).append(s).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        a1 = a1.a();
          goto _L5
        f = b((new StringBuilder()).append(a1).append(s).toString());
          goto _L4
        if (!a1.equals(f))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj1;
        JVM INSTR monitorexit ;
        return true;
        if (TextUtils.isEmpty(f))
        {
            break MISSING_BLOCK_LABEL_296;
        }
        p.c("Resetting the client id because Advertising Id changed.");
        a1 = aj1.b();
        p.c((new StringBuilder()).append("New client Id: ").append(a1).toString());
_L6:
        flag = c((new StringBuilder()).append(a2).append(a1).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        a1 = s;
          goto _L6
    }

    static String b(Context context)
    {
        Object obj = null;
        byte abyte0[];
        FileInputStream fileinputstream;
        int i;
        fileinputstream = context.openFileInput("gaClientIdData");
        abyte0 = new byte[128];
        i = fileinputstream.read(abyte0, 0, 128);
        if (fileinputstream.available() <= 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        p.d("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        context.deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        p.b("Hash file is empty.");
        fileinputstream.close();
        return null;
        Object obj1 = new String(abyte0, 0, i);
        fileinputstream.close();
        return ((String) (obj1));
        obj1;
_L2:
        p.d("Error reading Hash file, deleting it.");
        context.deleteFile("gaClientIdData");
        return ((String) (obj));
        IOException ioexception;
        ioexception;
        ioexception = ((IOException) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        context;
        return ((String) (obj1));
        context;
        return null;
    }

    static String b(String s)
    {
        MessageDigest messagedigest = aa.c("MD5");
        if (messagedigest == null)
        {
            return null;
        } else
        {
            return String.format(Locale.US, "%032X", new Object[] {
                new BigInteger(1, messagedigest.digest(s.getBytes()))
            });
        }
    }

    private boolean c(String s)
    {
        try
        {
            s = b(s);
            p.c("Storing hashed adid.");
            FileOutputStream fileoutputstream = e.openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
            f = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.analytics.p.a("Error creating hash file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.analytics.p.a("Error writing to hash file.");
            return false;
        }
        return true;
    }

    com.google.android.gms.b.a.a.a a()
    {
        com.google.android.gms.b.a.a.a a1;
        try
        {
            a1 = com.google.android.gms.b.a.a.b(e);
        }
        catch (IllegalStateException illegalstateexception)
        {
            p.d("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            p.d("GooglePlayServicesRepairableException getting Ad Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            p.d("IOException getting Ad Id Info");
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            p.d("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return null;
        }
        catch (Throwable throwable)
        {
            p.d("Unknown exception. Could not get the ad Id.");
            return null;
        }
        return a1;
    }

    public String a(String s)
    {
        long l = System.currentTimeMillis();
        if (l - d > 1000L)
        {
            com.google.android.gms.b.a.a.a a1 = a();
            if (a(c, a1))
            {
                c = a1;
            } else
            {
                c = new com.google.android.gms.b.a.a.a("", false);
            }
            d = l;
        }
        if (c != null)
        {
            if ("&adid".equals(s))
            {
                return c.a();
            }
            if ("&ate".equals(s))
            {
                if (c.b())
                {
                    return "0";
                } else
                {
                    return "1";
                }
            }
        }
        return null;
    }

}
