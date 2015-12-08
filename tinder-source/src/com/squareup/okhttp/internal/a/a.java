// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.l;
import okio.q;
import okio.r;

public interface a
{

    public static final a a = new a() {

        public final r a(File file)
            throws FileNotFoundException
        {
            return l.a(file);
        }

        public final void a(File file, File file1)
            throws IOException
        {
            d(file1);
            if (!file.renameTo(file1))
            {
                throw new IOException((new StringBuilder("failed to rename ")).append(file).append(" to ").append(file1).toString());
            } else
            {
                return;
            }
        }

        public final q b(File file)
            throws FileNotFoundException
        {
            q q;
            try
            {
                q = l.b(file);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                file.getParentFile().mkdirs();
                return l.b(file);
            }
            return q;
        }

        public final q c(File file)
            throws FileNotFoundException
        {
            q q;
            try
            {
                q = l.c(file);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                file.getParentFile().mkdirs();
                return l.c(file);
            }
            return q;
        }

        public final void d(File file)
            throws IOException
        {
            if (!file.delete() && file.exists())
            {
                throw new IOException((new StringBuilder("failed to delete ")).append(file).toString());
            } else
            {
                return;
            }
        }

        public final boolean e(File file)
            throws IOException
        {
            return file.exists();
        }

        public final long f(File file)
        {
            return file.length();
        }

        public final void g(File file)
            throws IOException
        {
            File afile[] = file.listFiles();
            if (afile == null)
            {
                throw new IOException((new StringBuilder("not a readable directory: ")).append(file).toString());
            }
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                file = afile[i];
                if (file.isDirectory())
                {
                    g(file);
                }
                if (!file.delete())
                {
                    throw new IOException((new StringBuilder("failed to delete ")).append(file).toString());
                }
            }

        }

    };

    public abstract r a(File file)
        throws FileNotFoundException;

    public abstract void a(File file, File file1)
        throws IOException;

    public abstract q b(File file)
        throws FileNotFoundException;

    public abstract q c(File file)
        throws FileNotFoundException;

    public abstract void d(File file)
        throws IOException;

    public abstract boolean e(File file)
        throws IOException;

    public abstract long f(File file);

    public abstract void g(File file)
        throws IOException;

}
