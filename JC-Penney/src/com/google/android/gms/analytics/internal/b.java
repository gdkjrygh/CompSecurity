// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a.a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, q, ab, r, 
//            au

public class b extends z
{

    public static boolean a;
    private com.google.android.gms.a.a.b b;
    private final q c;
    private String d;
    private boolean e;
    private Object f;

    b(ab ab1)
    {
        super(ab1);
        e = false;
        f = new Object();
        c = new q(ab1.d());
    }

    private static String a(String s)
    {
        MessageDigest messagedigest = r.b("MD5");
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

    private boolean a(com.google.android.gms.a.a.b b1, com.google.android.gms.a.a.b b2)
    {
        Object obj;
        String s;
        obj = null;
        if (b2 == null)
        {
            b2 = null;
        } else
        {
            b2 = b2.a();
        }
        if (TextUtils.isEmpty(b2))
        {
            return true;
        }
        s = x().b();
        Object obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        if (e) goto _L2; else goto _L1
_L1:
        d = e();
        e = true;
_L4:
        b1 = a((new StringBuilder()).append(b2).append(s).toString());
        if (!TextUtils.isEmpty(b1))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        return false;
        b1;
        obj1;
        JVM INSTR monitorexit ;
        throw b1;
_L2:
        if (!TextUtils.isEmpty(d)) goto _L4; else goto _L3
_L3:
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        b1 = obj;
_L5:
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        boolean flag = g((new StringBuilder()).append(b2).append(s).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        b1 = b1.a();
          goto _L5
        d = a((new StringBuilder()).append(b1).append(s).toString());
          goto _L4
        if (!b1.equals(d))
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
        b("Resetting the client id because Advertising Id changed.");
        b1 = x().c();
        a("New client Id", b1);
_L6:
        flag = g((new StringBuilder()).append(b2).append(b1).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        b1 = s;
          goto _L6
    }

    private com.google.android.gms.a.a.b f()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.a(1000L))
        {
            c.a();
            com.google.android.gms.a.a.b b1 = d();
            if (!a(b, b1))
            {
                break MISSING_BLOCK_LABEL_53;
            }
            b = b1;
        }
_L1:
        com.google.android.gms.a.a.b b2 = b;
        this;
        JVM INSTR monitorexit ;
        return b2;
        f("Failed to reset client id on adid change. Not using adid");
        b = new com.google.android.gms.a.a.b("", false);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private boolean g(String s)
    {
        try
        {
            s = a(s);
            b("Storing hashed adid.");
            FileOutputStream fileoutputstream = o().openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
            d = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e("Error creating hash file", s);
            return false;
        }
        return true;
    }

    protected void a()
    {
    }

    public boolean b()
    {
        boolean flag1 = false;
        D();
        com.google.android.gms.a.a.b b1 = f();
        boolean flag = flag1;
        if (b1 != null)
        {
            flag = flag1;
            if (!b1.b())
            {
                flag = true;
            }
        }
        return flag;
    }

    public String c()
    {
        D();
        Object obj = f();
        if (obj != null)
        {
            obj = ((com.google.android.gms.a.a.b) (obj)).a();
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

    protected com.google.android.gms.a.a.b d()
    {
        com.google.android.gms.a.a.b b1 = null;
        com.google.android.gms.a.a.b b2 = com.google.android.gms.a.a.a.b(o());
        b1 = b2;
_L2:
        return b1;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
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

    protected String e()
    {
        Object obj = null;
        byte abyte0[];
        FileInputStream fileinputstream;
        int i;
        fileinputstream = o().openFileInput("gaClientIdData");
        abyte0 = new byte[128];
        i = fileinputstream.read(abyte0, 0, 128);
        if (fileinputstream.available() <= 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        o().deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        b("Hash file is empty.");
        fileinputstream.close();
        return null;
        Object obj1 = new String(abyte0, 0, i);
        fileinputstream.close();
        return ((String) (obj1));
        obj1;
_L2:
        d("Error reading Hash file, deleting it", obj1);
        o().deleteFile("gaClientIdData");
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
}
