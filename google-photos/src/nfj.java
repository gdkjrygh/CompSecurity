// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.format.DateFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public final class nfj
    implements nff
{

    private static final String a = nfj.getSimpleName();
    private final Object b;
    private final File c;
    private final int d;
    private final int e;
    private final Executor f;
    private final nfm g;
    private PrintWriter h;
    private int i;

    public nfj(File file, int j, int k, Executor executor)
    {
        this(file, 100, 10, executor, new nfm());
    }

    private nfj(File file, int j, int k, Executor executor, nfm nfm1)
    {
        b = new Object();
        c = file;
        d = j;
        e = k - 1;
        f = executor;
        g = nfm1;
    }

    private static int a(File file)
    {
        int j = 0;
        BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
_L2:
        file = bufferedreader.readLine();
        if (file != null)
        {
            j++;
        } else
        {
            p.a(bufferedreader);
            return j;
        }
        if (true) goto _L2; else goto _L1
_L1:
        file;
        bufferedreader = null;
_L4:
        p.a(bufferedreader);
        throw file;
        file;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private File a(int j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(c.getAbsolutePath());
        stringbuilder.append('.');
        stringbuilder.append(j + 1);
        return new File(stringbuilder.toString());
    }

    static String a()
    {
        return a;
    }

    static String a(nfj nfj1, String s)
    {
        return String.format("%s: %s", new Object[] {
            DateFormat.format("yyyy-MM-dd kk:mm:ss", nfj1.g.a()), s
        });
    }

    static void a(nfj nfj1)
    {
        synchronized (nfj1.b)
        {
            if (nfj1.h == null)
            {
                nfj1.i = 0;
                if (nfj1.c.exists())
                {
                    nfj1.i = a(nfj1.c);
                    if (nfj1.i >= nfj1.d)
                    {
                        nfj1.b();
                        nfj1.i = 0;
                    }
                }
                nfj1.h = nfj1.c();
            }
            if (nfj1.i >= nfj1.d)
            {
                p.a(nfj1.h);
                nfj1.b();
                nfj1.i = 0;
                nfj1.h = nfj1.c();
            }
        }
        return;
        nfj1;
        obj;
        JVM INSTR monitorexit ;
        throw nfj1;
    }

    static PrintWriter b(nfj nfj1)
    {
        return nfj1.h;
    }

    private void b()
    {
        int j = 0;
_L7:
        if (j >= e) goto _L2; else goto _L1
_L1:
        if (a(j).exists()) goto _L4; else goto _L3
_L3:
        int k;
        k = j;
        if (j != e)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        for (k = 1; k < e; k++)
        {
            File file = a(k - 1);
            file.delete();
            a(k).renameTo(file);
        }

        break; /* Loop/switch isn't completed */
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        j = e;
        if (true) goto _L3; else goto _L5
_L5:
        k = j - 1;
        File file1 = a(k);
        file1.delete();
        c.renameTo(file1);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static int c(nfj nfj1)
    {
        int j = nfj1.i + 1;
        nfj1.i = j;
        return j;
    }

    private PrintWriter c()
    {
        if (!c.exists())
        {
            c.getParentFile().mkdirs();
            c.createNewFile();
        }
        return new PrintWriter(new FileOutputStream(c, true));
    }

    public final void a(String s)
    {
        f.execute(new nfk(this, s));
    }

    public final void close()
    {
        f.execute(new nfl(this));
    }

}
