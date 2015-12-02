// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.imagepipeline.webp;

import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

public class WebpSupportStatus
{

    public static final boolean a;
    public static final boolean b;
    public static final boolean c = a();
    private static final byte d[] = a("RIFF");
    private static final byte e[] = a("WEBP");
    private static final byte f[] = a("VP8 ");
    private static final byte g[] = a("VP8L");
    private static final byte h[] = a("VP8X");

    public WebpSupportStatus()
    {
    }

    private static boolean a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        android.graphics.BitmapFactory.Options options;
        if (android.os.Build.VERSION.SDK_INT != 17)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        if (options.outHeight != 1 || options.outWidth != 1) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean a(byte abyte0[], int i)
    {
        boolean flag = a(abyte0, i + 12, h);
        if ((abyte0[i + 20] & 2) == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return flag && i != 0;
    }

    public static boolean a(byte abyte0[], int i, int j)
    {
        boolean flag1 = false;
        boolean flag;
        if (b(abyte0, i))
        {
            flag = b;
        } else
        {
            if (c(abyte0, i))
            {
                return c;
            }
            flag = flag1;
            if (b(abyte0, i, j))
            {
                flag = flag1;
                if (!a(abyte0, i))
                {
                    return c;
                }
            }
        }
        return flag;
    }

    private static boolean a(byte abyte0[], int i, byte abyte1[])
    {
        if (abyte1.length + i <= abyte0.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= abyte1.length)
                {
                    break label1;
                }
                if (abyte0[j + i] != abyte1[j])
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("ASCII not found!", s);
        }
        return s;
    }

    public static boolean b(byte abyte0[], int i)
    {
        return a(abyte0, i + 12, f);
    }

    public static boolean b(byte abyte0[], int i, int j)
    {
        return j >= 21 && a(abyte0, i + 12, h);
    }

    public static boolean c(byte abyte0[], int i)
    {
        return a(abyte0, i + 12, g);
    }

    public static boolean c(byte abyte0[], int i, int j)
    {
        return j >= 20 && a(abyte0, i, d) && a(abyte0, i + 8, e);
    }

    public static boolean d(byte abyte0[], int i)
    {
        boolean flag = a(abyte0, i + 12, h);
        if ((abyte0[i + 20] & 0x10) == 16)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return flag && i != 0;
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT <= 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
