// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class myy
{

    private final Context a;
    private final String b;
    private final long c;
    private final long d;
    private final float e;
    private final float f;
    private final mza g;
    private File h;
    private String i;
    private long j;

    public myy(Context context, String s, long l, long l1, float f1, 
            float f2)
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            obj = new mzb();
        } else
        {
            obj = new myz();
        }
        this(context, s, l, l1, f1, f2, ((mza) (obj)));
    }

    private myy(Context context, String s, long l, long l1, float f1, 
            float f2, mza mza1)
    {
        a = context;
        b = s;
        c = l;
        d = l1;
        e = f1;
        f = f2;
        g = mza1;
    }

    private long a(File file)
    {
        long l = 0L;
        file = file.listFiles();
        long l1 = l;
        if (file != null)
        {
            int k = 0;
            do
            {
                l1 = l;
                if (k >= file.length)
                {
                    break;
                }
                File file1 = file[k];
                if (file1.isDirectory())
                {
                    l1 = a(file1);
                } else
                {
                    l1 = file1.length();
                }
                l += l1;
                k++;
            } while (true);
        }
        return l1;
    }

    static StatFs d()
    {
        return new StatFs(Environment.getDataDirectory().getPath());
    }

    private File e()
    {
        if (h == null)
        {
            h = new File(a.getCacheDir(), b);
        }
        return h;
    }

    private String f()
    {
        if (i == null)
        {
            i = e().getPath();
        }
        return i;
    }

    public final long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        if (j == 0L)
        {
            j = b();
        }
        l = j;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final File a(String s)
    {
        s = new File(b(s));
        if (s.exists())
        {
            return s;
        } else
        {
            return null;
        }
    }

    public final void a(String s, ByteBuffer bytebuffer)
    {
        String s1 = b(s);
        try
        {
            b.a(bytebuffer, s1);
            return;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            s = (new File(s1)).getParentFile();
            if (!s.exists())
            {
                try
                {
                    s.mkdirs();
                }
                // Misplaced declaration of an exception variable
                catch (ByteBuffer bytebuffer)
                {
                    s = String.valueOf(s);
                    Log.e("FileCache", (new StringBuilder(String.valueOf(s).length() + 31)).append("Cannot create cache directory: ").append(s).toString(), bytebuffer);
                    throw new RuntimeException("Cannot create cache directory", bytebuffer);
                }
            } else
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "Cannot write file to cache: ".concat(s);
                } else
                {
                    s = new String("Cannot write file to cache: ");
                }
                Log.e("FileCache", s, filenotfoundexception);
            }
            try
            {
                b.a(bytebuffer, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = String.valueOf(s1);
            }
            if (s.length() != 0)
            {
                s = "Cannot write file to cache: ".concat(s);
            } else
            {
                s = new String("Cannot write file to cache: ");
            }
            Log.e("FileCache", s, filenotfoundexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            s = String.valueOf(s1);
        }
        if (s.length() != 0)
        {
            s = "Cannot write file to cache: ".concat(s);
        } else
        {
            s = new String("Cannot write file to cache: ");
        }
        Log.e("FileCache", s, bytebuffer);
    }

    public final long b()
    {
        long l1 = d;
        long l2 = g.a();
        long l = l1;
        if ((float)l1 > (float)l2 * e)
        {
            l = (long)((float)l2 * e);
        }
        l1 = l;
        if (l < c)
        {
            l1 = c;
        }
        l = g.b();
        if ((float)l1 < (float)l * f)
        {
            return l1;
        } else
        {
            return (long)((float)(c() + l) * f);
        }
    }

    public final String b(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(f().length() + s.length() + 3);
        stringbuilder.append(f());
        stringbuilder.append(File.separatorChar);
        stringbuilder.append(s.charAt(0));
        stringbuilder.append(File.separatorChar);
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public final long c()
    {
        if (e().exists())
        {
            return a(e());
        } else
        {
            return 0L;
        }
    }
}
