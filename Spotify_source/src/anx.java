// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

final class anx
    implements anp
{

    private static final File a[] = new File[0];
    private final File b;
    private final gzc c;

    public anx(File file)
    {
        this(file, ((gzc) (new gzl())));
    }

    private anx(File file, gzc gzc1)
    {
        b = file;
        c = gzc1;
    }

    private File[] d()
    {
        File afile1[] = b.listFiles();
        File afile[] = afile1;
        if (afile1 == null)
        {
            afile = a;
        }
        return afile;
    }

    public final File a()
    {
        String s = (new StringBuilder()).append(c.a()).append(".ndk.json").toString();
        return new File(b, s);
    }

    public final File b()
    {
        File file = null;
        File afile[] = d();
        long l = 0L;
        for (int i = 0; i < afile.length; i++)
        {
            File file1 = afile[i];
            String s = file1.getName();
            long l1 = Long.parseLong(s.substring(0, s.length() - 9));
            if (l1 > l)
            {
                file = file1;
                l = l1;
            }
        }

        return file;
    }

    public final void c()
    {
        File afile[] = d();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

}
