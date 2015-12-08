// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

// Referenced classes of package com.roidapp.photogrid.c:
//            g

public final class a
{

    private static final String a = (new StringBuilder()).append(Environment.getDataDirectory().getPath()).append("/data/com.roidapp.photogrid/download").toString();

    public static String a(File file)
    {
        byte abyte0[];
        if (!file.isFile())
        {
            return "";
        }
        abyte0 = new byte[1024];
        MessageDigest messagedigest;
        messagedigest = MessageDigest.getInstance("MD5");
        file = new FileInputStream(file);
_L1:
        int i = file.read(abyte0, 0, 1024);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                g.b("AllUtil", file.toString());
                return "";
            }
        }
          goto _L1
        file.close();
        return (new BigInteger(1, messagedigest.digest())).toString(16);
    }

    public static String a(String s)
    {
        if (b() / 1024L / 1024L > 10L)
        {
            g.a("AllUtil", (new StringBuilder("\u5916\u90E8\u5B58\u50A8\u7A7A\u95F4\uFF0CMB:")).append(b() / 1024L / 1024L).toString());
            return (new StringBuilder()).append(s).append("/update/").toString();
        }
        if (c() / 1024L / 1024L > 10L)
        {
            g.b("AllUtil", (new StringBuilder("\u5185\u90E8\u5B58\u50A8\u7A7A\u95F4\uFF0CMB:")).append(c() / 1024L / 1024L).toString());
            return a;
        } else
        {
            g.b("AllUtil", "\u78C1\u76D8\u7A7A\u95F4\u4E0D\u8DB3");
            return "";
        }
    }

    private static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private static long b()
    {
        if (!a())
        {
            return 0L;
        }
        Object obj;
        long l;
        if (!a())
        {
            obj = null;
        } else
        {
            obj = Environment.getExternalStorageDirectory().getPath();
        }
        obj = new StatFs(((String) (obj)));
        l = ((StatFs) (obj)).getBlockSize();
        return (long)((StatFs) (obj)).getAvailableBlocks() * l;
    }

    public static String b(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("\uFEFF"))
            {
                s1 = s.substring(1);
            }
        }
        return s1;
    }

    private static long c()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        long l1 = statfs.getAvailableBlocks();
        g.a("AllUtil", (new StringBuilder("\u5185\u90E8\u7A7A\u95F4\u5927\u5C0F")).append(l1 * l).toString());
        return l1 * l;
    }

}
