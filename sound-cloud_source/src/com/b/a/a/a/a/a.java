// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a;

import android.graphics.Bitmap;
import com.b.a.a.a.b;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class a
    implements b
{

    public static final android.graphics.Bitmap.CompressFormat a;
    protected final File b;
    protected final File c;
    protected final com.b.a.a.a.b.a d;
    protected int e;
    protected android.graphics.Bitmap.CompressFormat f;
    protected int g;

    public a(File file, File file1, com.b.a.a.a.b.a a1)
    {
        e = 32768;
        f = a;
        g = 100;
        if (file == null)
        {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        } else
        {
            b = file;
            c = file1;
            d = a1;
            return;
        }
    }

    private File b(String s)
    {
        String s1;
label0:
        {
            s1 = d.a(s);
            File file = b;
            s = file;
            if (b.exists())
            {
                break label0;
            }
            s = file;
            if (b.mkdirs())
            {
                break label0;
            }
            s = file;
            if (c == null)
            {
                break label0;
            }
            if (!c.exists())
            {
                s = file;
                if (!c.mkdirs())
                {
                    break label0;
                }
            }
            s = c;
        }
        return new File(s, s1);
    }

    public final File a(String s)
    {
        return b(s);
    }

    public final void a()
    {
        File afile[] = b.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

        }
    }

    public final boolean a(String s, Bitmap bitmap)
        throws IOException
    {
        BufferedOutputStream bufferedoutputstream;
        File file;
        file = b(s);
        s = new File((new StringBuilder()).append(file.getAbsolutePath()).append(".tmp").toString());
        bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(s), e);
        boolean flag = bitmap.compress(f, g, bufferedoutputstream);
        com.b.a.c.b.a(bufferedoutputstream);
        boolean flag1 = flag;
        if (flag)
        {
            flag1 = flag;
            if (!s.renameTo(file))
            {
                flag1 = false;
            }
        }
        if (!flag1)
        {
            s.delete();
        }
        bitmap.recycle();
        return flag1;
        bitmap;
        com.b.a.c.b.a(bufferedoutputstream);
        s.delete();
        throw bitmap;
    }

    public final boolean a(String s, InputStream inputstream, com.b.a.c.b.a a1)
        throws IOException
    {
        File file;
        File file1;
        file = b(s);
        file1 = new File((new StringBuilder()).append(file.getAbsolutePath()).append(".tmp").toString());
        s = new BufferedOutputStream(new FileOutputStream(file1), e);
        boolean flag = com.b.a.c.b.a(inputstream, s, a1, e);
        com.b.a.c.b.a(s);
        com.b.a.c.b.a(inputstream);
        boolean flag1 = flag;
        if (flag)
        {
            flag1 = flag;
            if (!file1.renameTo(file))
            {
                flag1 = false;
            }
        }
        if (!flag1)
        {
            file1.delete();
        }
        return flag1;
        a1;
        com.b.a.c.b.a(s);
        throw a1;
        s;
        flag = false;
_L2:
        com.b.a.c.b.a(inputstream);
        boolean flag2 = flag;
        if (flag)
        {
            flag2 = flag;
            if (!file1.renameTo(file))
            {
                flag2 = false;
            }
        }
        if (!flag2)
        {
            file1.delete();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        a = android.graphics.Bitmap.CompressFormat.PNG;
    }
}
