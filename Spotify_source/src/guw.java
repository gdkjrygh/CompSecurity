// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface guw
{

    public static final guw a = new guw() {

        public final hcw a(File file)
        {
            return hcq.a(file);
        }

        public final void a(File file, File file1)
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

        public final hcv b(File file)
        {
            hcv hcv;
            try
            {
                hcv = hcq.b(file);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                file.getParentFile().mkdirs();
                return hcq.b(file);
            }
            return hcv;
        }

        public final hcv c(File file)
        {
            hcv hcv;
            try
            {
                hcv = hcq.c(file);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                file.getParentFile().mkdirs();
                return hcq.c(file);
            }
            return hcv;
        }

        public final void d(File file)
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
        {
            return file.exists();
        }

        public final long f(File file)
        {
            return file.length();
        }

        public final void g(File file)
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

    public abstract hcw a(File file);

    public abstract void a(File file, File file1);

    public abstract hcv b(File file);

    public abstract hcv c(File file);

    public abstract void d(File file);

    public abstract boolean e(File file);

    public abstract long f(File file);

    public abstract void g(File file);

}
