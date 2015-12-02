// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.os.Process;
import com.facebook.tools.dextr.bridge.constants.DextrConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.facebook.loom.logger:
//            LogWriter, LogEntry, Closeables

public class FileLogWriter extends LogWriter
{

    private static final Charset a = Charset.forName("US-ASCII");
    private static final int b = 1000;
    private final String c;
    private final String d;
    private final String e;
    private final StringBuilder f = new StringBuilder(64);
    private byte g[];
    private final LogEntry h;
    private boolean i;
    private OutputStream j;
    private long k;

    public FileLogWriter(String s, String s1, String s2)
    {
        g = new byte[64];
        i = true;
        c = s;
        d = s1;
        e = s2;
        h = new LogEntry(0, LogEntry.EntryType.UNKNOWN_TYPE, 0L, 0, 0, 0);
    }

    private static long a(long l)
    {
        return ((long)(b / 2) + l) / (long)b;
    }

    private String a()
    {
        f.setLength(0);
        f.append("dt\nver").append('|').append(3).append('\n').append("id|").append(c.toString()).append('\n').append("cmap|").append(DextrConstants.c).append('\n').append("prec|").append(6).append('\n').append("pid|").append(Process.myPid()).append('\n');
        if (e != null)
        {
            f.append("tag|").append(e).append('\n');
        }
        f.append('\n');
        return f.toString();
    }

    private int b()
    {
        StringBuilder stringbuilder = f;
        int i1 = stringbuilder.length();
        if (i1 > g.length)
        {
            g = new byte[i1];
        }
        byte abyte0[] = g;
        int l = 0;
        while (l < i1) 
        {
            char c1 = stringbuilder.charAt(l);
            if (c1 < '\200')
            {
                abyte0[l] = (byte)c1;
            } else
            {
                abyte0[l] = 46;
            }
            l++;
        }
        return i1;
    }

    private void b(LogEntry logentry)
    {
        if (!i) goto _L2; else goto _L1
_L1:
        k = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - logentry.c();
        logentry = (new File(d)).getParentFile();
        if (logentry == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!logentry.exists())
        {
            logentry.mkdirs();
        }
        logentry = new FileOutputStream(d);
        j = new GZIPOutputStream(logentry, 8192);
        j.write(a().getBytes(a));
_L4:
        i = false;
_L2:
        return;
        logentry;
        logentry = null;
_L5:
        Closeables.a(logentry);
        Closeables.a(j);
        j = null;
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
          goto _L5
    }

    public final long a(LogEntry logentry)
    {
        if (i)
        {
            b(logentry);
        }
        if (j == null)
        {
            return -1L;
        }
        long l1 = a(k + logentry.c());
        long l2 = h.c();
        f.setLength(0);
        f.append(logentry.a() - h.a()).append('|').append(logentry.b()).append('|').append(l1 - l2).append('|').append(logentry.d() - h.d()).append('|').append(logentry.e() - h.e()).append('|').append(logentry.f() - h.f()).append('|').append(logentry.g() - h.g());
        f.append('\n');
        int l = b();
        try
        {
            j.write(g, 0, l);
        }
        catch (IOException ioexception)
        {
            Closeables.a(j);
            j = null;
        }
        h.a(logentry.a(), logentry.b(), l1, logentry.d(), logentry.e(), logentry.f(), logentry.g());
        return (long)logentry.a();
    }

    public void close()
    {
        Closeables.a(j);
        j = null;
    }

}
