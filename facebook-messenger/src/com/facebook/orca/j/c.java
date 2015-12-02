// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.j;

import android.content.Context;
import android.os.Environment;
import com.facebook.common.w.m;
import com.facebook.debug.log.b;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.j:
//            d

public class c
{

    private static File b;
    private static File c;
    private long a;

    public c(Context context)
    {
        a = 0x5265c00L;
        b = new File(context.getCacheDir(), "/orcatemp");
        c = new File(Environment.getExternalStorageDirectory(), "/orcatemp");
    }

    private File a(String s, File file)
    {
        File file1;
        if (!a(file))
        {
            return null;
        }
        file1 = new File(file, s);
        if (file1.exists())
        {
            return file1;
        }
        boolean flag;
        do
        {
            flag = file1.createNewFile();
        } while (!flag);
        return file1;
        IOException ioexception;
        ioexception;
        com.facebook.debug.log.b.d("Orca:TempFileManager", m.a("Error occurred when creating the file %s in temporary directory %s.", new Object[] {
            s, file.getName()
        }), ioexception);
        return null;
    }

    private File a(String s, String s1, File file)
    {
        String s2;
        String s3;
label0:
        {
            if (!a(file))
            {
                return null;
            }
            if (s != null)
            {
                s2 = s;
                if (s.trim().length() != 0)
                {
                    break label0;
                }
            }
            s2 = "";
        }
label1:
        {
            if (s1 != null)
            {
                s3 = s1;
                if (s1.trim().length() != 0)
                {
                    break label1;
                }
            }
            s3 = ".tmp";
        }
        s = "";
_L1:
        File file1;
        boolean flag;
        try
        {
            s1 = (new StringBuilder()).append(s2).append(com.facebook.common.time.c.b().a()).append("_tmp").append(s3).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.facebook.debug.log.b.d("Orca:TempFileManager", m.a("Error occurred when creating the temporary file %s in directory %s.", new Object[] {
                s, file.getName()
            }), s1);
            return null;
        }
        s = s1;
        file1 = new File(file, s1);
        s = s1;
        flag = file1.createNewFile();
        s = s1;
        if (flag)
        {
            return file1;
        }
          goto _L1
    }

    private boolean a(File file)
    {
        boolean flag;
        if (file != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (file.exists())
        {
            return file.isDirectory() && file.canRead() && file.canWrite();
        } else
        {
            return file.mkdirs();
        }
    }

    private void b(File file)
    {
        long l = com.facebook.common.time.c.b().a();
        file = file.listFiles(new d());
        if (file != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = file[i];
                if (l - file1.lastModified() > a)
                {
                    file1.delete();
                }
                i++;
            }
        }
    }

    static boolean b()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public File a(String s, String s1, Boolean boolean1)
    {
        if (boolean1.booleanValue() || !b())
        {
            return a(s, s1, b);
        } else
        {
            return a(s, s1, c);
        }
    }

    public File a(String s, boolean flag)
    {
        if (flag || !b())
        {
            return a(s, b);
        } else
        {
            return a(s, c);
        }
    }

    public void a()
    {
        b(c);
        b(b);
    }

    public String b(String s, boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = b.getAbsolutePath();
        } else
        {
            s1 = c.getAbsolutePath();
        }
        return (new StringBuilder()).append(s1).append("/").append(s).toString();
    }

    public boolean c(String s, boolean flag)
    {
        if (flag)
        {
            return (new File(b, s)).exists();
        } else
        {
            return (new File(c, s)).exists();
        }
    }
}
