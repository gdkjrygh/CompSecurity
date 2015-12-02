// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.common.base.Preconditions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.b:
//            g, h, a, c, 
//            i, j

public final class f
{

    private f()
    {
    }

    public static i a(File file)
    {
        Preconditions.checkNotNull(file);
        return new g(file);
    }

    public static j a(File file, boolean flag)
    {
        Preconditions.checkNotNull(file);
        return new h(file, flag);
    }

    public static BufferedReader a(File file, Charset charset)
    {
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static void a(i i, File file)
    {
        com.google.common.b.a.a(i, b(file));
    }

    public static j b(File file)
    {
        return a(file, false);
    }

    public static String b(File file, Charset charset)
    {
        return new String(c(file), charset.name());
    }

    public static byte[] c(File file)
    {
        byte abyte0[];
        boolean flag;
        if (file.length() <= 0x7fffffffL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (file.length() == 0L)
        {
            return com.google.common.b.a.a(a(file));
        }
        abyte0 = new byte[(int)file.length()];
        file = new FileInputStream(file);
        com.google.common.b.a.a(file, abyte0);
        com.google.common.b.c.a(file, false);
        return abyte0;
        Exception exception;
        exception;
        com.google.common.b.c.a(file, true);
        throw exception;
    }
}
