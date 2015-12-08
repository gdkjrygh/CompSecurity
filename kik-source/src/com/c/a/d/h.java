// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import com.c.a.a.u;
import com.c.a.b.an;
import com.c.a.b.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.c.a.d:
//            i, g, b, a

public final class h
{
    private static final class a extends com.c.a.d.a
    {

        private final File a;
        private final v b;

        public final OutputStream a()
        {
            return new FileOutputStream(a, b.contains(g.a));
        }

        public final String toString()
        {
            String s = String.valueOf(String.valueOf(a));
            String s1 = String.valueOf(String.valueOf(b));
            return (new StringBuilder(s.length() + 20 + s1.length())).append("Files.asByteSink(").append(s).append(", ").append(s1).append(")").toString();
        }

        private transient a(File file, g ag[])
        {
            a = (File)u.a(file);
            b = v.a(ag);
        }

        a(File file, g ag[], byte byte0)
        {
            this(file, ag);
        }
    }

    private static final class b extends com.c.a.d.b
    {

        private final File a;

        public final InputStream a()
        {
            return new FileInputStream(a);
        }

        public final String toString()
        {
            String s = String.valueOf(String.valueOf(a));
            return (new StringBuilder(s.length() + 20)).append("Files.asByteSource(").append(s).append(")").toString();
        }

        private b(File file)
        {
            a = (File)u.a(file);
        }

        b(File file, byte byte0)
        {
            this(file);
        }
    }


    private static final an a = new i();

    public static void a(File file, File file1)
    {
        u.a(file);
        u.a(file1);
        boolean flag;
        if (!file.equals(file1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "Source %s and destination %s must be different", new Object[] {
            file, file1
        });
        if (!file.renameTo(file1))
        {
            if (!file.equals(file1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.a(flag, "Source %s and destination %s must be different", new Object[] {
                file, file1
            });
            (new b(file, (byte)0)).a(new a(file1, new g[0], (byte)0));
            if (!file.delete())
            {
                if (!file1.delete())
                {
                    file = String.valueOf(String.valueOf(file1));
                    throw new IOException((new StringBuilder(file.length() + 17)).append("Unable to delete ").append(file).toString());
                } else
                {
                    file = String.valueOf(String.valueOf(file));
                    throw new IOException((new StringBuilder(file.length() + 17)).append("Unable to delete ").append(file).toString());
                }
            }
        }
    }

}
