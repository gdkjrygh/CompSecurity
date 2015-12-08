// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.logging.e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            e, OfflineTranslationException, j

public final class f
    implements com.google.android.libraries.translate.offline.e
{

    private Context a;

    public f(Context context)
    {
        a = context;
    }

    public static String a(Context context)
    {
        if (!o.c())
        {
            Environment.getExternalStorageState();
            throw new OfflineTranslationException(-5004, "notMounted");
        }
        context = context.getExternalFilesDir("");
        if (context == null)
        {
            throw new OfflineTranslationException(-5004, "nullPath");
        } else
        {
            return context.getAbsolutePath();
        }
    }

    private static String a(InputStream inputstream)
    {
        int i = 0;
        Object obj = MessageDigest.getInstance("SHA-1");
        int k = ((MessageDigest) (obj)).getDigestLength();
        char ac[] = new byte[4096];
        do
        {
            int l = inputstream.read(ac);
            if (l <= 0)
            {
                break;
            }
            ((MessageDigest) (obj)).update(ac, 0, l);
        } while (true);
        com.google.android.libraries.translate.e.d.a(inputstream);
        if (k == ((MessageDigest) (obj)).getDigestLength())
        {
            inputstream = ((MessageDigest) (obj)).digest();
        } else
        {
            inputstream = Arrays.copyOf(((MessageDigest) (obj)).digest(), k);
        }
        obj = new StringBuilder(inputstream.length * 2);
        ac = "0123456789abcdef".toCharArray();
        for (k = inputstream.length; i < k; i++)
        {
            byte byte0 = inputstream[i];
            ((StringBuilder) (obj)).append(ac[byte0 >> 4 & 0xf]).append(ac[byte0 & 0xf]);
        }

        return ((StringBuilder) (obj)).toString();
    }

    private static boolean g(String s)
    {
        if (s.contains(".."))
        {
            for (s = new File(s); s != null; s = s.getParentFile())
            {
                if (s.getName().equals(".."))
                {
                    return false;
                }
            }

        }
        return true;
    }

    private static String h(String s)
    {
        s = a(new FileInputStream(s));
        return s;
        s;
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a()
    {
        return a(a);
    }

    public final boolean a(j j1, String s)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        s = (new File(s)).getParentFile();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.exists()) goto _L2; else goto _L3
_L3:
        if (!s.isDirectory()) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L11:
        if (flag) goto _L7; else goto _L6
_L6:
        if (s.mkdirs()) goto _L7; else goto _L8
_L8:
        Singleton.b().a(-504, s.getPath());
        j1.e = OfflinePackage.Status.ERROR;
        j1.d = a.getString(com.google.android.libraries.translate.f.err_download_offline_language_failed);
_L9:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L5:
        if (s.delete())
        {
            break; /* Loop/switch isn't completed */
        }
        Singleton.b().a(-503, s.getPath());
        j1.e = OfflinePackage.Status.ERROR;
        j1.d = a.getString(com.google.android.libraries.translate.f.err_download_offline_language_failed);
        continue; /* Loop/switch isn't completed */
        j1;
        throw j1;
_L7:
        flag1 = true;
        if (true) goto _L9; else goto _L2
_L2:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final boolean a(String s)
    {
        return (new File(s)).exists();
    }

    public final boolean a(String s, String s1)
    {
        return TextUtils.equals(s1, h(s));
    }

    public final long b()
    {
        StatFs statfs = new StatFs(a(a));
        long l = statfs.getAvailableBlocks();
        return (long)statfs.getBlockSize() * l;
    }

    public final boolean b(j j1, String s)
    {
        Object obj;
        Object obj1;
        String s2;
        ZipFile zipfile;
        s2 = j1.c;
        obj = new File(s2);
        if (!((File) (obj)).exists())
        {
            Singleton.b().a(-505, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        String s1;
        Enumeration enumeration;
        ZipEntry zipentry;
        StringBuilder stringbuilder;
        try
        {
            zipfile = new ZipFile(((File) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-506, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-506, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        obj = "";
        enumeration = zipfile.entries();
        obj1 = "";
_L4:
        obj = obj1;
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        zipentry = (ZipEntry)enumeration.nextElement();
        obj = obj1;
        if (zipentry.isDirectory()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (!g(zipentry.getName())) goto _L6; else goto _L5
_L5:
        obj = obj1;
        s1 = zipentry.getName();
        obj = obj1;
        stringbuilder = new StringBuilder(s);
        obj = obj1;
        stringbuilder.append("/");
        obj = obj1;
        stringbuilder.append(s1);
        obj = obj1;
        s1 = stringbuilder.toString();
        obj1 = s1;
        obj = s1;
        if (!a(j1, s1)) goto _L4; else goto _L7
_L7:
        obj = s1;
        obj1 = new File(s1);
        obj = s1;
        if (((File) (obj1)).exists())
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj = s1;
        ((File) (obj1)).createNewFile();
        obj = s1;
        obj1 = new BufferedOutputStream(new FileOutputStream(((File) (obj1))), 4096);
        obj = s1;
        com.google.android.libraries.translate.e.d.a(zipfile.getInputStream(zipentry), ((java.io.OutputStream) (obj1)));
        obj1 = s1;
          goto _L4
        s;
_L9:
        Singleton.b().a(-507, ((String) (obj)));
        j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
        try
        {
            zipfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-507, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        return false;
_L6:
        obj = obj1;
        Singleton.b().a(-516, ((String) (obj1)));
        obj = obj1;
        j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
        try
        {
            zipfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-507, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        return false;
_L2:
        try
        {
            zipfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-507, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        d(s2);
        return true;
        s;
        try
        {
            zipfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-507, s2);
            j1.a(a, com.google.android.libraries.translate.f.err_download_offline_language_failed);
            return false;
        }
        throw s;
        s;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean b(String s)
    {
        return (new File(s)).mkdirs();
    }

    public final Collection c(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = new File(s);
        if (s.list() != null)
        {
            s = s.list();
            int k = s.length;
            for (int i = 0; i < k; i++)
            {
                arraylist.add(s[i]);
            }

        }
        return arraylist;
    }

    public final void d(String s)
    {
        s = new File(s);
        if (s.exists())
        {
            s.delete();
        }
    }

    public final boolean e(String s)
    {
        return (new File(s)).isFile();
    }

    public final long f(String s)
    {
        return (new File(s)).length();
    }
}
