// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, k, s, m, 
//            aa

public final class a extends q
{

    public static boolean a;
    private com.google.android.gms.ads.a.a b;
    private final k c;
    private String d;
    private boolean e;
    private Object f;

    a(s s1)
    {
        super(s1);
        e = false;
        f = new Object();
        c = new k(s1.c());
    }

    private static String a(String s1)
    {
        MessageDigest messagedigest = m.d("MD5");
        if (messagedigest == null)
        {
            return null;
        } else
        {
            return String.format(Locale.US, "%032X", new Object[] {
                new BigInteger(1, messagedigest.digest(s1.getBytes()))
            });
        }
    }

    private boolean a(com.google.android.gms.ads.a.a a1, com.google.android.gms.ads.a.a a2)
    {
        Object obj;
        String s1;
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
        s1 = v().b();
        Object obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        if (e) goto _L2; else goto _L1
_L1:
        d = f();
        e = true;
_L4:
        a1 = a((new StringBuilder()).append(a2).append(s1).toString());
        if (!TextUtils.isEmpty(a1))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        return false;
        a1;
        obj1;
        JVM INSTR monitorexit ;
        throw a1;
_L2:
        if (!TextUtils.isEmpty(d)) goto _L4; else goto _L3
_L3:
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        a1 = obj;
_L5:
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        boolean flag = b((new StringBuilder()).append(a2).append(s1).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        a1 = a1.a();
          goto _L5
        d = a((new StringBuilder()).append(a1).append(s1).toString());
          goto _L4
        if (!a1.equals(d))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        obj1;
        JVM INSTR monitorexit ;
        return true;
        if (TextUtils.isEmpty(d))
        {
            break MISSING_BLOCK_LABEL_269;
        }
        c("Resetting the client id because Advertising Id changed.");
        a1 = v().c();
        a("New client Id", a1);
_L6:
        flag = b((new StringBuilder()).append(a2).append(a1).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        a1 = s1;
          goto _L6
    }

    private boolean b(String s1)
    {
        try
        {
            s1 = a(s1);
            c("Storing hashed adid.");
            FileOutputStream fileoutputstream = m().openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s1.getBytes());
            fileoutputstream.close();
            d = s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            e("Error creating hash file", s1);
            return false;
        }
        return true;
    }

    private com.google.android.gms.ads.a.a d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.a(1000L))
        {
            c.a();
            com.google.android.gms.ads.a.a a1 = e();
            if (!a(b, a1))
            {
                break MISSING_BLOCK_LABEL_53;
            }
            b = a1;
        }
_L1:
        com.google.android.gms.ads.a.a a2 = b;
        this;
        JVM INSTR monitorexit ;
        return a2;
        g("Failed to reset client id on adid change. Not using adid");
        b = new com.google.android.gms.ads.a.a("", false);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private com.google.android.gms.ads.a.a e()
    {
        com.google.android.gms.ads.a.a a1 = null;
        com.google.android.gms.ads.a.a a2 = com.google.android.gms.ads.a.a.a(m());
        a1 = a2;
_L2:
        return a1;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        f("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        return null;
        Throwable throwable;
        throwable;
        if (!a)
        {
            a = true;
            d("Error getting advertiser id", throwable);
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String f()
    {
        Object obj = null;
        byte abyte0[];
        FileInputStream fileinputstream;
        int i;
        fileinputstream = m().openFileInput("gaClientIdData");
        abyte0 = new byte[128];
        i = fileinputstream.read(abyte0, 0, 128);
        if (fileinputstream.available() <= 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        f("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        m().deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        c("Hash file is empty.");
        fileinputstream.close();
        return null;
        Object obj1 = new String(abyte0, 0, i);
        fileinputstream.close();
        return ((String) (obj1));
        obj1;
_L2:
        d("Error reading Hash file, deleting it", obj1);
        m().deleteFile("gaClientIdData");
        return ((String) (obj));
        IOException ioexception;
        ioexception;
        obj = obj1;
        obj1 = ioexception;
        if (true) goto _L2; else goto _L1
_L1:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        return ((String) (obj1));
        filenotfoundexception;
        return null;
    }

    protected final void a()
    {
    }

    public final boolean b()
    {
        boolean flag1 = false;
        B();
        com.google.android.gms.ads.a.a a1 = d();
        boolean flag = flag1;
        if (a1 != null)
        {
            flag = flag1;
            if (!a1.b())
            {
                flag = true;
            }
        }
        return flag;
    }

    public final String c()
    {
        B();
        Object obj = d();
        if (obj != null)
        {
            obj = ((com.google.android.gms.ads.a.a) (obj)).a();
        } else
        {
            obj = null;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        } else
        {
            return ((String) (obj));
        }
    }
}
