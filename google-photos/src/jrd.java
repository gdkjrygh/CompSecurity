// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class jrd extends jsw
{

    private static boolean a;
    private jnx b;
    private final jsu c;
    private String e;
    private boolean f;
    private Object g;

    jrd(jrk jrk1)
    {
        super(jrk1);
        f = false;
        g = new Object();
        c = new jsu(jrk1.c);
    }

    private static String a(String s)
    {
        MessageDigest messagedigest = jtk.b("MD5");
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

    private boolean a(jnx jnx1, jnx jnx2)
    {
        Object obj;
        String s;
        obj = null;
        if (jnx2 == null)
        {
            jnx2 = null;
        } else
        {
            jnx2 = jnx2.a;
        }
        if (TextUtils.isEmpty(jnx2))
        {
            return true;
        }
        s = super.d.g().b();
        Object obj1 = g;
        obj1;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        e = m();
        f = true;
_L4:
        jnx1 = a((new StringBuilder()).append(jnx2).append(s).toString());
        if (!TextUtils.isEmpty(jnx1))
        {
            break MISSING_BLOCK_LABEL_195;
        }
        return false;
        jnx1;
        obj1;
        JVM INSTR monitorexit ;
        throw jnx1;
_L2:
        if (!TextUtils.isEmpty(e)) goto _L4; else goto _L3
_L3:
        if (jnx1 != null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        jnx1 = obj;
_L5:
        if (jnx1 != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        boolean flag = g((new StringBuilder()).append(jnx2).append(s).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        jnx1 = jnx1.a;
          goto _L5
        e = a((new StringBuilder()).append(jnx1).append(s).toString());
          goto _L4
        if (!jnx1.equals(e))
        {
            break MISSING_BLOCK_LABEL_211;
        }
        obj1;
        JVM INSTR monitorexit ;
        return true;
        if (TextUtils.isEmpty(e))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        b("Resetting the client id because Advertising Id changed.");
        jnx1 = super.d.g().c();
        a("New client Id", jnx1);
_L6:
        flag = g((new StringBuilder()).append(jnx2).append(jnx1).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        jnx1 = s;
          goto _L6
    }

    private jnx d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.a(1000L))
        {
            c.a();
            jnx jnx1 = e();
            if (!a(b, jnx1))
            {
                break MISSING_BLOCK_LABEL_53;
            }
            b = jnx1;
        }
_L1:
        jnx jnx2 = b;
        this;
        JVM INSTR monitorexit ;
        return jnx2;
        f("Failed to reset client id on adid change. Not using adid");
        b = new jnx("", false);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private jnx e()
    {
        jnx jnx1 = null;
        jnx jnx2 = jnw.a(super.d.a);
        jnx1 = jnx2;
_L2:
        return jnx1;
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

    private boolean g(String s)
    {
        try
        {
            s = a(s);
            b("Storing hashed adid.");
            FileOutputStream fileoutputstream = super.d.a.openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
            e = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e("Error creating hash file", s);
            return false;
        }
        return true;
    }

    private String m()
    {
        Object obj = null;
        byte abyte0[];
        FileInputStream fileinputstream;
        int i;
        fileinputstream = super.d.a.openFileInput("gaClientIdData");
        abyte0 = new byte[128];
        i = fileinputstream.read(abyte0, 0, 128);
        if (fileinputstream.available() <= 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        e("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        super.d.a.deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_81;
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
        super.d.a.deleteFile("gaClientIdData");
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
        r();
        jnx jnx1 = d();
        boolean flag = flag1;
        if (jnx1 != null)
        {
            flag = flag1;
            if (!jnx1.b)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final String c()
    {
        r();
        Object obj = d();
        if (obj != null)
        {
            obj = ((jnx) (obj)).a;
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
