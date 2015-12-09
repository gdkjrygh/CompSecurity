// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

final class amz
    implements amh
{

    private final File a;
    private gzg b;

    public amz(File file)
    {
        a = file;
    }

    private void d()
    {
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        b = new gzg(a);
        return;
        IOException ioexception;
        ioexception;
        gya.a().c("CrashlyticsCore", (new StringBuilder("Could not open log file: ")).append(a).toString(), ioexception);
        return;
    }

    public final alr a()
    {
        if (a.exists())
        {
            d();
            if (b != null)
            {
                int ai[] = new int[1];
                ai[0] = 0;
                byte abyte0[] = new byte[b.a()];
                try
                {
                    b.a(new gzj(abyte0, ai) {

                        private byte a[];
                        private int b[];

                        public final void a(InputStream inputstream, int i)
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
                a = abyte0;
                b = ai;
                super();
            }
                    });
                }
                catch (IOException ioexception)
                {
                    gya.a().c("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ioexception);
                }
                return alr.a(abyte0, ai[0]);
            }
        }
        return null;
    }

    public final void a(long l, String s)
    {
        d();
        if (b != null)
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
                b.a(s, s.length);
                for (; !b.b() && b.a() > 0x10000; b.c()) { }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                gya.a().c("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", s);
            }
        }
    }

    public final void b()
    {
        CommonUtils.a(b, "There was a problem closing the Crashlytics log file.");
        b = null;
    }

    public final void c()
    {
        b();
        a.delete();
    }
}
