// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class eb
{

    public static void a(File file)
    {
        if (!file.getAbsolutePath().contains("com.crittercism"))
        {
            return;
        }
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                a(afile[i]);
            }

        }
        file.delete();
    }

    public static String b(File file)
    {
        File file1;
        Object obj;
        file1 = null;
        obj = new StringBuilder();
        file = new FileInputStream(file);
        InputStreamReader inputstreamreader = new InputStreamReader(file);
_L3:
        int i = inputstreamreader.read();
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append((char)i);
          goto _L3
        obj;
        file1 = file;
        file = ((File) (obj));
_L5:
        if (file1 != null)
        {
            file1.close();
        }
        if (inputstreamreader != null)
        {
            inputstreamreader.close();
        }
        throw file;
_L2:
        file.close();
        inputstreamreader.close();
        return ((StringBuilder) (obj)).toString();
        file;
        inputstreamreader = null;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        inputstreamreader = null;
        file1 = file;
        file = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
