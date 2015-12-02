// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.breakpad;

import android.util.Base64;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.e.h;
import com.facebook.debug.log.f;
import com.google.common.a.hq;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.facebook.breakpad:
//            a

public class BreakpadManager
{

    private Boolean a;
    private File b;
    private av c;
    private h d;
    private Boolean e;

    public BreakpadManager(File file, av av1, h h1)
    {
        a = Boolean.valueOf(false);
        b = file;
        c = av1;
        d = h1;
        e = Boolean.valueOf(false);
    }

    private List b()
    {
        java.util.ArrayList arraylist;
        String as[];
        arraylist = hq.a();
        a a1 = new a(this);
        as = b.list(a1);
        if (as == null) goto _L2; else goto _L1
_L1:
        int i;
        int l;
        l = as.length;
        i = 0;
_L12:
        if (i >= l) goto _L2; else goto _L3
_L3:
        byte abyte0[];
        File file;
        int i1;
        String s = as[i];
        file = new File(b, s);
        i1 = (int)file.length();
        f.c((new StringBuilder()).append("found dump file: ").append(s).append(", ").append(i1).append(" bytes").toString());
        abyte0 = new byte[i1];
        Object obj1 = new FileInputStream(file);
        int j = 0;
_L6:
        int k = ((FileInputStream) (obj1)).read(abyte0, j, i1 - j);
        if (k != -1) goto _L5; else goto _L4
_L4:
        ByteArrayOutputStream bytearrayoutputstream;
        ((FileInputStream) (obj1)).close();
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj1 = new GZIPOutputStream(bytearrayoutputstream);
        ((GZIPOutputStream) (obj1)).write(abyte0, 0, abyte0.length);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        ((GZIPOutputStream) (obj1)).close();
        arraylist.add(Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0));
_L7:
        if (!file.delete())
        {
            d.a("BreakpadManager", "Could not delete dump file");
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        k = j + k;
        j = k;
        if (i1 - k > 0) goto _L6; else goto _L4
        Object obj;
        obj;
        try
        {
            d.a("BreakpadManager", (new StringBuilder()).append("gzip failed: ").append(obj).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.a("BreakpadManager", (new StringBuilder()).append("FileNotFoundException: ").append(obj).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.a("BreakpadManager", (new StringBuilder()).append("Could not read native crash report: ").append(obj).toString());
        }
          goto _L7
        obj;
        obj1 = null;
_L10:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        ((GZIPOutputStream) (obj1)).close();
        arraylist.add(Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0));
_L8:
        throw obj;
        IOException ioexception;
        ioexception;
        d.a("BreakpadManager", (new StringBuilder()).append("gzip failed: ").append(ioexception).toString());
        if (true) goto _L8; else goto _L2
_L2:
        return arraylist;
        obj;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    private native void install(String s);

    public static void nativeCrashed(String s)
    {
        f.a((new StringBuilder()).append("Native crash reported: ").append(s).toString());
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a.booleanValue()) goto _L2; else goto _L1
_L1:
        Object obj = b;
        if (obj != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        System.loadLibrary("fb_stl_shared");
        System.loadLibrary("fb_breakpad_client");
        install(b.getAbsolutePath());
_L5:
        obj = b();
        cb cb1;
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); c.a(cb1))
        {
            String s = (String)iterator.next();
            cb1 = new cb("NATIVE_CRASH");
            cb1.e("app");
            cb1.b("MINIDUMP", s);
        }

        break MISSING_BLOCK_LABEL_142;
        obj;
        throw obj;
        obj;
        d.a("fb_breakpad_client", ((UnsatisfiedLinkError) (obj)).getMessage());
        if (true) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (((List) (obj)).size() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = Boolean.valueOf(flag);
        a = Boolean.valueOf(true);
          goto _L2
    }
}
