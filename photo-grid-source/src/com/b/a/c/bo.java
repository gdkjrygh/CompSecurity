// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.ab;
import a.a.a.a.a.b.l;
import a.a.a.a.f;
import a.a.a.a.s;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.b.a.c:
//            av, bp, b

final class bo
    implements av
{

    private final File a;
    private final int b = 0x10000;
    private ab c;

    public bo(File file)
    {
        a = file;
    }

    public final b a()
    {
        if (a.exists())
        {
            if (c == null)
            {
                try
                {
                    c = new ab(a);
                }
                catch (IOException ioexception)
                {
                    f.d().b("CrashlyticsCore", (new StringBuilder("Could not open log file: ")).append(a).toString(), ioexception);
                }
            }
            if (c != null)
            {
                int ai[] = new int[1];
                ai[0] = 0;
                byte abyte0[] = new byte[c.a()];
                try
                {
                    c.a(new bp(this, abyte0, ai));
                }
                catch (IOException ioexception1)
                {
                    f.d().b("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ioexception1);
                }
                return com.b.a.c.b.a(abyte0, ai[0]);
            }
        }
        return null;
    }

    public final void b()
    {
        l.a(c, "There was a problem closing the Crashlytics log file.");
        c = null;
    }

    public final void c()
    {
        b();
        a.delete();
    }
}
