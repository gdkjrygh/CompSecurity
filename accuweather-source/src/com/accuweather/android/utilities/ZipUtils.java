// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.accuweather.android.utilities:
//            Logger

public class ZipUtils
{

    private static final String ZIP_EXTENSION = ".zip";
    private static final int bufferSize = 4096;

    public ZipUtils()
    {
    }

    public static void extractFolder(ZipInputStream zipinputstream, String s)
        throws ZipException, IOException
    {
        do
        {
            ZipEntry zipentry = zipinputstream.getNextEntry();
            if (zipentry == null)
            {
                break;
            }
            String s1 = zipentry.getName();
            File file = new File(s, s1);
            file.getParentFile().mkdirs();
            if (!zipentry.isDirectory())
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(com/accuweather/android/utilities/ZipUtils.getName(), (new StringBuilder()).append("In extractFolder(), about to extract file ").append(zipentry.getName()).append(" to path ").append(file.getAbsolutePath()).append(" at ").append(new Date()).toString());
                }
                byte abyte0[] = new byte[4096];
                BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(file), 4096);
                do
                {
                    int i = zipinputstream.read(abyte0, 0, 4096);
                    if (i == -1)
                    {
                        break;
                    }
                    bufferedoutputstream.write(abyte0, 0, i);
                } while (true);
                bufferedoutputstream.flush();
                bufferedoutputstream.close();
                zipinputstream.closeEntry();
            } else
            {
                file.mkdir();
            }
            if (s1.endsWith(".zip"))
            {
                extractFolder(zipinputstream, file.getAbsolutePath());
            }
        } while (true);
    }
}
