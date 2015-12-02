// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import android.os.Environment;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook.common.c:
//            a, g, f, b

class d
{

    final a a;
    private File b;
    private Writer c;
    private long d;
    private long e;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, com.facebook.common.c.b b1)
    {
        this(a1);
    }

    private String a(int i)
    {
        switch (i)
        {
        default:
            return "o";

        case 2: // '\002'
            return "v";

        case 3: // '\003'
            return "d";

        case 4: // '\004'
            return "i";

        case 5: // '\005'
            return "w";

        case 6: // '\006'
            return "e";

        case 7: // '\007'
            return "a";
        }
    }

    private void a(int i, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        b();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(com.facebook.common.c.a.c().format(new Date()));
        stringbuilder.append(" ");
        stringbuilder.append(a(i));
        stringbuilder.append("/");
        stringbuilder.append(s);
        stringbuilder.append("(").append(Long.toString(Thread.currentThread().getId())).append("): ");
        s = stringbuilder.toString();
        s1 = s1.split("\n");
        j = s1.length;
        i = 0;
_L2:
        String s2;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s1[i];
        c.write(s);
        c.write(s2);
        c.write("\n");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        c.flush();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        b = null;
        c = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    static void a(d d1, int i, String s, String s1)
    {
        d1.a(i, s, s1);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer;
        d();
        writer = c;
        if (writer == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag = com.facebook.common.c.a.c(a);
        Exception exception;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            long l = System.currentTimeMillis();
            if (l - d >= 30000L)
            {
                d = System.currentTimeMillis();
                File file = c();
                if (!file.exists())
                {
                    file.mkdirs();
                    (new File(file, ".nomedia")).createNewFile();
                }
                b = g.a(file.getAbsoluteFile(), "debug.log", null, new Date());
                c = new BufferedWriter(new FileWriter(b), 2048);
                e = l;
                com.facebook.debug.log.b.c(com.facebook.common.c.a.d(), "Opened log.");
            }
            continue; /* Loop/switch isn't completed */
        }
        catch (IOException ioexception) { }
        finally
        {
            this;
        }
        b = null;
        c = null;
        if (true) goto _L1; else goto _L3
_L3:
        throw exception;
    }

    private File c()
    {
        return new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append("/Android/data/").append(com.facebook.common.c.a.d(a)).append("/files/log/").toString());
    }

    private void d()
    {
        while (c == null || System.currentTimeMillis() - e <= 0x124f80L) 
        {
            return;
        }
        e();
    }

    private void e()
    {
        Exception exception;
        try
        {
            c.close();
        }
        catch (Throwable throwable)
        {
            b = null;
            c = null;
            return;
        }
        finally
        {
            b = null;
        }
        b = null;
        c = null;
        return;
        c = null;
        throw exception;
    }

    public List a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        d();
        obj = c();
        if (((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = Collections.emptyList();
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L2:
        File afile[];
        int j;
        long l;
        l = System.currentTimeMillis();
        afile = ((File) (obj)).listFiles();
        obj = hq.c(afile.length);
        j = afile.length;
        File file;
        f f1;
        Date date;
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_134;
        }

        file = afile[i];
        if (!file.getName().contains("debug.log"))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        f1 = g.a(file);
        date = f1.b();
        if (date == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (l - date.getTime() <= 0x2932e00L)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        file.delete();
        break MISSING_BLOCK_LABEL_141;
        obj;
        throw obj;
        ((List) (obj)).add(f1);
        break MISSING_BLOCK_LABEL_141;
        g.a(((List) (obj)));
          goto _L3
    }
}
