// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release.a;

import android.text.TextUtils;
import com.roidapp.baselib.d.a;
import com.roidapp.photogrid.release.StickerInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class b
{

    public static final String a = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.sticker/").toString();

    public static com.roidapp.baselib.g.a a(StickerInfo stickerinfo, com.roidapp.baselib.g.b b1)
    {
        String s = stickerinfo.n;
        stickerinfo = stickerinfo.b;
        return com.roidapp.baselib.g.a.a(s, (new StringBuilder()).append(a).append(com.roidapp.baselib.d.a.c(stickerinfo)).toString(), b1);
    }

    public static InputStream a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = new File(s)).exists())
            {
                return new FileInputStream(s);
            }
        }
        return null;
    }

    public static boolean a(StickerInfo stickerinfo)
    {
        if (stickerinfo != null)
        {
            String s = stickerinfo.b;
            if (com.roidapp.baselib.d.a.a(b(stickerinfo), true))
            {
                String as[] = stickerinfo.k;
                if (as == null || as.length <= 0)
                {
                    c(stickerinfo);
                    return false;
                }
                String s1 = b(stickerinfo);
                int j = as.length;
                for (int i = 0; i < j; i++)
                {
                    String s2 = as[i];
                    if (TextUtils.isEmpty(s2))
                    {
                        c(stickerinfo);
                        return false;
                    }
                    if (!(new File((new StringBuilder()).append(s1).append(s2).toString())).exists())
                    {
                        c(stickerinfo);
                        return false;
                    }
                }

                return true;
            }
        }
        return false;
    }

    public static boolean a(String s, String s1)
    {
        Object obj1;
        (new File(s1)).mkdirs();
        obj1 = new ZipFile(s);
        Object obj = obj1;
        Enumeration enumeration = ((ZipFile) (obj1)).entries();
_L5:
        obj = obj1;
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        Object obj2 = (ZipEntry)enumeration.nextElement();
        obj = obj1;
        Object obj3 = ((ZipEntry) (obj2)).getName();
        obj = obj1;
        if (!((ZipEntry) (obj2)).isDirectory()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        (new File((new StringBuilder()).append(s1).append(((String) (obj3))).toString())).mkdirs();
          goto _L5
        obj;
        s1 = ((String) (obj1));
        obj1 = obj;
_L9:
        obj = s1;
        com.roidapp.baselib.d.a.a(new File(s));
        obj = s1;
        ((Exception) (obj1)).printStackTrace();
        byte abyte0[];
        int i;
        if (s1 != null)
        {
            try
            {
                s1.close();
                com.roidapp.baselib.d.a.a(new File(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return false;
_L4:
        obj = obj1;
        obj3 = new FileOutputStream(new File((new StringBuilder()).append(s1).append(((String) (obj3))).toString()));
        obj = obj1;
        abyte0 = new byte[1024];
        obj = obj1;
        obj2 = ((ZipFile) (obj1)).getInputStream(((ZipEntry) (obj2)));
_L7:
        obj = obj1;
        i = ((InputStream) (obj2)).read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((FileOutputStream) (obj3)).write(abyte0, 0, i);
        obj = obj1;
        ((FileOutputStream) (obj3)).flush();
        if (true) goto _L7; else goto _L6
        s1;
_L8:
        if (obj != null)
        {
            try
            {
                ((ZipFile) (obj)).close();
                com.roidapp.baselib.d.a.a(new File(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw s1;
_L6:
        obj = obj1;
        ((FileOutputStream) (obj3)).close();
        obj = obj1;
        ((InputStream) (obj2)).close();
          goto _L5
_L2:
        try
        {
            ((ZipFile) (obj1)).close();
            com.roidapp.baselib.d.a.a(new File(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return true;
        s1;
        obj = null;
          goto _L8
        obj1;
        s1 = null;
          goto _L9
    }

    public static String b(StickerInfo stickerinfo)
    {
        if (stickerinfo == null)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append(a).append(stickerinfo.b).append(Math.abs(stickerinfo.h)).append("/").toString();
        }
    }

    public static boolean c(StickerInfo stickerinfo)
    {
        com.roidapp.baselib.d.a.a(new File(b(stickerinfo)));
        return true;
    }

}
