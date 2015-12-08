// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

// Referenced classes of package com.crashlytics.android.core:
//            FileLogStore, ByteString

class QueueFileLogStore
    implements FileLogStore
{

    private final File a;
    private final int b = 0x10000;
    private n c;

    public QueueFileLogStore(File file)
    {
        a = file;
    }

    private void d()
    {
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        c = new n(a);
        return;
        IOException ioexception;
        ioexception;
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", (new StringBuilder("Could not open log file: ")).append(a).toString(), ioexception);
        return;
    }

    public final ByteString a()
    {
        if (a.exists())
        {
            d();
            if (c != null)
            {
                int ai[] = new int[1];
                ai[0] = 0;
                byte abyte0[] = new byte[c.a()];
                try
                {
                    c.a(new io.fabric.sdk.android.services.common.n.c(abyte0, ai) {

                        final byte a[];
                        final int b[];
                        final QueueFileLogStore c;

                        public final void a(InputStream inputstream, int i)
                            throws IOException
                        {
                            int ai1[];
                            inputstream.read(a, b[0], i);
                            ai1 = b;
                            ai1[0] = ai1[0] + i;
                            inputstream.close();
                            return;
                            Exception exception;
                            exception;
                            inputstream.close();
                            throw exception;
                        }

            
            {
                c = QueueFileLogStore.this;
                a = abyte0;
                b = ai;
                super();
            }
                    });
                }
                catch (IOException ioexception)
                {
                    io.fabric.sdk.android.c.a().c("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ioexception);
                }
                return ByteString.a(abyte0, ai[0]);
            }
        }
        return null;
    }

    public final void a(long l, String s)
    {
        d();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        if (s == null)
        {
            s = "null";
        }
        int i = b / 4;
        String s1 = s;
        try
        {
            if (s.length() > i)
            {
                s1 = (new StringBuilder("...")).append(s.substring(s.length() - i)).toString();
            }
            s = s1.replaceAll("\r", " ").replaceAll("\n", " ");
            s = String.format(Locale.US, "%d %s%n", new Object[] {
                Long.valueOf(l), s
            }).getBytes("UTF-8");
            c.a(s, s.length);
            for (; !c.b() && c.a() > b; c.c()) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            io.fabric.sdk.android.c.a().c("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", s);
        }
    }

    public final void b()
    {
        CommonUtils.a(c, "There was a problem closing the Crashlytics log file.");
        c = null;
    }

    public final void c()
    {
        b();
        a.delete();
    }
}
