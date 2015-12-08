// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.Context;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.w;
import b.a.a.a.d;
import b.a.a.a.o;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.a.a.c:
//            as, b

final class ar
{

    private final Context a;
    private final File b;
    private w c;

    public ar(Context context, File file)
    {
        this(context, file, (byte)0);
    }

    private ar(Context context, File file, byte byte0)
    {
        a = context;
        b = file;
        c = null;
    }

    private boolean c()
    {
        if (!j.a(a, "com.crashlytics.CollectCustomLogs", true))
        {
            d.c();
            return false;
        }
        j.a(c, (new StringBuilder("Could not close log file: ")).append(c).toString());
        File file;
        String s = (new StringBuilder("crashlytics-userlog-")).append(UUID.randomUUID().toString()).append(".temp").toString();
        file = new File(b, s);
        c = new w(file);
        file.delete();
        return true;
        Exception exception;
        exception;
        file = null;
_L2:
        d.c().b("Fabric", (new StringBuilder("Could not create log file: ")).append(file).toString(), exception);
        return false;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    final b a()
    {
        if (c == null)
        {
            return null;
        }
        int ai[] = new int[1];
        ai[0] = 0;
        byte abyte0[] = new byte[c.a()];
        try
        {
            c.a(new as(this, abyte0, ai));
        }
        catch (IOException ioexception)
        {
            d.c().b("Fabric", "A problem occurred while reading the Crashlytics log file.", ioexception);
        }
        return com.a.a.c.b.a(abyte0, ai[0]);
    }

    public final void a(long l, String s)
    {
        if (c == null)
        {
            c();
        }
        if (c != null)
        {
            if (s == null)
            {
                s = "null";
            }
            String s1 = s;
            try
            {
                if (s.length() > 16384)
                {
                    s1 = (new StringBuilder("...")).append(s.substring(s.length() - 16384)).toString();
                }
                s = s1.replaceAll("\r", " ").replaceAll("\n", " ");
                s = String.format(Locale.US, "%d %s%n", new Object[] {
                    Long.valueOf(l), s
                }).getBytes("UTF-8");
                c.a(s);
                for (; !c.b() && c.a() > 0x10000; c.c()) { }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                d.c().b("Fabric", "There was a problem writing to the Crashlytics log.", s);
            }
        }
    }

    final void b()
    {
        j.a(c, "There was a problem closing the Crashlytics log file.");
        c = null;
    }
}
