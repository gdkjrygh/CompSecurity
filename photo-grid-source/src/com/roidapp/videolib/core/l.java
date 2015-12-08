// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

// Referenced classes of package com.roidapp.videolib.core:
//            a

public final class l
{

    private static l g;
    private static long h = 0x240c8400L;
    private static final char i[] = "0123456789abcdef".toCharArray();
    Context a;
    String b;
    SharedPreferences c;
    com.roidapp.videolib.core.a d;
    boolean e;
    b f;

    private l()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = false;
        f = null;
    }

    public static l a()
    {
        if (g == null)
        {
            g = new l();
        }
        return g;
    }

    public static String a(InputStream inputstream)
    {
        int j = 0;
        byte abyte0[];
        MessageDigest messagedigest;
        abyte0 = new byte[4096];
        messagedigest = MessageDigest.getInstance("MD5");
_L1:
        int k = inputstream.read(abyte0);
label0:
        {
            if (k == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, k);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
                return null;
            }
        }
          goto _L1
        StringBuilder stringbuilder;
        inputstream = messagedigest.digest();
        stringbuilder = new StringBuilder(32);
        k = inputstream.length;
_L3:
        byte byte0;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = inputstream[j];
        stringbuilder.append(i[byte0 >> 4 & 0xf]);
        stringbuilder.append(i[byte0 & 0xf]);
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        inputstream = stringbuilder.toString();
        return inputstream;
    }

    public static String a(String s)
    {
        int j = 0;
        s = new FileInputStream(s);
        byte abyte0[];
        Object obj1;
        abyte0 = new byte[4096];
        obj1 = MessageDigest.getInstance("MD5");
_L3:
        int k = s.read(abyte0);
        if (k == -1) goto _L2; else goto _L1
_L1:
        ((MessageDigest) (obj1)).update(abyte0, 0, k);
          goto _L3
        Object obj;
        obj;
_L9:
        byte abyte1[];
        String s1;
        int i1;
        byte byte0;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return null;
_L2:
        abyte1 = ((MessageDigest) (obj1)).digest();
        obj1 = new StringBuilder(32);
        i1 = abyte1.length;
_L5:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = abyte1[j];
        ((StringBuilder) (obj1)).append(i[byte0 >> 4 & 0xf]);
        ((StringBuilder) (obj1)).append(i[byte0 & 0xf]);
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        s1 = ((StringBuilder) (obj1)).toString();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s1;
        s1;
        s = null;
_L7:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw s1;
        s1;
        if (true) goto _L7; else goto _L6
_L6:
        s;
        s = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void b()
    {
        g.a = null;
        g.c = null;
    }

    public static void c()
    {
        try
        {
            System.loadLibrary("avutil-54");
            System.loadLibrary("swresample-1");
            System.loadLibrary("swscale-3");
            System.loadLibrary("avcodec-56");
            System.loadLibrary("avformat-56");
            System.loadLibrary("amf");
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            unsatisfiedlinkerror.printStackTrace();
        }
    }

    public static boolean d()
    {
        try
        {
            c();
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public final void a(Context context)
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || context == null)
        {
            return;
        }
        a = context;
        try
        {
            b = (new StringBuilder()).append(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir).append("/codec/").toString();
        }
        catch (Exception exception)
        {
            b = (new StringBuilder()).append(com.roidapp.baselib.d.a.a(context, "/codec/").getAbsolutePath()).append(File.separator).toString();
        }
        c = context.getSharedPreferences("Video", 0);
    }

}
