// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            fe, eo, do, fd, 
//            dx

public final class ea
{

    private static final String a = com/flurry/sdk/ea.getSimpleName();
    private static final Set b = i();
    private static String c;

    public ea()
    {
    }

    public static String a()
    {
        com/flurry/sdk/ea;
        JVM INSTR monitorenter ;
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            throw new IllegalStateException("Must be called from a background thread!");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        com/flurry/sdk/ea;
        JVM INSTR monitorexit ;
        throw exception;
        String s;
        if (TextUtils.isEmpty(c))
        {
            c = g();
        }
        s = c;
        com/flurry/sdk/ea;
        JVM INSTR monitorexit ;
        return s;
    }

    private static String a(DataInput datainput)
        throws IOException
    {
        if (1 != datainput.readInt())
        {
            return null;
        } else
        {
            return datainput.readUTF();
        }
    }

    private static void a(String s, DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeInt(1);
        dataoutput.writeUTF(s);
    }

    static void a(String s, File file)
    {
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
        file = dataoutputstream;
        a(s, ((DataOutput) (dataoutputstream)));
        fe.a(dataoutputstream);
        return;
        Throwable throwable;
        throwable;
        s = null;
_L4:
        file = s;
        eo.a(6, a, "Error when saving phoneId", throwable);
        fe.a(s);
        return;
        s;
        file = null;
_L2:
        fe.a(file);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        s = dataoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(String s)
    {
        while (TextUtils.isEmpty(s) || c(s.toLowerCase(Locale.US))) 
        {
            return false;
        }
        return true;
    }

    static String b()
    {
        String s = android.provider.Settings.Secure.getString(com.flurry.sdk.do.a().b().getContentResolver(), "android_id");
        if (!a(s))
        {
            return null;
        } else
        {
            return (new StringBuilder("AND")).append(s).toString();
        }
    }

    private static String b(DataInput datainput)
        throws IOException
    {
        while (46586 != datainput.readUnsignedShort() || 2 != datainput.readUnsignedShort()) 
        {
            return null;
        }
        datainput.readUTF();
        return datainput.readUTF();
    }

    static void b(String s)
    {
        File file;
        if (!TextUtils.isEmpty(s))
        {
            if (fd.a(file = com.flurry.sdk.do.a().b().getFileStreamPath(h())))
            {
                a(s, file);
                return;
            }
        }
    }

    static String c()
    {
        String s1 = e();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            String s2 = f();
            s = s2;
            if (TextUtils.isEmpty(s2))
            {
                s = d();
            }
            b(s);
        }
        return s;
    }

    private static boolean c(String s)
    {
        return b.contains(s);
    }

    static String d()
    {
        long l = Double.doubleToLongBits(Math.random());
        long l1 = System.nanoTime();
        long l2 = dx.c(com.flurry.sdk.do.a().b()).hashCode() * 37;
        return (new StringBuilder("ID")).append(Long.toString(l + 37L * (l1 + l2), 16)).toString();
    }

    static String e()
    {
        Object obj;
        obj = com.flurry.sdk.do.a().b().getFileStreamPath(h());
        if (obj == null || !((File) (obj)).exists())
        {
            return null;
        }
        Object obj1 = new DataInputStream(new FileInputStream(((File) (obj))));
        obj = obj1;
        Object obj2 = a(((DataInput) (obj1)));
        fe.a(((java.io.Closeable) (obj1)));
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L4:
        obj = obj1;
        eo.a(6, a, "Error when loading phoneId", ((Throwable) (obj3)));
        fe.a(((java.io.Closeable) (obj1)));
        return null;
        obj;
        obj3 = null;
        obj1 = obj;
_L2:
        fe.a(((java.io.Closeable) (obj3)));
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String f()
    {
        Object obj = com.flurry.sdk.do.a().b().getFilesDir();
        if (obj != null) goto _L2; else goto _L1
_L1:
        static final class _cls1
            implements FilenameFilter
        {

            public final boolean accept(File file, String s)
            {
                return s.startsWith(".flurryagent.");
            }

        }

        String as[];
        return null;
_L2:
        if ((as = ((File) (obj)).list(new _cls1())) == null || as.length == 0) goto _L1; else goto _L3
_L3:
        as = as[0];
        as = com.flurry.sdk.do.a().b().getFileStreamPath(as);
        if (as == null || !as.exists()) goto _L1; else goto _L4
_L4:
        Object obj1 = new DataInputStream(new FileInputStream(as));
        as = ((String []) (obj1));
        Object obj2 = b(((DataInput) (obj1)));
        fe.a(((java.io.Closeable) (obj1)));
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L8:
        as = ((String []) (obj1));
        eo.a(6, a, "Error when loading phoneId", ((Throwable) (obj3)));
        fe.a(((java.io.Closeable) (obj1)));
        return null;
        as;
        obj3 = null;
        obj1 = as;
_L6:
        fe.a(((java.io.Closeable) (obj3)));
        throw obj1;
        obj1;
        obj3 = as;
        if (true) goto _L6; else goto _L5
_L5:
        obj3;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String g()
    {
        String s = b();
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return c();
        }
    }

    private static String h()
    {
        return ".flurryb.";
    }

    private static Set i()
    {
        HashSet hashset = new HashSet();
        hashset.add("null");
        hashset.add("9774d56d682e549c");
        hashset.add("dead00beef");
        return Collections.unmodifiableSet(hashset);
    }

}
