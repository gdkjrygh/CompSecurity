// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.text.format.DateFormat;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            d

public class e
{

    public static boolean a = true;
    private static final String b = com/qihoo/security/opti/trashclear/filemanager/e.getSimpleName();

    public e()
    {
    }

    private static long a(ZipEntry zipentry)
        throws Exception
    {
        if (zipentry == null)
        {
            return 0x1000000000L;
        }
        Class class1 = zipentry.getClass();
        Field field;
        try
        {
            field = class1.getDeclaredField("mLocalHeaderRelOffset");
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            nosuchfieldexception = class1.getDeclaredField("localHeaderRelOffset");
        }
        field.setAccessible(true);
        return field.getLong(zipentry);
    }

    public static Drawable a(Context context, String s)
    {
        Drawable drawable;
        PackageManager packagemanager;
        drawable = null;
        packagemanager = context.getPackageManager();
        if (!d(s)) goto _L2; else goto _L1
_L1:
        context = packagemanager.getPackageArchiveInfo(s, 1);
_L4:
        if (context != null)
        {
            context = ((PackageInfo) (context)).applicationInfo;
            context.sourceDir = s;
            context.publicSourceDir = s;
            try
            {
                drawable = packagemanager.getApplicationIcon(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
        }
        return drawable;
        context;
        context = null;
        continue; /* Loop/switch isn't completed */
_L2:
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static d a(File file, boolean flag)
    {
        d d1 = new d();
        String s = file.getPath();
        d1.h = file.canRead();
        d1.i = file.canWrite();
        d1.j = file.isHidden();
        d1.a = file.getName();
        d1.f = file.lastModified();
        d1.d = file.isDirectory();
        d1.b = s;
        if (d1.d)
        {
            return d1;
        } else
        {
            d1.c = file.length();
            return d1;
        }
    }

    public static String a(long l)
    {
        long l1 = 1024L * 1024L;
        long l2 = l1 * 1024L;
        if (l >= l2)
        {
            return String.format("%.1f GB", new Object[] {
                Float.valueOf((float)l / (float)l2)
            });
        }
        if (l >= l1)
        {
            float f = (float)l / (float)l1;
            String s;
            if (f > 100F)
            {
                s = "%.0f MB";
            } else
            {
                s = "%.1f MB";
            }
            return String.format(s, new Object[] {
                Float.valueOf(f)
            });
        }
        if (l >= 1024L)
        {
            float f1 = (float)l / (float)1024L;
            String s1;
            if (f1 > 100F)
            {
                s1 = "%.0f KB";
            } else
            {
                s1 = "%.1f KB";
            }
            return String.format(s1, new Object[] {
                Float.valueOf(f1)
            });
        } else
        {
            return String.format("%d B", new Object[] {
                Long.valueOf(l)
            });
        }
    }

    public static String a(Context context, long l)
    {
        java.text.DateFormat dateformat = DateFormat.getDateFormat(context);
        context = DateFormat.getTimeFormat(context);
        Date date = new Date(l);
        return (new StringBuilder()).append(dateformat.format(date)).append(" ").append(context.format(date)).toString();
    }

    public static String a(String s)
    {
        int i = s.lastIndexOf('.');
        if (i != -1)
        {
            return s.substring(i + 1, s.length());
        } else
        {
            return "";
        }
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean a(File file)
    {
        if (!a)
        {
            if (file.isHidden())
            {
                return false;
            }
            if (file.getName().startsWith("."))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean a(String s, ZipEntry azipentry[])
        throws Exception
    {
        if (azipentry == null)
        {
            return false;
        }
        int l = azipentry.length;
        RandomAccessFile randomaccessfile1;
        int i;
        randomaccessfile1 = null;
        i = 0;
_L4:
        RandomAccessFile randomaccessfile;
        ZipEntry zipentry;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        zipentry = azipentry[i];
        if (zipentry == null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        randomaccessfile = randomaccessfile1;
        if (randomaccessfile1 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        randomaccessfile = new RandomAccessFile(s, "r");
        randomaccessfile1 = randomaccessfile;
        long l1 = a(zipentry);
        randomaccessfile1 = randomaccessfile;
        randomaccessfile.seek(l1);
        randomaccessfile1 = randomaccessfile;
        long l2 = randomaccessfile.length();
        if (l1 + 8L > l2)
        {
            if (randomaccessfile != null)
            {
                randomaccessfile.close();
            }
            return false;
        }
        randomaccessfile1 = randomaccessfile;
        byte abyte0[] = new byte[8];
        randomaccessfile1 = randomaccessfile;
        int j = randomaccessfile.read(abyte0);
        int k;
        if (j != 8)
        {
            if (randomaccessfile != null)
            {
                randomaccessfile.close();
            }
            return false;
        }
        j = 0;
        k = 0;
        for (; j < 4; j++)
        {
            k = k << 8 | abyte0[j] & 0xff;
        }

        randomaccessfile1 = randomaccessfile;
        j = Integer.reverseBytes(k);
        if ((long)j != 0x4034b50L)
        {
            if (randomaccessfile != null)
            {
                randomaccessfile.close();
            }
            return true;
        }
        j = 6;
        k = 0;
        for (; j < 8; j++)
        {
            k = k << 8 | abyte0[j] & 0xff;
        }

        randomaccessfile1 = randomaccessfile;
        j = Short.reverseBytes((short)k);
        randomaccessfile1 = randomaccessfile;
        if ((j & 0xffff & 1) != 0)
        {
            if (randomaccessfile != null)
            {
                randomaccessfile.close();
            }
            return true;
        }
        break MISSING_BLOCK_LABEL_302;
        if (randomaccessfile1 != null)
        {
            randomaccessfile1.close();
        }
        return false;
        s;
        randomaccessfile1 = null;
_L2:
        if (randomaccessfile1 != null)
        {
            randomaccessfile1.close();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static long b(File file)
        throws Exception
    {
        file = file.listFiles();
        int j = file.length;
        long l = 0L;
        int i = 0;
        while (i < j) 
        {
            File file1 = file[i];
            if (file1.isDirectory())
            {
                l += b(file1);
            } else
            {
                l += file1.length();
            }
            i++;
        }
        return l;
    }

    public static void b(String s)
    {
        try
        {
            c(s);
            (new File(s.toString())).delete();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public static boolean c(String s)
    {
        File file;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        file = new File(s);
        break MISSING_BLOCK_LABEL_15;
_L2:
        do
        {
            return flag1;
        } while (!file.exists() || !file.isDirectory());
        String as[] = file.list();
        int j = as.length;
        int i = 0;
        do
        {
            flag1 = flag;
            if (i >= j)
            {
                continue;
            }
            Object obj = as[i];
            if (s.endsWith(File.separator))
            {
                obj = new File((new StringBuilder()).append(s).append(((String) (obj))).toString());
            } else
            {
                obj = new File((new StringBuilder()).append(s).append(File.separator).append(((String) (obj))).toString());
            }
            if (((File) (obj)).isFile())
            {
                ((File) (obj)).delete();
            } else
            if (((File) (obj)).isDirectory())
            {
                c(((File) (obj)).getAbsolutePath());
                ((File) (obj)).delete();
                flag = true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean d(String s)
    {
        System.currentTimeMillis();
        Object obj = new ZipFile(s);
        ZipEntry azipentry[];
        azipentry = new ZipEntry[3];
        azipentry[0] = ((ZipFile) (obj)).getEntry("AndroidManifest.xml");
        azipentry[1] = ((ZipFile) (obj)).getEntry("resources.arsc");
        azipentry[2] = null;
        long l = a(azipentry[1]);
        if (azipentry[1] == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ZipEntry zipentry;
        Enumeration enumeration = ((ZipFile) (obj)).entries();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break MISSING_BLOCK_LABEL_101;
            }
            zipentry = (ZipEntry)enumeration.nextElement();
        } while (a(zipentry) <= l);
        azipentry[2] = zipentry;
        ((ZipFile) (obj)).close();
        boolean flag = a(s, azipentry);
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return flag;
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        throw new NullPointerException();
        return flag;
        s;
        s = null;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return true;
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        throw new NullPointerException();
        return true;
        s;
        obj = null;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        ((ZipFile) (obj)).close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

}
