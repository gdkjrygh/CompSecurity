// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a.a;

import android.graphics.Bitmap;
import com.b.a.a.a.b;
import com.b.a.a.a.b.a;
import com.b.a.c.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.b.a.a.a.a.a:
//            a

public final class d
    implements b
{

    public static final android.graphics.Bitmap.CompressFormat a;
    protected com.b.a.a.a.a.a.a b;
    public File c;
    protected final a d;
    protected int e;
    protected android.graphics.Bitmap.CompressFormat f;
    protected int g;

    public d(File file, a a1, long l, int i)
    {
        e = 32768;
        f = a;
        g = 100;
        if (file == null)
        {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
        if (l == 0L)
        {
            l = 0x7fffffffffffffffL;
        }
        if (i == 0)
        {
            i = 0x7fffffff;
        }
        d = a1;
        a(file, c, l, i);
    }

    private void a(File file, File file1, long l, int i)
    {
_L4:
        b = com.b.a.a.a.a.a.a.a(file, l, i);
_L2:
        return;
        file;
        com.b.a.c.c.a(file);
        if (file1 == null) goto _L2; else goto _L1
_L1:
        file = file1;
        file1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String b(String s)
    {
        return d.a(s);
    }

    public final File a(String s)
    {
        Object obj;
        Object obj2;
        obj2 = null;
        obj = null;
        s = b.a(b(s));
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = obj;
        if (s != null)
        {
            s.close();
            obj1 = obj;
        }
_L4:
        return ((File) (obj1));
_L2:
        obj = s;
        obj1 = ((a.c) (s)).a[0];
        obj = obj1;
          goto _L1
        IOException ioexception;
        ioexception;
        s = null;
_L7:
        obj = s;
        com.b.a.c.c.a(ioexception);
        ioexception = obj2;
        if (s == null) goto _L4; else goto _L3
_L3:
        s.close();
        return null;
        s;
        obj = null;
_L6:
        if (obj != null)
        {
            ((a.c) (obj)).close();
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
          goto _L7
    }

    public final void a()
    {
        b.c();
        a(b.b, c, b.a(), b.b());
        return;
        Object obj;
        obj;
        com.b.a.c.c.a(((Throwable) (obj)));
        a(b.b, c, b.a(), b.b());
        return;
        obj;
        a(b.b, c, b.a(), b.b());
        throw obj;
    }

    public final boolean a(String s, Bitmap bitmap)
        throws IOException
    {
        a.a a1;
        a1 = b.b(b(s));
        if (a1 == null)
        {
            return false;
        }
        s = new BufferedOutputStream(a1.a(), e);
        boolean flag = bitmap.compress(f, g, s);
        com.b.a.c.b.a(s);
        if (flag)
        {
            a1.b();
            return flag;
        } else
        {
            a1.c();
            return flag;
        }
        bitmap;
        com.b.a.c.b.a(s);
        throw bitmap;
    }

    public final boolean a(String s, InputStream inputstream, com.b.a.c.b.a a1)
        throws IOException
    {
        BufferedOutputStream bufferedoutputstream;
        s = b.b(b(s));
        if (s == null)
        {
            return false;
        }
        bufferedoutputstream = new BufferedOutputStream(s.a(), e);
        boolean flag = com.b.a.c.b.a(inputstream, bufferedoutputstream, a1, e);
        com.b.a.c.b.a(bufferedoutputstream);
        if (flag)
        {
            s.b();
            return flag;
        } else
        {
            s.c();
            return flag;
        }
        inputstream;
        com.b.a.c.b.a(bufferedoutputstream);
        s.c();
        throw inputstream;
    }

    static 
    {
        a = android.graphics.Bitmap.CompressFormat.PNG;
    }
}
