// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Referenced classes of package com.arist.util:
//            Constant

public class LrcFileUtil
{

    public LrcFileUtil()
    {
    }

    public static void fileCopy(File file, File file1)
    {
        file = new BufferedReader(new FileReader(file));
        file1 = new PrintWriter(file1);
_L1:
        String s = file.readLine();
        if (s == null)
        {
            try
            {
                file.close();
                file1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_62;
        }
        file1.println(s);
          goto _L1
    }

    public static void moveLrcFile(File file)
    {
        int i;
        int j;
        File file1 = new File(Constant.BASE_LYRIC_PATH);
        if (!file1.exists())
        {
            file1.mkdirs();
        }
        file = file.listFiles();
        j = file.length;
        i = 0;
_L2:
        File file2;
        if (i >= j)
        {
            return;
        }
        file2 = file[i];
        if (!file2.isDirectory() || file2.getName().startsWith("."))
        {
            break; /* Loop/switch isn't completed */
        }
        moveLrcFile(file2);
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!file2.isFile() || !file2.getAbsolutePath().endsWith(".lrc")) goto _L4; else goto _L3
_L3:
        Object obj = file2.getAbsolutePath().substring(file2.getAbsolutePath().lastIndexOf('/') + 1);
        obj = new File((new StringBuilder(String.valueOf(Constant.BASE_LYRIC_PATH))).append(((String) (obj))).toString());
        if (!((File) (obj)).exists())
        {
            fileCopy(file2, ((File) (obj)));
        }
          goto _L4
    }
}
