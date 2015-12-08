// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a
{

    public static final File a[] = new File[0];

    public static void a(File file)
        throws IOException
    {
        if (file.exists())
        {
            b(file);
            if (!file.delete())
            {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    public static void b(File file)
        throws IOException
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException("Failed to list contents of " + file);
        }
        file = null;
        int i = 0;
        while (i < afile.length) 
        {
            File file1 = afile[i];
            try
            {
                c(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            i++;
        }
        if (file != null)
        {
            throw file;
        } else
        {
            return;
        }
    }

    public static void c(File file)
        throws IOException
    {
        if (file.isDirectory())
        {
            a(file);
        } else
        {
            boolean flag = file.exists();
            if (!file.delete())
            {
                if (!flag)
                {
                    throw new FileNotFoundException("File does not exist: " + file);
                } else
                {
                    throw new IOException("Unable to delete file: " + file);
                }
            }
        }
    }

}
