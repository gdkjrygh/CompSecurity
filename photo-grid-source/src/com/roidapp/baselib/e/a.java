// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.baselib.e:
//            g, b

public final class a extends g
{

    private b e;
    private String f;
    private int g;

    public a(a a1)
    {
        this(a1.d, a1.f, a1.e);
    }

    public a(String s, String s1, b b1)
    {
        super(s, b1);
        f = s1;
        e = b1;
    }

    private String a(long l, InputStream inputstream)
    {
        float f1;
        float f2;
        Object obj;
        byte abyte0[];
        long l2;
        if (inputstream == null)
        {
            throw new IOException("inputStream is null.");
        }
        f2 = g;
        f1 = g;
        abyte0 = new byte[4096];
        l2 = 0L;
        obj = new File(f);
        File file = ((File) (obj)).getParentFile();
        if (!file.exists() && !file.mkdirs())
        {
            throw new IOException("mkdir failed.");
        }
        obj = new FileOutputStream(((File) (obj)));
_L4:
        long l1 = l2;
        int i = inputstream.read(abyte0);
        if (i < 0) goto _L2; else goto _L1
_L1:
        l1 = l2;
        boolean flag = c.get();
        if (flag)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
            if (l > 0L && l2 != l)
            {
                Log.e("Download", "file download incomplete.[size != length]");
                (new File(f)).delete();
            }
            return null;
        }
        l1 = l2;
        ((FileOutputStream) (obj)).write(abyte0, 0, i);
        if (l <= 0L) goto _L4; else goto _L3
_L3:
        l2 += i;
        l1 = l2;
        f1 += ((float)i * (99F - f2)) / (float)l;
        l1 = l2;
        b((int)f1);
          goto _L4
        inputstream;
_L6:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (l > 0L && l1 != l)
        {
            Log.e("Download", "file download incomplete.[size != length]");
            (new File(f)).delete();
        }
        throw inputstream;
_L2:
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        if (l > 0L && l2 != l)
        {
            Log.e("Download", "file download incomplete.[size != length]");
            (new File(f)).delete();
        }
        return f;
        inputstream;
        obj = null;
        l1 = l2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void b(int i)
    {
        if (i != g)
        {
            g = i;
            if (e != null)
            {
                e.a(i);
            }
        }
    }

    protected final Object a(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            return a(httpurlconnection.getContentLength(), httpurlconnection.getInputStream());
        } else
        {
            return a(-1L, null);
        }
    }

    protected final void a()
    {
        super.a();
        b(0);
    }

    protected final void b()
    {
        super.b();
        b(3);
    }
}
