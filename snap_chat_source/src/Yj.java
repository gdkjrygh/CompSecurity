// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Yj
{

    public static final Yj a = new Yj() {

        public final aio a(File file)
        {
            return aii.a(file);
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

        public final ain b(File file)
        {
            ain ain;
            try
            {
                ain = aii.b(file);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                file.getParentFile().mkdirs();
                return aii.b(file);
            }
            return ain;
        }

        public final ain c(File file)
        {
            ain ain;
            try
            {
                ain = aii.c(file);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                file.getParentFile().mkdirs();
                return aii.c(file);
            }
            return ain;
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

    public abstract aio a(File file);

    public abstract void a(File file, File file1);

    public abstract ain b(File file);

    public abstract ain c(File file);

    public abstract void d(File file);

    public abstract boolean e(File file);

    public abstract long f(File file);

    public abstract void g(File file);

}
