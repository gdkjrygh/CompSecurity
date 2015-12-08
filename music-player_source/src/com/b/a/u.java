// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.content.Context;
import b.a.fj;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.b.a:
//            v, w

public final class u
{

    private final int a;
    private File b;
    private FilenameFilter c;

    public u(Context context)
    {
        this(context, ".um");
    }

    private u(Context context, String s)
    {
        a = 10;
        c = new v(this);
        b = new File(context.getFilesDir(), s);
        if (!b.exists() || !b.isDirectory())
        {
            b.mkdir();
        }
    }

    public final void a(w w1)
    {
        File afile[];
        int i;
        int j;
        afile = b.listFiles(c);
        if (afile == null || afile.length <= 0)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        File file1 = b;
        j = afile.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = w1.a(afile[i]);
        if (flag)
        {
            afile[i].delete();
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Throwable throwable;
        throwable;
        afile[i].delete();
          goto _L3
        w1;
        throw w1;
_L1:
        File file = b;
        w1.a();
    }

    public final void a(byte abyte0[])
    {
        int i = 0;
        if (abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = String.format(Locale.US, "um_cache_%d.env", new Object[] {
            Long.valueOf(System.currentTimeMillis())
        });
        obj = new File(b, ((String) (obj)));
        try
        {
            fj.a(((File) (obj)), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        abyte0 = b.listFiles(c);
        if (abyte0 != null && abyte0.length >= 10)
        {
            Arrays.sort(abyte0);
            int j = abyte0.length;
            while (i < j - 10) 
            {
                abyte0[i].delete();
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean a()
    {
        File afile[] = b.listFiles();
        return afile != null && afile.length > 0;
    }
}
